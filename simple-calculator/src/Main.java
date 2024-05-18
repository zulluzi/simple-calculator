import java.util.Scanner;

public class Main {
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static int bagi(int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String operator = "";
        System.out.println("Enter two numbers: ");
        a = scan.nextInt();
        b = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter an operator (+, -, *, /):");
        operator = scan.nextLine();

        float result = 0;

        switch (operator) {
            case "+":
                result = tambah(a, b);
                break;
            case "-":
                result = kurang(a, b);
                break;
            case "*":
                result = kali(a, b);
                break;
            case "/":
                result = bagi(a, b);
                break;
            default:
                System.out.println("Gagal");
                return;
        }
        System.out.println("Result: " + result);
    }
}
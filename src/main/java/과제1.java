import java.util.Scanner;

public class 과제1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("정수만 입력해주세요 실수말고 ");
        a = s.nextInt();

        if (a % 3 == 0) {
            System.out.printf("3의 배수입니다.\n");
        } else {
            System.out.printf("3의 배수가 아닌데 왜 입력하셨나요? 비록 과제에선 넣지 말라고 하셨지만 확인하려고 한번 더칠게 분명할테니 넣어드렸습니다\n");
        }
    }

}
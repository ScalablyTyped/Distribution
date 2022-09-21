package typings.micromarkUtilTypes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effects extends StObject {
  
  def attempt(construct: js.Array[Construct], returnState: State): js.Function1[/* code */ Code, Unit]
  def attempt(construct: js.Array[Construct], returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  def attempt(construct: ConstructRecord, returnState: State): js.Function1[/* code */ Code, Unit]
  def attempt(construct: ConstructRecord, returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  /**
    *   Try to tokenize a construct.
    */
  def attempt(construct: Construct, returnState: State): js.Function1[/* code */ Code, Unit]
  def attempt(construct: Construct, returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  /**
    *   Try to tokenize a construct.
    */
  @JSName("attempt")
  var attempt_Original: Attempt
  
  def check(construct: js.Array[Construct], returnState: State): js.Function1[/* code */ Code, Unit]
  def check(construct: js.Array[Construct], returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  def check(construct: ConstructRecord, returnState: State): js.Function1[/* code */ Code, Unit]
  def check(construct: ConstructRecord, returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  /**
    *   Attempt, then revert.
    */
  def check(construct: Construct, returnState: State): js.Function1[/* code */ Code, Unit]
  def check(construct: Construct, returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  /**
    *   Attempt, then revert.
    */
  @JSName("check")
  var check_Original: Attempt
  
  /**
    *   Deal with the character and move to the next.
    */
  def consume(code: Code): Unit
  /**
    *   Deal with the character and move to the next.
    */
  @JSName("consume")
  var consume_Original: Consume
  
  /**
    *   Start a new token.
    */
  def enter(`type`: String): Token
  def enter(`type`: String, fields: Record[String, Any]): Token
  /**
    *   Start a new token.
    */
  @JSName("enter")
  var enter_Original: Enter
  
  /**
    *   End a started token.
    */
  def exit(`type`: String): Token
  /**
    *   End a started token.
    */
  @JSName("exit")
  var exit_Original: Exit
  
  def interrupt(construct: js.Array[Construct], returnState: State): js.Function1[/* code */ Code, Unit]
  def interrupt(construct: js.Array[Construct], returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  def interrupt(construct: ConstructRecord, returnState: State): js.Function1[/* code */ Code, Unit]
  def interrupt(construct: ConstructRecord, returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  /**
    *   Interrupt is used for stuff right after a line of content.
    */
  def interrupt(construct: Construct, returnState: State): js.Function1[/* code */ Code, Unit]
  def interrupt(construct: Construct, returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit]
  /**
    *   Interrupt is used for stuff right after a line of content.
    */
  @JSName("interrupt")
  var interrupt_Original: Attempt
}
object Effects {
  
  inline def apply(
    attempt: (/* construct */ Construct | js.Array[Construct] | ConstructRecord, /* returnState */ State, /* bogusState */ js.UndefOr[State]) => js.Function1[/* code */ Code, Unit],
    check: (/* construct */ Construct | js.Array[Construct] | ConstructRecord, /* returnState */ State, /* bogusState */ js.UndefOr[State]) => js.Function1[/* code */ Code, Unit],
    consume: /* code */ Code => Unit,
    enter: (/* type */ String, /* fields */ js.UndefOr[Record[String, Any]]) => Token,
    exit: /* type */ String => Token,
    interrupt: (/* construct */ Construct | js.Array[Construct] | ConstructRecord, /* returnState */ State, /* bogusState */ js.UndefOr[State]) => js.Function1[/* code */ Code, Unit]
  ): Effects = {
    val __obj = js.Dynamic.literal(attempt = js.Any.fromFunction3(attempt), check = js.Any.fromFunction3(check), consume = js.Any.fromFunction1(consume), enter = js.Any.fromFunction2(enter), exit = js.Any.fromFunction1(exit), interrupt = js.Any.fromFunction3(interrupt))
    __obj.asInstanceOf[Effects]
  }
  
  extension [Self <: Effects](x: Self) {
    
    inline def setAttempt(
      value: (/* construct */ Construct | js.Array[Construct] | ConstructRecord, /* returnState */ State, /* bogusState */ js.UndefOr[State]) => js.Function1[/* code */ Code, Unit]
    ): Self = StObject.set(x, "attempt", js.Any.fromFunction3(value))
    
    inline def setCheck(
      value: (/* construct */ Construct | js.Array[Construct] | ConstructRecord, /* returnState */ State, /* bogusState */ js.UndefOr[State]) => js.Function1[/* code */ Code, Unit]
    ): Self = StObject.set(x, "check", js.Any.fromFunction3(value))
    
    inline def setConsume(value: /* code */ Code => Unit): Self = StObject.set(x, "consume", js.Any.fromFunction1(value))
    
    inline def setEnter(value: (/* type */ String, /* fields */ js.UndefOr[Record[String, Any]]) => Token): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setExit(value: /* type */ String => Token): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    
    inline def setInterrupt(
      value: (/* construct */ Construct | js.Array[Construct] | ConstructRecord, /* returnState */ State, /* bogusState */ js.UndefOr[State]) => js.Function1[/* code */ Code, Unit]
    ): Self = StObject.set(x, "interrupt", js.Any.fromFunction3(value))
  }
}

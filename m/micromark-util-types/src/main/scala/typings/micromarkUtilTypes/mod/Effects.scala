package typings.micromarkUtilTypes.mod

import typings.micromarkUtilTypes.anon.OmitPartialTokentype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effects extends StObject {
  
  /**
    * Try to tokenize a construct.
    */
  def attempt(construct: js.Array[Construct], ok: State): State
  def attempt(construct: js.Array[Construct], ok: State, nok: State): State
  def attempt(construct: ConstructRecord, ok: State): State
  def attempt(construct: ConstructRecord, ok: State, nok: State): State
  def attempt(construct: Construct, ok: State): State
  def attempt(construct: Construct, ok: State, nok: State): State
  /**
    * Try to tokenize a construct.
    */
  @JSName("attempt")
  var attempt_Original: Attempt
  
  /**
    * Attempt, then revert.
    */
  def check(construct: js.Array[Construct], ok: State): State
  def check(construct: js.Array[Construct], ok: State, nok: State): State
  def check(construct: ConstructRecord, ok: State): State
  def check(construct: ConstructRecord, ok: State, nok: State): State
  def check(construct: Construct, ok: State): State
  def check(construct: Construct, ok: State, nok: State): State
  /**
    * Attempt, then revert.
    */
  @JSName("check")
  var check_Original: Attempt
  
  /**
    * Deal with the character and move to the next.
    */
  def consume(code: Code): Unit
  /**
    * Deal with the character and move to the next.
    */
  @JSName("consume")
  var consume_Original: Consume
  
  /**
    * Start a new token.
    */
  def enter(`type`: TokenType): Token
  def enter(`type`: TokenType, fields: OmitPartialTokentype): Token
  /**
    * Start a new token.
    */
  @JSName("enter")
  var enter_Original: Enter
  
  /**
    * End a started token.
    */
  def exit(`type`: TokenType): Token
  /**
    * End a started token.
    */
  @JSName("exit")
  var exit_Original: Exit
  
  /**
    * Interrupt is used for stuff right after a line of content.
    */
  def interrupt(construct: js.Array[Construct], ok: State): State
  def interrupt(construct: js.Array[Construct], ok: State, nok: State): State
  def interrupt(construct: ConstructRecord, ok: State): State
  def interrupt(construct: ConstructRecord, ok: State, nok: State): State
  def interrupt(construct: Construct, ok: State): State
  def interrupt(construct: Construct, ok: State, nok: State): State
  /**
    * Interrupt is used for stuff right after a line of content.
    */
  @JSName("interrupt")
  var interrupt_Original: Attempt
}
object Effects {
  
  inline def apply(
    attempt: (/* construct */ js.Array[Construct] | Construct | ConstructRecord, /* ok */ State, /* nok */ js.UndefOr[State]) => State,
    check: (/* construct */ js.Array[Construct] | Construct | ConstructRecord, /* ok */ State, /* nok */ js.UndefOr[State]) => State,
    consume: /* code */ Code => Unit,
    enter: (/* type */ TokenType, /* fields */ js.UndefOr[OmitPartialTokentype]) => Token,
    exit: /* type */ TokenType => Token,
    interrupt: (/* construct */ js.Array[Construct] | Construct | ConstructRecord, /* ok */ State, /* nok */ js.UndefOr[State]) => State
  ): Effects = {
    val __obj = js.Dynamic.literal(attempt = js.Any.fromFunction3(attempt), check = js.Any.fromFunction3(check), consume = js.Any.fromFunction1(consume), enter = js.Any.fromFunction2(enter), exit = js.Any.fromFunction1(exit), interrupt = js.Any.fromFunction3(interrupt))
    __obj.asInstanceOf[Effects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Effects] (val x: Self) extends AnyVal {
    
    inline def setAttempt(
      value: (/* construct */ js.Array[Construct] | Construct | ConstructRecord, /* ok */ State, /* nok */ js.UndefOr[State]) => State
    ): Self = StObject.set(x, "attempt", js.Any.fromFunction3(value))
    
    inline def setCheck(
      value: (/* construct */ js.Array[Construct] | Construct | ConstructRecord, /* ok */ State, /* nok */ js.UndefOr[State]) => State
    ): Self = StObject.set(x, "check", js.Any.fromFunction3(value))
    
    inline def setConsume(value: /* code */ Code => Unit): Self = StObject.set(x, "consume", js.Any.fromFunction1(value))
    
    inline def setEnter(value: (/* type */ TokenType, /* fields */ js.UndefOr[OmitPartialTokentype]) => Token): Self = StObject.set(x, "enter", js.Any.fromFunction2(value))
    
    inline def setExit(value: /* type */ TokenType => Token): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    
    inline def setInterrupt(
      value: (/* construct */ js.Array[Construct] | Construct | ConstructRecord, /* ok */ State, /* nok */ js.UndefOr[State]) => State
    ): Self = StObject.set(x, "interrupt", js.Any.fromFunction3(value))
  }
}

package typings.moo.mod

import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lexer extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Token, _, js.UndefOr[scala.Nothing]]] = js.native
  /**
    * Returns a string with a pretty error message.
    */
  def formatError(token: Token): String = js.native
  def formatError(token: Token, message: String): String = js.native
  /**
    * Can be used by parsers like nearley to check whether a given token type can be parsed by this lexer.
    */
  def has(tokenType: String): Boolean = js.native
  /**
    * When you reach the end of Moo's internal buffer, next() will return undefined.
    * You can always reset() it and feed it more data when that happens.
    */
  def next(): js.UndefOr[Token] = js.native
  /**
    * Returns back to the previous state in the stack.
    */
  def popState(): Unit = js.native
  /**
    * Transitions to the provided state and pushes the state onto the state
    * stack.
    */
  def pushState(state: String): Unit = js.native
  /**
    * Empty the internal buffer of the lexer, and set the line, column, and offset counts back to their initial value.
    */
  def reset(): this.type = js.native
  def reset(chunk: String): this.type = js.native
  def reset(chunk: String, state: LexerState): this.type = js.native
  /**
    * Returns current state, which you can later pass it as the second argument
    * to reset() to explicitly control the internal state of the lexer.
    */
  def save(): LexerState = js.native
  /**
    * Transitiosn to the provided state. Does not push onto the state stack.
    */
  def setState(state: String): Unit = js.native
}


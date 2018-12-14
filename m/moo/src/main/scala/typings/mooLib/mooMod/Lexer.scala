package typings
package mooLib.mooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lexer extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[stdLib.Iterator[Token]] = js.native
  /**
       * Returns a string with a pretty error message.
       */
  def formatError(token: Token): java.lang.String = js.native
  /**
       * Returns a string with a pretty error message.
       */
  def formatError(token: Token, message: java.lang.String): java.lang.String = js.native
  /**
       * Can be used by parsers like nearley to check whether a given token type can be parsed by this lexer.
       */
  def has(tokenType: java.lang.String): scala.Boolean = js.native
  /**
       * When you reach the end of Moo's internal buffer, next() will return undefined.
       * You can always reset() it and feed it more data when that happens.
       */
  def next(): js.UndefOr[Token] = js.native
  /**
       * Empty the internal buffer of the lexer, and set the line, column, and offset counts back to their initial value.
       */
  def reset(): scala.Unit = js.native
  /**
       * Empty the internal buffer of the lexer, and set the line, column, and offset counts back to their initial value.
       */
  def reset(chunk: java.lang.String): scala.Unit = js.native
  /**
       * Empty the internal buffer of the lexer, and set the line, column, and offset counts back to their initial value.
       */
  def reset(chunk: java.lang.String, state: LexerState): scala.Unit = js.native
  /**
       * Returns current state, which you can later pass it as the second argument
       * to reset() to explicitly control the internal state of the lexer.
       */
  def save(): LexerState = js.native
}


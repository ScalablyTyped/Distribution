package typings.nearley.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lexer extends js.Object {
  
  /**
    * Returns a string with an error message describing the line/col of the offending token.
    * You might like to include a preview of the line in question.
    */
  def formatError(token: Token, message: String): String = js.native
  
  /**
    * Returns e.g. {type, value, line, col, …}. Only the value attribute is required.
    */
  def next(): js.UndefOr[Token] = js.native
  
  /**
    * Sets the internal buffer to data, and restores line/col/state info taken from save().
    */
  def reset(data: String): Unit = js.native
  def reset(data: String, state: LexerState): Unit = js.native
  
  /**
    * Returns an object describing the current line/col etc. This allows us
    * to preserve this information between feed() calls, and also to support Parser#rewind().
    * The exact structure is lexer-specific; nearley doesn't care what's in it.
    */
  def save(): LexerState = js.native
}

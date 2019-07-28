package typings.moo.mooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * The column where the match begins, starting from 1.
    */
  var col: Double
  /**
    * The line number of the beginning of the match, starting from 1.
    */
  var line: Double
  /**
    * The number of line breaks found in the match. (Always zero if this rule has lineBreaks: false.)
    */
  var lineBreaks: Double
  /**
    * The number of bytes from the start of the buffer where the match starts.
    */
  var offset: Double
  /**
    * The complete match.
    */
  var text: String
  /**
    * The name of the group, as passed to compile.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The match contents.
    */
  var value: String
}

object Token {
  @scala.inline
  def apply(
    col: Double,
    line: Double,
    lineBreaks: Double,
    offset: Double,
    text: String,
    toString: () => String,
    value: String,
    `type`: String = null
  ): Token = {
    val __obj = js.Dynamic.literal(col = col, line = line, lineBreaks = lineBreaks, offset = offset, text = text, toString = js.Any.fromFunction0(toString), value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}


package typings.moo.mod

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
    value: String,
    `type`: String = null
  ): Token = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineBreaks = lineBreaks.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}


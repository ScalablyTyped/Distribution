package typings
package mooLib.mooMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * The column where the match begins, starting from 1.
    */
  var col: scala.Double
  /**
    * The line number of the beginning of the match, starting from 1.
    */
  var line: scala.Double
  /**
    * The number of line breaks found in the match. (Always zero if this rule has lineBreaks: false.)
    */
  var lineBreaks: scala.Double
  /**
    * The number of bytes from the start of the buffer where the match starts.
    */
  var offset: scala.Double
  /**
    * The complete match.
    */
  var text: java.lang.String
  /**
    * The name of the group, as passed to compile.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The match contents.
    */
  var value: java.lang.String
}

object Token {
  @scala.inline
  def apply(
    col: scala.Double,
    line: scala.Double,
    lineBreaks: scala.Double,
    offset: scala.Double,
    text: java.lang.String,
    toString: js.Function0[java.lang.String],
    value: java.lang.String,
    `type`: java.lang.String = null
  ): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("lineBreaks")(lineBreaks)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("value")(value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}


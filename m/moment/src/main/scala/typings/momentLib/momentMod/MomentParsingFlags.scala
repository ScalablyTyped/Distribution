package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentParsingFlags extends js.Object {
  var charsLeftOver: scala.Double
  var empty: scala.Boolean
   // null
  var invalidFormat: scala.Boolean
  var invalidMonth: java.lang.String | scala.Unit
  var iso: scala.Boolean
  var meridiem: java.lang.String | scala.Unit
  var nullInput: scala.Boolean
  var overflow: scala.Double
  var parsedDateParts: js.Array[_]
  var unusedInput: js.Array[java.lang.String]
  var unusedTokens: js.Array[java.lang.String]
  var userInvalidated: scala.Boolean
}

object MomentParsingFlags {
  @scala.inline
  def apply(
    charsLeftOver: scala.Double,
    empty: scala.Boolean,
    invalidFormat: scala.Boolean,
    invalidMonth: java.lang.String | scala.Unit,
    iso: scala.Boolean,
    meridiem: java.lang.String | scala.Unit,
    nullInput: scala.Boolean,
    overflow: scala.Double,
    parsedDateParts: js.Array[_],
    unusedInput: js.Array[java.lang.String],
    unusedTokens: js.Array[java.lang.String],
    userInvalidated: scala.Boolean
  ): MomentParsingFlags = {
    val __obj = js.Dynamic.literal(charsLeftOver = charsLeftOver, empty = empty, invalidFormat = invalidFormat, invalidMonth = invalidMonth.asInstanceOf[js.Any], iso = iso, meridiem = meridiem.asInstanceOf[js.Any], nullInput = nullInput, overflow = overflow, parsedDateParts = parsedDateParts, unusedInput = unusedInput, unusedTokens = unusedTokens, userInvalidated = userInvalidated)
  
    __obj.asInstanceOf[MomentParsingFlags]
  }
}


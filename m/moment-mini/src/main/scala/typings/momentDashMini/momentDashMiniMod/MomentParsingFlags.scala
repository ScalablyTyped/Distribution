package typings.momentDashMini.momentDashMiniMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentParsingFlags extends js.Object {
  var charsLeftOver: Double
  var empty: Boolean
   // null
  var invalidFormat: Boolean
  var invalidMonth: String | Unit
  var iso: Boolean
  var meridiem: String | Unit
  var nullInput: Boolean
  var overflow: Double
  var parsedDateParts: js.Array[_]
  var unusedInput: js.Array[String]
  var unusedTokens: js.Array[String]
  var userInvalidated: Boolean
}

object MomentParsingFlags {
  @scala.inline
  def apply(
    charsLeftOver: Double,
    empty: Boolean,
    invalidFormat: Boolean,
    invalidMonth: String | Unit,
    iso: Boolean,
    meridiem: String | Unit,
    nullInput: Boolean,
    overflow: Double,
    parsedDateParts: js.Array[_],
    unusedInput: js.Array[String],
    unusedTokens: js.Array[String],
    userInvalidated: Boolean
  ): MomentParsingFlags = {
    val __obj = js.Dynamic.literal(charsLeftOver = charsLeftOver, empty = empty, invalidFormat = invalidFormat, invalidMonth = invalidMonth.asInstanceOf[js.Any], iso = iso, meridiem = meridiem.asInstanceOf[js.Any], nullInput = nullInput, overflow = overflow, parsedDateParts = parsedDateParts, unusedInput = unusedInput, unusedTokens = unusedTokens, userInvalidated = userInvalidated)
  
    __obj.asInstanceOf[MomentParsingFlags]
  }
}


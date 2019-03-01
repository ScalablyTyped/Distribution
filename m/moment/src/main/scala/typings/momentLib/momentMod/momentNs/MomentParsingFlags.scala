package typings
package momentLib.momentMod.momentNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("charsLeftOver")(charsLeftOver)
    __obj.updateDynamic("empty")(empty)
    __obj.updateDynamic("invalidFormat")(invalidFormat)
    __obj.updateDynamic("invalidMonth")(invalidMonth.asInstanceOf[js.Any])
    __obj.updateDynamic("iso")(iso)
    __obj.updateDynamic("meridiem")(meridiem.asInstanceOf[js.Any])
    __obj.updateDynamic("nullInput")(nullInput)
    __obj.updateDynamic("overflow")(overflow)
    __obj.updateDynamic("parsedDateParts")(parsedDateParts)
    __obj.updateDynamic("unusedInput")(unusedInput)
    __obj.updateDynamic("unusedTokens")(unusedTokens)
    __obj.updateDynamic("userInvalidated")(userInvalidated)
    __obj.asInstanceOf[MomentParsingFlags]
  }
}


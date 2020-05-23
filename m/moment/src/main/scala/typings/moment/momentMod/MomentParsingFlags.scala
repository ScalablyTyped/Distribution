package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentParsingFlags extends js.Object {
  var charsLeftOver: Double
  var empty: Boolean
  var invalidFormat: Boolean
  var invalidMonth: String | Null
  var iso: Boolean
  var meridiem: String | Null
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
    iso: Boolean,
    nullInput: Boolean,
    overflow: Double,
    parsedDateParts: js.Array[_],
    unusedInput: js.Array[String],
    unusedTokens: js.Array[String],
    userInvalidated: Boolean,
    invalidMonth: String = null,
    meridiem: String = null
  ): MomentParsingFlags = {
    val __obj = js.Dynamic.literal(charsLeftOver = charsLeftOver.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], invalidFormat = invalidFormat.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], nullInput = nullInput.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], parsedDateParts = parsedDateParts.asInstanceOf[js.Any], unusedInput = unusedInput.asInstanceOf[js.Any], unusedTokens = unusedTokens.asInstanceOf[js.Any], userInvalidated = userInvalidated.asInstanceOf[js.Any], invalidMonth = invalidMonth.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentParsingFlags]
  }
}


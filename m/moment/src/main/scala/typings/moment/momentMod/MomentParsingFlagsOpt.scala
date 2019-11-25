package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentParsingFlagsOpt extends js.Object {
  var charsLeftOver: js.UndefOr[Double] = js.undefined
  var empty: js.UndefOr[Boolean] = js.undefined
  var invalidFormat: js.UndefOr[Boolean] = js.undefined
  var invalidMonth: js.UndefOr[String] = js.undefined
  var iso: js.UndefOr[Boolean] = js.undefined
  var meridiem: js.UndefOr[String] = js.undefined
  var nullInput: js.UndefOr[Boolean] = js.undefined
  var overflow: js.UndefOr[Double] = js.undefined
  var parsedDateParts: js.UndefOr[js.Array[_]] = js.undefined
  var unusedInput: js.UndefOr[js.Array[String]] = js.undefined
  var unusedTokens: js.UndefOr[js.Array[String]] = js.undefined
  var userInvalidated: js.UndefOr[Boolean] = js.undefined
}

object MomentParsingFlagsOpt {
  @scala.inline
  def apply(
    charsLeftOver: Int | Double = null,
    empty: js.UndefOr[Boolean] = js.undefined,
    invalidFormat: js.UndefOr[Boolean] = js.undefined,
    invalidMonth: String = null,
    iso: js.UndefOr[Boolean] = js.undefined,
    meridiem: String = null,
    nullInput: js.UndefOr[Boolean] = js.undefined,
    overflow: Int | Double = null,
    parsedDateParts: js.Array[_] = null,
    unusedInput: js.Array[String] = null,
    unusedTokens: js.Array[String] = null,
    userInvalidated: js.UndefOr[Boolean] = js.undefined
  ): MomentParsingFlagsOpt = {
    val __obj = js.Dynamic.literal()
    if (charsLeftOver != null) __obj.updateDynamic("charsLeftOver")(charsLeftOver.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (!js.isUndefined(invalidFormat)) __obj.updateDynamic("invalidFormat")(invalidFormat.asInstanceOf[js.Any])
    if (invalidMonth != null) __obj.updateDynamic("invalidMonth")(invalidMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(iso)) __obj.updateDynamic("iso")(iso.asInstanceOf[js.Any])
    if (meridiem != null) __obj.updateDynamic("meridiem")(meridiem.asInstanceOf[js.Any])
    if (!js.isUndefined(nullInput)) __obj.updateDynamic("nullInput")(nullInput.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (parsedDateParts != null) __obj.updateDynamic("parsedDateParts")(parsedDateParts.asInstanceOf[js.Any])
    if (unusedInput != null) __obj.updateDynamic("unusedInput")(unusedInput.asInstanceOf[js.Any])
    if (unusedTokens != null) __obj.updateDynamic("unusedTokens")(unusedTokens.asInstanceOf[js.Any])
    if (!js.isUndefined(userInvalidated)) __obj.updateDynamic("userInvalidated")(userInvalidated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentParsingFlagsOpt]
  }
}


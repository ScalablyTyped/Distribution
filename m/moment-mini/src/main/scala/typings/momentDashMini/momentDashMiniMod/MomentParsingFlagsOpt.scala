package typings.momentDashMini.momentDashMiniMod

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
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (!js.isUndefined(invalidFormat)) __obj.updateDynamic("invalidFormat")(invalidFormat)
    if (invalidMonth != null) __obj.updateDynamic("invalidMonth")(invalidMonth)
    if (!js.isUndefined(iso)) __obj.updateDynamic("iso")(iso)
    if (meridiem != null) __obj.updateDynamic("meridiem")(meridiem)
    if (!js.isUndefined(nullInput)) __obj.updateDynamic("nullInput")(nullInput)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (parsedDateParts != null) __obj.updateDynamic("parsedDateParts")(parsedDateParts)
    if (unusedInput != null) __obj.updateDynamic("unusedInput")(unusedInput)
    if (unusedTokens != null) __obj.updateDynamic("unusedTokens")(unusedTokens)
    if (!js.isUndefined(userInvalidated)) __obj.updateDynamic("userInvalidated")(userInvalidated)
    __obj.asInstanceOf[MomentParsingFlagsOpt]
  }
}


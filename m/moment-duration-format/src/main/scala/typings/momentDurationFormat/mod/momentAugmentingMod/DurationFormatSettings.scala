package typings.momentDurationFormat.mod.momentAugmentingMod

import typings.momentDurationFormat.momentDurationFormatBooleans.`false`
import typings.momentDurationFormat.momentDurationFormatBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationFormatSettings extends js.Object {
  var decimalSeparator: js.UndefOr[String] = js.undefined
  var forceLength: js.UndefOr[Boolean] = js.undefined
  var grouping: js.UndefOr[js.Array[Double]] = js.undefined
  var groupingSeparator: js.UndefOr[String] = js.undefined
  var largest: js.UndefOr[Double] = js.undefined
  var maxValue: js.UndefOr[Double] = js.undefined
  var minValue: js.UndefOr[Double] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var stopTrim: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | TemplateFunction] = js.undefined
  var trim: js.UndefOr[`false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String])] = js.undefined
  var trunc: js.UndefOr[`true`] = js.undefined
  var useGrouping: js.UndefOr[Boolean] = js.undefined
  var useLeftUnits: js.UndefOr[Boolean] = js.undefined
  var usePlural: js.UndefOr[Boolean] = js.undefined
  var useSignificantDigits: js.UndefOr[`true`] = js.undefined
  var useToLocaleString: js.UndefOr[Boolean] = js.undefined
  var userLocale: js.UndefOr[String] = js.undefined
}

object DurationFormatSettings {
  @scala.inline
  def apply(
    decimalSeparator: String = null,
    forceLength: js.UndefOr[Boolean] = js.undefined,
    grouping: js.Array[Double] = null,
    groupingSeparator: String = null,
    largest: js.UndefOr[Double] = js.undefined,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    stopTrim: String = null,
    template: String | TemplateFunction = null,
    trim: `false` | UnitOfTrimV1 | UnitOfTrim | String | (js.Array[UnitOfTrim | String]) = null,
    trunc: `true` = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined,
    useLeftUnits: js.UndefOr[Boolean] = js.undefined,
    usePlural: js.UndefOr[Boolean] = js.undefined,
    useSignificantDigits: `true` = null,
    useToLocaleString: js.UndefOr[Boolean] = js.undefined,
    userLocale: String = null
  ): DurationFormatSettings = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(forceLength)) __obj.updateDynamic("forceLength")(forceLength.get.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (groupingSeparator != null) __obj.updateDynamic("groupingSeparator")(groupingSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(largest)) __obj.updateDynamic("largest")(largest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (stopTrim != null) __obj.updateDynamic("stopTrim")(stopTrim.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (trunc != null) __obj.updateDynamic("trunc")(trunc.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLeftUnits)) __obj.updateDynamic("useLeftUnits")(useLeftUnits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePlural)) __obj.updateDynamic("usePlural")(usePlural.get.asInstanceOf[js.Any])
    if (useSignificantDigits != null) __obj.updateDynamic("useSignificantDigits")(useSignificantDigits.asInstanceOf[js.Any])
    if (!js.isUndefined(useToLocaleString)) __obj.updateDynamic("useToLocaleString")(useToLocaleString.get.asInstanceOf[js.Any])
    if (userLocale != null) __obj.updateDynamic("userLocale")(userLocale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationFormatSettings]
  }
}


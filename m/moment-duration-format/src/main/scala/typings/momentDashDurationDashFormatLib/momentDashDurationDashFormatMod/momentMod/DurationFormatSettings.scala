package typings
package momentDashDurationDashFormatLib.momentDashDurationDashFormatMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationFormatSettings extends js.Object {
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  var forceLength: js.UndefOr[scala.Boolean] = js.undefined
  var grouping: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var groupingSeparator: js.UndefOr[java.lang.String] = js.undefined
  var largest: js.UndefOr[scala.Double] = js.undefined
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double] = js.undefined
  var precision: js.UndefOr[scala.Double] = js.undefined
  var stopTrim: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | TemplateFunction] = js.undefined
  var trim: js.UndefOr[
    momentDashDurationDashFormatLib.momentDashDurationDashFormatLibNumbers.`false` | UnitOfTrimV1 | UnitOfTrim | java.lang.String | (js.Array[UnitOfTrim | java.lang.String])
  ] = js.undefined
  var trunc: js.UndefOr[momentDashDurationDashFormatLib.momentDashDurationDashFormatLibNumbers.`true`] = js.undefined
  var useGrouping: js.UndefOr[scala.Boolean] = js.undefined
  var useLeftUnits: js.UndefOr[scala.Boolean] = js.undefined
  var usePlural: js.UndefOr[scala.Boolean] = js.undefined
  var useSignificantDigits: js.UndefOr[momentDashDurationDashFormatLib.momentDashDurationDashFormatLibNumbers.`true`] = js.undefined
  var useToLocaleString: js.UndefOr[scala.Boolean] = js.undefined
  var userLocale: js.UndefOr[java.lang.String] = js.undefined
}

object DurationFormatSettings {
  @scala.inline
  def apply(
    decimalSeparator: java.lang.String = null,
    forceLength: js.UndefOr[scala.Boolean] = js.undefined,
    grouping: js.Array[scala.Double] = null,
    groupingSeparator: java.lang.String = null,
    largest: scala.Int | scala.Double = null,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null,
    precision: scala.Int | scala.Double = null,
    stopTrim: java.lang.String = null,
    template: java.lang.String | TemplateFunction = null,
    trim: momentDashDurationDashFormatLib.momentDashDurationDashFormatLibNumbers.`false` | UnitOfTrimV1 | UnitOfTrim | java.lang.String | (js.Array[UnitOfTrim | java.lang.String]) = null,
    trunc: momentDashDurationDashFormatLib.momentDashDurationDashFormatLibNumbers.`true` = null,
    useGrouping: js.UndefOr[scala.Boolean] = js.undefined,
    useLeftUnits: js.UndefOr[scala.Boolean] = js.undefined,
    usePlural: js.UndefOr[scala.Boolean] = js.undefined,
    useSignificantDigits: momentDashDurationDashFormatLib.momentDashDurationDashFormatLibNumbers.`true` = null,
    useToLocaleString: js.UndefOr[scala.Boolean] = js.undefined,
    userLocale: java.lang.String = null
  ): DurationFormatSettings = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (!js.isUndefined(forceLength)) __obj.updateDynamic("forceLength")(forceLength)
    if (grouping != null) __obj.updateDynamic("grouping")(grouping)
    if (groupingSeparator != null) __obj.updateDynamic("groupingSeparator")(groupingSeparator)
    if (largest != null) __obj.updateDynamic("largest")(largest.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (stopTrim != null) __obj.updateDynamic("stopTrim")(stopTrim)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    if (trunc != null) __obj.updateDynamic("trunc")(trunc)
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    if (!js.isUndefined(useLeftUnits)) __obj.updateDynamic("useLeftUnits")(useLeftUnits)
    if (!js.isUndefined(usePlural)) __obj.updateDynamic("usePlural")(usePlural)
    if (useSignificantDigits != null) __obj.updateDynamic("useSignificantDigits")(useSignificantDigits)
    if (!js.isUndefined(useToLocaleString)) __obj.updateDynamic("useToLocaleString")(useToLocaleString)
    if (userLocale != null) __obj.updateDynamic("userLocale")(userLocale)
    __obj.asInstanceOf[DurationFormatSettings]
  }
}


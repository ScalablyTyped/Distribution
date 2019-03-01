package typings
package atOracleOraclejetLib.ojgaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojStatusMeterGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var angleExtent: scala.Double
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var borderColor: java.lang.String
  var borderRadius: java.lang.String
  var center: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext
  var color: java.lang.String
  var indicatorSize: scala.Double
  var innerRadius: scala.Double
  var label: atOracleOraclejetLib.Anon_AutoCenter
  var max: scala.Double
  var metricLabel: atOracleOraclejetLib.Anon_AutoBillionCenter
  var min: scala.Double
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.circular | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  var plotArea: atOracleOraclejetLib.Anon_AutoBorderColor
  var readonly: scala.Boolean
  var referenceLines: js.Array[atOracleOraclejetLib.ojgaugeMod.ojStatusMeterGaugeNs.ReferenceLine]
  var startAngle: scala.Double
  var step: scala.Double | scala.Null
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var thresholdDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.onIndicator
  var thresholds: js.Array[atOracleOraclejetLib.ojgaugeMod.ojStatusMeterGaugeNs.Threshold]
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_1927274009
  val transientValue: scala.Double | scala.Null
  var value: scala.Double | scala.Null
  var visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object ojStatusMeterGaugeSettableProperties {
  @scala.inline
  def apply(
    angleExtent: scala.Double,
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    borderColor: java.lang.String,
    borderRadius: java.lang.String,
    center: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext,
    color: java.lang.String,
    indicatorSize: scala.Double,
    innerRadius: scala.Double,
    label: atOracleOraclejetLib.Anon_AutoCenter,
    max: scala.Double,
    metricLabel: atOracleOraclejetLib.Anon_AutoBillionCenter,
    min: scala.Double,
    orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.circular | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal,
    plotArea: atOracleOraclejetLib.Anon_AutoBorderColor,
    readonly: scala.Boolean,
    referenceLines: js.Array[atOracleOraclejetLib.ojgaugeMod.ojStatusMeterGaugeNs.ReferenceLine],
    startAngle: scala.Double,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    thresholdDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.currentOnly | atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.onIndicator,
    thresholds: js.Array[atOracleOraclejetLib.ojgaugeMod.ojStatusMeterGaugeNs.Threshold],
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_1927274009,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    visualEffects: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    animationDuration: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    transientValue: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): ojStatusMeterGaugeSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angleExtent")(angleExtent)
    __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("borderColor")(borderColor)
    __obj.updateDynamic("borderRadius")(borderRadius)
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("indicatorSize")(indicatorSize)
    __obj.updateDynamic("innerRadius")(innerRadius)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("metricLabel")(metricLabel)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.updateDynamic("plotArea")(plotArea)
    __obj.updateDynamic("readonly")(readonly)
    __obj.updateDynamic("referenceLines")(referenceLines)
    __obj.updateDynamic("startAngle")(startAngle)
    __obj.updateDynamic("svgClassName")(svgClassName)
    __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.updateDynamic("thresholdDisplay")(thresholdDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("thresholds")(thresholds)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeSettableProperties]
  }
}


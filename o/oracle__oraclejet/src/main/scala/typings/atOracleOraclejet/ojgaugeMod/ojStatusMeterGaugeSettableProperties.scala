package typings.atOracleOraclejet.ojgaugeMod

import typings.atOracleOraclejet.Anon_AutoBillionCenter
import typings.atOracleOraclejet.Anon_AutoBorderColor
import typings.atOracleOraclejet.Anon_AutoCenter
import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_1592349836
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.circular
import typings.atOracleOraclejet.atOracleOraclejetStrings.currentOnly
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.onIndicator
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.ojgaugeMod.ojStatusMeterGaugeNs.ReferenceLine
import typings.atOracleOraclejet.ojgaugeMod.ojStatusMeterGaugeNs.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojStatusMeterGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  var angleExtent: Double
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var borderColor: String
  var borderRadius: String
  var center: Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext
  var color: String
  var indicatorSize: Double
  var innerRadius: Double
  var label: Anon_AutoCenter
  var max: Double
  var metricLabel: Anon_AutoBillionCenter
  var min: Double
  var orientation: circular | vertical | horizontal
  var plotArea: Anon_AutoBorderColor
  var readonly: Boolean
  var referenceLines: js.Array[ReferenceLine]
  var startAngle: Double
  var step: Double | Null
  var svgClassName: String
  var svgStyle: js.Object
  var thresholdDisplay: currentOnly | all | onIndicator
  var thresholds: js.Array[Threshold]
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_1592349836
  val transientValue: Double | Null
  var value: Double | Null
  var visualEffects: none | auto
}

object ojStatusMeterGaugeSettableProperties {
  @scala.inline
  def apply(
    angleExtent: Double,
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    borderColor: String,
    borderRadius: String,
    center: Anon_ContextRendererAnonInsertAnonPreventDefaultCenterContext,
    color: String,
    indicatorSize: Double,
    innerRadius: Double,
    label: Anon_AutoCenter,
    max: Double,
    metricLabel: Anon_AutoBillionCenter,
    min: Double,
    orientation: circular | vertical | horizontal,
    plotArea: Anon_AutoBorderColor,
    readonly: Boolean,
    referenceLines: js.Array[ReferenceLine],
    startAngle: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholdDisplay: currentOnly | all | onIndicator,
    thresholds: js.Array[Threshold],
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultTooltipContext_1592349836,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue,
    visualEffects: none | auto,
    animationDuration: Int | Double = null,
    step: Int | Double = null,
    transientValue: Int | Double = null,
    value: Int | Double = null
  ): ojStatusMeterGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(angleExtent = angleExtent, animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], borderColor = borderColor, borderRadius = borderRadius, center = center, color = color, indicatorSize = indicatorSize, innerRadius = innerRadius, label = label, max = max, metricLabel = metricLabel, min = min, orientation = orientation.asInstanceOf[js.Any], plotArea = plotArea, readonly = readonly, referenceLines = referenceLines, startAngle = startAngle, svgClassName = svgClassName, svgStyle = svgStyle, thresholdDisplay = thresholdDisplay.asInstanceOf[js.Any], thresholds = thresholds, tooltip = tooltip, trackResize = trackResize.asInstanceOf[js.Any], translations = translations, visualEffects = visualEffects.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeSettableProperties]
  }
}


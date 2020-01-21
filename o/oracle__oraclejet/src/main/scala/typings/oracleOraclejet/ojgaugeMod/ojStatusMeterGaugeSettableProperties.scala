package typings.oracleOraclejet.ojgaugeMod

import typings.oracleOraclejet.AnonAutoBillionCenter
import typings.oracleOraclejet.AnonAutoBorderColor
import typings.oracleOraclejet.AnonAutoCenter
import typings.oracleOraclejet.AnonComponentNameLabelAndValue
import typings.oracleOraclejet.AnonContextRendererAnonInsertAnonPreventDefaultCenterContext
import typings.oracleOraclejet.AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392
import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.ReferenceLine
import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.circular
import typings.oracleOraclejet.oracleOraclejetStrings.currentOnly
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.onIndicator
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
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
  var center: AnonContextRendererAnonInsertAnonPreventDefaultCenterContext
  var color: String
  var indicatorSize: Double
  var innerRadius: Double
  var label: AnonAutoCenter
  var max: Double
  var metricLabel: AnonAutoBillionCenter
  var min: Double
  var orientation: circular | vertical | horizontal
  var plotArea: AnonAutoBorderColor
  var readonly: Boolean
  var referenceLines: js.Array[ReferenceLine]
  var startAngle: Double
  var step: Double | Null
  var svgClassName: String
  var svgStyle: js.Object
  var thresholdDisplay: currentOnly | all | onIndicator
  var thresholds: js.Array[Threshold]
  var tooltip: AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392
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
    center: AnonContextRendererAnonInsertAnonPreventDefaultCenterContext,
    color: String,
    indicatorSize: Double,
    innerRadius: Double,
    label: AnonAutoCenter,
    max: Double,
    metricLabel: AnonAutoBillionCenter,
    min: Double,
    orientation: circular | vertical | horizontal,
    plotArea: AnonAutoBorderColor,
    readonly: Boolean,
    referenceLines: js.Array[ReferenceLine],
    startAngle: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholdDisplay: currentOnly | all | onIndicator,
    thresholds: js.Array[Threshold],
    tooltip: AnonContextRendererAnonInsertAnonPreventDefaultTooltipContext848864392,
    trackResize: on | off,
    translations: AnonComponentNameLabelAndValue,
    visualEffects: none | auto,
    animationDuration: Int | Double = null,
    step: Int | Double = null,
    transientValue: Int | Double = null,
    value: Int | Double = null
  ): ojStatusMeterGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(angleExtent = angleExtent.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], indicatorSize = indicatorSize.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], referenceLines = referenceLines.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholdDisplay = thresholdDisplay.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeSettableProperties]
  }
}


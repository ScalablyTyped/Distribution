package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.Anon10
import typings.oracleOraclejet.Anon11
import typings.oracleOraclejet.AnonBorderColorBorderRadius
import typings.oracleOraclejet.AnonConverterPosition
import typings.oracleOraclejet.AnonLabelAndValue
import typings.oracleOraclejet.AnonPositionStyle
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGaugeSettableProperties> */
trait ojStatusMeterGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var angleExtent: js.UndefOr[Double] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var center: js.UndefOr[Anon10] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var indicatorSize: js.UndefOr[Double] = js.undefined
  var innerRadius: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[AnonPositionStyle] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var metricLabel: js.UndefOr[AnonConverterPosition] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[circular | vertical | horizontal] = js.undefined
  var plotArea: js.UndefOr[AnonBorderColorBorderRadius] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var referenceLines: js.UndefOr[js.Array[ReferenceLine]] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var thresholdDisplay: js.UndefOr[currentOnly | all | onIndicator] = js.undefined
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.undefined
  var tooltip: js.UndefOr[Anon11] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var transientValue: js.UndefOr[Double] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}

object ojStatusMeterGaugeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    angleExtent: Int | Double = null,
    animationDuration: Int | Double = null,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    borderColor: String = null,
    borderRadius: String = null,
    center: Anon10 = null,
    color: String = null,
    indicatorSize: Int | Double = null,
    innerRadius: Int | Double = null,
    label: AnonPositionStyle = null,
    max: Int | Double = null,
    metricLabel: AnonConverterPosition = null,
    min: Int | Double = null,
    orientation: circular | vertical | horizontal = null,
    plotArea: AnonBorderColorBorderRadius = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    referenceLines: js.Array[ReferenceLine] = null,
    startAngle: Int | Double = null,
    step: Int | Double = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    thresholdDisplay: currentOnly | all | onIndicator = null,
    thresholds: js.Array[Threshold] = null,
    tooltip: Anon11 = null,
    trackResize: on | off = null,
    transientValue: Int | Double = null,
    translations: AnonLabelAndValue = null,
    value: Int | Double = null,
    visualEffects: none | auto = null
  ): ojStatusMeterGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (angleExtent != null) __obj.updateDynamic("angleExtent")(angleExtent.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (indicatorSize != null) __obj.updateDynamic("indicatorSize")(indicatorSize.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (metricLabel != null) __obj.updateDynamic("metricLabel")(metricLabel.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (referenceLines != null) __obj.updateDynamic("referenceLines")(referenceLines.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (thresholdDisplay != null) __obj.updateDynamic("thresholdDisplay")(thresholdDisplay.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (transientValue != null) __obj.updateDynamic("transientValue")(transientValue.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visualEffects != null) __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeSettablePropertiesLenient]
  }
}


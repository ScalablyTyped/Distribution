package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.BorderColorBorderRadius
import typings.oracleOraclejet.anon.ConverterPosition
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.PositionStyle
import typings.oracleOraclejet.anon.`10`
import typings.oracleOraclejet.anon.`11`
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
  var center: js.UndefOr[`10`] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var indicatorSize: js.UndefOr[Double] = js.undefined
  var innerRadius: js.UndefOr[Double] = js.undefined
  var label: js.UndefOr[PositionStyle] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var metricLabel: js.UndefOr[ConverterPosition] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[circular | vertical | horizontal] = js.undefined
  var plotArea: js.UndefOr[BorderColorBorderRadius] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var referenceLines: js.UndefOr[js.Array[ReferenceLine]] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var thresholdDisplay: js.UndefOr[currentOnly | all | onIndicator] = js.undefined
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.undefined
  var tooltip: js.UndefOr[`11`] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var transientValue: js.UndefOr[Double] = js.undefined
  var translations: js.UndefOr[LabelAndValue] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}

object ojStatusMeterGaugeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    angleExtent: js.UndefOr[Double] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    borderColor: String = null,
    borderRadius: String = null,
    center: `10` = null,
    color: String = null,
    indicatorSize: js.UndefOr[Double] = js.undefined,
    innerRadius: js.UndefOr[Double] = js.undefined,
    label: PositionStyle = null,
    max: js.UndefOr[Double] = js.undefined,
    metricLabel: ConverterPosition = null,
    min: js.UndefOr[Double] = js.undefined,
    orientation: circular | vertical | horizontal = null,
    plotArea: BorderColorBorderRadius = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    referenceLines: js.Array[ReferenceLine] = null,
    startAngle: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    thresholdDisplay: currentOnly | all | onIndicator = null,
    thresholds: js.Array[Threshold] = null,
    tooltip: `11` = null,
    trackResize: on | off = null,
    transientValue: js.UndefOr[Double] = js.undefined,
    translations: LabelAndValue = null,
    value: js.UndefOr[Double] = js.undefined,
    visualEffects: none | auto = null
  ): ojStatusMeterGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(angleExtent)) __obj.updateDynamic("angleExtent")(angleExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorSize)) __obj.updateDynamic("indicatorSize")(indicatorSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRadius)) __obj.updateDynamic("innerRadius")(innerRadius.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (metricLabel != null) __obj.updateDynamic("metricLabel")(metricLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (referenceLines != null) __obj.updateDynamic("referenceLines")(referenceLines.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (thresholdDisplay != null) __obj.updateDynamic("thresholdDisplay")(thresholdDisplay.asInstanceOf[js.Any])
    if (thresholds != null) __obj.updateDynamic("thresholds")(thresholds.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (!js.isUndefined(transientValue)) __obj.updateDynamic("transientValue")(transientValue.get.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (visualEffects != null) __obj.updateDynamic("visualEffects")(visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeSettablePropertiesLenient]
  }
}


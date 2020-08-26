package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.BorderColorBorderRadius
import typings.oracleOraclejet.anon.ConverterPosition
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.PositionStyle
import typings.oracleOraclejet.anon.`12`
import typings.oracleOraclejet.anon.`13`
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
@js.native
trait ojStatusMeterGaugeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var angleExtent: js.UndefOr[Double] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var borderColor: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[String] = js.native
  var center: js.UndefOr[`12`] = js.native
  var color: js.UndefOr[String] = js.native
  var indicatorSize: js.UndefOr[Double] = js.native
  var innerRadius: js.UndefOr[Double] = js.native
  var label: js.UndefOr[PositionStyle] = js.native
  var max: js.UndefOr[Double] = js.native
  var metricLabel: js.UndefOr[ConverterPosition] = js.native
  var min: js.UndefOr[Double] = js.native
  var orientation: js.UndefOr[circular | vertical | horizontal] = js.native
  var plotArea: js.UndefOr[BorderColorBorderRadius] = js.native
  var readonly: js.UndefOr[Boolean] = js.native
  var referenceLines: js.UndefOr[js.Array[ReferenceLine]] = js.native
  var startAngle: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double | Null] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var thresholdDisplay: js.UndefOr[currentOnly | all | onIndicator] = js.native
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.native
  var tooltip: js.UndefOr[`13`] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var transientValue: js.UndefOr[Double | Null] = js.native
  var translations: js.UndefOr[LabelAndValue] = js.native
  var value: js.UndefOr[Double | Null] = js.native
  var visualEffects: js.UndefOr[none | auto] = js.native
}

object ojStatusMeterGaugeSettablePropertiesLenient {
  @scala.inline
  def apply(): ojStatusMeterGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojStatusMeterGaugeSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojStatusMeterGaugeSettablePropertiesLenientOps[Self <: ojStatusMeterGaugeSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngleExtent(value: Double): Self = this.set("angleExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngleExtent: Self = this.set("angleExtent", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDataChange: Self = this.set("animationOnDataChange", js.undefined)
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDisplay: Self = this.set("animationOnDisplay", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setCenter(value: `12`): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setIndicatorSize(value: Double): Self = this.set("indicatorSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorSize: Self = this.set("indicatorSize", js.undefined)
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRadius: Self = this.set("innerRadius", js.undefined)
    @scala.inline
    def setLabel(value: PositionStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMetricLabel(value: ConverterPosition): Self = this.set("metricLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetricLabel: Self = this.set("metricLabel", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOrientation(value: circular | vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPlotArea(value: BorderColorBorderRadius): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotArea: Self = this.set("plotArea", js.undefined)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    @scala.inline
    def setReferenceLinesVarargs(value: ReferenceLine*): Self = this.set("referenceLines", js.Array(value :_*))
    @scala.inline
    def setReferenceLines(value: js.Array[ReferenceLine]): Self = this.set("referenceLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceLines: Self = this.set("referenceLines", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStepNull: Self = this.set("step", null)
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    @scala.inline
    def setThresholdDisplay(value: currentOnly | all | onIndicator): Self = this.set("thresholdDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholdDisplay: Self = this.set("thresholdDisplay", js.undefined)
    @scala.inline
    def setThresholdsVarargs(value: Threshold*): Self = this.set("thresholds", js.Array(value :_*))
    @scala.inline
    def setThresholds(value: js.Array[Threshold]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
    @scala.inline
    def setTooltip(value: `13`): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTransientValue(value: Double): Self = this.set("transientValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransientValue: Self = this.set("transientValue", js.undefined)
    @scala.inline
    def setTransientValueNull: Self = this.set("transientValue", null)
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    @scala.inline
    def setVisualEffects(value: none | auto): Self = this.set("visualEffects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisualEffects: Self = this.set("visualEffects", js.undefined)
  }
  
}


package typings.oracleOraclejet.ojgaugeMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojStatusMeterGaugeSettableProperties extends dvtBaseGaugeSettableProperties {
  
  var angleExtent: Double = js.native
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationOnDataChange: auto | none = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var borderColor: String = js.native
  
  var borderRadius: String = js.native
  
  var center: `12` = js.native
  
  var color: String = js.native
  
  var indicatorSize: Double = js.native
  
  var innerRadius: Double = js.native
  
  var label: PositionStyle = js.native
  
  var max: Double = js.native
  
  var metricLabel: ConverterPosition = js.native
  
  var min: Double = js.native
  
  var orientation: circular | vertical | horizontal = js.native
  
  var plotArea: BorderColorBorderRadius = js.native
  
  var readonly: Boolean = js.native
  
  var referenceLines: js.Array[ReferenceLine] = js.native
  
  var startAngle: Double = js.native
  
  var step: Double | Null = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var thresholdDisplay: currentOnly | all | onIndicator = js.native
  
  var thresholds: js.Array[Threshold] = js.native
  
  var tooltip: `13` = js.native
  
  val transientValue: Double | Null = js.native
  
  var value: Double | Null = js.native
  
  var visualEffects: none | auto = js.native
}
object ojStatusMeterGaugeSettableProperties {
  
  @scala.inline
  def apply(
    angleExtent: Double,
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    borderColor: String,
    borderRadius: String,
    center: `12`,
    color: String,
    indicatorSize: Double,
    innerRadius: Double,
    label: PositionStyle,
    max: Double,
    metricLabel: ConverterPosition,
    min: Double,
    orientation: circular | vertical | horizontal,
    plotArea: BorderColorBorderRadius,
    readonly: Boolean,
    referenceLines: js.Array[ReferenceLine],
    startAngle: Double,
    svgClassName: String,
    svgStyle: js.Object,
    thresholdDisplay: currentOnly | all | onIndicator,
    thresholds: js.Array[Threshold],
    tooltip: `13`,
    trackResize: on | off,
    translations: LabelAndValue,
    visualEffects: none | auto
  ): ojStatusMeterGaugeSettableProperties = {
    val __obj = js.Dynamic.literal(angleExtent = angleExtent.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], indicatorSize = indicatorSize.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], referenceLines = referenceLines.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholdDisplay = thresholdDisplay.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojStatusMeterGaugeSettableProperties]
  }
  
  @scala.inline
  implicit class ojStatusMeterGaugeSettablePropertiesOps[Self <: ojStatusMeterGaugeSettableProperties] (val x: Self) extends AnyVal {
    
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
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: `12`): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSize(value: Double): Self = this.set("indicatorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadius(value: Double): Self = this.set("innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: PositionStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricLabel(value: ConverterPosition): Self = this.set("metricLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: circular | vertical | horizontal): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotArea(value: BorderColorBorderRadius): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceLinesVarargs(value: ReferenceLine*): Self = this.set("referenceLines", js.Array(value :_*))
    
    @scala.inline
    def setReferenceLines(value: js.Array[ReferenceLine]): Self = this.set("referenceLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdDisplay(value: currentOnly | all | onIndicator): Self = this.set("thresholdDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsVarargs(value: Threshold*): Self = this.set("thresholds", js.Array(value :_*))
    
    @scala.inline
    def setThresholds(value: js.Array[Threshold]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: `13`): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualEffects(value: none | auto): Self = this.set("visualEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNull: Self = this.set("step", null)
    
    @scala.inline
    def setTransientValue(value: Double): Self = this.set("transientValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValueNull: Self = this.set("transientValue", null)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}

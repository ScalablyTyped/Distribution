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
import org.scalablytyped.runtime.StObject
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
  implicit class ojStatusMeterGaugeSettablePropertiesMutableBuilder[Self <: ojStatusMeterGaugeSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleExtent(value: Double): Self = StObject.set(x, "angleExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: `12`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSize(value: Double): Self = StObject.set(x, "indicatorSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: PositionStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricLabel(value: ConverterPosition): Self = StObject.set(x, "metricLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: circular | vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotArea(value: BorderColorBorderRadius): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceLines(value: js.Array[ReferenceLine]): Self = StObject.set(x, "referenceLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceLinesVarargs(value: ReferenceLine*): Self = StObject.set(x, "referenceLines", js.Array(value :_*))
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepNull: Self = StObject.set(x, "step", null)
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdDisplay(value: currentOnly | all | onIndicator): Self = StObject.set(x, "thresholdDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value :_*))
    
    @scala.inline
    def setTooltip(value: `13`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransientValueNull: Self = StObject.set(x, "transientValue", null)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
  }
}

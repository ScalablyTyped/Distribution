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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojStatusMeterGaugeSettableProperties
  extends StObject
     with dvtBaseGaugeSettableProperties {
  
  var angleExtent: Double
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var animationOnDataChange: auto | none
  
  var animationOnDisplay: auto | none
  
  var borderColor: String
  
  var borderRadius: String
  
  var center: `12`
  
  var color: String
  
  var indicatorSize: Double
  
  var innerRadius: Double
  
  var label: PositionStyle
  
  var max: Double
  
  var metricLabel: ConverterPosition
  
  var min: Double
  
  var orientation: circular | vertical | horizontal
  
  var plotArea: BorderColorBorderRadius
  
  var readonly: Boolean
  
  var referenceLines: js.Array[ReferenceLine]
  
  var startAngle: Double
  
  var step: Double | Null
  
  var svgClassName: String
  
  var svgStyle: js.Object
  
  var thresholdDisplay: currentOnly | all | onIndicator
  
  var thresholds: js.Array[Threshold]
  
  var tooltip: `13`
  
  val transientValue: Double | Null
  
  var value: Double | Null
  
  var visualEffects: none | auto
}
object ojStatusMeterGaugeSettableProperties {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(angleExtent = angleExtent.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], indicatorSize = indicatorSize.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], referenceLines = referenceLines.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], thresholdDisplay = thresholdDisplay.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], visualEffects = visualEffects.asInstanceOf[js.Any], step = null, transientValue = null, value = null)
    __obj.asInstanceOf[ojStatusMeterGaugeSettableProperties]
  }
  
  extension [Self <: ojStatusMeterGaugeSettableProperties](x: Self) {
    
    inline def setAngleExtent(value: Double): Self = StObject.set(x, "angleExtent", value.asInstanceOf[js.Any])
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: `12`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIndicatorSize(value: Double): Self = StObject.set(x, "indicatorSize", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: PositionStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMetricLabel(value: ConverterPosition): Self = StObject.set(x, "metricLabel", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: circular | vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPlotArea(value: BorderColorBorderRadius): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReferenceLines(value: js.Array[ReferenceLine]): Self = StObject.set(x, "referenceLines", value.asInstanceOf[js.Any])
    
    inline def setReferenceLinesVarargs(value: ReferenceLine*): Self = StObject.set(x, "referenceLines", js.Array(value*))
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setThresholdDisplay(value: currentOnly | all | onIndicator): Self = StObject.set(x, "thresholdDisplay", value.asInstanceOf[js.Any])
    
    inline def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setTooltip(value: `13`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
    
    inline def setTransientValueNull: Self = StObject.set(x, "transientValue", null)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
  }
}

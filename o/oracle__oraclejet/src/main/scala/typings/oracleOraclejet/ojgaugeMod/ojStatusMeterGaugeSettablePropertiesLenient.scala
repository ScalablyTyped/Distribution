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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.ojStatusMeterGaugeSettableProperties> */
trait ojStatusMeterGaugeSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var angleExtent: js.UndefOr[Double] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[String] = js.undefined
  
  var center: js.UndefOr[`12`] = js.undefined
  
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
  
  var step: js.UndefOr[Double | Null] = js.undefined
  
  var svgClassName: js.UndefOr[String] = js.undefined
  
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  
  var thresholdDisplay: js.UndefOr[currentOnly | all | onIndicator] = js.undefined
  
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.undefined
  
  var tooltip: js.UndefOr[`13`] = js.undefined
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var transientValue: js.UndefOr[Double | Null] = js.undefined
  
  var translations: js.UndefOr[LabelAndValue] = js.undefined
  
  var value: js.UndefOr[Double | Null] = js.undefined
  
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}
object ojStatusMeterGaugeSettablePropertiesLenient {
  
  inline def apply(): ojStatusMeterGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojStatusMeterGaugeSettablePropertiesLenient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojStatusMeterGaugeSettablePropertiesLenient] (val x: Self) extends AnyVal {
    
    inline def setAngleExtent(value: Double): Self = StObject.set(x, "angleExtent", value.asInstanceOf[js.Any])
    
    inline def setAngleExtentUndefined: Self = StObject.set(x, "angleExtent", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDataChangeUndefined: Self = StObject.set(x, "animationOnDataChange", js.undefined)
    
    inline def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setCenter(value: `12`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIndicatorSize(value: Double): Self = StObject.set(x, "indicatorSize", value.asInstanceOf[js.Any])
    
    inline def setIndicatorSizeUndefined: Self = StObject.set(x, "indicatorSize", js.undefined)
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    inline def setLabel(value: PositionStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMetricLabel(value: ConverterPosition): Self = StObject.set(x, "metricLabel", value.asInstanceOf[js.Any])
    
    inline def setMetricLabelUndefined: Self = StObject.set(x, "metricLabel", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOrientation(value: circular | vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPlotArea(value: BorderColorBorderRadius): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setReferenceLines(value: js.Array[ReferenceLine]): Self = StObject.set(x, "referenceLines", value.asInstanceOf[js.Any])
    
    inline def setReferenceLinesUndefined: Self = StObject.set(x, "referenceLines", js.undefined)
    
    inline def setReferenceLinesVarargs(value: ReferenceLine*): Self = StObject.set(x, "referenceLines", js.Array(value*))
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    inline def setThresholdDisplay(value: currentOnly | all | onIndicator): Self = StObject.set(x, "thresholdDisplay", value.asInstanceOf[js.Any])
    
    inline def setThresholdDisplayUndefined: Self = StObject.set(x, "thresholdDisplay", js.undefined)
    
    inline def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    inline def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setTooltip(value: `13`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTransientValue(value: Double): Self = StObject.set(x, "transientValue", value.asInstanceOf[js.Any])
    
    inline def setTransientValueNull: Self = StObject.set(x, "transientValue", null)
    
    inline def setTransientValueUndefined: Self = StObject.set(x, "transientValue", js.undefined)
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
    
    inline def setVisualEffectsUndefined: Self = StObject.set(x, "visualEffects", js.undefined)
  }
}

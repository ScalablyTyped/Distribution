package typings.oracleOraclejet.ojgaugeMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.Text
import typings.oracleOraclejet.anon.TextType
import typings.oracleOraclejet.anon.`10`
import typings.oracleOraclejet.ojgaugeMod.ojLedGauge.Threshold
import typings.oracleOraclejet.oracleOraclejetNumbers.`0`
import typings.oracleOraclejet.oracleOraclejetNumbers.`180`
import typings.oracleOraclejet.oracleOraclejetNumbers.`270`
import typings.oracleOraclejet.oracleOraclejetNumbers.`90`
import typings.oracleOraclejet.oracleOraclejetStrings.arrow
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgauge.ojLedGaugeSettableProperties> */
trait ojLedGaugeSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[Text] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var metricLabel: js.UndefOr[TextType] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[`90` | `180` | `270` | `0`] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var svgClassName: js.UndefOr[String] = js.undefined
  
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  
  var thresholds: js.UndefOr[js.Array[Threshold]] = js.undefined
  
  var tooltip: js.UndefOr[`10`] = js.undefined
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var translations: js.UndefOr[LabelAndValue] = js.undefined
  
  var `type`: js.UndefOr[arrow | diamond | square | rectangle | triangle | star | human | circle] = js.undefined
  
  var value: js.UndefOr[Double | Null] = js.undefined
  
  var visualEffects: js.UndefOr[none | auto] = js.undefined
}
object ojLedGaugeSettablePropertiesLenient {
  
  inline def apply(): ojLedGaugeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLedGaugeSettablePropertiesLenient]
  }
  
  extension [Self <: ojLedGaugeSettablePropertiesLenient](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLabel(value: Text): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMetricLabel(value: TextType): Self = StObject.set(x, "metricLabel", value.asInstanceOf[js.Any])
    
    inline def setMetricLabelUndefined: Self = StObject.set(x, "metricLabel", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setRotation(value: `90` | `180` | `270` | `0`): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    inline def setThresholds(value: js.Array[Threshold]): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
    
    inline def setThresholdsUndefined: Self = StObject.set(x, "thresholds", js.undefined)
    
    inline def setThresholdsVarargs(value: Threshold*): Self = StObject.set(x, "thresholds", js.Array(value*))
    
    inline def setTooltip(value: `10`): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setType(value: arrow | diamond | square | rectangle | triangle | star | human | circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisualEffects(value: none | auto): Self = StObject.set(x, "visualEffects", value.asInstanceOf[js.Any])
    
    inline def setVisualEffectsUndefined: Self = StObject.set(x, "visualEffects", js.undefined)
  }
}

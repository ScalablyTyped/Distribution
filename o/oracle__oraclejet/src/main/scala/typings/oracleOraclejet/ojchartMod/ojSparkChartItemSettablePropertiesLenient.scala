package typings.oracleOraclejet.ojchartMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojchart.ojSparkChartItemSettableProperties> */
trait ojSparkChartItemSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[String] = js.undefined
  
  var high: js.UndefOr[Double | Null] = js.undefined
  
  var low: js.UndefOr[Double | Null] = js.undefined
  
  var markerDisplayed: js.UndefOr[off | on] = js.undefined
  
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  
  var markerSize: js.UndefOr[Double] = js.undefined
  
  var svgClassName: js.UndefOr[String] = js.undefined
  
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  
  var value: js.UndefOr[Double | Null] = js.undefined
}
object ojSparkChartItemSettablePropertiesLenient {
  
  inline def apply(): ojSparkChartItemSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojSparkChartItemSettablePropertiesLenient]
  }
  
  extension [Self <: ojSparkChartItemSettablePropertiesLenient](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighNull: Self = StObject.set(x, "high", null)
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowNull: Self = StObject.set(x, "low", null)
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setMarkerDisplayed(value: off | on): Self = StObject.set(x, "markerDisplayed", value.asInstanceOf[js.Any])
    
    inline def setMarkerDisplayedUndefined: Self = StObject.set(x, "markerDisplayed", js.undefined)
    
    inline def setMarkerShape(value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
    
    inline def setMarkerShapeUndefined: Self = StObject.set(x, "markerShape", js.undefined)
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    inline def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    inline def setSvgClassNameUndefined: Self = StObject.set(x, "svgClassName", js.undefined)
    
    inline def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    inline def setSvgStyleUndefined: Self = StObject.set(x, "svgStyle", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

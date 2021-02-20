package typings.oracleOraclejet.ojchartMod

import typings.oracleOraclejet.mod.JetSettableProperties
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSparkChartItemSettableProperties extends JetSettableProperties {
  
  var borderColor: String = js.native
  
  var color: String = js.native
  
  var date: String = js.native
  
  var high: Double | Null = js.native
  
  var low: Double | Null = js.native
  
  var markerDisplayed: off | on = js.native
  
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.native
  
  var markerSize: Double = js.native
  
  var svgClassName: String = js.native
  
  var svgStyle: js.Object = js.native
  
  var value: Double | Null = js.native
}
object ojSparkChartItemSettableProperties {
  
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    date: String,
    markerDisplayed: off | on,
    markerSize: Double,
    svgClassName: String,
    svgStyle: js.Object
  ): ojSparkChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartItemSettableProperties]
  }
  
  @scala.inline
  implicit class ojSparkChartItemSettablePropertiesMutableBuilder[Self <: ojSparkChartItemSettableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighNull: Self = StObject.set(x, "high", null)
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowNull: Self = StObject.set(x, "low", null)
    
    @scala.inline
    def setMarkerDisplayed(value: off | on): Self = StObject.set(x, "markerDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerShape(value: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String): Self = StObject.set(x, "markerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerShapeUndefined: Self = StObject.set(x, "markerShape", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgClassName(value: String): Self = StObject.set(x, "svgClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgStyle(value: js.Object): Self = StObject.set(x, "svgStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}

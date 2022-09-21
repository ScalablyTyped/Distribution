package typings.nivoCore.anon

import typings.nivoCore.nivoCoreNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSize extends StObject {
  
  var fontSize: String | `0`
  
  var lineColor: String
  
  var lineStrokeWidth: Double
  
  var text: PartialCSSProperties
  
  var textColor: String
}
object FontSize {
  
  inline def apply(
    fontSize: String | `0`,
    lineColor: String,
    lineStrokeWidth: Double,
    text: PartialCSSProperties,
    textColor: String
  ): FontSize = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], lineStrokeWidth = lineStrokeWidth.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSize]
  }
  
  extension [Self <: FontSize](x: Self) {
    
    inline def setFontSize(value: String | `0`): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineStrokeWidth(value: Double): Self = StObject.set(x, "lineStrokeWidth", value.asInstanceOf[js.Any])
    
    inline def setText(value: PartialCSSProperties): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}

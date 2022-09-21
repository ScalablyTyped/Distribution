package typings.nivoLegends.anon

import typings.nivoLegends.nivoLegendsStrings.alphabetic
import typings.nivoLegends.nivoLegendsStrings.central
import typings.nivoLegends.nivoLegendsStrings.end
import typings.nivoLegends.nivoLegendsStrings.hanging
import typings.nivoLegends.nivoLegendsStrings.middle
import typings.nivoLegends.nivoLegendsStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var text: String
  
  var textHorizontalAlign: start | middle | end
  
  var textVerticalAlign: alphabetic | central | hanging
  
  var textX: Double
  
  var textY: Double
  
  var x1: Double
  
  var x2: Double
  
  var y1: Double
  
  var y2: Double
}
object Text {
  
  inline def apply(
    text: String,
    textHorizontalAlign: start | middle | end,
    textVerticalAlign: alphabetic | central | hanging,
    textX: Double,
    textY: Double,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], textHorizontalAlign = textHorizontalAlign.asInstanceOf[js.Any], textVerticalAlign = textVerticalAlign.asInstanceOf[js.Any], textX = textX.asInstanceOf[js.Any], textY = textY.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  extension [Self <: Text](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextHorizontalAlign(value: start | middle | end): Self = StObject.set(x, "textHorizontalAlign", value.asInstanceOf[js.Any])
    
    inline def setTextVerticalAlign(value: alphabetic | central | hanging): Self = StObject.set(x, "textVerticalAlign", value.asInstanceOf[js.Any])
    
    inline def setTextX(value: Double): Self = StObject.set(x, "textX", value.asInstanceOf[js.Any])
    
    inline def setTextY(value: Double): Self = StObject.set(x, "textY", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}

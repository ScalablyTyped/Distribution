package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descent extends StObject {
  
  var ascent: Any
  
  var descent: Any
  
  var fallbackFont: String
  
  var lineGap: Any
  
  var sizeAdjust: String
}
object Descent {
  
  inline def apply(ascent: Any, descent: Any, fallbackFont: String, lineGap: Any, sizeAdjust: String): Descent = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fallbackFont = fallbackFont.asInstanceOf[js.Any], lineGap = lineGap.asInstanceOf[js.Any], sizeAdjust = sizeAdjust.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descent]
  }
  
  extension [Self <: Descent](x: Self) {
    
    inline def setAscent(value: Any): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    inline def setDescent(value: Any): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    inline def setFallbackFont(value: String): Self = StObject.set(x, "fallbackFont", value.asInstanceOf[js.Any])
    
    inline def setLineGap(value: Any): Self = StObject.set(x, "lineGap", value.asInstanceOf[js.Any])
    
    inline def setSizeAdjust(value: String): Self = StObject.set(x, "sizeAdjust", value.asInstanceOf[js.Any])
  }
}

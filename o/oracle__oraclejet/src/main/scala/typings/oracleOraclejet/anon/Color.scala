package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[String] = js.undefined
  
  var diameter: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[String] = js.undefined
  
  var endOpacity: js.UndefOr[Double] = js.undefined
  
  var offsetX: js.UndefOr[String] = js.undefined
  
  var offsetY: js.UndefOr[String] = js.undefined
  
  var startOpacity: js.UndefOr[Double] = js.undefined
  
  var timingFunction: js.UndefOr[String] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDiameter(value: String): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndOpacity(value: Double): Self = StObject.set(x, "endOpacity", value.asInstanceOf[js.Any])
    
    inline def setEndOpacityUndefined: Self = StObject.set(x, "endOpacity", js.undefined)
    
    inline def setOffsetX(value: String): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: String): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setStartOpacity(value: Double): Self = StObject.set(x, "startOpacity", value.asInstanceOf[js.Any])
    
    inline def setStartOpacityUndefined: Self = StObject.set(x, "startOpacity", js.undefined)
    
    inline def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
  }
}

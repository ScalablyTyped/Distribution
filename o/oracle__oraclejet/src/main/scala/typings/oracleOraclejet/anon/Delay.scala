package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: js.UndefOr[String] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[String] = js.undefined
  
  var endMaxHeight: js.UndefOr[String] = js.undefined
  
  var endMaxWidth: js.UndefOr[String] = js.undefined
  
  var persist: js.UndefOr[String] = js.undefined
  
  var startMaxHeight: js.UndefOr[String] = js.undefined
  
  var startMaxWidth: js.UndefOr[String] = js.undefined
  
  var timingFunction: js.UndefOr[String] = js.undefined
}
object Delay {
  
  inline def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  extension [Self <: Delay](x: Self) {
    
    inline def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndMaxHeight(value: String): Self = StObject.set(x, "endMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setEndMaxHeightUndefined: Self = StObject.set(x, "endMaxHeight", js.undefined)
    
    inline def setEndMaxWidth(value: String): Self = StObject.set(x, "endMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setEndMaxWidthUndefined: Self = StObject.set(x, "endMaxWidth", js.undefined)
    
    inline def setPersist(value: String): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setStartMaxHeight(value: String): Self = StObject.set(x, "startMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setStartMaxHeightUndefined: Self = StObject.set(x, "startMaxHeight", js.undefined)
    
    inline def setStartMaxWidth(value: String): Self = StObject.set(x, "startMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setStartMaxWidthUndefined: Self = StObject.set(x, "startMaxWidth", js.undefined)
    
    inline def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
  }
}

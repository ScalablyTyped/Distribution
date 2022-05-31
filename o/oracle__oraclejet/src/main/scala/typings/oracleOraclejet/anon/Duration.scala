package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var delay: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[String] = js.undefined
  
  var endOpacity: js.UndefOr[Double] = js.undefined
  
  var persist: js.UndefOr[String] = js.undefined
  
  var startOpacity: js.UndefOr[Double] = js.undefined
  
  var timingFunction: js.UndefOr[String] = js.undefined
}
object Duration {
  
  inline def apply(): Duration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEndOpacity(value: Double): Self = StObject.set(x, "endOpacity", value.asInstanceOf[js.Any])
    
    inline def setEndOpacityUndefined: Self = StObject.set(x, "endOpacity", js.undefined)
    
    inline def setPersist(value: String): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
    
    inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    
    inline def setStartOpacity(value: Double): Self = StObject.set(x, "startOpacity", value.asInstanceOf[js.Any])
    
    inline def setStartOpacityUndefined: Self = StObject.set(x, "startOpacity", js.undefined)
    
    inline def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
  }
}

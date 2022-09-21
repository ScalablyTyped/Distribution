package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSourceInfo extends StObject {
  
  var active: Nanos
  
  var error: js.UndefOr[ApiError] = js.undefined
  
  var lag: Double
  
  var name: String
}
object StreamSourceInfo {
  
  inline def apply(active: Nanos, lag: Double, name: String): StreamSourceInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lag = lag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSourceInfo]
  }
  
  extension [Self <: StreamSourceInfo](x: Self) {
    
    inline def setActive(value: Nanos): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setError(value: ApiError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLag(value: Double): Self = StObject.set(x, "lag", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

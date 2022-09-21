package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostContextChangedPayload extends StObject {
  
  var context: Any
  
  var reason: HostContextChangedReasons
}
object HostContextChangedPayload {
  
  inline def apply(context: Any, reason: HostContextChangedReasons): HostContextChangedPayload = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostContextChangedPayload]
  }
  
  extension [Self <: HostContextChangedPayload](x: Self) {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setReason(value: HostContextChangedReasons): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}

package typings.next.anon

import typings.next.distTelemetryEventsBuildMod.EventBuildOptimized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventNamePayload extends StObject {
  
  var eventName: String
  
  var payload: EventBuildOptimized
}
object EventNamePayload {
  
  inline def apply(eventName: String, payload: EventBuildOptimized): EventNamePayload = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNamePayload]
  }
  
  extension [Self <: EventNamePayload](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: EventBuildOptimized): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}

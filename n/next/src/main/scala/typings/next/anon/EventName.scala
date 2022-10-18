package typings.next.anon

import typings.next.distTelemetryEventsBuildMod.EventBuildCompleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventName extends StObject {
  
  var eventName: String
  
  var payload: EventBuildCompleted_
}
object EventName {
  
  inline def apply(eventName: String, payload: EventBuildCompleted_): EventName = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventName]
  }
  
  extension [Self <: EventName](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: EventBuildCompleted_): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}

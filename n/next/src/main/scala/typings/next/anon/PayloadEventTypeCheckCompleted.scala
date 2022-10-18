package typings.next.anon

import typings.next.distTelemetryEventsBuildMod.EventTypeCheckCompleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadEventTypeCheckCompleted extends StObject {
  
  var eventName: String
  
  var payload: EventTypeCheckCompleted_
}
object PayloadEventTypeCheckCompleted {
  
  inline def apply(eventName: String, payload: EventTypeCheckCompleted_): PayloadEventTypeCheckCompleted = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadEventTypeCheckCompleted]
  }
  
  extension [Self <: PayloadEventTypeCheckCompleted](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: EventTypeCheckCompleted_): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}

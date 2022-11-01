package typings.next.anon

import typings.next.distTelemetryEventsSessionStoppedMod.EventCliSessionStopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadEventCliSessionStopped extends StObject {
  
  var eventName: String
  
  var payload: EventCliSessionStopped
}
object PayloadEventCliSessionStopped {
  
  inline def apply(eventName: String, payload: EventCliSessionStopped): PayloadEventCliSessionStopped = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadEventCliSessionStopped]
  }
  
  extension [Self <: PayloadEventCliSessionStopped](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: EventCliSessionStopped): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}

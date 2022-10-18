package typings.next.anon

import typings.next.distTelemetryEventsVersionMod.EventCliSessionStarted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadEventCliSessionStarted extends StObject {
  
  var eventName: String
  
  var payload: EventCliSessionStarted
}
object PayloadEventCliSessionStarted {
  
  inline def apply(eventName: String, payload: EventCliSessionStarted): PayloadEventCliSessionStarted = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadEventCliSessionStarted]
  }
  
  extension [Self <: PayloadEventCliSessionStarted](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: EventCliSessionStarted): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}

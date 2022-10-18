package typings.next.anon

import typings.next.distTelemetryEventsBuildMod.EventLintCheckCompleted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventNameString extends StObject {
  
  var eventName: String
  
  var payload: EventLintCheckCompleted_
}
object EventNameString {
  
  inline def apply(eventName: String, payload: EventLintCheckCompleted_): EventNameString = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNameString]
  }
  
  extension [Self <: EventNameString](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: EventLintCheckCompleted_): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}

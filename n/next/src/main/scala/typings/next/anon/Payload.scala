package typings.next.anon

import typings.next.distTelemetryEventsBuildMod.EventBuildFeatureUsage_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  var eventName: String
  
  var payload: EventBuildFeatureUsage_
}
object Payload {
  
  inline def apply(eventName: String, payload: EventBuildFeatureUsage_): Payload = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  extension [Self <: Payload](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: EventBuildFeatureUsage_): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}

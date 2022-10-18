package typings.next

import typings.next.anon.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryEventsSwcLoadFailureMod {
  
  @JSImport("next/dist/telemetry/events/swc-load-failure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventSwcLoadFailure(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventSwcLoadFailure")().asInstanceOf[js.Promise[Unit]]
  inline def eventSwcLoadFailure(event: Arch): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventSwcLoadFailure")(event.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait EventSwcLoadFailure_ extends StObject {
    
    var eventName: String
    
    var payload: Arch
  }
  object EventSwcLoadFailure_ {
    
    inline def apply(eventName: String, payload: Arch): EventSwcLoadFailure_ = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSwcLoadFailure_]
    }
    
    extension [Self <: EventSwcLoadFailure_](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Arch): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}

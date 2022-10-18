package typings.next

import typings.next.anon.PackageName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryEventsPluginsMod {
  
  @JSImport("next/dist/telemetry/events/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventNextPlugins(dir: String): js.Promise[js.Array[NextPluginsEvent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventNextPlugins")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NextPluginsEvent]]]
  
  trait NextPluginsEvent extends StObject {
    
    var eventName: String
    
    var payload: PackageName
  }
  object NextPluginsEvent {
    
    inline def apply(eventName: String, payload: PackageName): NextPluginsEvent = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextPluginsEvent]
    }
    
    extension [Self <: NextPluginsEvent](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: PackageName): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}

package typings.next

import typings.next.anon.PluginName
import typings.next.distServerConfigSharedMod.NextConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryEventsSwcPluginsMod {
  
  @JSImport("next/dist/telemetry/events/swc-plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventSwcPlugins(dir: String, config: NextConfig): js.Promise[js.Array[SwcPluginsEvent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventSwcPlugins")(dir.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SwcPluginsEvent]]]
  
  trait SwcPluginsEvent extends StObject {
    
    var eventName: String
    
    var payload: PluginName
  }
  object SwcPluginsEvent {
    
    inline def apply(eventName: String, payload: PluginName): SwcPluginsEvent = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwcPluginsEvent]
    }
    
    extension [Self <: SwcPluginsEvent](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: PluginName): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}

package typings.maximMazurokGapiClientHomegraph

import typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph.AgentUsersResource
import typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph.DevicesResource
import typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.homegraph
import typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object homegraph {
        
        @JSGlobal("gapi.client.homegraph.agentUsers")
        @js.native
        val agentUsers: AgentUsersResource = js.native
        
        @JSGlobal("gapi.client.homegraph.devices")
        @js.native
        val devices: DevicesResource = js.native
      }
      
      /** Load HomeGraph API v1 */
      inline def load(name: homegraph, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: homegraph, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}

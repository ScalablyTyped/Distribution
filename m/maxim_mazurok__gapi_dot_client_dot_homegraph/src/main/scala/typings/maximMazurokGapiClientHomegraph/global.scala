package typings.maximMazurokGapiClientHomegraph

import typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph.AgentUsersResource
import typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph.DevicesResource
import typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.homegraph
import typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object homegraph {
        
        @JSGlobal("gapi.client.homegraph.agentUsers")
        @js.native
        val agentUsers: AgentUsersResource = js.native
        
        @JSGlobal("gapi.client.homegraph.devices")
        @js.native
        val devices: DevicesResource = js.native
      }
      
      /** Load HomeGraph API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: homegraph, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: homegraph, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}

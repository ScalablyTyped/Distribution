package typings.maximMazurokGapiClientHomegraph

import typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph.AgentUsersResource
import typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph.DevicesResource
import typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.homegraph
import typings.maximMazurokGapiClientHomegraph.maximMazurokGapiClientHomegraphStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load HomeGraph API v1 */
      def load(name: homegraph, version: v1): js.Thenable[Unit] = js.native
      def load(name: homegraph, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object homegraph extends js.Object {
        
        val agentUsers: AgentUsersResource = js.native
        
        val devices: DevicesResource = js.native
      }
    }
  }
}

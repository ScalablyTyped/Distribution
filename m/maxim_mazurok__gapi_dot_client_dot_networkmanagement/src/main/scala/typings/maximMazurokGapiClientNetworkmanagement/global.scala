package typings.maximMazurokGapiClientNetworkmanagement

import typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement.ProjectsResource
import typings.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.networkmanagement
import typings.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.v1
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
      
      /** Load Network Management API v1 */
      def load(name: networkmanagement, version: v1): js.Thenable[Unit] = js.native
      def load(name: networkmanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object networkmanagement extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

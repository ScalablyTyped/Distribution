package typings.maximMazurokGapiClientNetworkmanagement

import typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement.ProjectsResource
import typings.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.networkmanagement
import typings.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Network Management API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: networkmanagement, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: networkmanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object networkmanagement {
        
        @JSGlobal("gapi.client.networkmanagement.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}

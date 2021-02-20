package typings.maximMazurokGapiClientManagedidentities

import typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities.ProjectsResource
import typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.managedidentities
import typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Managed Service for Microsoft Active Directory API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: managedidentities, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: managedidentities, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object managedidentities {
        
        @JSGlobal("gapi.client.managedidentities.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}

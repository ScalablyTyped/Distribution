package typings.maximMazurokGapiClientManagedidentities

import typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities.ProjectsResource
import typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.managedidentities
import typings.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Managed Service for Microsoft Active Directory API v1 */
      inline def load(name: managedidentities, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: managedidentities, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object managedidentities {
        
        @JSGlobal("gapi.client.managedidentities.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}

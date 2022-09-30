package typings.maximMazurokGapiClientDlp

import typings.maximMazurokGapiClientDlp.gapi.client.dlp.InfoTypesResource
import typings.maximMazurokGapiClientDlp.gapi.client.dlp.LocationsResource
import typings.maximMazurokGapiClientDlp.gapi.client.dlp.OrganizationsResource
import typings.maximMazurokGapiClientDlp.gapi.client.dlp.ProjectsResource
import typings.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.dlp
import typings.maximMazurokGapiClientDlp.maximMazurokGapiClientDlpStrings.v2
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
      
      object dlp {
        
        @JSGlobal("gapi.client.dlp.infoTypes")
        @js.native
        val infoTypes: InfoTypesResource = js.native
        
        @JSGlobal("gapi.client.dlp.locations")
        @js.native
        val locations: LocationsResource = js.native
        
        @JSGlobal("gapi.client.dlp.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.dlp.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Data Loss Prevention (DLP) API v2 */
      inline def load(name: dlp, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: dlp, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}

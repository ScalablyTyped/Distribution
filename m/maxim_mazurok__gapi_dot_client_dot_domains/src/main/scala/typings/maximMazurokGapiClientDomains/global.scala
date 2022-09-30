package typings.maximMazurokGapiClientDomains

import typings.maximMazurokGapiClientDomains.gapi.client.domains.ProjectsResource
import typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.domains
import typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.v1
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
      
      object domains {
        
        @JSGlobal("gapi.client.domains.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Domains API v1 */
      inline def load(name: domains, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: domains, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}

package typings.maximMazurokGapiClientSourcerepo

import typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo.ProjectsResource
import typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.sourcerepo
import typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.v1
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
      
      /** Load Cloud Source Repositories API v1 */
      inline def load(name: sourcerepo, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: sourcerepo, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object sourcerepo {
        
        @JSGlobal("gapi.client.sourcerepo.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}

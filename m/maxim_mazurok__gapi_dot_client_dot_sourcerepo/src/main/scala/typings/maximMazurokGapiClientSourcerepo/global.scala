package typings.maximMazurokGapiClientSourcerepo

import typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo.ProjectsResource
import typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.sourcerepo
import typings.maximMazurokGapiClientSourcerepo.maximMazurokGapiClientSourcerepoStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Source Repositories API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sourcerepo, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sourcerepo, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object sourcerepo {
        
        @JSGlobal("gapi.client.sourcerepo.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}

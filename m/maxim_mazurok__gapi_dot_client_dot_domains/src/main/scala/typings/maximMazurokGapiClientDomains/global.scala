package typings.maximMazurokGapiClientDomains

import typings.maximMazurokGapiClientDomains.gapi.client.domains.ProjectsResource
import typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.domains
import typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object domains {
        
        @JSGlobal("gapi.client.domains.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Domains API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: domains, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: domains, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}

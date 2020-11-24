package typings.maximMazurokGapiClientDomains

import typings.maximMazurokGapiClientDomains.gapi.client.domains.ProjectsResource
import typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.domains
import typings.maximMazurokGapiClientDomains.maximMazurokGapiClientDomainsStrings.v1beta1
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
      
      /** Load Cloud Domains API v1beta1 */
      def load(name: domains, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: domains, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object domains extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}

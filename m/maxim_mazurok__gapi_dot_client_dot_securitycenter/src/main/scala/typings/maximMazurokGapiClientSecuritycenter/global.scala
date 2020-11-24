package typings.maximMazurokGapiClientSecuritycenter

import typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter.OrganizationsResource
import typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.securitycenter
import typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.v1
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
      
      /** Load Security Command Center API v1 */
      def load(name: securitycenter, version: v1): js.Thenable[Unit] = js.native
      def load(name: securitycenter, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object securitycenter extends js.Object {
        
        val organizations: OrganizationsResource = js.native
      }
    }
  }
}

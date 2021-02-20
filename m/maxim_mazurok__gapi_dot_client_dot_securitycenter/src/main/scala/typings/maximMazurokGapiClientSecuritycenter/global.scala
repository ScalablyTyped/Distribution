package typings.maximMazurokGapiClientSecuritycenter

import typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter.OrganizationsResource
import typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.securitycenter
import typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Security Command Center API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: securitycenter, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: securitycenter, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object securitycenter {
        
        @JSGlobal("gapi.client.securitycenter.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
      }
    }
  }
}

package typings.maximMazurokGapiClientSecuritycenter

import typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter.OrganizationsResource
import typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.securitycenter
import typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Security Command Center API v1 */
      inline def load(name: securitycenter, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: securitycenter, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object securitycenter {
        
        @JSGlobal("gapi.client.securitycenter.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
      }
    }
  }
}

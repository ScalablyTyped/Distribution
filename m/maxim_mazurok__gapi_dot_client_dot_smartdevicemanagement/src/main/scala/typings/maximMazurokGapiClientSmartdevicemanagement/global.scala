package typings.maximMazurokGapiClientSmartdevicemanagement

import typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement.EnterprisesResource
import typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.smartdevicemanagement
import typings.maximMazurokGapiClientSmartdevicemanagement.maximMazurokGapiClientSmartdevicemanagementStrings.v1
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
      
      /** Load Smart Device Management API v1 */
      def load(name: smartdevicemanagement, version: v1): js.Thenable[Unit] = js.native
      def load(name: smartdevicemanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object smartdevicemanagement extends js.Object {
        
        val enterprises: EnterprisesResource = js.native
      }
    }
  }
}

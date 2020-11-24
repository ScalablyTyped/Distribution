package typings.maximMazurokGapiClientServiceconsumermanagement

import typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement.OperationsResource
import typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement.ServicesResource
import typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.serviceconsumermanagement
import typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.v1
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
      
      /** Load Service Consumer Management API v1 */
      def load(name: serviceconsumermanagement, version: v1): js.Thenable[Unit] = js.native
      def load(name: serviceconsumermanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object serviceconsumermanagement extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val services: ServicesResource = js.native
      }
    }
  }
}

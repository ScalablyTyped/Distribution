package typings.maximMazurokGapiClientServicenetworking

import typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking.OperationsResource
import typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking.ServicesResource
import typings.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.servicenetworking
import typings.maximMazurokGapiClientServicenetworking.maximMazurokGapiClientServicenetworkingStrings.v1
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
      
      /** Load Service Networking API v1 */
      def load(name: servicenetworking, version: v1): js.Thenable[Unit] = js.native
      def load(name: servicenetworking, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object servicenetworking extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val services: ServicesResource = js.native
      }
    }
  }
}

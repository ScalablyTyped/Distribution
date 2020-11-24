package typings.maximMazurokGapiClientServiceusage

import typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage.OperationsResource
import typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage.ServicesResource
import typings.maximMazurokGapiClientServiceusage.maximMazurokGapiClientServiceusageStrings.serviceusage
import typings.maximMazurokGapiClientServiceusage.maximMazurokGapiClientServiceusageStrings.v1
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
      
      /** Load Service Usage API v1 */
      def load(name: serviceusage, version: v1): js.Thenable[Unit] = js.native
      def load(name: serviceusage, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object serviceusage extends js.Object {
        
        val operations: OperationsResource = js.native
        
        val services: ServicesResource = js.native
      }
    }
  }
}

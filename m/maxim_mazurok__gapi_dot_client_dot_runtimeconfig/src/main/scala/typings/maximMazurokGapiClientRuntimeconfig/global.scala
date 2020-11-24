package typings.maximMazurokGapiClientRuntimeconfig

import typings.maximMazurokGapiClientRuntimeconfig.gapi.client.runtimeconfig.OperationsResource
import typings.maximMazurokGapiClientRuntimeconfig.maximMazurokGapiClientRuntimeconfigStrings.runtimeconfig
import typings.maximMazurokGapiClientRuntimeconfig.maximMazurokGapiClientRuntimeconfigStrings.v1
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
      
      /** Load Cloud Runtime Configuration API v1 */
      def load(name: runtimeconfig, version: v1): js.Thenable[Unit] = js.native
      def load(name: runtimeconfig, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object runtimeconfig extends js.Object {
        
        val operations: OperationsResource = js.native
      }
    }
  }
}

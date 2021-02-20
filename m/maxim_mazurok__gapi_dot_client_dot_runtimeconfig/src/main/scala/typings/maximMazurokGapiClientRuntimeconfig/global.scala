package typings.maximMazurokGapiClientRuntimeconfig

import typings.maximMazurokGapiClientRuntimeconfig.gapi.client.runtimeconfig.OperationsResource
import typings.maximMazurokGapiClientRuntimeconfig.maximMazurokGapiClientRuntimeconfigStrings.runtimeconfig
import typings.maximMazurokGapiClientRuntimeconfig.maximMazurokGapiClientRuntimeconfigStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud Runtime Configuration API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: runtimeconfig, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: runtimeconfig, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object runtimeconfig {
        
        @JSGlobal("gapi.client.runtimeconfig.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
    }
  }
}

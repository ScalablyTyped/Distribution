package typings.maximMazurokGapiClientServiceusage

import typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage.OperationsResource
import typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage.ServicesResource
import typings.maximMazurokGapiClientServiceusage.maximMazurokGapiClientServiceusageStrings.serviceusage
import typings.maximMazurokGapiClientServiceusage.maximMazurokGapiClientServiceusageStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Service Usage API v1 */
      inline def load(name: serviceusage, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: serviceusage, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object serviceusage {
        
        @JSGlobal("gapi.client.serviceusage.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.serviceusage.services")
        @js.native
        val services: ServicesResource = js.native
      }
    }
  }
}

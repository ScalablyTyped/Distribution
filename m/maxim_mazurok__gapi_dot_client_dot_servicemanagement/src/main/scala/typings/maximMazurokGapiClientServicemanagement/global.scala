package typings.maximMazurokGapiClientServicemanagement

import typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement.OperationsResource
import typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement.ServicesResource
import typings.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.servicemanagement
import typings.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.v1
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
      
      /** Load Service Management API v1 */
      inline def load(name: servicemanagement, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: servicemanagement, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object servicemanagement {
        
        @JSGlobal("gapi.client.servicemanagement.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.servicemanagement.services")
        @js.native
        val services: ServicesResource = js.native
      }
    }
  }
}

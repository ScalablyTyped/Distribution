package typings.maximMazurokGapiClientServiceconsumermanagement

import typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement.OperationsResource
import typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement.ServicesResource
import typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.serviceconsumermanagement
import typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.v1
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
      
      /** Load Service Consumer Management API v1 */
      inline def load(name: serviceconsumermanagement, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: serviceconsumermanagement, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object serviceconsumermanagement {
        
        @JSGlobal("gapi.client.serviceconsumermanagement.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.serviceconsumermanagement.services")
        @js.native
        val services: ServicesResource = js.native
      }
    }
  }
}

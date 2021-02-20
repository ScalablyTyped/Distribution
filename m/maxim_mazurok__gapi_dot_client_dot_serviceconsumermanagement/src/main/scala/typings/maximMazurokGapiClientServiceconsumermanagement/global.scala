package typings.maximMazurokGapiClientServiceconsumermanagement

import typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement.OperationsResource
import typings.maximMazurokGapiClientServiceconsumermanagement.gapi.client.serviceconsumermanagement.ServicesResource
import typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.serviceconsumermanagement
import typings.maximMazurokGapiClientServiceconsumermanagement.maximMazurokGapiClientServiceconsumermanagementStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Service Consumer Management API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: serviceconsumermanagement, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: serviceconsumermanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
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

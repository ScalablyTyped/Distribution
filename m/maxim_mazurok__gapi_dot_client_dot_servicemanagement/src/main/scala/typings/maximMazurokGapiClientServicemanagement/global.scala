package typings.maximMazurokGapiClientServicemanagement

import typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement.OperationsResource
import typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement.ServicesResource
import typings.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.servicemanagement
import typings.maximMazurokGapiClientServicemanagement.maximMazurokGapiClientServicemanagementStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Service Management API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: servicemanagement, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: servicemanagement, version: v1, callback: js.Function0[_]): Unit = js.native
      
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

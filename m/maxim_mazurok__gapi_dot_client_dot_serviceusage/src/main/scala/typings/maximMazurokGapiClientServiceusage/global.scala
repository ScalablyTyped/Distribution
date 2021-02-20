package typings.maximMazurokGapiClientServiceusage

import typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage.OperationsResource
import typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage.ServicesResource
import typings.maximMazurokGapiClientServiceusage.maximMazurokGapiClientServiceusageStrings.serviceusage
import typings.maximMazurokGapiClientServiceusage.maximMazurokGapiClientServiceusageStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Service Usage API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: serviceusage, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: serviceusage, version: v1, callback: js.Function0[_]): Unit = js.native
      
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

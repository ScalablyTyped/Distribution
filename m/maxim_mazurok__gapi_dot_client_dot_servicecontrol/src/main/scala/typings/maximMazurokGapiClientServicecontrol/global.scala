package typings.maximMazurokGapiClientServicecontrol

import typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol.ServicesResource
import typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.servicecontrol
import typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Service Control API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: servicecontrol, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: servicecontrol, version: v2, callback: js.Function0[_]): Unit = js.native
      
      object servicecontrol {
        
        @JSGlobal("gapi.client.servicecontrol.services")
        @js.native
        val services: ServicesResource = js.native
      }
    }
  }
}

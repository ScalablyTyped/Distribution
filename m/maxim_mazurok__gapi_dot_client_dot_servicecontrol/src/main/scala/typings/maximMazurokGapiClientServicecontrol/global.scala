package typings.maximMazurokGapiClientServicecontrol

import typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol.ServicesResource
import typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.servicecontrol
import typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Service Control API v2 */
      inline def load(name: servicecontrol, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: servicecontrol, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object servicecontrol {
        
        @JSGlobal("gapi.client.servicecontrol.services")
        @js.native
        val services: ServicesResource = js.native
      }
    }
  }
}

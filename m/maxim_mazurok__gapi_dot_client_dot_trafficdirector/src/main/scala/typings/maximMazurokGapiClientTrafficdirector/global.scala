package typings.maximMazurokGapiClientTrafficdirector

import typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector.DiscoveryResource
import typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.trafficdirector
import typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Traffic Director API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: trafficdirector, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: trafficdirector, version: v2, callback: js.Function0[_]): Unit = js.native
      
      object trafficdirector {
        
        @JSGlobal("gapi.client.trafficdirector.discovery")
        @js.native
        val discovery: DiscoveryResource = js.native
      }
    }
  }
}

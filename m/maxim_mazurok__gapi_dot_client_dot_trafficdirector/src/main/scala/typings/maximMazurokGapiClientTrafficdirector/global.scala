package typings.maximMazurokGapiClientTrafficdirector

import typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector.DiscoveryResource
import typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.trafficdirector
import typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Traffic Director API v2 */
      def load(name: trafficdirector, version: v2): js.Thenable[Unit] = js.native
      def load(name: trafficdirector, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object trafficdirector extends js.Object {
        
        val discovery: DiscoveryResource = js.native
      }
    }
  }
}

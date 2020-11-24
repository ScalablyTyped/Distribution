package typings.maximMazurokGapiClientRealtimebidding

import typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding.BiddersResource
import typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding.BuyersResource
import typings.maximMazurokGapiClientRealtimebidding.maximMazurokGapiClientRealtimebiddingStrings.realtimebidding
import typings.maximMazurokGapiClientRealtimebidding.maximMazurokGapiClientRealtimebiddingStrings.v1
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
      
      /** Load Real-time Bidding API v1 */
      def load(name: realtimebidding, version: v1): js.Thenable[Unit] = js.native
      def load(name: realtimebidding, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object realtimebidding extends js.Object {
        
        val bidders: BiddersResource = js.native
        
        val buyers: BuyersResource = js.native
      }
    }
  }
}

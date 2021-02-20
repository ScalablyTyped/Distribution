package typings.maximMazurokGapiClientRealtimebidding

import typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding.BiddersResource
import typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding.BuyersResource
import typings.maximMazurokGapiClientRealtimebidding.maximMazurokGapiClientRealtimebiddingStrings.realtimebidding
import typings.maximMazurokGapiClientRealtimebidding.maximMazurokGapiClientRealtimebiddingStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Real-time Bidding API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: realtimebidding, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: realtimebidding, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object realtimebidding {
        
        @JSGlobal("gapi.client.realtimebidding.bidders")
        @js.native
        val bidders: BiddersResource = js.native
        
        @JSGlobal("gapi.client.realtimebidding.buyers")
        @js.native
        val buyers: BuyersResource = js.native
      }
    }
  }
}

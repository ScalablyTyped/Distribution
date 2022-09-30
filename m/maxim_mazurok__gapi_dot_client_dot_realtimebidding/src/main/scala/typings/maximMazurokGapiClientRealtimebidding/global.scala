package typings.maximMazurokGapiClientRealtimebidding

import typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding.BiddersResource
import typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding.BuyersResource
import typings.maximMazurokGapiClientRealtimebidding.maximMazurokGapiClientRealtimebiddingStrings.realtimebidding
import typings.maximMazurokGapiClientRealtimebidding.maximMazurokGapiClientRealtimebiddingStrings.v1
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
      
      /** Load Real-time Bidding API v1 */
      inline def load(name: realtimebidding, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: realtimebidding, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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

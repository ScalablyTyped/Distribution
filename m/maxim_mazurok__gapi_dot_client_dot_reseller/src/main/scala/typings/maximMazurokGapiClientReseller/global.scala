package typings.maximMazurokGapiClientReseller

import typings.maximMazurokGapiClientReseller.gapi.client.reseller.CustomersResource
import typings.maximMazurokGapiClientReseller.gapi.client.reseller.ResellernotifyResource
import typings.maximMazurokGapiClientReseller.gapi.client.reseller.SubscriptionsResource
import typings.maximMazurokGapiClientReseller.maximMazurokGapiClientResellerStrings.reseller
import typings.maximMazurokGapiClientReseller.maximMazurokGapiClientResellerStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Workspace Reseller API v1 */
      @scala.inline
      def load(name: reseller, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: reseller, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object reseller {
        
        @JSGlobal("gapi.client.reseller.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.reseller.resellernotify")
        @js.native
        val resellernotify: ResellernotifyResource = js.native
        
        @JSGlobal("gapi.client.reseller.subscriptions")
        @js.native
        val subscriptions: SubscriptionsResource = js.native
      }
    }
  }
}

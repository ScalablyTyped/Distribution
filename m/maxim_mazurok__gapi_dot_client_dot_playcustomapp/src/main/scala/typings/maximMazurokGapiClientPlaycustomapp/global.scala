package typings.maximMazurokGapiClientPlaycustomapp

import typings.maximMazurokGapiClientPlaycustomapp.gapi.client.playcustomapp.AccountsResource
import typings.maximMazurokGapiClientPlaycustomapp.maximMazurokGapiClientPlaycustomappStrings.playcustomapp
import typings.maximMazurokGapiClientPlaycustomapp.maximMazurokGapiClientPlaycustomappStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Google Play Custom App Publishing API v1 */
      inline def load(name: playcustomapp, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: playcustomapp, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object playcustomapp {
        
        @JSGlobal("gapi.client.playcustomapp.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
    }
  }
}

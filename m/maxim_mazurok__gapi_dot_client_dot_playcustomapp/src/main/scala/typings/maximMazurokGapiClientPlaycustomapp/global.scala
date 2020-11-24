package typings.maximMazurokGapiClientPlaycustomapp

import typings.maximMazurokGapiClientPlaycustomapp.gapi.client.playcustomapp.AccountsResource
import typings.maximMazurokGapiClientPlaycustomapp.maximMazurokGapiClientPlaycustomappStrings.playcustomapp
import typings.maximMazurokGapiClientPlaycustomapp.maximMazurokGapiClientPlaycustomappStrings.v1
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
      
      /** Load Google Play Custom App Publishing API v1 */
      def load(name: playcustomapp, version: v1): js.Thenable[Unit] = js.native
      def load(name: playcustomapp, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object playcustomapp extends js.Object {
        
        val accounts: AccountsResource = js.native
      }
    }
  }
}

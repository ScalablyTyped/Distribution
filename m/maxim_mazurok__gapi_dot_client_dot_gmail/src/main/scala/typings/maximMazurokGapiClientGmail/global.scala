package typings.maximMazurokGapiClientGmail

import typings.maximMazurokGapiClientGmail.gapi.client.gmail.UsersResource
import typings.maximMazurokGapiClientGmail.maximMazurokGapiClientGmailStrings.gmail
import typings.maximMazurokGapiClientGmail.maximMazurokGapiClientGmailStrings.v1
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
      
      /** Load Gmail API v1 */
      def load(name: gmail, version: v1): js.Thenable[Unit] = js.native
      def load(name: gmail, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object gmail extends js.Object {
        
        val users: UsersResource = js.native
      }
    }
  }
}

package typings.maximMazurokGapiClientGmail

import typings.maximMazurokGapiClientGmail.gapi.client.gmail.UsersResource
import typings.maximMazurokGapiClientGmail.maximMazurokGapiClientGmailStrings.gmail
import typings.maximMazurokGapiClientGmail.maximMazurokGapiClientGmailStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object gmail {
        
        @JSGlobal("gapi.client.gmail.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Gmail API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: gmail, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: gmail, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}

package typings.maximMazurokGapiClientOslogin

import typings.maximMazurokGapiClientOslogin.gapi.client.oslogin.UsersResource
import typings.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.oslogin
import typings.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Cloud OS Login API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: oslogin, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: oslogin, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object oslogin {
        
        @JSGlobal("gapi.client.oslogin.users")
        @js.native
        val users: UsersResource = js.native
      }
    }
  }
}

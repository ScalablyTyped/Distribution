package typings.maximMazurokGapiClientOauth2

import typings.maximMazurokGapiClientOauth2.gapi.client.oauth2.UserinfoResource
import typings.maximMazurokGapiClientOauth2.maximMazurokGapiClientOauth2Strings.oauth2
import typings.maximMazurokGapiClientOauth2.maximMazurokGapiClientOauth2Strings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Google OAuth2 API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: oauth2, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: oauth2, version: v2, callback: js.Function0[_]): Unit = js.native
      
      object oauth2 {
        
        @JSGlobal("gapi.client.oauth2.userinfo")
        @js.native
        val userinfo: UserinfoResource = js.native
      }
    }
  }
}

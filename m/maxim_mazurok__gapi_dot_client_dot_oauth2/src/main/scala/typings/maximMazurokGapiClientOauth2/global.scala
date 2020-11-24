package typings.maximMazurokGapiClientOauth2

import typings.maximMazurokGapiClientOauth2.gapi.client.oauth2.UserinfoResource
import typings.maximMazurokGapiClientOauth2.maximMazurokGapiClientOauth2Strings.oauth2
import typings.maximMazurokGapiClientOauth2.maximMazurokGapiClientOauth2Strings.v2
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
      
      /** Load Google OAuth2 API v2 */
      def load(name: oauth2, version: v2): js.Thenable[Unit] = js.native
      def load(name: oauth2, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object oauth2 extends js.Object {
        
        val userinfo: UserinfoResource = js.native
      }
    }
  }
}

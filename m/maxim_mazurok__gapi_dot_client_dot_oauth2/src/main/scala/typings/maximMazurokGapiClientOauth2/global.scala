package typings.maximMazurokGapiClientOauth2

import typings.maximMazurokGapiClientOauth2.gapi.client.oauth2.UserinfoResource
import typings.maximMazurokGapiClientOauth2.maximMazurokGapiClientOauth2Strings.oauth2
import typings.maximMazurokGapiClientOauth2.maximMazurokGapiClientOauth2Strings.v2
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
      
      /** Load Google OAuth2 API v2 */
      inline def load(name: oauth2, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: oauth2, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object oauth2 {
        
        @JSGlobal("gapi.client.oauth2.userinfo")
        @js.native
        val userinfo: UserinfoResource = js.native
      }
    }
  }
}

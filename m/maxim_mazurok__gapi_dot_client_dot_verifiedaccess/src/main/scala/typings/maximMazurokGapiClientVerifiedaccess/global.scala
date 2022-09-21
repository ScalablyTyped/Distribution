package typings.maximMazurokGapiClientVerifiedaccess

import typings.maximMazurokGapiClientVerifiedaccess.gapi.client.verifiedaccess.ChallengeResource
import typings.maximMazurokGapiClientVerifiedaccess.maximMazurokGapiClientVerifiedaccessStrings.v2
import typings.maximMazurokGapiClientVerifiedaccess.maximMazurokGapiClientVerifiedaccessStrings.verifiedaccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Chrome Verified Access API v2 */
      inline def load(name: verifiedaccess, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: verifiedaccess, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object verifiedaccess {
        
        @JSGlobal("gapi.client.verifiedaccess.challenge")
        @js.native
        val challenge: ChallengeResource = js.native
      }
    }
  }
}

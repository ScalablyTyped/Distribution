package typings.maximMazurokGapiClientVerifiedaccess

import typings.maximMazurokGapiClientVerifiedaccess.gapi.client.verifiedaccess.ChallengeResource
import typings.maximMazurokGapiClientVerifiedaccess.maximMazurokGapiClientVerifiedaccessStrings.v1
import typings.maximMazurokGapiClientVerifiedaccess.maximMazurokGapiClientVerifiedaccessStrings.verifiedaccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Chrome Verified Access API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: verifiedaccess, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: verifiedaccess, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object verifiedaccess {
        
        @JSGlobal("gapi.client.verifiedaccess.challenge")
        @js.native
        val challenge: ChallengeResource = js.native
      }
    }
  }
}

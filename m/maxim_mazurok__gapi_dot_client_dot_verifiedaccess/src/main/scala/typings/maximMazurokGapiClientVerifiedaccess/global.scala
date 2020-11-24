package typings.maximMazurokGapiClientVerifiedaccess

import typings.maximMazurokGapiClientVerifiedaccess.gapi.client.verifiedaccess.ChallengeResource
import typings.maximMazurokGapiClientVerifiedaccess.maximMazurokGapiClientVerifiedaccessStrings.v1
import typings.maximMazurokGapiClientVerifiedaccess.maximMazurokGapiClientVerifiedaccessStrings.verifiedaccess
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
      
      /** Load Chrome Verified Access API v1 */
      def load(name: verifiedaccess, version: v1): js.Thenable[Unit] = js.native
      def load(name: verifiedaccess, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object verifiedaccess extends js.Object {
        
        val challenge: ChallengeResource = js.native
      }
    }
  }
}

package typings.maximMazurokGapiClientIdentitytoolkit

import typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit.RelyingpartyResource
import typings.maximMazurokGapiClientIdentitytoolkit.maximMazurokGapiClientIdentitytoolkitStrings.identitytoolkit
import typings.maximMazurokGapiClientIdentitytoolkit.maximMazurokGapiClientIdentitytoolkitStrings.v3
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
      
      /** Load Google Identity Toolkit API v3 */
      def load(name: identitytoolkit, version: v3): js.Thenable[Unit] = js.native
      def load(name: identitytoolkit, version: v3, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object identitytoolkit extends js.Object {
        
        val relyingparty: RelyingpartyResource = js.native
      }
    }
  }
}

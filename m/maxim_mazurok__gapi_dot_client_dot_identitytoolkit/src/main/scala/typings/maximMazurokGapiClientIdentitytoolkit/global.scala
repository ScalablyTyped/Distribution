package typings.maximMazurokGapiClientIdentitytoolkit

import typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit.RelyingpartyResource
import typings.maximMazurokGapiClientIdentitytoolkit.maximMazurokGapiClientIdentitytoolkitStrings.identitytoolkit
import typings.maximMazurokGapiClientIdentitytoolkit.maximMazurokGapiClientIdentitytoolkitStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object identitytoolkit {
        
        @JSGlobal("gapi.client.identitytoolkit.relyingparty")
        @js.native
        val relyingparty: RelyingpartyResource = js.native
      }
      
      /** Load Google Identity Toolkit API v3 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: identitytoolkit, version: v3): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: identitytoolkit, version: v3, callback: js.Function0[_]): Unit = js.native
    }
  }
}

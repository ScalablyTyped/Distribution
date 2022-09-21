package typings.maximMazurokGapiClientIdentitytoolkit

import typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit.RelyingpartyResource
import typings.maximMazurokGapiClientIdentitytoolkit.maximMazurokGapiClientIdentitytoolkitStrings.identitytoolkit
import typings.maximMazurokGapiClientIdentitytoolkit.maximMazurokGapiClientIdentitytoolkitStrings.v3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object identitytoolkit {
        
        @JSGlobal("gapi.client.identitytoolkit.relyingparty")
        @js.native
        val relyingparty: RelyingpartyResource = js.native
      }
      
      /** Load Google Identity Toolkit API v3 */
      inline def load(name: identitytoolkit, version: v3): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: identitytoolkit, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}

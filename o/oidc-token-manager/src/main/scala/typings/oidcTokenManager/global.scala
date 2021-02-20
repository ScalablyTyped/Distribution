package typings.oidcTokenManager

import typings.oidcTokenManager.Oidc.OidcClientSettings
import typings.oidcTokenManager.Oidc.OidcClientStatic
import typings.oidcTokenManager.Oidc.OidcTokenManagerSettings
import typings.oidcTokenManager.Oidc.OidcTokenManagerStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Oidc {
    
    @JSGlobal("Oidc.DefaultHttpRequest")
    @js.native
    class DefaultHttpRequest ()
      extends typings.oidcTokenManager.Oidc.DefaultHttpRequest
    
    @JSGlobal("Oidc.DefaultPromise")
    @js.native
    class DefaultPromise protected ()
      extends typings.oidcTokenManager.Oidc.DefaultPromise {
      def this(promise: js.Any) = this()
    }
    
    @JSGlobal("Oidc.DefaultPromiseFactory")
    @js.native
    class DefaultPromiseFactory ()
      extends typings.oidcTokenManager.Oidc.DefaultPromiseFactory
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OidcClient")
  @js.native
  class OidcClient protected ()
    extends typings.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcClientSettings) = this()
  }
  @JSGlobal("OidcClient")
  @js.native
  def OidcClient: OidcClientStatic = js.native
  @scala.inline
  def OidcClient_=(x: OidcClientStatic): Unit = js.Dynamic.global.updateDynamic("OidcClient")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OidcTokenManager")
  @js.native
  class OidcTokenManager ()
    extends typings.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcTokenManagerSettings) = this()
  }
  @JSGlobal("OidcTokenManager")
  @js.native
  def OidcTokenManager: OidcTokenManagerStatic = js.native
  @scala.inline
  def OidcTokenManager_=(x: OidcTokenManagerStatic): Unit = js.Dynamic.global.updateDynamic("OidcTokenManager")(x.asInstanceOf[js.Any])
}

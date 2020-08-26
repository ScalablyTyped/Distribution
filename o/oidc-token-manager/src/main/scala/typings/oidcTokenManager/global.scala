package typings.oidcTokenManager

import org.scalablytyped.runtime.TopLevel
import typings.oidcTokenManager.Oidc.OidcClientSettings
import typings.oidcTokenManager.Oidc.OidcClientStatic
import typings.oidcTokenManager.Oidc.OidcTokenManagerSettings
import typings.oidcTokenManager.Oidc.OidcTokenManagerStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class OidcClient protected ()
    extends typings.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcClientSettings) = this()
  }
  
  @js.native
  class OidcTokenManager ()
    extends typings.oidcTokenManager.Oidc.OidcTokenManager {
    def this(settings: OidcTokenManagerSettings) = this()
  }
  
  @js.native
  object Oidc extends js.Object {
    @js.native
    class DefaultHttpRequest ()
      extends typings.oidcTokenManager.Oidc.DefaultHttpRequest
    
    @js.native
    class DefaultPromise protected ()
      extends typings.oidcTokenManager.Oidc.DefaultPromise {
      def this(promise: js.Any) = this()
    }
    
    @js.native
    class DefaultPromiseFactory ()
      extends typings.oidcTokenManager.Oidc.DefaultPromiseFactory
    
  }
  
  @js.native
  object OidcClient extends TopLevel[OidcClientStatic]
  
  @js.native
  object OidcTokenManager extends TopLevel[OidcTokenManagerStatic]
  
}


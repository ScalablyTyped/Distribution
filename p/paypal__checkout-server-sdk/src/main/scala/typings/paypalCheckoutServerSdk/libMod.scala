package typings.paypalCheckoutServerSdk

import typings.paypalCheckoutServerSdk.accessTokenMod.AccessTokenOptions
import typings.paypalPaypalhttp.mod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "AccessToken")
  @js.native
  open class AccessToken protected ()
    extends typings.paypalCheckoutServerSdk.accessTokenMod.AccessToken {
    def this(options: AccessTokenOptions) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "AccessTokenRequest")
  @js.native
  open class AccessTokenRequest protected ()
    extends typings.paypalCheckoutServerSdk.accessTokenRequestMod.AccessTokenRequest {
    def this(environment: typings.paypalCheckoutServerSdk.paypalEnvironmentMod.PayPalEnvironment) = this()
    def this(
      environment: typings.paypalCheckoutServerSdk.paypalEnvironmentMod.PayPalEnvironment,
      refreshToken: String
    ) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "LiveEnvironment")
  @js.native
  open class LiveEnvironment protected ()
    extends typings.paypalCheckoutServerSdk.paypalEnvironmentMod.LiveEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "PayPalEnvironment")
  @js.native
  open class PayPalEnvironment protected ()
    extends typings.paypalCheckoutServerSdk.paypalEnvironmentMod.PayPalEnvironment {
    /**
      * @param clientId - The client id for this environment
      * @param clientSecret - The client secret
      * @param baseUrl - The base url to execute requests
      * @param webUrl - The web url to authorize user's consent
      */
    def this(clientId: String, clientSecret: String, baseUrl: String, webUrl: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "PayPalHttpClient")
  @js.native
  open class PayPalHttpClient protected ()
    extends typings.paypalCheckoutServerSdk.paypalHttpClientMod.PayPalHttpClient {
    /**
      * @param environment - The environment for this client
      * @param refreshToken - The refreshToken to be used to generate the access Token.
      */
    def this(environment: typings.paypalCheckoutServerSdk.paypalEnvironmentMod.PayPalEnvironment) = this()
    def this(
      environment: typings.paypalCheckoutServerSdk.paypalEnvironmentMod.PayPalEnvironment,
      refreshToken: String
    ) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "RefreshTokenRequest")
  @js.native
  open class RefreshTokenRequest protected ()
    extends typings.paypalCheckoutServerSdk.refreshTokenRequestMod.RefreshTokenRequest {
    /**
      * @param environment - The environment for this request (sandbox or live)
      * @param code - The authorization code provided at the end of the user consent OAuth flow.
      */
    def this(environment: typings.paypalCheckoutServerSdk.paypalEnvironmentMod.PayPalEnvironment, code: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "SandboxEnvironment")
  @js.native
  open class SandboxEnvironment protected ()
    extends typings.paypalCheckoutServerSdk.paypalEnvironmentMod.SandboxEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "TokenCache")
  @js.native
  open class TokenCache ()
    extends typings.paypalCheckoutServerSdk.tokenCacheMod.TokenCache
  object TokenCache {
    
    @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "TokenCache")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def cacheForEnvironment[T /* <: Environment */](environment: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheForEnvironment")(environment.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def cacheForEnvironment[T /* <: Environment */](environment: T, refreshToken: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheForEnvironment")(environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}

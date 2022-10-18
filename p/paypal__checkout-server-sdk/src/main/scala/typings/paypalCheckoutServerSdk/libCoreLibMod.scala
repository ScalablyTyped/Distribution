package typings.paypalCheckoutServerSdk

import typings.paypalCheckoutServerSdk.libCoreAccessTokenMod.AccessTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreLibMod {
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "AccessToken")
  @js.native
  open class AccessToken protected ()
    extends typings.paypalCheckoutServerSdk.libCoreAccessTokenMod.AccessToken {
    def this(options: AccessTokenOptions) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "AccessTokenRequest")
  @js.native
  open class AccessTokenRequest protected ()
    extends typings.paypalCheckoutServerSdk.libCoreAccessTokenRequestMod.AccessTokenRequest {
    def this(environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment) = this()
    def this(
      environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
      refreshToken: String
    ) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "LiveEnvironment")
  @js.native
  open class LiveEnvironment protected ()
    extends typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.LiveEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "PayPalEnvironment")
  @js.native
  open class PayPalEnvironment protected ()
    extends typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment {
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
    extends typings.paypalCheckoutServerSdk.libCorePaypalHttpClientMod.PayPalHttpClient {
    /**
      * @param environment - The environment for this client
      * @param refreshToken - The refreshToken to be used to generate the access Token.
      */
    def this(environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment) = this()
    def this(
      environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
      refreshToken: String
    ) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "RefreshTokenRequest")
  @js.native
  open class RefreshTokenRequest protected ()
    extends typings.paypalCheckoutServerSdk.libCoreRefreshTokenRequestMod.RefreshTokenRequest {
    /**
      * @param environment - The environment for this request (sandbox or live)
      * @param code - The authorization code provided at the end of the user consent OAuth flow.
      */
    def this(
      environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
      code: String
    ) = this()
  }
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/lib", "SandboxEnvironment")
  @js.native
  open class SandboxEnvironment protected ()
    extends typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.SandboxEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
}

package typings.paypalCheckoutServerSdk

import typings.paypalCheckoutServerSdk.libCoreAccessTokenMod.AccessTokenOptions
import typings.paypalCheckoutServerSdk.libOrdersLibMod.BaseOrderHeaders
import typings.paypalCheckoutServerSdk.libPaymentsLibMod.BasePaymentHeaders
import typings.paypalPaypalhttp.mod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLibMod {
  
  object core {
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.AccessToken")
    @js.native
    open class AccessToken protected ()
      extends typings.paypalCheckoutServerSdk.libCoreLibMod.AccessToken {
      def this(options: AccessTokenOptions) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.AccessTokenRequest")
    @js.native
    open class AccessTokenRequest protected ()
      extends typings.paypalCheckoutServerSdk.libCoreLibMod.AccessTokenRequest {
      def this(environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment) = this()
      def this(
        environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
        refreshToken: String
      ) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.LiveEnvironment")
    @js.native
    open class LiveEnvironment protected ()
      extends typings.paypalCheckoutServerSdk.libCoreLibMod.LiveEnvironment {
      def this(clientId: String, clientSecret: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.PayPalEnvironment")
    @js.native
    open class PayPalEnvironment protected ()
      extends typings.paypalCheckoutServerSdk.libCoreLibMod.PayPalEnvironment {
      /**
        * @param clientId - The client id for this environment
        * @param clientSecret - The client secret
        * @param baseUrl - The base url to execute requests
        * @param webUrl - The web url to authorize user's consent
        */
      def this(clientId: String, clientSecret: String, baseUrl: String, webUrl: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.PayPalHttpClient")
    @js.native
    open class PayPalHttpClient protected ()
      extends typings.paypalCheckoutServerSdk.libCoreLibMod.PayPalHttpClient {
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
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.RefreshTokenRequest")
    @js.native
    open class RefreshTokenRequest protected ()
      extends typings.paypalCheckoutServerSdk.libCoreLibMod.RefreshTokenRequest {
      /**
        * @param environment - The environment for this request (sandbox or live)
        * @param code - The authorization code provided at the end of the user consent OAuth flow.
        */
      def this(
        environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
        code: String
      ) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.SandboxEnvironment")
    @js.native
    open class SandboxEnvironment protected ()
      extends typings.paypalCheckoutServerSdk.libCoreLibMod.SandboxEnvironment {
      def this(clientId: String, clientSecret: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.TokenCache")
    @js.native
    open class TokenCache ()
      extends typings.paypalCheckoutServerSdk.libCoreLibMod.TokenCache
    object TokenCache {
      
      @JSImport("@paypal/checkout-server-sdk/lib/lib", "core.TokenCache")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def cacheForEnvironment[T /* <: Environment */](environment: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheForEnvironment")(environment.asInstanceOf[js.Any]).asInstanceOf[T]
      inline def cacheForEnvironment[T /* <: Environment */](environment: T, refreshToken: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheForEnvironment")(environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any])).asInstanceOf[T]
    }
  }
  
  object orders {
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.BaseOrderRequest")
    @js.native
    open class BaseOrderRequest[H /* <: BaseOrderHeaders */, B] protected ()
      extends typings.paypalCheckoutServerSdk.libOrdersLibMod.BaseOrderRequest[H, B] {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersAuthorizeRequest")
    @js.native
    open class OrdersAuthorizeRequest protected ()
      extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersAuthorizeRequest {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersCaptureRequest")
    @js.native
    open class OrdersCaptureRequest protected ()
      extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersCaptureRequest {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersCreateRequest")
    @js.native
    open class OrdersCreateRequest ()
      extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersCreateRequest
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersGetRequest")
    @js.native
    open class OrdersGetRequest protected ()
      extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersGetRequest {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersPatchRequest")
    @js.native
    open class OrdersPatchRequest protected ()
      extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersPatchRequest {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "orders.OrdersValidateRequest")
    @js.native
    open class OrdersValidateRequest protected ()
      extends typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersValidateRequest {
      def this(orderId: String) = this()
    }
  }
  
  object payments {
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "payments.AuthorizationsCaptureRequest")
    @js.native
    open class AuthorizationsCaptureRequest protected ()
      extends typings.paypalCheckoutServerSdk.libPaymentsLibMod.AuthorizationsCaptureRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "payments.AuthorizationsGetRequest")
    @js.native
    open class AuthorizationsGetRequest protected ()
      extends typings.paypalCheckoutServerSdk.libPaymentsLibMod.AuthorizationsGetRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "payments.AuthorizationsReauthorizeRequest")
    @js.native
    open class AuthorizationsReauthorizeRequest protected ()
      extends typings.paypalCheckoutServerSdk.libPaymentsLibMod.AuthorizationsReauthorizeRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "payments.AuthorizationsVoidRequest")
    @js.native
    open class AuthorizationsVoidRequest protected ()
      extends typings.paypalCheckoutServerSdk.libPaymentsLibMod.AuthorizationsVoidRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "payments.BasePaymentRequest")
    @js.native
    open class BasePaymentRequest[H /* <: BasePaymentHeaders */, D] protected ()
      extends typings.paypalCheckoutServerSdk.libPaymentsLibMod.BasePaymentRequest[H, D] {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "payments.CapturesGetRequest")
    @js.native
    open class CapturesGetRequest protected ()
      extends typings.paypalCheckoutServerSdk.libPaymentsLibMod.CapturesGetRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "payments.CapturesRefundRequest")
    @js.native
    open class CapturesRefundRequest protected ()
      extends typings.paypalCheckoutServerSdk.libPaymentsLibMod.CapturesRefundRequest {
      def this(captureId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk/lib/lib", "payments.RefundsGetRequest")
    @js.native
    open class RefundsGetRequest protected ()
      extends typings.paypalCheckoutServerSdk.libPaymentsLibMod.RefundsGetRequest {
      def this(refundId: String) = this()
    }
  }
}

package typings.paypalCheckoutServerSdk

import typings.paypalCheckoutServerSdk.libCoreAccessTokenMod.AccessTokenOptions
import typings.paypalCheckoutServerSdk.libOrdersLibMod.BaseOrderHeaders
import typings.paypalCheckoutServerSdk.libPaymentsLibMod.BasePaymentHeaders
import typings.paypalPaypalhttp.mod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object core {
    
    @JSImport("@paypal/checkout-server-sdk", "core.AccessToken")
    @js.native
    open class AccessToken protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.core.AccessToken {
      def this(options: AccessTokenOptions) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "core.AccessTokenRequest")
    @js.native
    open class AccessTokenRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.core.AccessTokenRequest {
      def this(environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment) = this()
      def this(
        environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
        refreshToken: String
      ) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "core.LiveEnvironment")
    @js.native
    open class LiveEnvironment protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.core.LiveEnvironment {
      def this(clientId: String, clientSecret: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "core.PayPalEnvironment")
    @js.native
    open class PayPalEnvironment protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.core.PayPalEnvironment {
      /**
        * @param clientId - The client id for this environment
        * @param clientSecret - The client secret
        * @param baseUrl - The base url to execute requests
        * @param webUrl - The web url to authorize user's consent
        */
      def this(clientId: String, clientSecret: String, baseUrl: String, webUrl: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "core.PayPalHttpClient")
    @js.native
    open class PayPalHttpClient protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.core.PayPalHttpClient {
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
    
    @JSImport("@paypal/checkout-server-sdk", "core.RefreshTokenRequest")
    @js.native
    open class RefreshTokenRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.core.RefreshTokenRequest {
      /**
        * @param environment - The environment for this request (sandbox or live)
        * @param code - The authorization code provided at the end of the user consent OAuth flow.
        */
      def this(
        environment: typings.paypalCheckoutServerSdk.libCorePaypalEnvironmentMod.PayPalEnvironment,
        code: String
      ) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "core.SandboxEnvironment")
    @js.native
    open class SandboxEnvironment protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.core.SandboxEnvironment {
      def this(clientId: String, clientSecret: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "core.TokenCache")
    @js.native
    open class TokenCache ()
      extends typings.paypalCheckoutServerSdk.libLibMod.core.TokenCache
    object TokenCache {
      
      @JSImport("@paypal/checkout-server-sdk", "core.TokenCache")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def cacheForEnvironment[T /* <: Environment */](environment: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheForEnvironment")(environment.asInstanceOf[js.Any]).asInstanceOf[T]
      inline def cacheForEnvironment[T /* <: Environment */](environment: T, refreshToken: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheForEnvironment")(environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any])).asInstanceOf[T]
    }
  }
  
  object orders {
    
    @JSImport("@paypal/checkout-server-sdk", "orders.BaseOrderRequest")
    @js.native
    open class BaseOrderRequest[H /* <: BaseOrderHeaders */, B] protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.orders.BaseOrderRequest[H, B] {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "orders.OrdersAuthorizeRequest")
    @js.native
    open class OrdersAuthorizeRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersAuthorizeRequest {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "orders.OrdersCaptureRequest")
    @js.native
    open class OrdersCaptureRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersCaptureRequest {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "orders.OrdersCreateRequest")
    @js.native
    open class OrdersCreateRequest ()
      extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersCreateRequest
    
    @JSImport("@paypal/checkout-server-sdk", "orders.OrdersGetRequest")
    @js.native
    open class OrdersGetRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersGetRequest {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "orders.OrdersPatchRequest")
    @js.native
    open class OrdersPatchRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersPatchRequest {
      def this(orderId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "orders.OrdersValidateRequest")
    @js.native
    open class OrdersValidateRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.orders.OrdersValidateRequest {
      def this(orderId: String) = this()
    }
  }
  
  object payments {
    
    @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsCaptureRequest")
    @js.native
    open class AuthorizationsCaptureRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsCaptureRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsGetRequest")
    @js.native
    open class AuthorizationsGetRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsGetRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsReauthorizeRequest")
    @js.native
    open class AuthorizationsReauthorizeRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsReauthorizeRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "payments.AuthorizationsVoidRequest")
    @js.native
    open class AuthorizationsVoidRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.payments.AuthorizationsVoidRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "payments.BasePaymentRequest")
    @js.native
    open class BasePaymentRequest[H /* <: BasePaymentHeaders */, D] protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.payments.BasePaymentRequest[H, D] {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "payments.CapturesGetRequest")
    @js.native
    open class CapturesGetRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.payments.CapturesGetRequest {
      def this(authorizationId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "payments.CapturesRefundRequest")
    @js.native
    open class CapturesRefundRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.payments.CapturesRefundRequest {
      def this(captureId: String) = this()
    }
    
    @JSImport("@paypal/checkout-server-sdk", "payments.RefundsGetRequest")
    @js.native
    open class RefundsGetRequest protected ()
      extends typings.paypalCheckoutServerSdk.libLibMod.payments.RefundsGetRequest {
      def this(refundId: String) = this()
    }
  }
}

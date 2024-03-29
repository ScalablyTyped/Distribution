package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.mod.payouts.PayoutsGetRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsItemCancelRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsItemGetRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsPostRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  /**
    * Live Environment
    */
  @JSImport("@paypal/payouts-sdk", "core.LiveEnvironment")
  @js.native
  open class LiveEnvironment protected () extends PayPalEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
  
  /**
    * Base class for PayPal environments
    */
  @JSImport("@paypal/payouts-sdk", "core.PayPalEnvironment")
  @js.native
  open class PayPalEnvironment protected () extends StObject {
    def this(clientId: String, clientSecret: String, baseUrl: String, webUrl: String) = this()
    
    // Authorization header string for basic authentication with the current client id and secret
    def authorizationString(): String = js.native
  }
  
  /**
    * PayPal HTTP client
    */
  @JSImport("@paypal/payouts-sdk", "core.PayPalHttpClient")
  @js.native
  open class PayPalHttpClient protected () extends StObject {
    def this(environment: PayPalEnvironment) = this()
    def this(environment: PayPalEnvironment, refreshToken: String) = this()
    
    def execute(request: PayoutsGetRequest): js.Promise[HttpResponse[GetBatchPayoutResponse]] = js.native
    def execute(request: PayoutsItemCancelRequest): js.Promise[HttpResponse[GetPayoutsItemResponse]] = js.native
    def execute(request: PayoutsItemGetRequest): js.Promise[HttpResponse[GetPayoutsItemResponse]] = js.native
    def execute(request: PayoutsPostRequest): js.Promise[HttpResponse[CreateBatchPayoutResponse]] = js.native
  }
  
  /**
    * Sandbox Environment
    */
  @JSImport("@paypal/payouts-sdk", "core.SandboxEnvironment")
  @js.native
  open class SandboxEnvironment protected () extends PayPalEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
}

package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.mod.payouts.PayoutsGetRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsItemCancelRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsItemGetRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsPostRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/payouts-sdk", "core")
@js.native
object core extends js.Object {
  
  /**
    * Live Environment
    */
  @js.native
  class LiveEnvironment protected () extends PayPalEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
  
  /**
    * Base class for PayPal environments
    */
  @js.native
  class PayPalEnvironment protected () extends js.Object {
    def this(clientId: String, clientSecret: String, baseUrl: String, webUrl: String) = this()
    
    // Authorization header string for basic authentication with the current client id and secret
    def authorizationString(): String = js.native
  }
  
  /**
    * PayPal HTTP client
    */
  @js.native
  class PayPalHttpClient protected () extends js.Object {
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
  @js.native
  class SandboxEnvironment protected () extends PayPalEnvironment {
    def this(clientId: String, clientSecret: String) = this()
  }
}

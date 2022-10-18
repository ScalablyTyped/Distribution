package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.AuthorizationsReauthorize.RequestData
import typings.paypalCheckoutServerSdk.libPaymentsLibMod.AuthorizationsReauthorize.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "AuthorizationsReauthorizeRequest")
@js.native
open class AuthorizationsReauthorizeRequest protected () extends BasePaymentRequest[RequestHeaders, Capture] {
  def this(authorizationId: String) = this()
  
  def payPalRequestId(payPalRequestId: String): this.type = js.native
  
  def prefer(prefer: String): this.type = js.native
  
  def requestBody(body: RequestData): this.type = js.native
}

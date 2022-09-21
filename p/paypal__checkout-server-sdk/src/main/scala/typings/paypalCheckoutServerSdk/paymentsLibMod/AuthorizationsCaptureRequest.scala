package typings.paypalCheckoutServerSdk.paymentsLibMod

import typings.paypalCheckoutServerSdk.paymentsLibMod.AuthorizationsCapture.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "AuthorizationsCaptureRequest")
@js.native
open class AuthorizationsCaptureRequest protected () extends BasePaymentRequest[RequestHeaders, Capture] {
  def this(authorizationId: String) = this()
  
  def payPalRequestId(payPalRequestId: String): this.type = js.native
  
  def prefer(prefer: String): this.type = js.native
  
  def requestBody(body: CaptureRequest): this.type = js.native
}

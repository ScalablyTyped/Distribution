package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import typings.paypalCheckoutServerSdk.libPaymentsLibMod.CapturesRefund.RequestData
import typings.paypalCheckoutServerSdk.libPaymentsLibMod.CapturesRefund.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "CapturesRefundRequest")
@js.native
open class CapturesRefundRequest protected () extends BasePaymentRequest[RequestHeaders, Capture] {
  def this(captureId: String) = this()
  
  def payPalRequestId(payPalRequestId: String): this.type = js.native
  
  def prefer(prefer: String): this.type = js.native
  
  def requestBody(body: RequestData): this.type = js.native
}

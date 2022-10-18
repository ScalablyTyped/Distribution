package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersCapture.RequestData
import typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersCapture.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "OrdersCaptureRequest")
@js.native
open class OrdersCaptureRequest protected () extends BaseOrderRequest[RequestHeaders, Order] {
  def this(orderId: String) = this()
  
  def payPalClientMetadataId(payPalClientMetadataId: String): this.type = js.native
  
  def payPalRequestId(payPalRequestId: String): this.type = js.native
  
  def prefer(prefer: String): this.type = js.native
  
  def requestBody(body: RequestData): this.type = js.native
}

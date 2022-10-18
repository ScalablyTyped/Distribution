package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersValidate.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "OrdersValidateRequest")
@js.native
open class OrdersValidateRequest protected () extends BaseOrderRequest[RequestHeaders, Null] {
  def this(orderId: String) = this()
  
  def payPalClientMetadataId(payPalClientMetadataId: String): this.type = js.native
  
  def requestBody(body: js.Object): this.type = js.native
}

package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.ordersLibMod.OrdersCreate.RequestData
import typings.paypalCheckoutServerSdk.ordersLibMod.OrdersCreate.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "OrdersCreateRequest")
@js.native
open class OrdersCreateRequest () extends BaseOrderRequest[RequestHeaders, Order] {
  
  def payPalPartnerAttributionId(payPalPartnerAttributionId: String): this.type = js.native
  
  def prefer(prefer: String): this.type = js.native
  
  def requestBody(order: RequestData): this.type = js.native
}

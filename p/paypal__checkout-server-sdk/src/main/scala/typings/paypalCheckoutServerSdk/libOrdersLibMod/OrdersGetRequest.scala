package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersGet.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "OrdersGetRequest")
@js.native
open class OrdersGetRequest protected () extends BaseOrderRequest[RequestHeaders, Order] {
  def this(orderId: String) = this()
}

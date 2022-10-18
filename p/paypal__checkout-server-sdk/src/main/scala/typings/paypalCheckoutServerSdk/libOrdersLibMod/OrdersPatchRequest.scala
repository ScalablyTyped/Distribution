package typings.paypalCheckoutServerSdk.libOrdersLibMod

import typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersPatch.RequestData
import typings.paypalCheckoutServerSdk.libOrdersLibMod.OrdersPatch.RequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "OrdersPatchRequest")
@js.native
open class OrdersPatchRequest protected () extends BaseOrderRequest[RequestHeaders, Null] {
  def this(orderId: String) = this()
  
  def requestBody(body: RequestData): this.type = js.native
}

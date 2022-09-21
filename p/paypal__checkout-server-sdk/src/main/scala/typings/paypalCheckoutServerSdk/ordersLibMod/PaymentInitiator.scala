package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaymentInitiator extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "PaymentInitiator")
@js.native
object PaymentInitiator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PaymentInitiator & String] = js.native
  
  @js.native
  sealed trait CUSTOMER
    extends StObject
       with PaymentInitiator
  /* "CUSTOMER" */ val CUSTOMER: typings.paypalCheckoutServerSdk.ordersLibMod.PaymentInitiator.CUSTOMER & String = js.native
  
  @js.native
  sealed trait MERCHANT
    extends StObject
       with PaymentInitiator
  /* "MERCHANT" */ val MERCHANT: typings.paypalCheckoutServerSdk.ordersLibMod.PaymentInitiator.MERCHANT & String = js.native
}

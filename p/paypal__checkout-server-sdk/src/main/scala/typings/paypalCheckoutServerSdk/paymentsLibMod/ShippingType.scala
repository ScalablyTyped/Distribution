package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShippingType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "ShippingType")
@js.native
object ShippingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShippingType & String] = js.native
  
  @js.native
  sealed trait PICKUP
    extends StObject
       with ShippingType
  /* "PICKUP" */ val PICKUP: typings.paypalCheckoutServerSdk.paymentsLibMod.ShippingType.PICKUP & String = js.native
  
  @js.native
  sealed trait PICKUP_IN_PERSON
    extends StObject
       with ShippingType
  /* "PICKUP_IN_PERSON" */ val PICKUP_IN_PERSON: typings.paypalCheckoutServerSdk.paymentsLibMod.ShippingType.PICKUP_IN_PERSON & String = js.native
  
  @js.native
  sealed trait SHIPPING
    extends StObject
       with ShippingType
  /* "SHIPPING" */ val SHIPPING: typings.paypalCheckoutServerSdk.paymentsLibMod.ShippingType.SHIPPING & String = js.native
}

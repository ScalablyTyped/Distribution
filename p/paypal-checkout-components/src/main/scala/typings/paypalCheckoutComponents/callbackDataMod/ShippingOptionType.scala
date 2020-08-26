package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShippingOptionType extends js.Object

@JSImport("paypal-checkout-components/modules/callback-data", "ShippingOptionType")
@js.native
object ShippingOptionType extends js.Object {
  /**
    * The payer intends to pick up the items at a specified address. For example, a store address.
    */
  @js.native
  sealed trait Pickup extends ShippingOptionType
  
  /**
    * The payer intends to receive the items at a specified address.
    */
  @js.native
  sealed trait Shipping extends ShippingOptionType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShippingOptionType with String] = js.native
  /* "PICKUP" */ @js.native
  object Pickup extends TopLevel[Pickup with String]
  
  /* "SHIPPING" */ @js.native
  object Shipping extends TopLevel[Shipping with String]
  
}


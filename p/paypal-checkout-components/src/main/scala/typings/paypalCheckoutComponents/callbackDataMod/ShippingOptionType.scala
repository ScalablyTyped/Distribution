package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShippingOptionType extends js.Object
@JSImport("paypal-checkout-components/modules/callback-data", "ShippingOptionType")
@js.native
object ShippingOptionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ShippingOptionType with String] = js.native
  
  /**
    * The payer intends to pick up the items at a specified address. For example, a store address.
    */
  @js.native
  sealed trait Pickup extends ShippingOptionType
  /* "PICKUP" */ @js.native
  object Pickup extends TopLevel[Pickup with String]
  
  /**
    * The payer intends to receive the items at a specified address.
    */
  @js.native
  sealed trait Shipping extends ShippingOptionType
  /* "SHIPPING" */ @js.native
  object Shipping extends TopLevel[Shipping with String]
}

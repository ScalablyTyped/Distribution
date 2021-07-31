package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Intent extends StObject
@JSImport("paypal-checkout-components/modules/callback-data", "Intent")
@js.native
object Intent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Intent & String] = js.native
  
  /**
    * Submits the transaction for authorization but not settlement.
    */
  @js.native
  sealed trait Authorize
    extends StObject
       with Intent
  /* "authorize" */ val Authorize: typings.paypalCheckoutComponents.callbackDataMod.Intent.Authorize & String = js.native
  
  /**
    * Payment will be immediately submitted for settlement upon creating a transaction.
    * `sale` can be used as an alias for this value.
    */
  @js.native
  sealed trait Capture
    extends StObject
       with Intent
  /* "capture" */ val Capture: typings.paypalCheckoutComponents.callbackDataMod.Intent.Capture & String = js.native
  
  /**
    * Validates the transaction without an authorization (i.e. without holding funds).
    * Useful for authorizing and capturing funds up to 90 days after the order has been placed.
    * Only available for Checkout flow.
    */
  @js.native
  sealed trait Order
    extends StObject
       with Intent
  /* "order" */ val Order: typings.paypalCheckoutComponents.callbackDataMod.Intent.Order & String = js.native
}

package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Intent extends StObject
@JSImport("paypal-checkout-components/modules/callback-data", "Intent")
@js.native
object Intent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Intent with String] = js.native
  
  /**
    * Submits the transaction for authorization but not settlement.
    */
  @js.native
  sealed trait Authorize extends Intent
  /* "authorize" */ val Authorize: typings.paypalCheckoutComponents.callbackDataMod.Intent.Authorize with String = js.native
  
  /**
    * Payment will be immediately submitted for settlement upon creating a transaction.
    * `sale` can be used as an alias for this value.
    */
  @js.native
  sealed trait Capture extends Intent
  /* "capture" */ val Capture: typings.paypalCheckoutComponents.callbackDataMod.Intent.Capture with String = js.native
  
  /**
    * Validates the transaction without an authorization (i.e. without holding funds).
    * Useful for authorizing and capturing funds up to 90 days after the order has been placed.
    * Only available for Checkout flow.
    */
  @js.native
  sealed trait Order extends Intent
  /* "order" */ val Order: typings.paypalCheckoutComponents.callbackDataMod.Intent.Order with String = js.native
}

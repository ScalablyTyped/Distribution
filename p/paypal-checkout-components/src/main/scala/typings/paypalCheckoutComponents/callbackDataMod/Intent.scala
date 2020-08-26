package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Intent extends js.Object

@JSImport("paypal-checkout-components/modules/callback-data", "Intent")
@js.native
object Intent extends js.Object {
  /**
    * Submits the transaction for authorization but not settlement.
    */
  @js.native
  sealed trait Authorize extends Intent
  
  /**
    * Payment will be immediately submitted for settlement upon creating a transaction.
    * `sale` can be used as an alias for this value.
    */
  @js.native
  sealed trait Capture extends Intent
  
  /**
    * Validates the transaction without an authorization (i.e. without holding funds).
    * Useful for authorizing and capturing funds up to 90 days after the order has been placed.
    * Only available for Checkout flow.
    */
  @js.native
  sealed trait Order extends Intent
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Intent with String] = js.native
  /* "authorize" */ @js.native
  object Authorize extends TopLevel[Authorize with String]
  
  /* "capture" */ @js.native
  object Capture extends TopLevel[Capture with String]
  
  /* "order" */ @js.native
  object Order extends TopLevel[Order with String]
  
}


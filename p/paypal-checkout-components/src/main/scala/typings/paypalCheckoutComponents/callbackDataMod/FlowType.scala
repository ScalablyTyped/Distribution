package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlowType extends js.Object

@JSImport("paypal-checkout-components/modules/callback-data", "FlowType")
@js.native
object FlowType extends js.Object {
  /**
    * Used for one-time checkout
    */
  @js.native
  sealed trait Checkout extends FlowType
  
  /**
    * Used to store the payment method for future use, ie subscriptions
    */
  @js.native
  sealed trait Vault extends FlowType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlowType with String] = js.native
  /* "checkout" */ @js.native
  object Checkout extends TopLevel[Checkout with String]
  
  /* "vault" */ @js.native
  object Vault extends TopLevel[Vault with String]
  
}


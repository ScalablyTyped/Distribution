package typings.paypalCheckoutComponents.callbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowType extends StObject
@JSImport("paypal-checkout-components/modules/callback-data", "FlowType")
@js.native
object FlowType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlowType with String] = js.native
  
  /**
    * Used for one-time checkout
    */
  @js.native
  sealed trait Checkout extends FlowType
  /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.callbackDataMod.FlowType.Checkout with String = js.native
  
  /**
    * Used to store the payment method for future use, ie subscriptions
    */
  @js.native
  sealed trait Vault extends FlowType
  /* "vault" */ val Vault: typings.paypalCheckoutComponents.callbackDataMod.FlowType.Vault with String = js.native
}

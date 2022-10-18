package typings.paypalCheckoutComponents.modulesCallbackDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlowType extends StObject
@JSImport("paypal-checkout-components/modules/callback-data", "FlowType")
@js.native
object FlowType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FlowType & String] = js.native
  
  /**
    * Used for one-time checkout
    */
  @js.native
  sealed trait Checkout
    extends StObject
       with FlowType
  /* "checkout" */ val Checkout: typings.paypalCheckoutComponents.modulesCallbackDataMod.FlowType.Checkout & String = js.native
  
  /**
    * Used to store the payment method for future use, ie subscriptions
    */
  @js.native
  sealed trait Vault
    extends StObject
       with FlowType
  /* "vault" */ val Vault: typings.paypalCheckoutComponents.modulesCallbackDataMod.FlowType.Vault & String = js.native
}

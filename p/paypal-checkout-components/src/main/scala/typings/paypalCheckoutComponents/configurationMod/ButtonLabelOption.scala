package typings.paypalCheckoutComponents.configurationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonLabelOption extends js.Object

@JSImport("paypal-checkout-components/modules/configuration", "ButtonLabelOption")
@js.native
object ButtonLabelOption extends js.Object {
  /**
    * The Buy Now button. Initializes the checkout flow.
    * The default Buy Now button is unbranded. To include PayPal branding, set branding: true.
    */
  @js.native
  sealed trait BuyNow extends ButtonLabelOption
  
  /**
    * The PayPal Checkout button. The default button.
    */
  @js.native
  sealed trait Checkout extends ButtonLabelOption
  
  /**
    * The PayPal Credit button. Initializes the credit flow. Cannot be used with any custom color option.
    */
  @js.native
  sealed trait Credit extends ButtonLabelOption
  
  /**
    * The Pay With PayPal button. Initializes the checkout flow.
    */
  @js.native
  sealed trait Pay extends ButtonLabelOption
  
  /**
    * The generic PayPal button. Initializes the checkout flow. This button contains only the PayPal brand logo.
    */
  @js.native
  sealed trait PayPal extends ButtonLabelOption
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonLabelOption with String] = js.native
  /* "buynow" */ @js.native
  object BuyNow extends TopLevel[BuyNow with String]
  
  /* "checkout" */ @js.native
  object Checkout extends TopLevel[Checkout with String]
  
  /* "credit" */ @js.native
  object Credit extends TopLevel[Credit with String]
  
  /* "pay" */ @js.native
  object Pay extends TopLevel[Pay with String]
  
  /* "paypal" */ @js.native
  object PayPal extends TopLevel[PayPal with String]
  
}


package typings.paypalCheckoutComponents.configurationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonColorOption extends js.Object
@JSImport("paypal-checkout-components/modules/configuration", "ButtonColorOption")
@js.native
object ButtonColorOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonColorOption with String] = js.native
  
  /**
    * Third alternate
    * If your website demands a monochromatic button experience, try the black button.
    * Because black is a common website color and less capable of drawing people's attention,
    * we recommend this button as a third alternative.
    */
  @js.native
  sealed trait Black extends ButtonColorOption
  /* "black" */ @js.native
  object Black extends TopLevel[Black with String]
  
  /**
    * First alternate
    * If gold is not an option for your site, try the PayPal blue button.
    * Research shows that people know it is our brand color,
    * which provides a halo of trust and security to your experience.
    */
  @js.native
  sealed trait Blue extends ButtonColorOption
  /* "blue" */ @js.native
  object Blue extends TopLevel[Blue with String]
  
  /**
    * Recommended
    * People around the world know us for the color gold and research confirms it.
    * Extensive testing determined just the right shade and shape that help increase conversion.
    * Use it on your website to leverage PayPal’s recognition and preference.
    */
  @js.native
  sealed trait Gold extends ButtonColorOption
  /* "gold" */ @js.native
  object Gold extends TopLevel[Gold with String]
  
  /**
    * Second alternate
    * If gold or blue do not work for your site design or aesthetic, try the silver button.
    * Because this color is a bit recessive and less capable of drawing people’s attention,
    * we recommend this button color as a second alternative.
    */
  @js.native
  sealed trait Silver extends ButtonColorOption
  /* "silver" */ @js.native
  object Silver extends TopLevel[Silver with String]
}

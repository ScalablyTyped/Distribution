package typings.paypalCheckoutComponents.configurationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonSizeOption extends js.Object

@JSImport("paypal-checkout-components/modules/configuration", "ButtonSizeOption")
@js.native
object ButtonSizeOption extends js.Object {
  /**
    * 350 pixels by 40 pixels
    */
  @js.native
  sealed trait Large extends ButtonSizeOption
  
  /**
    * 250 pixels by 35 pixels
    */
  @js.native
  sealed trait Medium extends ButtonSizeOption
  
  /**
    * Dynamic
    * Matches the width of the container element, height is decided dynamically based on width.
    * Minimum width is 150px, maximum width is 500px.
    */
  @js.native
  sealed trait Responsive extends ButtonSizeOption
  
  /**
    * Recommended. Default.
    * 150 pixels by 25 pixels
    */
  @js.native
  sealed trait Small extends ButtonSizeOption
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonSizeOption with String] = js.native
  /* "large" */ @js.native
  object Large extends TopLevel[Large with String]
  
  /* "medium" */ @js.native
  object Medium extends TopLevel[Medium with String]
  
  /* "responsive" */ @js.native
  object Responsive extends TopLevel[Responsive with String]
  
  /* "small" */ @js.native
  object Small extends TopLevel[Small with String]
  
}


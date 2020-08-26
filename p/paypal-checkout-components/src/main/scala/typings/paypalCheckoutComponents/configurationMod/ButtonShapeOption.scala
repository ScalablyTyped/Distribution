package typings.paypalCheckoutComponents.configurationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonShapeOption extends js.Object

@JSImport("paypal-checkout-components/modules/configuration", "ButtonShapeOption")
@js.native
object ButtonShapeOption extends js.Object {
  /**
    * Recommended
    * Whenever possible, use the pill-shaped button.
    * Its unique and powerful shape signifies PayPal in people’s minds.
    */
  @js.native
  sealed trait Pill extends ButtonShapeOption
  
  /**
    * Use the rectangular button as an alternative for media such as mobile
    * where pill-shaped buttons might pose design challenges.
    */
  @js.native
  sealed trait Rect extends ButtonShapeOption
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonShapeOption with String] = js.native
  /* "pill" */ @js.native
  object Pill extends TopLevel[Pill with String]
  
  /* "rect" */ @js.native
  object Rect extends TopLevel[Rect with String]
  
}


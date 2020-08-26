package typings.paypalCheckoutComponents.configurationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Environment extends js.Object

@JSImport("paypal-checkout-components/modules/configuration", "Environment")
@js.native
object Environment extends js.Object {
  @js.native
  sealed trait Production extends Environment
  
  @js.native
  sealed trait Sandbox extends Environment
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Environment with String] = js.native
  /* "production" */ @js.native
  object Production extends TopLevel[Production with String]
  
  /* "sandbox" */ @js.native
  object Sandbox extends TopLevel[Sandbox with String]
  
}


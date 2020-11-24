package typings.paypalCheckoutComponents.configurationMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Environment extends js.Object
@JSImport("paypal-checkout-components/modules/configuration", "Environment")
@js.native
object Environment extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Environment with String] = js.native
  
  @js.native
  sealed trait Production extends Environment
  /* "production" */ @js.native
  object Production extends TopLevel[Production with String]
  
  @js.native
  sealed trait Sandbox extends Environment
  /* "sandbox" */ @js.native
  object Sandbox extends TopLevel[Sandbox with String]
}

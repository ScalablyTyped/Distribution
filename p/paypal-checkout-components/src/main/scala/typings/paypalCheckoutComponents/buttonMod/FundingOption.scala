package typings.paypalCheckoutComponents.buttonMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FundingOption extends js.Object
@JSImport("paypal-checkout-components/modules/button", "FundingOption")
@js.native
object FundingOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FundingOption with Double] = js.native
  
  @js.native
  sealed trait CARD extends FundingOption
  /* 1 */ @js.native
  object CARD extends TopLevel[CARD with Double]
  
  @js.native
  sealed trait CREDIT extends FundingOption
  /* 0 */ @js.native
  object CREDIT extends TopLevel[CREDIT with Double]
  
  @js.native
  sealed trait ELV extends FundingOption
  /* 3 */ @js.native
  object ELV extends TopLevel[ELV with Double]
  
  @js.native
  sealed trait VENMO extends FundingOption
  /* 2 */ @js.native
  object VENMO extends TopLevel[VENMO with Double]
}

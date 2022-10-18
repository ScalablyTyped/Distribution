package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "TokenType")
@js.native
object TokenType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TokenType & String] = js.native
  
  @js.native
  sealed trait BILLING_AGREEMENT
    extends StObject
       with TokenType
  /* "BILLING_AGREEMENT" */ val BILLING_AGREEMENT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.TokenType.BILLING_AGREEMENT & String = js.native
}

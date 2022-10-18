package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccountType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "AccountType")
@js.native
object AccountType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AccountType & String] = js.native
  
  @js.native
  sealed trait CHECKING
    extends StObject
       with AccountType
  /* "CHECKING" */ val CHECKING: typings.paypalCheckoutServerSdk.libPaymentsLibMod.AccountType.CHECKING & String = js.native
  
  @js.native
  sealed trait SAVINGS
    extends StObject
       with AccountType
  /* "SAVINGS" */ val SAVINGS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.AccountType.SAVINGS & String = js.native
}

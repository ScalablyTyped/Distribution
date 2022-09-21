package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DisbursementMode extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "DisbursementMode")
@js.native
object DisbursementMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DisbursementMode & String] = js.native
  
  @js.native
  sealed trait DELAYED
    extends StObject
       with DisbursementMode
  /* "DELAYED" */ val DELAYED: typings.paypalCheckoutServerSdk.paymentsLibMod.DisbursementMode.DELAYED & String = js.native
  
  @js.native
  sealed trait INSTANT
    extends StObject
       with DisbursementMode
  /* "INSTANT" */ val INSTANT: typings.paypalCheckoutServerSdk.paymentsLibMod.DisbursementMode.INSTANT & String = js.native
}

package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccountTier extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "AccountTier")
@js.native
object AccountTier extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AccountTier & String] = js.native
  
  @js.native
  sealed trait BUSINESS
    extends StObject
       with AccountTier
  /* "BUSINESS" */ val BUSINESS: typings.paypalCheckoutServerSdk.ordersLibMod.AccountTier.BUSINESS & String = js.native
  
  @js.native
  sealed trait PERSONAL
    extends StObject
       with AccountTier
  /* "PERSONAL" */ val PERSONAL: typings.paypalCheckoutServerSdk.ordersLibMod.AccountTier.PERSONAL & String = js.native
  
  @js.native
  sealed trait PREMIER
    extends StObject
       with AccountTier
  /* "PREMIER" */ val PREMIER: typings.paypalCheckoutServerSdk.ordersLibMod.AccountTier.PREMIER & String = js.native
}

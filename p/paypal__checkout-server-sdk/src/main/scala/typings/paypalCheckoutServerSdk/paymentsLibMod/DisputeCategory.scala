package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DisputeCategory extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "DisputeCategory")
@js.native
object DisputeCategory extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DisputeCategory & String] = js.native
  
  @js.native
  sealed trait ITEM_NOT_RECEIVED
    extends StObject
       with DisputeCategory
  /* "ITEM_NOT_RECEIVED" */ val ITEM_NOT_RECEIVED: typings.paypalCheckoutServerSdk.paymentsLibMod.DisputeCategory.ITEM_NOT_RECEIVED & String = js.native
  
  @js.native
  sealed trait UNAUTHORIZED_TRANSACTION
    extends StObject
       with DisputeCategory
  /* "UNAUTHORIZED_TRANSACTION" */ val UNAUTHORIZED_TRANSACTION: typings.paypalCheckoutServerSdk.paymentsLibMod.DisputeCategory.UNAUTHORIZED_TRANSACTION & String = js.native
}

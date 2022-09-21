package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelEnumsDisbursementType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "ModelEnumsDisbursementType")
@js.native
object ModelEnumsDisbursementType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ModelEnumsDisbursementType & String] = js.native
  
  @js.native
  sealed trait DELAYED
    extends StObject
       with ModelEnumsDisbursementType
  /* "DELAYED" */ val DELAYED: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsDisbursementType.DELAYED & String = js.native
  
  @js.native
  sealed trait INSTANT
    extends StObject
       with ModelEnumsDisbursementType
  /* "INSTANT" */ val INSTANT: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsDisbursementType.INSTANT & String = js.native
}

package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelEnumsLiabilityType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "ModelEnumsLiabilityType")
@js.native
object ModelEnumsLiabilityType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ModelEnumsLiabilityType & String] = js.native
  
  @js.native
  sealed trait FULL
    extends StObject
       with ModelEnumsLiabilityType
  /* "FULL" */ val FULL: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsLiabilityType.FULL & String = js.native
  
  @js.native
  sealed trait PARTIAL
    extends StObject
       with ModelEnumsLiabilityType
  /* "PARTIAL" */ val PARTIAL: typings.paypalCheckoutServerSdk.ordersLibMod.ModelEnumsLiabilityType.PARTIAL & String = js.native
}

package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModelEnumsFacilitatorType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "ModelEnumsFacilitatorType")
@js.native
object ModelEnumsFacilitatorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ModelEnumsFacilitatorType & String] = js.native
  
  @js.native
  sealed trait API_CALLER
    extends StObject
       with ModelEnumsFacilitatorType
  /* "API_CALLER" */ val API_CALLER: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.API_CALLER & String = js.native
  
  @js.native
  sealed trait INTERNAL
    extends StObject
       with ModelEnumsFacilitatorType
  /* "INTERNAL" */ val INTERNAL: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.INTERNAL & String = js.native
  
  @js.native
  sealed trait PARTNER
    extends StObject
       with ModelEnumsFacilitatorType
  /* "PARTNER" */ val PARTNER: typings.paypalCheckoutServerSdk.libOrdersLibMod.ModelEnumsFacilitatorType.PARTNER & String = js.native
}

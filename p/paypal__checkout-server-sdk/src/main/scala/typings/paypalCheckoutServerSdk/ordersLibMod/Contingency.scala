package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Contingency extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "Contingency")
@js.native
object Contingency extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Contingency & String] = js.native
  
  @js.native
  sealed trait `3D_SECURE`
    extends StObject
       with Contingency
  /* "3D_SECURE" */ val `3D_SECURE`: typings.paypalCheckoutServerSdk.ordersLibMod.Contingency.`3D_SECURE` & String = js.native
}

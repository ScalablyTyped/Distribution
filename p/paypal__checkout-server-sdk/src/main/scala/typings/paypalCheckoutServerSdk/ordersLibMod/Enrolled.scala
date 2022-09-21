package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Enrolled extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "Enrolled")
@js.native
object Enrolled extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Enrolled & String] = js.native
  
  @js.native
  sealed trait B
    extends StObject
       with Enrolled
  /* "B" */ val B: typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled.B & String = js.native
  
  @js.native
  sealed trait N
    extends StObject
       with Enrolled
  /* "N" */ val N: typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled.N & String = js.native
  
  @js.native
  sealed trait U
    extends StObject
       with Enrolled
  /* "U" */ val U: typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled.U & String = js.native
  
  @js.native
  sealed trait Y
    extends StObject
       with Enrolled
  /* "Y" */ val Y: typings.paypalCheckoutServerSdk.ordersLibMod.Enrolled.Y & String = js.native
}

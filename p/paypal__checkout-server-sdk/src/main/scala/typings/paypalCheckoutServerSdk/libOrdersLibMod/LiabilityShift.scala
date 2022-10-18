package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LiabilityShift extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "LiabilityShift")
@js.native
object LiabilityShift extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LiabilityShift & String] = js.native
  
  @js.native
  sealed trait NO
    extends StObject
       with LiabilityShift
  /* "NO" */ val NO: typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.NO & String = js.native
  
  @js.native
  sealed trait POSSIBLE
    extends StObject
       with LiabilityShift
  /* "POSSIBLE" */ val POSSIBLE: typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.POSSIBLE & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with LiabilityShift
  /* "UNKNOWN" */ val UNKNOWN: typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.UNKNOWN & String = js.native
  
  @js.native
  sealed trait YES
    extends StObject
       with LiabilityShift
  /* "YES" */ val YES: typings.paypalCheckoutServerSdk.libOrdersLibMod.LiabilityShift.YES & String = js.native
}

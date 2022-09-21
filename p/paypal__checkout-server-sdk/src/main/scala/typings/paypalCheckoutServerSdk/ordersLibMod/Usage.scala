package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Usage extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "Usage")
@js.native
object Usage extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Usage & String] = js.native
  
  @js.native
  sealed trait DERIVED
    extends StObject
       with Usage
  /* "DERIVED" */ val DERIVED: typings.paypalCheckoutServerSdk.ordersLibMod.Usage.DERIVED & String = js.native
  
  @js.native
  sealed trait FIRST
    extends StObject
       with Usage
  /* "FIRST" */ val FIRST: typings.paypalCheckoutServerSdk.ordersLibMod.Usage.FIRST & String = js.native
  
  @js.native
  sealed trait SUBSEQUENT
    extends StObject
       with Usage
  /* "SUBSEQUENT" */ val SUBSEQUENT: typings.paypalCheckoutServerSdk.ordersLibMod.Usage.SUBSEQUENT & String = js.native
}

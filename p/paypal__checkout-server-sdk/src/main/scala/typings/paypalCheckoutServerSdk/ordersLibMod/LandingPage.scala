package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LandingPage extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "LandingPage")
@js.native
object LandingPage extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LandingPage & String] = js.native
  
  @js.native
  sealed trait BILLING
    extends StObject
       with LandingPage
  /* "BILLING" */ val BILLING: typings.paypalCheckoutServerSdk.ordersLibMod.LandingPage.BILLING & String = js.native
  
  @js.native
  sealed trait LOGIN
    extends StObject
       with LandingPage
  /* "LOGIN" */ val LOGIN: typings.paypalCheckoutServerSdk.ordersLibMod.LandingPage.LOGIN & String = js.native
  
  @js.native
  sealed trait NO_PREFERENCE
    extends StObject
       with LandingPage
  /* "NO_PREFERENCE" */ val NO_PREFERENCE: typings.paypalCheckoutServerSdk.ordersLibMod.LandingPage.NO_PREFERENCE & String = js.native
}

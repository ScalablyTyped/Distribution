package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PayeePreferred extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "PayeePreferred")
@js.native
object PayeePreferred extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PayeePreferred & String] = js.native
  
  @js.native
  sealed trait IMMEDIATE_PAYMENT_REQUIRED
    extends StObject
       with PayeePreferred
  /* "IMMEDIATE_PAYMENT_REQUIRED" */ val IMMEDIATE_PAYMENT_REQUIRED: typings.paypalCheckoutServerSdk.libOrdersLibMod.PayeePreferred.IMMEDIATE_PAYMENT_REQUIRED & String = js.native
  
  @js.native
  sealed trait UNRESTRICTED
    extends StObject
       with PayeePreferred
  /* "UNRESTRICTED" */ val UNRESTRICTED: typings.paypalCheckoutServerSdk.libOrdersLibMod.PayeePreferred.UNRESTRICTED & String = js.native
}

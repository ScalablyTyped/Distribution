package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaymentType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "PaymentType")
@js.native
object PaymentType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PaymentType & String] = js.native
  
  @js.native
  sealed trait ONE_TIME
    extends StObject
       with PaymentType
  /* "ONE_TIME" */ val ONE_TIME: typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.ONE_TIME & String = js.native
  
  @js.native
  sealed trait RECURRING
    extends StObject
       with PaymentType
  /* "RECURRING" */ val RECURRING: typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.RECURRING & String = js.native
  
  @js.native
  sealed trait UNSCHEDULED
    extends StObject
       with PaymentType
  /* "UNSCHEDULED" */ val UNSCHEDULED: typings.paypalCheckoutServerSdk.libOrdersLibMod.PaymentType.UNSCHEDULED & String = js.native
}

package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CVVCode extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "CVVCode")
@js.native
object CVVCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CVVCode & String] = js.native
  
  @js.native
  sealed trait ALL_OTHERS
    extends StObject
       with CVVCode
  /* "All others" */ val ALL_OTHERS: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.ALL_OTHERS & String = js.native
  
  @js.native
  sealed trait E
    extends StObject
       with CVVCode
  /* "E" */ val E: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.E & String = js.native
  
  @js.native
  sealed trait I
    extends StObject
       with CVVCode
  /* "I" */ val I: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.I & String = js.native
  
  @js.native
  sealed trait M
    extends StObject
       with CVVCode
  /* "M" */ val M: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.M & String = js.native
  
  @js.native
  sealed trait Maestro_matched
    extends StObject
       with CVVCode
  /* "0" */ val Maestro_matched: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_matched & String = js.native
  
  @js.native
  sealed trait Maestro_not_available
    extends StObject
       with CVVCode
  /* "4" */ val Maestro_not_available: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_available & String = js.native
  
  @js.native
  sealed trait Maestro_not_implemented
    extends StObject
       with CVVCode
  /* "2" */ val Maestro_not_implemented: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_implemented & String = js.native
  
  @js.native
  sealed trait Maestro_not_match
    extends StObject
       with CVVCode
  /* "1" */ val Maestro_not_match: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_match & String = js.native
  
  @js.native
  sealed trait Maestro_not_present
    extends StObject
       with CVVCode
  /* "3" */ val Maestro_not_present: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.Maestro_not_present & String = js.native
  
  @js.native
  sealed trait N
    extends StObject
       with CVVCode
  /* "N" */ val N: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.N & String = js.native
  
  @js.native
  sealed trait P
    extends StObject
       with CVVCode
  /* "P" */ val P: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.P & String = js.native
  
  @js.native
  sealed trait S
    extends StObject
       with CVVCode
  /* "S" */ val S: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.S & String = js.native
  
  @js.native
  sealed trait U
    extends StObject
       with CVVCode
  /* "U" */ val U: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.U & String = js.native
  
  @js.native
  sealed trait X
    extends StObject
       with CVVCode
  /* "X" */ val X: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CVVCode.X & String = js.native
}

package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "PhoneType")
@js.native
object PhoneType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PhoneType & String] = js.native
  
  @js.native
  sealed trait FAX
    extends StObject
       with PhoneType
  /* "FAX" */ val FAX: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.FAX & String = js.native
  
  @js.native
  sealed trait HOME
    extends StObject
       with PhoneType
  /* "HOME" */ val HOME: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.HOME & String = js.native
  
  @js.native
  sealed trait MOBILE
    extends StObject
       with PhoneType
  /* "MOBILE" */ val MOBILE: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.MOBILE & String = js.native
  
  @js.native
  sealed trait OTHER
    extends StObject
       with PhoneType
  /* "OTHER" */ val OTHER: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.OTHER & String = js.native
  
  @js.native
  sealed trait PAGER
    extends StObject
       with PhoneType
  /* "PAGER" */ val PAGER: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.PAGER & String = js.native
  
  @js.native
  sealed trait WORK
    extends StObject
       with PhoneType
  /* "WORK" */ val WORK: typings.paypalCheckoutServerSdk.libOrdersLibMod.PhoneType.WORK & String = js.native
}

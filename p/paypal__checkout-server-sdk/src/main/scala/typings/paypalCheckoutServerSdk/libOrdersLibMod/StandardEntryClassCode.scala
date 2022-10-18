package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StandardEntryClassCode extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "StandardEntryClassCode")
@js.native
object StandardEntryClassCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StandardEntryClassCode & String] = js.native
  
  @js.native
  sealed trait CCD
    extends StObject
       with StandardEntryClassCode
  /* "CCD" */ val CCD: typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.CCD & String = js.native
  
  @js.native
  sealed trait PP
    extends StObject
       with StandardEntryClassCode
  /* "PPD" */ val PP: typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.PP & String = js.native
  
  @js.native
  sealed trait TEL
    extends StObject
       with StandardEntryClassCode
  /* "TEL" */ val TEL: typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.TEL & String = js.native
  
  @js.native
  sealed trait WEB
    extends StObject
       with StandardEntryClassCode
  /* "WEB" */ val WEB: typings.paypalCheckoutServerSdk.libOrdersLibMod.StandardEntryClassCode.WEB & String = js.native
}

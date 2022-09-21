package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardBrand extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "CardBrand")
@js.native
object CardBrand extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardBrand & String] = js.native
  
  @js.native
  sealed trait AMEX
    extends StObject
       with CardBrand
  /* "AMEX" */ val AMEX: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.AMEX & String = js.native
  
  @js.native
  sealed trait CB_NATIONALE
    extends StObject
       with CardBrand
  /* "CB_NATIONALE" */ val CB_NATIONALE: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CB_NATIONALE & String = js.native
  
  @js.native
  sealed trait CETELEM
    extends StObject
       with CardBrand
  /* "CETELEM" */ val CETELEM: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CETELEM & String = js.native
  
  @js.native
  sealed trait CHINA_UNION_PAY
    extends StObject
       with CardBrand
  /* "CHINA_UNION_PAY" */ val CHINA_UNION_PAY: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CHINA_UNION_PAY & String = js.native
  
  @js.native
  sealed trait CONFIDIS
    extends StObject
       with CardBrand
  /* "CONFIDIS" */ val CONFIDIS: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CONFIDIS & String = js.native
  
  @js.native
  sealed trait CONFIGOGA
    extends StObject
       with CardBrand
  /* "CONFIGOGA" */ val CONFIGOGA: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.CONFIGOGA & String = js.native
  
  @js.native
  sealed trait DELTA
    extends StObject
       with CardBrand
  /* "DELTA" */ val DELTA: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.DELTA & String = js.native
  
  @js.native
  sealed trait DISCOVER
    extends StObject
       with CardBrand
  /* "DISCOVER" */ val DISCOVER: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.DISCOVER & String = js.native
  
  @js.native
  sealed trait ELECTRON
    extends StObject
       with CardBrand
  /* "ELECTRON" */ val ELECTRON: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.ELECTRON & String = js.native
  
  @js.native
  sealed trait JCB
    extends StObject
       with CardBrand
  /* "JCB" */ val JCB: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.JCB & String = js.native
  
  @js.native
  sealed trait MAESTRO
    extends StObject
       with CardBrand
  /* "MAESTRO" */ val MAESTRO: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.MAESTRO & String = js.native
  
  @js.native
  sealed trait MASTERCARD
    extends StObject
       with CardBrand
  /* "MASTERCARD" */ val MASTERCARD: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.MASTERCARD & String = js.native
  
  @js.native
  sealed trait SOLO
    extends StObject
       with CardBrand
  /* "SOLO" */ val SOLO: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.SOLO & String = js.native
  
  @js.native
  sealed trait STAR
    extends StObject
       with CardBrand
  /* "STAR" */ val STAR: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.STAR & String = js.native
  
  @js.native
  sealed trait SWITCH
    extends StObject
       with CardBrand
  /* "SWITCH" */ val SWITCH: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.SWITCH & String = js.native
  
  @js.native
  sealed trait VISA
    extends StObject
       with CardBrand
  /* "VISA" */ val VISA: typings.paypalCheckoutServerSdk.paymentsLibMod.CardBrand.VISA & String = js.native
}

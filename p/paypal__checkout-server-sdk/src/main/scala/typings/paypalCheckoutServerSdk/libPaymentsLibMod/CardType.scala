package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CardType extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "CardType")
@js.native
object CardType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CardType & String] = js.native
  
  @js.native
  sealed trait CREDIT
    extends StObject
       with CardType
  /* "CREDIT" */ val CREDIT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.CREDIT & String = js.native
  
  @js.native
  sealed trait DEBIT
    extends StObject
       with CardType
  /* "DEBIT" */ val DEBIT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.DEBIT & String = js.native
  
  @js.native
  sealed trait PREPAID
    extends StObject
       with CardType
  /* "PREPAID" */ val PREPAID: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.PREPAID & String = js.native
  
  @js.native
  sealed trait STORE
    extends StObject
       with CardType
  /* "STORE" */ val STORE: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.STORE & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with CardType
  /* "UNKNOWN" */ val UNKNOWN: typings.paypalCheckoutServerSdk.libPaymentsLibMod.CardType.UNKNOWN & String = js.native
}

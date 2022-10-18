package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaymentAdviceCode extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "PaymentAdviceCode")
@js.native
object PaymentAdviceCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PaymentAdviceCode & String] = js.native
  
  @js.native
  sealed trait MASTERCARD_ACCOUNT_CLOSED
    extends StObject
       with PaymentAdviceCode
  /* "03" */ val MASTERCARD_ACCOUNT_CLOSED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode.MASTERCARD_ACCOUNT_CLOSED & String = js.native
  
  @js.native
  sealed trait MASTERCARD_CREDIT_LIMIT
    extends StObject
       with PaymentAdviceCode
  /* "02" */ val MASTERCARD_CREDIT_LIMIT: typings.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode.MASTERCARD_CREDIT_LIMIT & String = js.native
  
  @js.native
  sealed trait MASTERCARD_EXPIRED
    extends StObject
       with PaymentAdviceCode
  /* "01" */ val MASTERCARD_EXPIRED: typings.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode.MASTERCARD_EXPIRED & String = js.native
  
  @js.native
  sealed trait MASTERCARD_UNSUCCESSFUL
    extends StObject
       with PaymentAdviceCode
  /* "21" */ val MASTERCARD_UNSUCCESSFUL: typings.paypalCheckoutServerSdk.libPaymentsLibMod.PaymentAdviceCode.MASTERCARD_UNSUCCESSFUL & String = js.native
}

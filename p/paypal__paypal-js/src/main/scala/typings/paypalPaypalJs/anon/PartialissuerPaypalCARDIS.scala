package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.CARD_ISSUER_INSTALLMENTS
import typings.paypalPaypalJs.paypalPaypalJsStrings.Paypal_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  issuer :'Paypal' | 'CARD_ISSUER_INSTALLMENTS',   total_payment :std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode>,   total_interest :std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode>,   installment_details :std.Partial<{  period :string,   interval_duration :string,   payment_due :std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/commons.AmountWithCurrencyCode>}>,   term :number}> */
trait PartialissuerPaypalCARDIS extends StObject {
  
  var installment_details: js.UndefOr[Partialperiodstringinterv] = js.undefined
  
  var issuer: js.UndefOr[Paypal_ | CARD_ISSUER_INSTALLMENTS] = js.undefined
  
  var term: js.UndefOr[Double] = js.undefined
  
  var total_interest: js.UndefOr[PartialAmountWithCurrency] = js.undefined
  
  var total_payment: js.UndefOr[PartialAmountWithCurrency] = js.undefined
}
object PartialissuerPaypalCARDIS {
  
  inline def apply(): PartialissuerPaypalCARDIS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialissuerPaypalCARDIS]
  }
  
  extension [Self <: PartialissuerPaypalCARDIS](x: Self) {
    
    inline def setInstallment_details(value: Partialperiodstringinterv): Self = StObject.set(x, "installment_details", value.asInstanceOf[js.Any])
    
    inline def setInstallment_detailsUndefined: Self = StObject.set(x, "installment_details", js.undefined)
    
    inline def setIssuer(value: Paypal_ | CARD_ISSUER_INSTALLMENTS): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setTerm(value: Double): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    inline def setTotal_interest(value: PartialAmountWithCurrency): Self = StObject.set(x, "total_interest", value.asInstanceOf[js.Any])
    
    inline def setTotal_interestUndefined: Self = StObject.set(x, "total_interest", js.undefined)
    
    inline def setTotal_payment(value: PartialAmountWithCurrency): Self = StObject.set(x, "total_payment", value.asInstanceOf[js.Any])
    
    inline def setTotal_paymentUndefined: Self = StObject.set(x, "total_payment", js.undefined)
  }
}

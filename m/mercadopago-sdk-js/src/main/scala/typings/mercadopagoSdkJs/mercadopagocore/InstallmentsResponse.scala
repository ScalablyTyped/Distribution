package typings.mercadopagoSdkJs.mercadopagocore

import typings.mercadopagoSdkJs.shared.Issuer
import typings.mercadopagoSdkJs.shared.PayerCost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallmentsResponse extends StObject {
  
  var agreements: js.UndefOr[Any] = js.undefined
  
  var issuer: Issuer
  
  var merchant_account_id: js.UndefOr[String] = js.undefined
  
  var payer_costs: js.Array[PayerCost]
  
  var payment_method_id: String
  
  var payment_type_id: String
  
  var processing_mode: String
}
object InstallmentsResponse {
  
  inline def apply(
    issuer: Issuer,
    payer_costs: js.Array[PayerCost],
    payment_method_id: String,
    payment_type_id: String,
    processing_mode: String
  ): InstallmentsResponse = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], payer_costs = payer_costs.asInstanceOf[js.Any], payment_method_id = payment_method_id.asInstanceOf[js.Any], payment_type_id = payment_type_id.asInstanceOf[js.Any], processing_mode = processing_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallmentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallmentsResponse] (val x: Self) extends AnyVal {
    
    inline def setAgreements(value: Any): Self = StObject.set(x, "agreements", value.asInstanceOf[js.Any])
    
    inline def setAgreementsUndefined: Self = StObject.set(x, "agreements", js.undefined)
    
    inline def setIssuer(value: Issuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setMerchant_account_id(value: String): Self = StObject.set(x, "merchant_account_id", value.asInstanceOf[js.Any])
    
    inline def setMerchant_account_idUndefined: Self = StObject.set(x, "merchant_account_id", js.undefined)
    
    inline def setPayer_costs(value: js.Array[PayerCost]): Self = StObject.set(x, "payer_costs", value.asInstanceOf[js.Any])
    
    inline def setPayer_costsVarargs(value: PayerCost*): Self = StObject.set(x, "payer_costs", js.Array(value*))
    
    inline def setPayment_method_id(value: String): Self = StObject.set(x, "payment_method_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_type_id(value: String): Self = StObject.set(x, "payment_type_id", value.asInstanceOf[js.Any])
    
    inline def setProcessing_mode(value: String): Self = StObject.set(x, "processing_mode", value.asInstanceOf[js.Any])
  }
}

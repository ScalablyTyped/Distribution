package typings.mercadopagoSdkJs.cardform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardFormData extends StObject {
  
  var amount: String
  
  var cardholderEmail: js.UndefOr[String] = js.undefined
  
  var identificationNumber: String
  
  var identificationType: String
  
  var installments: String
  
  var issuerId: String
  
  var merchantAccountId: js.UndefOr[String] = js.undefined
  
  var paymentMethodId: String
  
  var processingMode: String
  
  var token: String
}
object CardFormData {
  
  inline def apply(
    amount: String,
    identificationNumber: String,
    identificationType: String,
    installments: String,
    issuerId: String,
    paymentMethodId: String,
    processingMode: String,
    token: String
  ): CardFormData = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], identificationNumber = identificationNumber.asInstanceOf[js.Any], identificationType = identificationType.asInstanceOf[js.Any], installments = installments.asInstanceOf[js.Any], issuerId = issuerId.asInstanceOf[js.Any], paymentMethodId = paymentMethodId.asInstanceOf[js.Any], processingMode = processingMode.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFormData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardFormData] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCardholderEmail(value: String): Self = StObject.set(x, "cardholderEmail", value.asInstanceOf[js.Any])
    
    inline def setCardholderEmailUndefined: Self = StObject.set(x, "cardholderEmail", js.undefined)
    
    inline def setIdentificationNumber(value: String): Self = StObject.set(x, "identificationNumber", value.asInstanceOf[js.Any])
    
    inline def setIdentificationType(value: String): Self = StObject.set(x, "identificationType", value.asInstanceOf[js.Any])
    
    inline def setInstallments(value: String): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
    
    inline def setIssuerId(value: String): Self = StObject.set(x, "issuerId", value.asInstanceOf[js.Any])
    
    inline def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    inline def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
    
    inline def setPaymentMethodId(value: String): Self = StObject.set(x, "paymentMethodId", value.asInstanceOf[js.Any])
    
    inline def setProcessingMode(value: String): Self = StObject.set(x, "processingMode", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}

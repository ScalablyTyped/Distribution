package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardFormData extends StObject {
  
  var installments: Double
  
  var issuer_id: String | Null
  
  var payer: PayerAPI
  
  var payment_method_id: String
  
  var payment_method_option_id: js.UndefOr[String] = js.undefined
  
  var processing_mode: js.UndefOr[String] = js.undefined
  
  var token: String
  
  var transaction_amount: Double
}
object CardFormData {
  
  inline def apply(
    installments: Double,
    payer: PayerAPI,
    payment_method_id: String,
    token: String,
    transaction_amount: Double
  ): CardFormData = {
    val __obj = js.Dynamic.literal(installments = installments.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], payment_method_id = payment_method_id.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], transaction_amount = transaction_amount.asInstanceOf[js.Any], issuer_id = null)
    __obj.asInstanceOf[CardFormData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardFormData] (val x: Self) extends AnyVal {
    
    inline def setInstallments(value: Double): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
    
    inline def setIssuer_id(value: String): Self = StObject.set(x, "issuer_id", value.asInstanceOf[js.Any])
    
    inline def setIssuer_idNull: Self = StObject.set(x, "issuer_id", null)
    
    inline def setPayer(value: PayerAPI): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_id(value: String): Self = StObject.set(x, "payment_method_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_option_id(value: String): Self = StObject.set(x, "payment_method_option_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_option_idUndefined: Self = StObject.set(x, "payment_method_option_id", js.undefined)
    
    inline def setProcessing_mode(value: String): Self = StObject.set(x, "processing_mode", value.asInstanceOf[js.Any])
    
    inline def setProcessing_modeUndefined: Self = StObject.set(x, "processing_mode", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTransaction_amount(value: Double): Self = StObject.set(x, "transaction_amount", value.asInstanceOf[js.Any])
  }
}

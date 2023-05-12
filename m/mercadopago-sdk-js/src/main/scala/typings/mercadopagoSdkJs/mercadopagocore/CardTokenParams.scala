package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardTokenParams extends StObject {
  
  var cardExpirationMonth: js.UndefOr[String] = js.undefined
  
  var cardExpirationYear: js.UndefOr[String] = js.undefined
  
  var cardId: js.UndefOr[String] = js.undefined
  
  var cardNumber: js.UndefOr[String] = js.undefined
  
  var cardholderName: js.UndefOr[String] = js.undefined
  
  var identificationNumber: js.UndefOr[String] = js.undefined
  
  var identificationType: js.UndefOr[String] = js.undefined
  
  var securityCode: js.UndefOr[String] = js.undefined
}
object CardTokenParams {
  
  inline def apply(): CardTokenParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTokenParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardTokenParams] (val x: Self) extends AnyVal {
    
    inline def setCardExpirationMonth(value: String): Self = StObject.set(x, "cardExpirationMonth", value.asInstanceOf[js.Any])
    
    inline def setCardExpirationMonthUndefined: Self = StObject.set(x, "cardExpirationMonth", js.undefined)
    
    inline def setCardExpirationYear(value: String): Self = StObject.set(x, "cardExpirationYear", value.asInstanceOf[js.Any])
    
    inline def setCardExpirationYearUndefined: Self = StObject.set(x, "cardExpirationYear", js.undefined)
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
    
    inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
    
    inline def setCardNumberUndefined: Self = StObject.set(x, "cardNumber", js.undefined)
    
    inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    inline def setIdentificationNumber(value: String): Self = StObject.set(x, "identificationNumber", value.asInstanceOf[js.Any])
    
    inline def setIdentificationNumberUndefined: Self = StObject.set(x, "identificationNumber", js.undefined)
    
    inline def setIdentificationType(value: String): Self = StObject.set(x, "identificationType", value.asInstanceOf[js.Any])
    
    inline def setIdentificationTypeUndefined: Self = StObject.set(x, "identificationType", js.undefined)
    
    inline def setSecurityCode(value: String): Self = StObject.set(x, "securityCode", value.asInstanceOf[js.Any])
    
    inline def setSecurityCodeUndefined: Self = StObject.set(x, "securityCode", js.undefined)
  }
}

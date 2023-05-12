package typings.mercadopagoSdkJs.cardform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardFormMap extends StObject {
  
  var cardExpirationDate: js.UndefOr[CardFormProperties] = js.undefined
  
  var cardExpirationMonth: js.UndefOr[CardFormProperties] = js.undefined
  
  var cardExpirationYear: js.UndefOr[CardFormProperties] = js.undefined
  
  var cardNumber: CardFormProperties
  
  var cardholderEmail: CardFormProperties
  
  var cardholderName: CardFormProperties
  
  var expirationDate: js.UndefOr[CardFormProperties] = js.undefined
  
  var expirationMonth: js.UndefOr[CardFormProperties] = js.undefined
  
  var id: String
  
  var identificationNumber: CardFormProperties
  
  var identificationType: CardFormProperties
  
  var installments: CardFormProperties
  
  var issuer: CardFormProperties
  
  var securityCode: CardFormProperties
}
object CardFormMap {
  
  inline def apply(
    cardNumber: CardFormProperties,
    cardholderEmail: CardFormProperties,
    cardholderName: CardFormProperties,
    id: String,
    identificationNumber: CardFormProperties,
    identificationType: CardFormProperties,
    installments: CardFormProperties,
    issuer: CardFormProperties,
    securityCode: CardFormProperties
  ): CardFormMap = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cardholderEmail = cardholderEmail.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identificationNumber = identificationNumber.asInstanceOf[js.Any], identificationType = identificationType.asInstanceOf[js.Any], installments = installments.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], securityCode = securityCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFormMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardFormMap] (val x: Self) extends AnyVal {
    
    inline def setCardExpirationDate(value: CardFormProperties): Self = StObject.set(x, "cardExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setCardExpirationDateUndefined: Self = StObject.set(x, "cardExpirationDate", js.undefined)
    
    inline def setCardExpirationMonth(value: CardFormProperties): Self = StObject.set(x, "cardExpirationMonth", value.asInstanceOf[js.Any])
    
    inline def setCardExpirationMonthUndefined: Self = StObject.set(x, "cardExpirationMonth", js.undefined)
    
    inline def setCardExpirationYear(value: CardFormProperties): Self = StObject.set(x, "cardExpirationYear", value.asInstanceOf[js.Any])
    
    inline def setCardExpirationYearUndefined: Self = StObject.set(x, "cardExpirationYear", js.undefined)
    
    inline def setCardNumber(value: CardFormProperties): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
    
    inline def setCardholderEmail(value: CardFormProperties): Self = StObject.set(x, "cardholderEmail", value.asInstanceOf[js.Any])
    
    inline def setCardholderName(value: CardFormProperties): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: CardFormProperties): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setExpirationMonth(value: CardFormProperties): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentificationNumber(value: CardFormProperties): Self = StObject.set(x, "identificationNumber", value.asInstanceOf[js.Any])
    
    inline def setIdentificationType(value: CardFormProperties): Self = StObject.set(x, "identificationType", value.asInstanceOf[js.Any])
    
    inline def setInstallments(value: CardFormProperties): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: CardFormProperties): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setSecurityCode(value: CardFormProperties): Self = StObject.set(x, "securityCode", value.asInstanceOf[js.Any])
  }
}

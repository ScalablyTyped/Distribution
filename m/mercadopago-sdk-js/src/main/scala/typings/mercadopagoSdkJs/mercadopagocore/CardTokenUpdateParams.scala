package typings.mercadopagoSdkJs.mercadopagocore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardTokenUpdateParams extends StObject {
  
  var cardExpirationMonth: js.UndefOr[String] = js.undefined
  
  var cardExpirationYear: js.UndefOr[String] = js.undefined
  
  var securityCode: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object CardTokenUpdateParams {
  
  inline def apply(): CardTokenUpdateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTokenUpdateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardTokenUpdateParams] (val x: Self) extends AnyVal {
    
    inline def setCardExpirationMonth(value: String): Self = StObject.set(x, "cardExpirationMonth", value.asInstanceOf[js.Any])
    
    inline def setCardExpirationMonthUndefined: Self = StObject.set(x, "cardExpirationMonth", js.undefined)
    
    inline def setCardExpirationYear(value: String): Self = StObject.set(x, "cardExpirationYear", value.asInstanceOf[js.Any])
    
    inline def setCardExpirationYearUndefined: Self = StObject.set(x, "cardExpirationYear", js.undefined)
    
    inline def setSecurityCode(value: String): Self = StObject.set(x, "securityCode", value.asInstanceOf[js.Any])
    
    inline def setSecurityCodeUndefined: Self = StObject.set(x, "securityCode", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}

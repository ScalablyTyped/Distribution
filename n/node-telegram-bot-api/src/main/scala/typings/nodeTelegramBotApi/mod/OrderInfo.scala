package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderInfo extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var shipping_address: js.UndefOr[ShippingAddress] = js.undefined
}
object OrderInfo {
  
  inline def apply(): OrderInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderInfo]
  }
  
  extension [Self <: OrderInfo](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setShipping_address(value: ShippingAddress): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
    
    inline def setShipping_addressUndefined: Self = StObject.set(x, "shipping_address", js.undefined)
  }
}

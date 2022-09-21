package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.paymentsLibMod.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPhoneInfo extends StObject {
  
  var phone_number: Phone
  
  var phone_type: PhoneType
}
object ModelPhoneInfo {
  
  inline def apply(phone_number: Phone, phone_type: PhoneType): ModelPhoneInfo = {
    val __obj = js.Dynamic.literal(phone_number = phone_number.asInstanceOf[js.Any], phone_type = phone_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPhoneInfo]
  }
  
  extension [Self <: ModelPhoneInfo](x: Self) {
    
    inline def setPhone_number(value: Phone): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_type(value: PhoneType): Self = StObject.set(x, "phone_type", value.asInstanceOf[js.Any])
  }
}

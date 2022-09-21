package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCustomerServiceContact extends StObject {
  
  var emails: js.Array[String]
  
  var phones: js.Array[ModelPhoneInfo]
}
object ModelCustomerServiceContact {
  
  inline def apply(emails: js.Array[String], phones: js.Array[ModelPhoneInfo]): ModelCustomerServiceContact = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCustomerServiceContact]
  }
  
  extension [Self <: ModelCustomerServiceContact](x: Self) {
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setPhones(value: js.Array[ModelPhoneInfo]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesVarargs(value: ModelPhoneInfo*): Self = StObject.set(x, "phones", js.Array(value*))
  }
}

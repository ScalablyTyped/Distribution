package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contact extends StObject {
  
  var first_name: String
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var phone_number: String
  
  var user_id: js.UndefOr[Double] = js.undefined
  
  var vcard: js.UndefOr[String] = js.undefined
}
object Contact {
  
  inline def apply(first_name: String, phone_number: String): Contact = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setUser_id(value: Double): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
    
    inline def setVcard(value: String): Self = StObject.set(x, "vcard", value.asInstanceOf[js.Any])
    
    inline def setVcardUndefined: Self = StObject.set(x, "vcard", js.undefined)
  }
}

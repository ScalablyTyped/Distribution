package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ trait InputContactMessageContent extends StObject {
  
  var first_name: String
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var phone_number: String
}
object InputContactMessageContent {
  
  inline def apply(first_name: String, phone_number: String): InputContactMessageContent = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContactMessageContent]
  }
  
  extension [Self <: InputContactMessageContent](x: Self) {
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
  }
}

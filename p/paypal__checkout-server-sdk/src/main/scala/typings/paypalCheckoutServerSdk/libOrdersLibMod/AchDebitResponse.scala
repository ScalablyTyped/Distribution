package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchDebitResponse extends StObject {
  
  var account_holder_name: String
  
  var last_digits: String
  
  var routing_number: String
}
object AchDebitResponse {
  
  inline def apply(account_holder_name: String, last_digits: String, routing_number: String): AchDebitResponse = {
    val __obj = js.Dynamic.literal(account_holder_name = account_holder_name.asInstanceOf[js.Any], last_digits = last_digits.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchDebitResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AchDebitResponse] (val x: Self) extends AnyVal {
    
    inline def setAccount_holder_name(value: String): Self = StObject.set(x, "account_holder_name", value.asInstanceOf[js.Any])
    
    inline def setLast_digits(value: String): Self = StObject.set(x, "last_digits", value.asInstanceOf[js.Any])
    
    inline def setRouting_number(value: String): Self = StObject.set(x, "routing_number", value.asInstanceOf[js.Any])
  }
}

package typings.paystack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Authorizationcode extends StObject {
  
  var amount: Double
  
  var authorization_code: String
  
  var email: String
  
  var reference: String
}
object Authorizationcode {
  
  inline def apply(amount: Double, authorization_code: String, email: String, reference: String): Authorizationcode = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], authorization_code = authorization_code.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorizationcode]
  }
  
  extension [Self <: Authorizationcode](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAuthorization_code(value: String): Self = StObject.set(x, "authorization_code", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}

package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: String
  
  var rawBytes: js.UndefOr[Boolean] = js.undefined
}
object Email {
  
  inline def apply(email: String): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setRawBytes(value: Boolean): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
    
    inline def setRawBytesUndefined: Self = StObject.set(x, "rawBytes", js.undefined)
  }
}

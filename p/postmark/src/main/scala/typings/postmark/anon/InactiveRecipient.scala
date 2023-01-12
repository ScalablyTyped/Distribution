package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InactiveRecipient extends StObject {
  
  var inactiveRecipient: Double
  
  var invalidEmailRequest: Double
}
object InactiveRecipient {
  
  inline def apply(inactiveRecipient: Double, invalidEmailRequest: Double): InactiveRecipient = {
    val __obj = js.Dynamic.literal(inactiveRecipient = inactiveRecipient.asInstanceOf[js.Any], invalidEmailRequest = invalidEmailRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[InactiveRecipient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InactiveRecipient] (val x: Self) extends AnyVal {
    
    inline def setInactiveRecipient(value: Double): Self = StObject.set(x, "inactiveRecipient", value.asInstanceOf[js.Any])
    
    inline def setInvalidEmailRequest(value: Double): Self = StObject.set(x, "invalidEmailRequest", value.asInstanceOf[js.Any])
  }
}

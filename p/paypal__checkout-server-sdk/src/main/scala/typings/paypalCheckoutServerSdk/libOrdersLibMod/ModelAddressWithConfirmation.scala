package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelAddressWithConfirmation extends StObject {
  
  var confirmation_authority: String
  
  var confirmation_status: String
  
  var id: String
}
object ModelAddressWithConfirmation {
  
  inline def apply(confirmation_authority: String, confirmation_status: String, id: String): ModelAddressWithConfirmation = {
    val __obj = js.Dynamic.literal(confirmation_authority = confirmation_authority.asInstanceOf[js.Any], confirmation_status = confirmation_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelAddressWithConfirmation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelAddressWithConfirmation] (val x: Self) extends AnyVal {
    
    inline def setConfirmation_authority(value: String): Self = StObject.set(x, "confirmation_authority", value.asInstanceOf[js.Any])
    
    inline def setConfirmation_status(value: String): Self = StObject.set(x, "confirmation_status", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

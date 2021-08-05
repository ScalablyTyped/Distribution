package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Participant
  extends StObject
     with Person {
  
  var additional_info: js.UndefOr[String] = js.undefined
  
  @JSName("email")
  var email_Participant: String
  
  var fax: js.UndefOr[Phone] = js.undefined
}
object Participant {
  
  inline def apply(email: String): Participant = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  
  extension [Self <: Participant](x: Self) {
    
    inline def setAdditional_info(value: String): Self = StObject.set(x, "additional_info", value.asInstanceOf[js.Any])
    
    inline def setAdditional_infoUndefined: Self = StObject.set(x, "additional_info", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFax(value: Phone): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    inline def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
  }
}

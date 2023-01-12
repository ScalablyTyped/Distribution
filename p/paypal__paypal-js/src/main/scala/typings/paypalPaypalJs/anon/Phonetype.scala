package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phonetype extends StObject {
  
  /** The phone number, in its canonical international */
  var phone_number: String
  
  /** The phone type. */
  var phone_type: String
}
object Phonetype {
  
  inline def apply(phone_number: String, phone_type: String): Phonetype = {
    val __obj = js.Dynamic.literal(phone_number = phone_number.asInstanceOf[js.Any], phone_type = phone_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phonetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phonetype] (val x: Self) extends AnyVal {
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_type(value: String): Self = StObject.set(x, "phone_type", value.asInstanceOf[js.Any])
  }
}

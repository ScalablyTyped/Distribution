package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phonenumber extends StObject {
  
  var phone_number: Nationalnumber
  
  var phone_type: js.UndefOr[String] = js.undefined
}
object Phonenumber {
  
  inline def apply(phone_number: Nationalnumber): Phonenumber = {
    val __obj = js.Dynamic.literal(phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phonenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Phonenumber] (val x: Self) extends AnyVal {
    
    inline def setPhone_number(value: Nationalnumber): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_type(value: String): Self = StObject.set(x, "phone_type", value.asInstanceOf[js.Any])
    
    inline def setPhone_typeUndefined: Self = StObject.set(x, "phone_type", js.undefined)
  }
}

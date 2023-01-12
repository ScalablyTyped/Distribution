package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nationalnumber extends StObject {
  
  /**
    * The national number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en).
    * The combined length of the country calling code (CC) and the national number must not be greater than 15 digits.
    * The national number consists of a national destination code (NDC) and subscriber number (SN).
    */
  var national_number: String
}
object Nationalnumber {
  
  inline def apply(national_number: String): Nationalnumber = {
    val __obj = js.Dynamic.literal(national_number = national_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nationalnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nationalnumber] (val x: Self) extends AnyVal {
    
    inline def setNational_number(value: String): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
  }
}

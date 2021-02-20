package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phone extends StObject {
  
  var country_code: String = js.native
  
  var national_number: String = js.native
}
object Phone {
  
  @scala.inline
  def apply(country_code: String, national_number: String): Phone = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phone]
  }
  
  @scala.inline
  implicit class PhoneMutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNational_number(value: String): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
  }
}

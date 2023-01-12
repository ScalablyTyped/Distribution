package typings.phone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(phoneNumber: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(phoneNumber: String, countryCode: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(phoneNumber: String, countryCode: String, allowLandLine: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], allowLandLine.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(phoneNumber: String, countryCode: Unit, allowLandLine: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(phoneNumber.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any], allowLandLine.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("phone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("phone", "iso3166_data")
  @js.native
  val iso3166Data: js.Array[PhoneData] = js.native
  
  trait PhoneData extends StObject {
    
    var alpha2: String
    
    var alpha3: String
    
    var country_code: String
    
    var country_name: String
    
    var mobile_begin_with: js.Array[String]
    
    var phone_number_lengths: js.Array[Double]
  }
  object PhoneData {
    
    inline def apply(
      alpha2: String,
      alpha3: String,
      country_code: String,
      country_name: String,
      mobile_begin_with: js.Array[String],
      phone_number_lengths: js.Array[Double]
    ): PhoneData = {
      val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], country_name = country_name.asInstanceOf[js.Any], mobile_begin_with = mobile_begin_with.asInstanceOf[js.Any], phone_number_lengths = phone_number_lengths.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhoneData] (val x: Self) extends AnyVal {
      
      inline def setAlpha2(value: String): Self = StObject.set(x, "alpha2", value.asInstanceOf[js.Any])
      
      inline def setAlpha3(value: String): Self = StObject.set(x, "alpha3", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
      
      inline def setMobile_begin_with(value: js.Array[String]): Self = StObject.set(x, "mobile_begin_with", value.asInstanceOf[js.Any])
      
      inline def setMobile_begin_withVarargs(value: String*): Self = StObject.set(x, "mobile_begin_with", js.Array(value*))
      
      inline def setPhone_number_lengths(value: js.Array[Double]): Self = StObject.set(x, "phone_number_lengths", value.asInstanceOf[js.Any])
      
      inline def setPhone_number_lengthsVarargs(value: Double*): Self = StObject.set(x, "phone_number_lengths", js.Array(value*))
    }
  }
}

package typings.paypalCheckoutServerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Addressline1 extends StObject {
    
    var address_line_1: js.UndefOr[String] = js.undefined
    
    var address_line_2: js.UndefOr[String] = js.undefined
    
    var admin_area_1: js.UndefOr[String] = js.undefined
    
    var admin_area_2: js.UndefOr[String] = js.undefined
    
    var country_code: String
    
    var postal_code: js.UndefOr[String] = js.undefined
  }
  object Addressline1 {
    
    inline def apply(country_code: String): Addressline1 = {
      val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addressline1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Addressline1] (val x: Self) extends AnyVal {
      
      inline def setAddress_line_1(value: String): Self = StObject.set(x, "address_line_1", value.asInstanceOf[js.Any])
      
      inline def setAddress_line_1Undefined: Self = StObject.set(x, "address_line_1", js.undefined)
      
      inline def setAddress_line_2(value: String): Self = StObject.set(x, "address_line_2", value.asInstanceOf[js.Any])
      
      inline def setAddress_line_2Undefined: Self = StObject.set(x, "address_line_2", js.undefined)
      
      inline def setAdmin_area_1(value: String): Self = StObject.set(x, "admin_area_1", value.asInstanceOf[js.Any])
      
      inline def setAdmin_area_1Undefined: Self = StObject.set(x, "admin_area_1", js.undefined)
      
      inline def setAdmin_area_2(value: String): Self = StObject.set(x, "admin_area_2", value.asInstanceOf[js.Any])
      
      inline def setAdmin_area_2Undefined: Self = StObject.set(x, "admin_area_2", js.undefined)
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_code(value: String): Self = StObject.set(x, "postal_code", value.asInstanceOf[js.Any])
      
      inline def setPostal_codeUndefined: Self = StObject.set(x, "postal_code", js.undefined)
    }
  }
  
  trait Fullname extends StObject {
    
    var full_name: js.UndefOr[String] = js.undefined
  }
  object Fullname {
    
    inline def apply(): Fullname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fullname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fullname] (val x: Self) extends AnyVal {
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    }
  }
  
  trait Nationalnumber extends StObject {
    
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
}

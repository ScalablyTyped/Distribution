package typings.paypalPayoutsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alternatefullname extends StObject {
    
    var alternate_full_name: js.UndefOr[String] = js.undefined
    
    var full_name: js.UndefOr[String] = js.undefined
    
    var given_name: js.UndefOr[String] = js.undefined
    
    var middle_name: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var surname: js.UndefOr[String] = js.undefined
  }
  object Alternatefullname {
    
    inline def apply(): Alternatefullname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alternatefullname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alternatefullname] (val x: Self) extends AnyVal {
      
      inline def setAlternate_full_name(value: String): Self = StObject.set(x, "alternate_full_name", value.asInstanceOf[js.Any])
      
      inline def setAlternate_full_nameUndefined: Self = StObject.set(x, "alternate_full_name", js.undefined)
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
      
      inline def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      inline def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
      
      inline def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
      
      inline def setMiddle_nameUndefined: Self = StObject.set(x, "middle_name", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    }
  }
  
  trait Countrycode extends StObject {
    
    var country_code: String
    
    var extension_number: js.UndefOr[String] = js.undefined
    
    var national_number: String
  }
  object Countrycode {
    
    inline def apply(country_code: String, national_number: String): Countrycode = {
      val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Countrycode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Countrycode] (val x: Self) extends AnyVal {
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setExtension_number(value: String): Self = StObject.set(x, "extension_number", value.asInstanceOf[js.Any])
      
      inline def setExtension_numberUndefined: Self = StObject.set(x, "extension_number", js.undefined)
      
      inline def setNational_number(value: String): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
    }
  }
  
  trait Currency extends StObject {
    
    var currency: String
    
    var value: String
  }
  object Currency {
    
    inline def apply(currency: String, value: String): Currency = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Phone extends StObject {
    
    var phone: js.UndefOr[Countrycode] = js.undefined
  }
  object Phone {
    
    inline def apply(): Phone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Phone]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
      
      inline def setPhone(value: Countrycode): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
}

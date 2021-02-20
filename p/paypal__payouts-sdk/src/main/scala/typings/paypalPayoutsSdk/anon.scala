package typings.paypalPayoutsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Alternatefullname extends StObject {
    
    var alternate_full_name: js.UndefOr[String] = js.native
    
    var full_name: js.UndefOr[String] = js.native
    
    var given_name: js.UndefOr[String] = js.native
    
    var middle_name: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var surname: js.UndefOr[String] = js.native
  }
  object Alternatefullname {
    
    @scala.inline
    def apply(): Alternatefullname = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alternatefullname]
    }
    
    @scala.inline
    implicit class AlternatefullnameMutableBuilder[Self <: Alternatefullname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternate_full_name(value: String): Self = StObject.set(x, "alternate_full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternate_full_nameUndefined: Self = StObject.set(x, "alternate_full_name", js.undefined)
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
      
      @scala.inline
      def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGiven_nameUndefined: Self = StObject.set(x, "given_name", js.undefined)
      
      @scala.inline
      def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddle_nameUndefined: Self = StObject.set(x, "middle_name", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    }
  }
  
  @js.native
  trait Countrycode extends StObject {
    
    var country_code: String = js.native
    
    var extension_number: js.UndefOr[String] = js.native
    
    var national_number: String = js.native
  }
  object Countrycode {
    
    @scala.inline
    def apply(country_code: String, national_number: String): Countrycode = {
      val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], national_number = national_number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Countrycode]
    }
    
    @scala.inline
    implicit class CountrycodeMutableBuilder[Self <: Countrycode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtension_number(value: String): Self = StObject.set(x, "extension_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtension_numberUndefined: Self = StObject.set(x, "extension_number", js.undefined)
      
      @scala.inline
      def setNational_number(value: String): Self = StObject.set(x, "national_number", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Currency extends StObject {
    
    var currency: String = js.native
    
    var value: String = js.native
  }
  object Currency {
    
    @scala.inline
    def apply(currency: String, value: String): Currency = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Phone extends StObject {
    
    var phone: js.UndefOr[Countrycode] = js.native
  }
  object Phone {
    
    @scala.inline
    def apply(): Phone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Phone]
    }
    
    @scala.inline
    implicit class PhoneMutableBuilder[Self <: Phone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPhone(value: Countrycode): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
}

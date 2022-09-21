package typings.paypalPaypalJs

import typings.paypalPaypalJs.anon.PartialliabilityshiftYESN
import typings.paypalPaypalJs.anon.Vault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonsMod {
  
  trait Address extends StObject {
    
    /**
      * The first line of the address. For example, number or street.
      * @maxLength 300
      */
    var address_line_1: js.UndefOr[String] = js.undefined
    
    /**
      * The second line of the address. For example, suite or apartment number.
      * @maxLength 300
      */
    var address_line_2: js.UndefOr[String] = js.undefined
    
    /** The highest level sub-division in a country, which is usually a province, state, or ISO-3166-2 subdivision. */
    var admin_area_1: js.UndefOr[String] = js.undefined
    
    /** A city, town, or village. Smaller than `admin_area_level_1`. */
    var admin_area_2: js.UndefOr[String] = js.undefined
    
    /** The [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region. */
    var country_code: String
    
    /**
      * The postal code, which is the zip code or equivalent.
      * Typically required for countries with a postal code or an equivalent.
      */
    var postal_code: js.UndefOr[String] = js.undefined
  }
  object Address {
    
    inline def apply(country_code: String): Address = {
      val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
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
  
  trait AmountWithCurrencyCode extends StObject {
    
    /** The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency. */
    var currency_code: String
    
    /**
      * The value, which might be:
      * - An integer for currencies like `JPY` that are not typically fractional.
      * - A decimal fraction for currencies like `TND` that are subdivided into thousandths.
      *
      * For the required number of decimal places for a currency code, see [Currency Codes](/docs/integration/direct/rest/currency-codes/).
      */
    var value: String
  }
  object AmountWithCurrencyCode {
    
    inline def apply(currency_code: String, value: String): AmountWithCurrencyCode = {
      val __obj = js.Dynamic.literal(currency_code = currency_code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmountWithCurrencyCode]
    }
    
    extension [Self <: AmountWithCurrencyCode](x: Self) {
      
      inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Card extends StObject {
    
    /** Additional attributes associated with the use of this card. */
    var attributes: js.UndefOr[Vault] = js.undefined
    
    /** Results of Authentication such as 3D Secure. */
    var authentication_result: PartialliabilityshiftYESN
    
    /** The portable international postal address.  */
    var billing_address: js.UndefOr[Address] = js.undefined
    
    /**
      * An acronym for Bank Identification Number (BIN), also known as IIN (Issuer Identification Number).
      * It Is a standardized global numbering scheme (6 to 8 digits) used to identify a bank / institution that issued the card.
      */
    var bin: String
    
    /** The card network or brand. Applies to credit, debit, gift, and payment cards. */
    var brand: String
    
    /** The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency. */
    var currency_code: js.UndefOr[String] = js.undefined
    
    /** The year and month, in ISO-8601 `YYYY-MM` date format. */
    var expiry: String
    
    /** The PayPal-generated ID for the card. */
    var id: String
    
    /** The issuer of the card instrument. */
    var issuer: String
    
    /** The last digits of the payment card. */
    var last_digits: String
    
    /** The last digits of the payment card. */
    var last_n_chars: String
    
    /** The card holder's name as it appears on the card. */
    var name: String
    
    /** The payment card type. */
    var `type`: String
  }
  object Card {
    
    inline def apply(
      authentication_result: PartialliabilityshiftYESN,
      bin: String,
      brand: String,
      expiry: String,
      id: String,
      issuer: String,
      last_digits: String,
      last_n_chars: String,
      name: String,
      `type`: String
    ): Card = {
      val __obj = js.Dynamic.literal(authentication_result = authentication_result.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], expiry = expiry.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], last_digits = last_digits.asInstanceOf[js.Any], last_n_chars = last_n_chars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Card]
    }
    
    extension [Self <: Card](x: Self) {
      
      inline def setAttributes(value: Vault): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAuthentication_result(value: PartialliabilityshiftYESN): Self = StObject.set(x, "authentication_result", value.asInstanceOf[js.Any])
      
      inline def setBilling_address(value: Address): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
      
      inline def setBilling_addressUndefined: Self = StObject.set(x, "billing_address", js.undefined)
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
      
      inline def setCurrency_codeUndefined: Self = StObject.set(x, "currency_code", js.undefined)
      
      inline def setExpiry(value: String): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setLast_digits(value: String): Self = StObject.set(x, "last_digits", value.asInstanceOf[js.Any])
      
      inline def setLast_n_chars(value: String): Self = StObject.set(x, "last_n_chars", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Taxes extends StObject {
    
    /** The currency and amount for a financial transaction, such as a balance or payment due. */
    var amount: js.UndefOr[AmountWithCurrencyCode] = js.undefined
    
    /** Indicates whether the tax was already included in the billing amount. */
    var inclusive: js.UndefOr[String] = js.undefined
    
    /** The percentage, as a fixed-point, signed decimal number. For example, define a 19.99% interest rate as `19.99`. */
    var percentage: String
  }
  object Taxes {
    
    inline def apply(percentage: String): Taxes = {
      val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Taxes]
    }
    
    extension [Self <: Taxes](x: Self) {
      
      inline def setAmount(value: AmountWithCurrencyCode): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setInclusive(value: String): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
      
      inline def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
      
      inline def setPercentage(value: String): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
}

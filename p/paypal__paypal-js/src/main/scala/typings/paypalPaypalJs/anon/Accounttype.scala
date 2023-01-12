package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accounttype extends StObject {
  
  /** The type of bank account. */
  var account_type: js.UndefOr[String] = js.undefined
  
  /** The name of the bank to which the account is linked. */
  var bank_name: String
  
  /** The [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region. */
  var country_code: String
  
  /** The PayPal-generated ID for the bank account. */
  var id: String
  
  /** The last four digits of the bank account number. */
  var last_n_chars: String
}
object Accounttype {
  
  inline def apply(bank_name: String, country_code: String, id: String, last_n_chars: String): Accounttype = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_n_chars = last_n_chars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accounttype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accounttype] (val x: Self) extends AnyVal {
    
    inline def setAccount_type(value: String): Self = StObject.set(x, "account_type", value.asInstanceOf[js.Any])
    
    inline def setAccount_typeUndefined: Self = StObject.set(x, "account_type", js.undefined)
    
    inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_n_chars(value: String): Self = StObject.set(x, "last_n_chars", value.asInstanceOf[js.Any])
  }
}

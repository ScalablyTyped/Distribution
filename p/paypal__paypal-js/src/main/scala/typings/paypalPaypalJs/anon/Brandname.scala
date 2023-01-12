package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brandname extends StObject {
  
  /**
    * The name of the merchant. Appears to the customer in checkout, payment transactions, email receipts, and transaction history.
    * @maxLength 127
    */
  var brand_name: String
  
  /**
    * The internationalized email address.
    * @maxLength 254
    */
  var business_email: String
  
  var business_phone: Countrycode
}
object Brandname {
  
  inline def apply(brand_name: String, business_email: String, business_phone: Countrycode): Brandname = {
    val __obj = js.Dynamic.literal(brand_name = brand_name.asInstanceOf[js.Any], business_email = business_email.asInstanceOf[js.Any], business_phone = business_phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brandname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brandname] (val x: Self) extends AnyVal {
    
    inline def setBrand_name(value: String): Self = StObject.set(x, "brand_name", value.asInstanceOf[js.Any])
    
    inline def setBusiness_email(value: String): Self = StObject.set(x, "business_email", value.asInstanceOf[js.Any])
    
    inline def setBusiness_phone(value: Countrycode): Self = StObject.set(x, "business_phone", value.asInstanceOf[js.Any])
  }
}

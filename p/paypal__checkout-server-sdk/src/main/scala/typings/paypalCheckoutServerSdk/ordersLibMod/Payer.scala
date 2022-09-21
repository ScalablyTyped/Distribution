package typings.paypalCheckoutServerSdk.ordersLibMod

import typings.paypalCheckoutServerSdk.paymentsLibMod.AddressPortable
import typings.paypalCheckoutServerSdk.paymentsLibMod.Name
import typings.paypalCheckoutServerSdk.paymentsLibMod.TaxInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payer
  extends StObject
     with PayerBase {
  
  var address: AddressPortable
  
  var birth_date: String
  
  var name: Name
  
  var phone: PhoneWithType
  
  var tax_info: TaxInfo
}
object Payer {
  
  inline def apply(
    address: AddressPortable,
    birth_date: String,
    email_address: String,
    name: Name,
    payer_id: String,
    phone: PhoneWithType,
    tax_info: TaxInfo
  ): Payer = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], email_address = email_address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payer_id = payer_id.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tax_info = tax_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payer]
  }
  
  extension [Self <: Payer](x: Self) {
    
    inline def setAddress(value: AddressPortable): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBirth_date(value: String): Self = StObject.set(x, "birth_date", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: PhoneWithType): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setTax_info(value: TaxInfo): Self = StObject.set(x, "tax_info", value.asInstanceOf[js.Any])
  }
}

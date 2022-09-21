package typings.paypalPaypalJs.ordersMod

import typings.paypalPaypalJs.anon.Partialgivennamestringsur
import typings.paypalPaypalJs.anon.Phonenumber
import typings.paypalPaypalJs.anon.Taxid
import typings.paypalPaypalJs.commonsMod.Address
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payer extends StObject {
  
  var address: Address
  
  var birth_date: String
  
  var email_address: String
  
  /**
    * The name of the party
    */
  var name: Partialgivennamestringsur
  
  /**
    * The account identifier for a PayPal account.
    */
  var payer_id: String
  
  var phone: Phonenumber
  
  /**
    * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and `tax_id_type` are required
    */
  var tax_info: Taxid
  
  /**
    * The payer's tenant id.
    * For a Venmo user who gave consent for BA on Venmo app, this would be VENMO
    * @readonly
    */
  var tenant: String
}
object Payer {
  
  inline def apply(
    address: Address,
    birth_date: String,
    email_address: String,
    name: Partialgivennamestringsur,
    payer_id: String,
    phone: Phonenumber,
    tax_info: Taxid,
    tenant: String
  ): Payer = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], birth_date = birth_date.asInstanceOf[js.Any], email_address = email_address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], payer_id = payer_id.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], tax_info = tax_info.asInstanceOf[js.Any], tenant = tenant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payer]
  }
  
  extension [Self <: Payer](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBirth_date(value: String): Self = StObject.set(x, "birth_date", value.asInstanceOf[js.Any])
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setName(value: Partialgivennamestringsur): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
    
    inline def setPhone(value: Phonenumber): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setTax_info(value: Taxid): Self = StObject.set(x, "tax_info", value.asInstanceOf[js.Any])
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
  }
}

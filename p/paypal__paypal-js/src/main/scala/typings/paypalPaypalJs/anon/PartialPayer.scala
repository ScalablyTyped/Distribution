package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@paypal/paypal-js.@paypal/paypal-js/types/apis/orders.Payer> */
trait PartialPayer extends StObject {
  
  var address: js.UndefOr[typings.paypalPaypalJs.typesApisCommonsMod.Address] = js.undefined
  
  var birth_date: js.UndefOr[String] = js.undefined
  
  var email_address: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[Partialgivennamestringsur] = js.undefined
  
  var payer_id: js.UndefOr[String] = js.undefined
  
  var phone: js.UndefOr[Phonenumber] = js.undefined
  
  var tax_info: js.UndefOr[Taxid] = js.undefined
  
  var tenant: js.UndefOr[String] = js.undefined
}
object PartialPayer {
  
  inline def apply(): PartialPayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPayer]
  }
  
  extension [Self <: PartialPayer](x: Self) {
    
    inline def setAddress(value: typings.paypalPaypalJs.typesApisCommonsMod.Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBirth_date(value: String): Self = StObject.set(x, "birth_date", value.asInstanceOf[js.Any])
    
    inline def setBirth_dateUndefined: Self = StObject.set(x, "birth_date", js.undefined)
    
    inline def setEmail_address(value: String): Self = StObject.set(x, "email_address", value.asInstanceOf[js.Any])
    
    inline def setEmail_addressUndefined: Self = StObject.set(x, "email_address", js.undefined)
    
    inline def setName(value: Partialgivennamestringsur): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
    
    inline def setPayer_idUndefined: Self = StObject.set(x, "payer_id", js.undefined)
    
    inline def setPhone(value: Phonenumber): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setTax_info(value: Taxid): Self = StObject.set(x, "tax_info", value.asInstanceOf[js.Any])
    
    inline def setTax_infoUndefined: Self = StObject.set(x, "tax_info", js.undefined)
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
  }
}

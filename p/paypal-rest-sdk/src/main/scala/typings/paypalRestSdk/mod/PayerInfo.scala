package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayerInfo extends StObject {
  
  var billing_address: js.UndefOr[Address] = js.undefined
  
  var birth_date: js.UndefOr[String] = js.undefined
  
  var country_code: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  val first_name: js.UndefOr[String] = js.undefined
  
  val last_name: js.UndefOr[String] = js.undefined
  
  val middle_name: js.UndefOr[String] = js.undefined
  
  val payer_id: js.UndefOr[String] = js.undefined
  
  val salutation: js.UndefOr[String] = js.undefined
  
  val shipping_address: js.UndefOr[Address] = js.undefined
  
  val suffix: js.UndefOr[String] = js.undefined
  
  var tax_id: js.UndefOr[String] = js.undefined
  
  var tax_id_type: js.UndefOr[String] = js.undefined
}
object PayerInfo {
  
  inline def apply(): PayerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayerInfo]
  }
  
  extension [Self <: PayerInfo](x: Self) {
    
    inline def setBilling_address(value: Address): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
    
    inline def setBilling_addressUndefined: Self = StObject.set(x, "billing_address", js.undefined)
    
    inline def setBirth_date(value: String): Self = StObject.set(x, "birth_date", value.asInstanceOf[js.Any])
    
    inline def setBirth_dateUndefined: Self = StObject.set(x, "birth_date", js.undefined)
    
    inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    inline def setCountry_codeUndefined: Self = StObject.set(x, "country_code", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    inline def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
    
    inline def setMiddle_nameUndefined: Self = StObject.set(x, "middle_name", js.undefined)
    
    inline def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
    
    inline def setPayer_idUndefined: Self = StObject.set(x, "payer_id", js.undefined)
    
    inline def setSalutation(value: String): Self = StObject.set(x, "salutation", value.asInstanceOf[js.Any])
    
    inline def setSalutationUndefined: Self = StObject.set(x, "salutation", js.undefined)
    
    inline def setShipping_address(value: Address): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
    
    inline def setShipping_addressUndefined: Self = StObject.set(x, "shipping_address", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setTax_id(value: String): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    inline def setTax_idUndefined: Self = StObject.set(x, "tax_id", js.undefined)
    
    inline def setTax_id_type(value: String): Self = StObject.set(x, "tax_id_type", value.asInstanceOf[js.Any])
    
    inline def setTax_id_typeUndefined: Self = StObject.set(x, "tax_id_type", js.undefined)
  }
}

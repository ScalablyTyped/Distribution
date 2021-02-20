package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayerInfo extends StObject {
  
  var billing_address: js.UndefOr[Address] = js.native
  
  var birth_date: js.UndefOr[String] = js.native
  
  var country_code: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  val first_name: js.UndefOr[String] = js.native
  
  val last_name: js.UndefOr[String] = js.native
  
  val middle_name: js.UndefOr[String] = js.native
  
  val payer_id: js.UndefOr[String] = js.native
  
  val salutation: js.UndefOr[String] = js.native
  
  val shipping_address: js.UndefOr[Address] = js.native
  
  val suffix: js.UndefOr[String] = js.native
  
  var tax_id: js.UndefOr[String] = js.native
  
  var tax_id_type: js.UndefOr[String] = js.native
}
object PayerInfo {
  
  @scala.inline
  def apply(): PayerInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayerInfo]
  }
  
  @scala.inline
  implicit class PayerInfoMutableBuilder[Self <: PayerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_address(value: Address): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_addressUndefined: Self = StObject.set(x, "billing_address", js.undefined)
    
    @scala.inline
    def setBirth_date(value: String): Self = StObject.set(x, "birth_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirth_dateUndefined: Self = StObject.set(x, "birth_date", js.undefined)
    
    @scala.inline
    def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry_codeUndefined: Self = StObject.set(x, "country_code", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_nameUndefined: Self = StObject.set(x, "first_name", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle_nameUndefined: Self = StObject.set(x, "middle_name", js.undefined)
    
    @scala.inline
    def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayer_idUndefined: Self = StObject.set(x, "payer_id", js.undefined)
    
    @scala.inline
    def setSalutation(value: String): Self = StObject.set(x, "salutation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalutationUndefined: Self = StObject.set(x, "salutation", js.undefined)
    
    @scala.inline
    def setShipping_address(value: Address): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_addressUndefined: Self = StObject.set(x, "shipping_address", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setTax_id(value: String): Self = StObject.set(x, "tax_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_idUndefined: Self = StObject.set(x, "tax_id", js.undefined)
    
    @scala.inline
    def setTax_id_type(value: String): Self = StObject.set(x, "tax_id_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTax_id_typeUndefined: Self = StObject.set(x, "tax_id_type", js.undefined)
  }
}

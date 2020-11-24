package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PayerInfo extends js.Object {
  
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
  implicit class PayerInfoOps[Self <: PayerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBilling_address(value: Address): Self = this.set("billing_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling_address: Self = this.set("billing_address", js.undefined)
    
    @scala.inline
    def setBirth_date(value: String): Self = this.set("birth_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirth_date: Self = this.set("birth_date", js.undefined)
    
    @scala.inline
    def setCountry_code(value: String): Self = this.set("country_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry_code: Self = this.set("country_code", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    
    @scala.inline
    def setMiddle_name(value: String): Self = this.set("middle_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddle_name: Self = this.set("middle_name", js.undefined)
    
    @scala.inline
    def setPayer_id(value: String): Self = this.set("payer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayer_id: Self = this.set("payer_id", js.undefined)
    
    @scala.inline
    def setSalutation(value: String): Self = this.set("salutation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalutation: Self = this.set("salutation", js.undefined)
    
    @scala.inline
    def setShipping_address(value: Address): Self = this.set("shipping_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_address: Self = this.set("shipping_address", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    
    @scala.inline
    def setTax_id(value: String): Self = this.set("tax_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_id: Self = this.set("tax_id", js.undefined)
    
    @scala.inline
    def setTax_id_type(value: String): Self = this.set("tax_id_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_id_type: Self = this.set("tax_id_type", js.undefined)
  }
}

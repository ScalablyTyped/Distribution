package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Merchant extends Person {
  
  var additional_info: js.UndefOr[String] = js.native
  
  var additional_info_label: js.UndefOr[String] = js.native
  
  var fax: js.UndefOr[Phone] = js.native
  
  var tax_id: js.UndefOr[String] = js.native
}
object Merchant {
  
  @scala.inline
  def apply(): Merchant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Merchant]
  }
  
  @scala.inline
  implicit class MerchantOps[Self <: Merchant] (val x: Self) extends AnyVal {
    
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
    def setAdditional_info(value: String): Self = this.set("additional_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditional_info: Self = this.set("additional_info", js.undefined)
    
    @scala.inline
    def setAdditional_info_label(value: String): Self = this.set("additional_info_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditional_info_label: Self = this.set("additional_info_label", js.undefined)
    
    @scala.inline
    def setFax(value: Phone): Self = this.set("fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFax: Self = this.set("fax", js.undefined)
    
    @scala.inline
    def setTax_id(value: String): Self = this.set("tax_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_id: Self = this.set("tax_id", js.undefined)
  }
}

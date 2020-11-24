package typings.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentTerm extends js.Object {
  
  var due_date: js.UndefOr[String] = js.native
  
  var term_type: js.UndefOr[String] = js.native
}
object PaymentTerm {
  
  @scala.inline
  def apply(): PaymentTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentTerm]
  }
  
  @scala.inline
  implicit class PaymentTermOps[Self <: PaymentTerm] (val x: Self) extends AnyVal {
    
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
    def setDue_date(value: String): Self = this.set("due_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDue_date: Self = this.set("due_date", js.undefined)
    
    @scala.inline
    def setTerm_type(value: String): Self = this.set("term_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerm_type: Self = this.set("term_type", js.undefined)
  }
}

package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Allowedpaymentmethod
import typings.paypalRestSdk.anon.Items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  var amount: Amount = js.native
  
  var custom: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var invoice_number: js.UndefOr[String] = js.native
  
  var item_list: js.UndefOr[Items] = js.native
  
  var note_to_payee: js.UndefOr[String] = js.native
  
  var notify_url: js.UndefOr[String] = js.native
  
  var order_url: js.UndefOr[String] = js.native
  
  var payee: js.UndefOr[Payee] = js.native
  
  var payment_options: js.UndefOr[Allowedpaymentmethod] = js.native
  
  var purchase_order: js.UndefOr[String] = js.native
  
  var reference_id: js.UndefOr[String] = js.native
  
  val related_resources: js.UndefOr[js.Array[RelatedResources]] = js.native
  
  var soft_descriptor: js.UndefOr[String] = js.native
}
object Transaction {
  
  @scala.inline
  def apply(amount: Amount): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Amount): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: String): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setInvoice_number(value: String): Self = this.set("invoice_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoice_number: Self = this.set("invoice_number", js.undefined)
    
    @scala.inline
    def setItem_list(value: Items): Self = this.set("item_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_list: Self = this.set("item_list", js.undefined)
    
    @scala.inline
    def setNote_to_payee(value: String): Self = this.set("note_to_payee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote_to_payee: Self = this.set("note_to_payee", js.undefined)
    
    @scala.inline
    def setNotify_url(value: String): Self = this.set("notify_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotify_url: Self = this.set("notify_url", js.undefined)
    
    @scala.inline
    def setOrder_url(value: String): Self = this.set("order_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder_url: Self = this.set("order_url", js.undefined)
    
    @scala.inline
    def setPayee(value: Payee): Self = this.set("payee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayee: Self = this.set("payee", js.undefined)
    
    @scala.inline
    def setPayment_options(value: Allowedpaymentmethod): Self = this.set("payment_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_options: Self = this.set("payment_options", js.undefined)
    
    @scala.inline
    def setPurchase_order(value: String): Self = this.set("purchase_order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchase_order: Self = this.set("purchase_order", js.undefined)
    
    @scala.inline
    def setReference_id(value: String): Self = this.set("reference_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference_id: Self = this.set("reference_id", js.undefined)
    
    @scala.inline
    def setRelated_resourcesVarargs(value: RelatedResources*): Self = this.set("related_resources", js.Array(value :_*))
    
    @scala.inline
    def setRelated_resources(value: js.Array[RelatedResources]): Self = this.set("related_resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelated_resources: Self = this.set("related_resources", js.undefined)
    
    @scala.inline
    def setSoft_descriptor(value: String): Self = this.set("soft_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoft_descriptor: Self = this.set("soft_descriptor", js.undefined)
  }
}

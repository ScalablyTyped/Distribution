package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaleResource extends Resource {
  
  val billing_agreement_id: js.UndefOr[String] = js.native
  
  val clearing_time: js.UndefOr[String] = js.native
  
  val exchange_rate: js.UndefOr[String] = js.native
  
  val payment_hold_reasons: js.UndefOr[js.Array[String]] = js.native
  
  val payment_hold_status: js.UndefOr[String] = js.native
  
  val purchase_unit_reference_id: js.UndefOr[String] = js.native
  
  val transaction_fee: js.UndefOr[Currency] = js.native
}
object SaleResource {
  
  @scala.inline
  def apply(amount: Amount, id: String): SaleResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaleResource]
  }
  
  @scala.inline
  implicit class SaleResourceOps[Self <: SaleResource] (val x: Self) extends AnyVal {
    
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
    def setBilling_agreement_id(value: String): Self = this.set("billing_agreement_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling_agreement_id: Self = this.set("billing_agreement_id", js.undefined)
    
    @scala.inline
    def setClearing_time(value: String): Self = this.set("clearing_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearing_time: Self = this.set("clearing_time", js.undefined)
    
    @scala.inline
    def setExchange_rate(value: String): Self = this.set("exchange_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange_rate: Self = this.set("exchange_rate", js.undefined)
    
    @scala.inline
    def setPayment_hold_reasonsVarargs(value: String*): Self = this.set("payment_hold_reasons", js.Array(value :_*))
    
    @scala.inline
    def setPayment_hold_reasons(value: js.Array[String]): Self = this.set("payment_hold_reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_hold_reasons: Self = this.set("payment_hold_reasons", js.undefined)
    
    @scala.inline
    def setPayment_hold_status(value: String): Self = this.set("payment_hold_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayment_hold_status: Self = this.set("payment_hold_status", js.undefined)
    
    @scala.inline
    def setPurchase_unit_reference_id(value: String): Self = this.set("purchase_unit_reference_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchase_unit_reference_id: Self = this.set("purchase_unit_reference_id", js.undefined)
    
    @scala.inline
    def setTransaction_fee(value: Currency): Self = this.set("transaction_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction_fee: Self = this.set("transaction_fee", js.undefined)
  }
}

package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefundRequest extends js.Object {
  var amount: js.UndefOr[Amount] = js.native
  var description: js.UndefOr[String] = js.native
  var invoice_number: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Array[Item]] = js.native
  var payer_info: js.UndefOr[PayerInfo] = js.native
  var reason: js.UndefOr[String] = js.native
  var refund_advice: js.UndefOr[Boolean] = js.native
  var refund_source: js.UndefOr[String] = js.native
  var supplementary_data: js.UndefOr[js.Array[_]] = js.native
}

object RefundRequest {
  @scala.inline
  def apply(): RefundRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefundRequest]
  }
  @scala.inline
  implicit class RefundRequestOps[Self <: RefundRequest] (val x: Self) extends AnyVal {
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
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setInvoice_number(value: String): Self = this.set("invoice_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_number: Self = this.set("invoice_number", js.undefined)
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPayer_info(value: PayerInfo): Self = this.set("payer_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayer_info: Self = this.set("payer_info", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRefund_advice(value: Boolean): Self = this.set("refund_advice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_advice: Self = this.set("refund_advice", js.undefined)
    @scala.inline
    def setRefund_source(value: String): Self = this.set("refund_source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_source: Self = this.set("refund_source", js.undefined)
    @scala.inline
    def setSupplementary_dataVarargs(value: js.Any*): Self = this.set("supplementary_data", js.Array(value :_*))
    @scala.inline
    def setSupplementary_data(value: js.Array[_]): Self = this.set("supplementary_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupplementary_data: Self = this.set("supplementary_data", js.undefined)
  }
  
}


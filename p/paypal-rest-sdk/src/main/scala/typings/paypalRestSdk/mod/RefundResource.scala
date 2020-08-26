package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefundResource extends Resource {
  val capture_id: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var invoice_number: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
  val refund_funding_type: js.UndefOr[String] = js.native
  val refund_reason_code: js.UndefOr[String] = js.native
  val sale_id: js.UndefOr[String] = js.native
}

object RefundResource {
  @scala.inline
  def apply(amount: Amount, id: String): RefundResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundResource]
  }
  @scala.inline
  implicit class RefundResourceOps[Self <: RefundResource] (val x: Self) extends AnyVal {
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
    def setCapture_id(value: String): Self = this.set("capture_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapture_id: Self = this.set("capture_id", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setInvoice_number(value: String): Self = this.set("invoice_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_number: Self = this.set("invoice_number", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setRefund_funding_type(value: String): Self = this.set("refund_funding_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_funding_type: Self = this.set("refund_funding_type", js.undefined)
    @scala.inline
    def setRefund_reason_code(value: String): Self = this.set("refund_reason_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefund_reason_code: Self = this.set("refund_reason_code", js.undefined)
    @scala.inline
    def setSale_id(value: String): Self = this.set("sale_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSale_id: Self = this.set("sale_id", js.undefined)
  }
  
}


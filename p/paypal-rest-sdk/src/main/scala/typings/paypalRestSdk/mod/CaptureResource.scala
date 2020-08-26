package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureResource extends Resource {
  var invoice_number: js.UndefOr[String] = js.native
  var is_final_capture: js.UndefOr[Boolean] = js.native
  var transaction_fee: js.UndefOr[Currency] = js.native
}

object CaptureResource {
  @scala.inline
  def apply(amount: Amount, id: String): CaptureResource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureResource]
  }
  @scala.inline
  implicit class CaptureResourceOps[Self <: CaptureResource] (val x: Self) extends AnyVal {
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
    def setInvoice_number(value: String): Self = this.set("invoice_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_number: Self = this.set("invoice_number", js.undefined)
    @scala.inline
    def setIs_final_capture(value: Boolean): Self = this.set("is_final_capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_final_capture: Self = this.set("is_final_capture", js.undefined)
    @scala.inline
    def setTransaction_fee(value: Currency): Self = this.set("transaction_fee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransaction_fee: Self = this.set("transaction_fee", js.undefined)
  }
  
}


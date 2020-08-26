package typings.paypalRestSdk.mod.authorization

import typings.paypalRestSdk.mod.Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureRequest extends js.Object {
  var amount: js.UndefOr[Amount] = js.native
  var invoice_number: js.UndefOr[String] = js.native
  var is_final_capture: js.UndefOr[Boolean] = js.native
}

object CaptureRequest {
  @scala.inline
  def apply(): CaptureRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureRequest]
  }
  @scala.inline
  implicit class CaptureRequestOps[Self <: CaptureRequest] (val x: Self) extends AnyVal {
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
    def setInvoice_number(value: String): Self = this.set("invoice_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice_number: Self = this.set("invoice_number", js.undefined)
    @scala.inline
    def setIs_final_capture(value: Boolean): Self = this.set("is_final_capture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIs_final_capture: Self = this.set("is_final_capture", js.undefined)
  }
  
}


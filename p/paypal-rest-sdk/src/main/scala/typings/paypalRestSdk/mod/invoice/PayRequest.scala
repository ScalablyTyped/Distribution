package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayRequest extends js.Object {
  var amount: Currency = js.native
  var date: String = js.native
  var method: String = js.native
  var note: js.UndefOr[String] = js.native
}

object PayRequest {
  @scala.inline
  def apply(amount: Currency, date: String, method: String): PayRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayRequest]
  }
  @scala.inline
  implicit class PayRequestOps[Self <: PayRequest] (val x: Self) extends AnyVal {
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
    def setAmount(value: Currency): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
  }
  
}


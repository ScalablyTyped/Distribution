package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefundRequest extends js.Object {
  var amount: Currency
  var date: String
  var note: js.UndefOr[String] = js.undefined
}

object RefundRequest {
  @scala.inline
  def apply(amount: Currency, date: String, note: String = null): RefundRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundRequest]
  }
}


package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentDetail extends Detail {
  var method: String
  var transaction_type: String
}

object PaymentDetail {
  @scala.inline
  def apply(
    amount: Currency,
    date: String,
    method: String,
    transaction_id: String,
    transaction_type: String,
    `type`: String,
    note: String = null
  ): PaymentDetail = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], transaction_type = transaction_type.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDetail]
  }
}


package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Currency
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
    val __obj = js.Dynamic.literal(amount = amount, date = date, method = method, transaction_id = transaction_id, transaction_type = transaction_type)
    __obj.updateDynamic("type")(`type`)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[PaymentDetail]
  }
}


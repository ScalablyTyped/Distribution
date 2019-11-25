package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Detail extends js.Object {
  var amount: Currency
  var date: String
  var note: js.UndefOr[String] = js.undefined
  var transaction_id: String
  var `type`: String
}

object Detail {
  @scala.inline
  def apply(amount: Currency, date: String, transaction_id: String, `type`: String, note: String = null): Detail = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
}


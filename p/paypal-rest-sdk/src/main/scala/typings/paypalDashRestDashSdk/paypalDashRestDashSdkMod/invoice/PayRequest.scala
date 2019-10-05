package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.invoice

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayRequest extends js.Object {
  var amount: Currency
  var date: String
  var method: String
  var note: js.UndefOr[String] = js.undefined
}

object PayRequest {
  @scala.inline
  def apply(amount: Currency, date: String, method: String, note: String = null): PayRequest = {
    val __obj = js.Dynamic.literal(amount = amount, date = date, method = method)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[PayRequest]
  }
}


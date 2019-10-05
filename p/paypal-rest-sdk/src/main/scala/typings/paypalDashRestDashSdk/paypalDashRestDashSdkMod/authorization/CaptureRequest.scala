package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.authorization

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Amount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureRequest extends js.Object {
  var amount: js.UndefOr[Amount] = js.undefined
  var invoice_number: js.UndefOr[String] = js.undefined
  var is_final_capture: js.UndefOr[Boolean] = js.undefined
}

object CaptureRequest {
  @scala.inline
  def apply(
    amount: Amount = null,
    invoice_number: String = null,
    is_final_capture: js.UndefOr[Boolean] = js.undefined
  ): CaptureRequest = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number)
    if (!js.isUndefined(is_final_capture)) __obj.updateDynamic("is_final_capture")(is_final_capture)
    __obj.asInstanceOf[CaptureRequest]
  }
}


package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefundRequest extends js.Object {
  var amount: js.UndefOr[Amount] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var invoice_number: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var payer_info: js.UndefOr[PayerInfo] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var refund_advice: js.UndefOr[scala.Boolean] = js.undefined
  var refund_source: js.UndefOr[java.lang.String] = js.undefined
  var supplementary_data: js.UndefOr[js.Array[_]] = js.undefined
}

object RefundRequest {
  @scala.inline
  def apply(
    amount: Amount = null,
    description: java.lang.String = null,
    invoice_number: java.lang.String = null,
    items: js.Array[Item] = null,
    payer_info: PayerInfo = null,
    reason: java.lang.String = null,
    refund_advice: js.UndefOr[scala.Boolean] = js.undefined,
    refund_source: java.lang.String = null,
    supplementary_data: js.Array[_] = null
  ): RefundRequest = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (description != null) __obj.updateDynamic("description")(description)
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number)
    if (items != null) __obj.updateDynamic("items")(items)
    if (payer_info != null) __obj.updateDynamic("payer_info")(payer_info)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (!js.isUndefined(refund_advice)) __obj.updateDynamic("refund_advice")(refund_advice)
    if (refund_source != null) __obj.updateDynamic("refund_source")(refund_source)
    if (supplementary_data != null) __obj.updateDynamic("supplementary_data")(supplementary_data)
    __obj.asInstanceOf[RefundRequest]
  }
}


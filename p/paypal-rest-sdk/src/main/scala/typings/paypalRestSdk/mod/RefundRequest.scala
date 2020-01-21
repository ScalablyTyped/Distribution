package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefundRequest extends js.Object {
  var amount: js.UndefOr[Amount] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var invoice_number: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var payer_info: js.UndefOr[PayerInfo] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var refund_advice: js.UndefOr[Boolean] = js.undefined
  var refund_source: js.UndefOr[String] = js.undefined
  var supplementary_data: js.UndefOr[js.Array[_]] = js.undefined
}

object RefundRequest {
  @scala.inline
  def apply(
    amount: Amount = null,
    description: String = null,
    invoice_number: String = null,
    items: js.Array[Item] = null,
    payer_info: PayerInfo = null,
    reason: String = null,
    refund_advice: js.UndefOr[Boolean] = js.undefined,
    refund_source: String = null,
    supplementary_data: js.Array[_] = null
  ): RefundRequest = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (payer_info != null) __obj.updateDynamic("payer_info")(payer_info.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(refund_advice)) __obj.updateDynamic("refund_advice")(refund_advice.asInstanceOf[js.Any])
    if (refund_source != null) __obj.updateDynamic("refund_source")(refund_source.asInstanceOf[js.Any])
    if (supplementary_data != null) __obj.updateDynamic("supplementary_data")(supplementary_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefundRequest]
  }
}


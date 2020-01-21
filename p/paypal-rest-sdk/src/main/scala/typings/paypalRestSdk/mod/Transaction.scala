package typings.paypalRestSdk.mod

import typings.paypalRestSdk.AnonAllowedpaymentmethod
import typings.paypalRestSdk.AnonItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var amount: Amount
  var custom: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var invoice_number: js.UndefOr[String] = js.undefined
  var item_list: js.UndefOr[AnonItems] = js.undefined
  var note_to_payee: js.UndefOr[String] = js.undefined
  var notify_url: js.UndefOr[String] = js.undefined
  var order_url: js.UndefOr[String] = js.undefined
  var payee: js.UndefOr[Payee] = js.undefined
  var payment_options: js.UndefOr[AnonAllowedpaymentmethod] = js.undefined
  var purchase_order: js.UndefOr[String] = js.undefined
  var reference_id: js.UndefOr[String] = js.undefined
  val related_resources: js.UndefOr[js.Array[RelatedResources]] = js.undefined
  var soft_descriptor: js.UndefOr[String] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(
    amount: Amount,
    custom: String = null,
    description: String = null,
    invoice_number: String = null,
    item_list: AnonItems = null,
    note_to_payee: String = null,
    notify_url: String = null,
    order_url: String = null,
    payee: Payee = null,
    payment_options: AnonAllowedpaymentmethod = null,
    purchase_order: String = null,
    reference_id: String = null,
    related_resources: js.Array[RelatedResources] = null,
    soft_descriptor: String = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number.asInstanceOf[js.Any])
    if (item_list != null) __obj.updateDynamic("item_list")(item_list.asInstanceOf[js.Any])
    if (note_to_payee != null) __obj.updateDynamic("note_to_payee")(note_to_payee.asInstanceOf[js.Any])
    if (notify_url != null) __obj.updateDynamic("notify_url")(notify_url.asInstanceOf[js.Any])
    if (order_url != null) __obj.updateDynamic("order_url")(order_url.asInstanceOf[js.Any])
    if (payee != null) __obj.updateDynamic("payee")(payee.asInstanceOf[js.Any])
    if (payment_options != null) __obj.updateDynamic("payment_options")(payment_options.asInstanceOf[js.Any])
    if (purchase_order != null) __obj.updateDynamic("purchase_order")(purchase_order.asInstanceOf[js.Any])
    if (reference_id != null) __obj.updateDynamic("reference_id")(reference_id.asInstanceOf[js.Any])
    if (related_resources != null) __obj.updateDynamic("related_resources")(related_resources.asInstanceOf[js.Any])
    if (soft_descriptor != null) __obj.updateDynamic("soft_descriptor")(soft_descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}


package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var amount: Amount
  var custom: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var invoice_number: js.UndefOr[java.lang.String] = js.undefined
  var item_list: js.UndefOr[paypalDashRestDashSdkLib.Anon_Items] = js.undefined
  var note_to_payee: js.UndefOr[java.lang.String] = js.undefined
  var notify_url: js.UndefOr[java.lang.String] = js.undefined
  var order_url: js.UndefOr[java.lang.String] = js.undefined
  var payee: js.UndefOr[Payee] = js.undefined
  var payment_options: js.UndefOr[paypalDashRestDashSdkLib.Anon_Allowedpaymentmethod] = js.undefined
  var purchase_order: js.UndefOr[java.lang.String] = js.undefined
  var reference_id: js.UndefOr[java.lang.String] = js.undefined
  val related_resources: js.UndefOr[js.Array[RelatedResources]] = js.undefined
  var soft_descriptor: js.UndefOr[java.lang.String] = js.undefined
}

object Transaction {
  @scala.inline
  def apply(
    amount: Amount,
    custom: java.lang.String = null,
    description: java.lang.String = null,
    invoice_number: java.lang.String = null,
    item_list: paypalDashRestDashSdkLib.Anon_Items = null,
    note_to_payee: java.lang.String = null,
    notify_url: java.lang.String = null,
    order_url: java.lang.String = null,
    payee: Payee = null,
    payment_options: paypalDashRestDashSdkLib.Anon_Allowedpaymentmethod = null,
    purchase_order: java.lang.String = null,
    reference_id: java.lang.String = null,
    related_resources: js.Array[RelatedResources] = null,
    soft_descriptor: java.lang.String = null
  ): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (description != null) __obj.updateDynamic("description")(description)
    if (invoice_number != null) __obj.updateDynamic("invoice_number")(invoice_number)
    if (item_list != null) __obj.updateDynamic("item_list")(item_list)
    if (note_to_payee != null) __obj.updateDynamic("note_to_payee")(note_to_payee)
    if (notify_url != null) __obj.updateDynamic("notify_url")(notify_url)
    if (order_url != null) __obj.updateDynamic("order_url")(order_url)
    if (payee != null) __obj.updateDynamic("payee")(payee)
    if (payment_options != null) __obj.updateDynamic("payment_options")(payment_options)
    if (purchase_order != null) __obj.updateDynamic("purchase_order")(purchase_order)
    if (reference_id != null) __obj.updateDynamic("reference_id")(reference_id)
    if (related_resources != null) __obj.updateDynamic("related_resources")(related_resources)
    if (soft_descriptor != null) __obj.updateDynamic("soft_descriptor")(soft_descriptor)
    __obj.asInstanceOf[Transaction]
  }
}


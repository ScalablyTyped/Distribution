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
  var item_list: js.UndefOr[paypalDashRestDashSdkLib.Anon_Shippingphonenumber] = js.undefined
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


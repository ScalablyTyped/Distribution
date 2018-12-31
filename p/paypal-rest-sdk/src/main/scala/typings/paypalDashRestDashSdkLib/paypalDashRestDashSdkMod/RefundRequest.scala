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


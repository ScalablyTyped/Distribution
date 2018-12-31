package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment extends js.Object {
  val create_time: js.UndefOr[java.lang.String] = js.undefined
  var experience_profile_id: js.UndefOr[java.lang.String] = js.undefined
  val failure_reason: js.UndefOr[java.lang.String] = js.undefined
  val id: js.UndefOr[java.lang.String] = js.undefined
  var intent: java.lang.String
  val links: js.UndefOr[js.Array[Link]] = js.undefined
  var note_to_payer: js.UndefOr[java.lang.String] = js.undefined
  var payer: paypalDashRestDashSdkLib.Anon_Paymentmethod
  var redirect_urls: js.UndefOr[paypalDashRestDashSdkLib.Anon_Cancelurl] = js.undefined
  val state: js.UndefOr[java.lang.String] = js.undefined
  var transactions: js.Array[Transaction]
  val update_time: js.UndefOr[java.lang.String] = js.undefined
}


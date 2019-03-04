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

object Payment {
  @scala.inline
  def apply(
    intent: java.lang.String,
    payer: paypalDashRestDashSdkLib.Anon_Paymentmethod,
    transactions: js.Array[Transaction],
    create_time: java.lang.String = null,
    experience_profile_id: java.lang.String = null,
    failure_reason: java.lang.String = null,
    id: java.lang.String = null,
    links: js.Array[Link] = null,
    note_to_payer: java.lang.String = null,
    redirect_urls: paypalDashRestDashSdkLib.Anon_Cancelurl = null,
    state: java.lang.String = null,
    update_time: java.lang.String = null
  ): Payment = {
    val __obj = js.Dynamic.literal(intent = intent, payer = payer, transactions = transactions)
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (experience_profile_id != null) __obj.updateDynamic("experience_profile_id")(experience_profile_id)
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason)
    if (id != null) __obj.updateDynamic("id")(id)
    if (links != null) __obj.updateDynamic("links")(links)
    if (note_to_payer != null) __obj.updateDynamic("note_to_payer")(note_to_payer)
    if (redirect_urls != null) __obj.updateDynamic("redirect_urls")(redirect_urls)
    if (state != null) __obj.updateDynamic("state")(state)
    if (update_time != null) __obj.updateDynamic("update_time")(update_time)
    __obj.asInstanceOf[Payment]
  }
}


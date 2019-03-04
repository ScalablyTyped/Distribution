package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentResponse
  extends Payment
     with Response {
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[java.lang.String] = js.undefined
}

object PaymentResponse {
  @scala.inline
  def apply(
    httpStatusCode: scala.Double,
    intent: java.lang.String,
    payer: paypalDashRestDashSdkLib.Anon_Paymentmethod,
    transactions: js.Array[Transaction],
    count: scala.Int | scala.Double = null,
    create_time: java.lang.String = null,
    experience_profile_id: java.lang.String = null,
    failure_reason: java.lang.String = null,
    id: java.lang.String = null,
    links: js.Array[Link] = null,
    note_to_payer: java.lang.String = null,
    redirect_urls: paypalDashRestDashSdkLib.Anon_Cancelurl = null,
    state: java.lang.String = null,
    total_count: scala.Int | scala.Double = null,
    update_time: java.lang.String = null
  ): PaymentResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode, intent = intent, payer = payer, transactions = transactions)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (experience_profile_id != null) __obj.updateDynamic("experience_profile_id")(experience_profile_id)
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason)
    if (id != null) __obj.updateDynamic("id")(id)
    if (links != null) __obj.updateDynamic("links")(links)
    if (note_to_payer != null) __obj.updateDynamic("note_to_payer")(note_to_payer)
    if (redirect_urls != null) __obj.updateDynamic("redirect_urls")(redirect_urls)
    if (state != null) __obj.updateDynamic("state")(state)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    if (update_time != null) __obj.updateDynamic("update_time")(update_time)
    __obj.asInstanceOf[PaymentResponse]
  }
}


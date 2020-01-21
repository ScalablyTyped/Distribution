package typings.paypalRestSdk.mod

import typings.paypalRestSdk.AnonCancelurl
import typings.paypalRestSdk.AnonPaymentmethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentResponse
  extends Payment_
     with Response {
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[String] = js.undefined
}

object PaymentResponse {
  @scala.inline
  def apply(
    httpStatusCode: Double,
    intent: String,
    payer: AnonPaymentmethod,
    transactions: js.Array[Transaction],
    count: Int | Double = null,
    create_time: String = null,
    experience_profile_id: String = null,
    failure_reason: String = null,
    id: String = null,
    links: js.Array[Link] = null,
    note_to_payer: String = null,
    redirect_urls: AnonCancelurl = null,
    state: String = null,
    total_count: Int | Double = null,
    update_time: String = null
  ): PaymentResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (experience_profile_id != null) __obj.updateDynamic("experience_profile_id")(experience_profile_id.asInstanceOf[js.Any])
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (note_to_payer != null) __obj.updateDynamic("note_to_payer")(note_to_payer.asInstanceOf[js.Any])
    if (redirect_urls != null) __obj.updateDynamic("redirect_urls")(redirect_urls.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    if (update_time != null) __obj.updateDynamic("update_time")(update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResponse]
  }
}


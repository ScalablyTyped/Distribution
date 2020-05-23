package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Cancelurl
import typings.paypalRestSdk.anon.Paymentmethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment_ extends js.Object {
  val create_time: js.UndefOr[String] = js.undefined
  var experience_profile_id: js.UndefOr[String] = js.undefined
  val failure_reason: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  var intent: String
  val links: js.UndefOr[js.Array[Link]] = js.undefined
  var note_to_payer: js.UndefOr[String] = js.undefined
  var payer: Paymentmethod
  var redirect_urls: js.UndefOr[Cancelurl] = js.undefined
  val state: js.UndefOr[String] = js.undefined
  var transactions: js.Array[Transaction]
  val update_time: js.UndefOr[String] = js.undefined
}

object Payment_ {
  @scala.inline
  def apply(
    intent: String,
    payer: Paymentmethod,
    transactions: js.Array[Transaction],
    create_time: String = null,
    experience_profile_id: String = null,
    failure_reason: String = null,
    id: String = null,
    links: js.Array[Link] = null,
    note_to_payer: String = null,
    redirect_urls: Cancelurl = null,
    state: String = null,
    update_time: String = null
  ): Payment_ = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (experience_profile_id != null) __obj.updateDynamic("experience_profile_id")(experience_profile_id.asInstanceOf[js.Any])
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (note_to_payer != null) __obj.updateDynamic("note_to_payer")(note_to_payer.asInstanceOf[js.Any])
    if (redirect_urls != null) __obj.updateDynamic("redirect_urls")(redirect_urls.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (update_time != null) __obj.updateDynamic("update_time")(update_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment_]
  }
}


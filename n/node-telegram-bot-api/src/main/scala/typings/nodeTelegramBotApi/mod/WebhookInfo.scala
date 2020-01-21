package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookInfo extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[String]] = js.undefined
  var has_custom_certificate: Boolean
  var last_error_date: js.UndefOr[Double] = js.undefined
  var last_error_message: js.UndefOr[String] = js.undefined
  var max_connections: js.UndefOr[Double] = js.undefined
  var pending_update_count: Double
  var url: String
}

object WebhookInfo {
  @scala.inline
  def apply(
    has_custom_certificate: Boolean,
    pending_update_count: Double,
    url: String,
    allowed_updates: js.Array[String] = null,
    last_error_date: Int | Double = null,
    last_error_message: String = null,
    max_connections: Int | Double = null
  ): WebhookInfo = {
    val __obj = js.Dynamic.literal(has_custom_certificate = has_custom_certificate.asInstanceOf[js.Any], pending_update_count = pending_update_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (allowed_updates != null) __obj.updateDynamic("allowed_updates")(allowed_updates.asInstanceOf[js.Any])
    if (last_error_date != null) __obj.updateDynamic("last_error_date")(last_error_date.asInstanceOf[js.Any])
    if (last_error_message != null) __obj.updateDynamic("last_error_message")(last_error_message.asInstanceOf[js.Any])
    if (max_connections != null) __obj.updateDynamic("max_connections")(max_connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookInfo]
  }
}


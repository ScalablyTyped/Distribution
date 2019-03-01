package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookInfo extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var has_custom_certificate: scala.Boolean
  var last_error_date: js.UndefOr[scala.Double] = js.undefined
  var last_error_message: js.UndefOr[java.lang.String] = js.undefined
  var max_connections: js.UndefOr[scala.Double] = js.undefined
  var pending_update_count: scala.Double
  var url: java.lang.String
}

object WebhookInfo {
  @scala.inline
  def apply(
    has_custom_certificate: scala.Boolean,
    pending_update_count: scala.Double,
    url: java.lang.String,
    allowed_updates: js.Array[java.lang.String] = null,
    last_error_date: scala.Int | scala.Double = null,
    last_error_message: java.lang.String = null,
    max_connections: scala.Int | scala.Double = null
  ): WebhookInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("has_custom_certificate")(has_custom_certificate)
    __obj.updateDynamic("pending_update_count")(pending_update_count)
    __obj.updateDynamic("url")(url)
    if (allowed_updates != null) __obj.updateDynamic("allowed_updates")(allowed_updates)
    if (last_error_date != null) __obj.updateDynamic("last_error_date")(last_error_date.asInstanceOf[js.Any])
    if (last_error_message != null) __obj.updateDynamic("last_error_message")(last_error_message)
    if (max_connections != null) __obj.updateDynamic("max_connections")(max_connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookInfo]
  }
}


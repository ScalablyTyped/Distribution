package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notification.webhook

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookListResponse extends Response {
  val webhooks: js.Array[Webhook]
}

object WebhookListResponse {
  @scala.inline
  def apply(
    httpStatusCode: Double,
    webhooks: js.Array[Webhook],
    count: Int | Double = null,
    create_time: String = null,
    total_count: Int | Double = null
  ): WebhookListResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookListResponse]
  }
}


package typings.paypalRestSdk.mod.notification.webhook

import typings.paypalRestSdk.mod.Response
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
    count: js.UndefOr[Double] = js.undefined,
    create_time: String = null,
    total_count: js.UndefOr[Double] = js.undefined
  ): WebhookListResponse = {
    val __obj = js.Dynamic.literal(httpStatusCode = httpStatusCode.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (!js.isUndefined(total_count)) __obj.updateDynamic("total_count")(total_count.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookListResponse]
  }
}


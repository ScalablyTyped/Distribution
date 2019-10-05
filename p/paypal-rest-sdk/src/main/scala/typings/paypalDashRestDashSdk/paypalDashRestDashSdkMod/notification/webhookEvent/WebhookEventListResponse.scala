package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notification.webhookEvent

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookEventListResponse extends Response {
  var events: js.Array[WebhookEvent]
}

object WebhookEventListResponse {
  @scala.inline
  def apply(
    events: js.Array[WebhookEvent],
    httpStatusCode: Double,
    count: Int | Double = null,
    create_time: String = null,
    total_count: Int | Double = null
  ): WebhookEventListResponse = {
    val __obj = js.Dynamic.literal(events = events, httpStatusCode = httpStatusCode)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time)
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookEventListResponse]
  }
}


package typings.paypalRestSdk.mod.notification.webhookEvent

import typings.paypalRestSdk.mod.Response
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
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (total_count != null) __obj.updateDynamic("total_count")(total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookEventListResponse]
  }
}


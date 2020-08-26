package typings.paypalRestSdk.mod.notification.webhookEvent

import typings.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookEventListResponse extends Response {
  var events: js.Array[WebhookEvent] = js.native
}

object WebhookEventListResponse {
  @scala.inline
  def apply(events: js.Array[WebhookEvent], httpStatusCode: Double): WebhookEventListResponse = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookEventListResponse]
  }
  @scala.inline
  implicit class WebhookEventListResponseOps[Self <: WebhookEventListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventsVarargs(value: WebhookEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[WebhookEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
  }
  
}


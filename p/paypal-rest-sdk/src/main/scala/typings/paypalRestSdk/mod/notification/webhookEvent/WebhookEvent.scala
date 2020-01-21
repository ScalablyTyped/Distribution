package typings.paypalRestSdk.mod.notification.webhookEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookEvent extends js.Object {
  val create_time: js.UndefOr[String] = js.undefined
  val event_type: js.UndefOr[String] = js.undefined
  val event_version: js.UndefOr[String] = js.undefined
  val id: js.UndefOr[String] = js.undefined
  val resource: js.UndefOr[js.Any] = js.undefined
  val resource_type: js.UndefOr[String] = js.undefined
  val summary: js.UndefOr[String] = js.undefined
}

object WebhookEvent {
  @scala.inline
  def apply(
    create_time: String = null,
    event_type: String = null,
    event_version: String = null,
    id: String = null,
    resource: js.Any = null,
    resource_type: String = null,
    summary: String = null
  ): WebhookEvent = {
    val __obj = js.Dynamic.literal()
    if (create_time != null) __obj.updateDynamic("create_time")(create_time.asInstanceOf[js.Any])
    if (event_type != null) __obj.updateDynamic("event_type")(event_type.asInstanceOf[js.Any])
    if (event_version != null) __obj.updateDynamic("event_version")(event_version.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resource_type != null) __obj.updateDynamic("resource_type")(resource_type.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookEvent]
  }
}


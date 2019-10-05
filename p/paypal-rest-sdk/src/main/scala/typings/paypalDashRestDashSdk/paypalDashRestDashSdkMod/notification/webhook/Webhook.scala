package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notification.webhook

import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.Link
import typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod.notification.NotificationEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook extends js.Object {
  var event_types: js.Array[NotificationEventType]
  val id: js.UndefOr[String] = js.undefined
  val links: js.UndefOr[js.Array[Link]] = js.undefined
  var url: String
}

object Webhook {
  @scala.inline
  def apply(
    event_types: js.Array[NotificationEventType],
    url: String,
    id: String = null,
    links: js.Array[Link] = null
  ): Webhook = {
    val __obj = js.Dynamic.literal(event_types = event_types, url = url)
    if (id != null) __obj.updateDynamic("id")(id)
    if (links != null) __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[Webhook]
  }
}


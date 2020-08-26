package typings.paypalRestSdk.mod.notification.webhook

import typings.paypalRestSdk.mod.Link
import typings.paypalRestSdk.mod.notification.NotificationEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  var event_types: js.Array[NotificationEventType] = js.native
  val id: js.UndefOr[String] = js.native
  val links: js.UndefOr[js.Array[Link]] = js.native
  var url: String = js.native
}

object Webhook {
  @scala.inline
  def apply(event_types: js.Array[NotificationEventType], url: String): Webhook = {
    val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
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
    def setEvent_typesVarargs(value: NotificationEventType*): Self = this.set("event_types", js.Array(value :_*))
    @scala.inline
    def setEvent_types(value: js.Array[NotificationEventType]): Self = this.set("event_types", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
  }
  
}


package typings.postmark.webhooksMod

import typings.postmark.webhookMod.Webhook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhooks extends js.Object {
  var Webhooks: js.Array[Webhook] = js.native
}

object Webhooks {
  @scala.inline
  def apply(Webhooks: js.Array[Webhook]): Webhooks = {
    val __obj = js.Dynamic.literal(Webhooks = Webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhooks]
  }
  @scala.inline
  implicit class WebhooksOps[Self <: Webhooks] (val x: Self) extends AnyVal {
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
    def setWebhooksVarargs(value: Webhook*): Self = this.set("Webhooks", js.Array(value :_*))
    @scala.inline
    def setWebhooks(value: js.Array[Webhook]): Self = this.set("Webhooks", value.asInstanceOf[js.Any])
  }
  
}


package typings.postmark.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookRequestTriggers extends js.Object {
  var Bounce: js.UndefOr[BounceWebhookTrigger] = js.native
  var Click: js.UndefOr[WebhookTrigger] = js.native
  var Delivery: js.UndefOr[WebhookTrigger] = js.native
  var Open: js.UndefOr[OpenWebhookTrigger] = js.native
  var SpamComplaint: js.UndefOr[SpamWebhookTrigger] = js.native
}

object WebhookRequestTriggers {
  @scala.inline
  def apply(): WebhookRequestTriggers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebhookRequestTriggers]
  }
  @scala.inline
  implicit class WebhookRequestTriggersOps[Self <: WebhookRequestTriggers] (val x: Self) extends AnyVal {
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
    def setBounce(value: BounceWebhookTrigger): Self = this.set("Bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounce: Self = this.set("Bounce", js.undefined)
    @scala.inline
    def setClick(value: WebhookTrigger): Self = this.set("Click", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClick: Self = this.set("Click", js.undefined)
    @scala.inline
    def setDelivery(value: WebhookTrigger): Self = this.set("Delivery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelivery: Self = this.set("Delivery", js.undefined)
    @scala.inline
    def setOpen(value: OpenWebhookTrigger): Self = this.set("Open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("Open", js.undefined)
    @scala.inline
    def setSpamComplaint(value: SpamWebhookTrigger): Self = this.set("SpamComplaint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpamComplaint: Self = this.set("SpamComplaint", js.undefined)
  }
  
}


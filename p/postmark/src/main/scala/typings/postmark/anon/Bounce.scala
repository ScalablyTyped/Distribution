package typings.postmark.anon

import typings.postmark.webhookMod.BounceWebhookTrigger
import typings.postmark.webhookMod.OpenWebhookTrigger
import typings.postmark.webhookMod.SpamWebhookTrigger
import typings.postmark.webhookMod.WebhookTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounce extends js.Object {
  var Bounce: BounceWebhookTrigger = js.native
  var Click: WebhookTrigger = js.native
  var Delivery: WebhookTrigger = js.native
  var Open: OpenWebhookTrigger = js.native
  var SpamComplaint: SpamWebhookTrigger = js.native
}

object Bounce {
  @scala.inline
  def apply(
    Bounce: BounceWebhookTrigger,
    Click: WebhookTrigger,
    Delivery: WebhookTrigger,
    Open: OpenWebhookTrigger,
    SpamComplaint: SpamWebhookTrigger
  ): Bounce = {
    val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], Delivery = Delivery.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounce]
  }
  @scala.inline
  implicit class BounceOps[Self <: Bounce] (val x: Self) extends AnyVal {
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
    def setClick(value: WebhookTrigger): Self = this.set("Click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelivery(value: WebhookTrigger): Self = this.set("Delivery", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: OpenWebhookTrigger): Self = this.set("Open", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpamComplaint(value: SpamWebhookTrigger): Self = this.set("SpamComplaint", value.asInstanceOf[js.Any])
  }
  
}


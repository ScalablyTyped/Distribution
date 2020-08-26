package typings.postmark.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceWebhookTrigger extends WebhookTrigger {
  var IncludeContent: js.UndefOr[Boolean] = js.native
}

object BounceWebhookTrigger {
  @scala.inline
  def apply(Enabled: Boolean): BounceWebhookTrigger = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceWebhookTrigger]
  }
  @scala.inline
  implicit class BounceWebhookTriggerOps[Self <: BounceWebhookTrigger] (val x: Self) extends AnyVal {
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
    def setIncludeContent(value: Boolean): Self = this.set("IncludeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeContent: Self = this.set("IncludeContent", js.undefined)
  }
  
}


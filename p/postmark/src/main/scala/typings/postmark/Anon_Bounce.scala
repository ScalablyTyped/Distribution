package typings.postmark

import typings.postmark.distClientModelsWebhooksWebhookMod.BounceWebhookTrigger
import typings.postmark.distClientModelsWebhooksWebhookMod.OpenWebhookTrigger
import typings.postmark.distClientModelsWebhooksWebhookMod.SpamWebhookTrigger
import typings.postmark.distClientModelsWebhooksWebhookMod.WebhookTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bounce extends js.Object {
  var Bounce: BounceWebhookTrigger
  var Click: WebhookTrigger
  var Delivery: WebhookTrigger
  var Open: OpenWebhookTrigger
  var SpamComplaint: SpamWebhookTrigger
}

object Anon_Bounce {
  @scala.inline
  def apply(
    Bounce: BounceWebhookTrigger,
    Click: WebhookTrigger,
    Delivery: WebhookTrigger,
    Open: OpenWebhookTrigger,
    SpamComplaint: SpamWebhookTrigger
  ): Anon_Bounce = {
    val __obj = js.Dynamic.literal(Bounce = Bounce, Click = Click, Delivery = Delivery, Open = Open, SpamComplaint = SpamComplaint)
  
    __obj.asInstanceOf[Anon_Bounce]
  }
}


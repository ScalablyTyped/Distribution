package typings.postmark.distClientModelsWebhooksWebhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookRequestTriggers extends js.Object {
  var Bounce: js.UndefOr[BounceWebhookTrigger] = js.undefined
  var Click: js.UndefOr[WebhookTrigger] = js.undefined
  var Delivery: js.UndefOr[WebhookTrigger] = js.undefined
  var Open: js.UndefOr[OpenWebhookTrigger] = js.undefined
  var SpamComplaint: js.UndefOr[SpamWebhookTrigger] = js.undefined
}

object WebhookRequestTriggers {
  @scala.inline
  def apply(
    Bounce: BounceWebhookTrigger = null,
    Click: WebhookTrigger = null,
    Delivery: WebhookTrigger = null,
    Open: OpenWebhookTrigger = null,
    SpamComplaint: SpamWebhookTrigger = null
  ): WebhookRequestTriggers = {
    val __obj = js.Dynamic.literal()
    if (Bounce != null) __obj.updateDynamic("Bounce")(Bounce)
    if (Click != null) __obj.updateDynamic("Click")(Click)
    if (Delivery != null) __obj.updateDynamic("Delivery")(Delivery)
    if (Open != null) __obj.updateDynamic("Open")(Open)
    if (SpamComplaint != null) __obj.updateDynamic("SpamComplaint")(SpamComplaint)
    __obj.asInstanceOf[WebhookRequestTriggers]
  }
}


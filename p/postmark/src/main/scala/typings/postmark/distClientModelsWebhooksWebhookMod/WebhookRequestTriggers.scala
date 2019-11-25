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
    if (Bounce != null) __obj.updateDynamic("Bounce")(Bounce.asInstanceOf[js.Any])
    if (Click != null) __obj.updateDynamic("Click")(Click.asInstanceOf[js.Any])
    if (Delivery != null) __obj.updateDynamic("Delivery")(Delivery.asInstanceOf[js.Any])
    if (Open != null) __obj.updateDynamic("Open")(Open.asInstanceOf[js.Any])
    if (SpamComplaint != null) __obj.updateDynamic("SpamComplaint")(SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookRequestTriggers]
  }
}


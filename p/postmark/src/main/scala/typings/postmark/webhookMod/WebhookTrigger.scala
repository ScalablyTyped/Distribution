package typings.postmark.webhookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookTrigger extends js.Object {
  var Enabled: Boolean
}

object WebhookTrigger {
  @scala.inline
  def apply(Enabled: Boolean): WebhookTrigger = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTrigger]
  }
}


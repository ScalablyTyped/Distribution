package typings.postmark.webhooksMod

import typings.postmark.webhookMod.Webhook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhooks extends js.Object {
  var Webhooks: js.Array[Webhook]
}

object Webhooks {
  @scala.inline
  def apply(Webhooks: js.Array[Webhook]): Webhooks = {
    val __obj = js.Dynamic.literal(Webhooks = Webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhooks]
  }
}


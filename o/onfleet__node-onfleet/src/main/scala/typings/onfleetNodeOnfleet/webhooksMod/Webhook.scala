package typings.onfleetNodeOnfleet.webhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook extends js.Object {
  def create(webhook: OnfleetWebhook): js.Promise[WebhookResult]
  def deleteOne(id: String): js.Promise[Unit]
  def get(): js.Promise[js.Array[GetWebhookResult]]
}

object Webhook {
  @scala.inline
  def apply(
    create: OnfleetWebhook => js.Promise[WebhookResult],
    deleteOne: String => js.Promise[Unit],
    get: () => js.Promise[js.Array[GetWebhookResult]]
  ): Webhook = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Webhook]
  }
}


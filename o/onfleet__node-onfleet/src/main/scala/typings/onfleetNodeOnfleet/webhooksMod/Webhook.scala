package typings.onfleetNodeOnfleet.webhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Webhook extends js.Object {
  def create(webhook: OnfleetWebhook): js.Promise[WebhookResult] = js.native
  def deleteOne(id: String): js.Promise[Unit] = js.native
  def get(): js.Promise[js.Array[GetWebhookResult]] = js.native
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
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
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
    def setCreate(value: OnfleetWebhook => js.Promise[WebhookResult]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteOne(value: String => js.Promise[Unit]): Self = this.set("deleteOne", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: () => js.Promise[js.Array[GetWebhookResult]]): Self = this.set("get", js.Any.fromFunction0(value))
  }
  
}


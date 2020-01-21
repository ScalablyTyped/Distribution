package typings.onfleetNodeOnfleet.webhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@onfleet/node-onfleet/Resources/Webhooks", JSImport.Namespace)
@js.native
class ^ () extends Webhook {
  /* CompleteClass */
  override def create(webhook: OnfleetWebhook): js.Promise[WebhookResult] = js.native
  /* CompleteClass */
  override def deleteOne(id: String): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def get(): js.Promise[js.Array[GetWebhookResult]] = js.native
}


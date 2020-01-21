package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDeleted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon8 extends WebhookTriggerType {
  var triggerId: `8`
  var triggerName: TaskDeleted
}

object Anon8 {
  @scala.inline
  def apply(triggerId: `8`, triggerName: TaskDeleted): Anon8 = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon8]
  }
}


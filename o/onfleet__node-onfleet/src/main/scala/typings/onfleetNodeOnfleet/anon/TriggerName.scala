package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerName extends WebhookTriggerType {
  var triggerId: `1`
  var triggerName: TaskEta
}

object TriggerName {
  @scala.inline
  def apply(triggerId: `1`, triggerName: TaskEta): TriggerName = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerName]
  }
}


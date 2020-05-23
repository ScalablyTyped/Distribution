package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerId extends WebhookTriggerType {
  var triggerId: `0`
  var triggerName: TaskStarted
}

object TriggerId {
  @scala.inline
  def apply(triggerId: `0`, triggerName: TaskStarted): TriggerId = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerId]
  }
}


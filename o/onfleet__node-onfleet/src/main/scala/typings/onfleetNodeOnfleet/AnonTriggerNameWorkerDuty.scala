package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameWorkerDuty extends WebhookTriggerType {
  var triggerId: `5`
  var triggerName: WorkerDuty
}

object AnonTriggerNameWorkerDuty {
  @scala.inline
  def apply(triggerId: `5`, triggerName: WorkerDuty): AnonTriggerNameWorkerDuty = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTriggerNameWorkerDuty]
  }
}


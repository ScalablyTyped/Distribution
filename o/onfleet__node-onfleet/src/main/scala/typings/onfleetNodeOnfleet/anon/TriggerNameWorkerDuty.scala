package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerNameWorkerDuty extends WebhookTriggerType {
  var triggerId: `5`
  var triggerName: WorkerDuty
}

object TriggerNameWorkerDuty {
  @scala.inline
  def apply(triggerId: `5`, triggerName: WorkerDuty): TriggerNameWorkerDuty = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerNameWorkerDuty]
  }
}


package typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod

import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`0`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`10`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`12`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`13`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`14`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`1`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`2`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`3`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`4`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`5`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`6`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`7`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`8`
import typings.atOnfleetNodeDashOnfleet.atOnfleetNodeDashOnfleetNumbers.`9`
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskArrival
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskAssigned
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCloned
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCompleted
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCreated
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDelayed
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDeleted
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskEta
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskFailed
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUnassigned
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUpdated
import typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.WorkerDuty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookTriggerType extends js.Object {
  var triggerId: js.UndefOr[
    `0` | `1` | `10` | `12` | `13` | `14` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`
  ] = js.undefined
  var triggerName: js.UndefOr[
    SmsRecipientResponseMissed | TaskArrival | TaskAssigned | TaskCloned | TaskCompleted | TaskCreated | TaskDelayed | TaskDeleted | TaskEta | TaskFailed | TaskStarted | TaskUnassigned | TaskUpdated | WorkerDuty
  ] = js.undefined
}

object WebhookTriggerType {
  @scala.inline
  def apply(triggerId: `0` = null, triggerName: TaskStarted = null): WebhookTriggerType = {
    val __obj = js.Dynamic.literal()
    if (triggerId != null) __obj.updateDynamic("triggerId")(triggerId)
    if (triggerName != null) __obj.updateDynamic("triggerName")(triggerName)
    __obj.asInstanceOf[WebhookTriggerType]
  }
}


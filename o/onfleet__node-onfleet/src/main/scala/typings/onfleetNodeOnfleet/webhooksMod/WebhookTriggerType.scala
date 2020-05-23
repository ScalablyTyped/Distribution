package typings.onfleetNodeOnfleet.webhooksMod

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`12`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`6`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`7`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`9`
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskArrival
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskAssigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCloned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCompleted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCreated
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDelayed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDeleted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskFailed
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUpdated
import typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.onfleetNodeOnfleet.anon.TriggerId
  - typings.onfleetNodeOnfleet.anon.TriggerName
  - typings.onfleetNodeOnfleet.anon.TriggerIdTriggerName
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskFailed
  - typings.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskCreated
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed
  - typings.onfleetNodeOnfleet.anon.TriggerNameTaskCloned
  - typings.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed
*/
trait WebhookTriggerType extends js.Object

object WebhookTriggerType {
  @scala.inline
  def TriggerNameTaskAssigned(triggerId: `9`, triggerName: TaskAssigned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerIdTriggerName(triggerId: `2`, triggerName: TaskArrival): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameTaskCreated(triggerId: `6`, triggerName: TaskCreated): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameTaskFailed(triggerId: `4`, triggerName: TaskFailed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameTaskDelayed(triggerId: `12`, triggerName: TaskDelayed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameWorkerDuty(triggerId: `5`, triggerName: WorkerDuty): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerName(triggerId: `1`, triggerName: TaskEta): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerId(triggerId: `0`, triggerName: TaskStarted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameTaskDeleted(triggerId: `8`, triggerName: TaskDeleted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameTaskCompleted(triggerId: `3`, triggerName: TaskCompleted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameTaskUpdated(triggerId: `7`, triggerName: TaskUpdated): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameSmsRecipientResponseMissed(triggerId: `14`, triggerName: SmsRecipientResponseMissed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameTaskUnassigned(triggerId: `10`, triggerName: TaskUnassigned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def TriggerNameTaskCloned(triggerId: `13`, triggerName: TaskCloned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookTriggerType]
  }
}


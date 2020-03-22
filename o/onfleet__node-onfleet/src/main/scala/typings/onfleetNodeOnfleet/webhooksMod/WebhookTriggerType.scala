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
  - typings.onfleetNodeOnfleet.AnonTriggerId
  - typings.onfleetNodeOnfleet.AnonTriggerName
  - typings.onfleetNodeOnfleet.AnonTriggerIdTriggerName
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskCompleted
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskFailed
  - typings.onfleetNodeOnfleet.AnonTriggerNameWorkerDuty
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskCreated
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskUpdated
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskDeleted
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskAssigned
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskUnassigned
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskDelayed
  - typings.onfleetNodeOnfleet.AnonTriggerNameTaskCloned
  - typings.onfleetNodeOnfleet.AnonTriggerNameSmsRecipientResponseMissed
*/
trait WebhookTriggerType extends js.Object

object WebhookTriggerType {
  @scala.inline
  def AnonTriggerIdTriggerName(triggerId: `2`, triggerName: TaskArrival): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskUnassigned(triggerId: `10`, triggerName: TaskUnassigned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskCloned(triggerId: `13`, triggerName: TaskCloned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskUpdated(triggerId: `7`, triggerName: TaskUpdated): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskDelayed(triggerId: `12`, triggerName: TaskDelayed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerId(triggerId: `0`, triggerName: TaskStarted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameSmsRecipientResponseMissed(triggerId: `14`, triggerName: SmsRecipientResponseMissed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskFailed(triggerId: `4`, triggerName: TaskFailed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskDeleted(triggerId: `8`, triggerName: TaskDeleted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameWorkerDuty(triggerId: `5`, triggerName: WorkerDuty): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskCreated(triggerId: `6`, triggerName: TaskCreated): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerName(triggerId: `1`, triggerName: TaskEta): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskCompleted(triggerId: `3`, triggerName: TaskCompleted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskAssigned(triggerId: `9`, triggerName: TaskAssigned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
}


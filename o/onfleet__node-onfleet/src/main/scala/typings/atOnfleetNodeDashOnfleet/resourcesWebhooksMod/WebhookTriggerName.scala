package typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebhookTriggerName extends js.Object

@JSImport("@onfleet/node-onfleet/Resources/Webhooks", "WebhookTriggerName")
@js.native
object WebhookTriggerName extends js.Object {
  @js.native
  sealed trait SmsRecipientResponseMissed extends WebhookTriggerName
  
  @js.native
  sealed trait TaskArrival extends WebhookTriggerName
  
  @js.native
  sealed trait TaskAssigned extends WebhookTriggerName
  
  @js.native
  sealed trait TaskCloned extends WebhookTriggerName
  
  @js.native
  sealed trait TaskCompleted extends WebhookTriggerName
  
  @js.native
  sealed trait TaskCreated extends WebhookTriggerName
  
  @js.native
  sealed trait TaskDelayed extends WebhookTriggerName
  
  @js.native
  sealed trait TaskDeleted extends WebhookTriggerName
  
  @js.native
  sealed trait TaskEta extends WebhookTriggerName
  
  @js.native
  sealed trait TaskFailed extends WebhookTriggerName
  
  @js.native
  sealed trait TaskStarted extends WebhookTriggerName
  
  @js.native
  sealed trait TaskUnassigned extends WebhookTriggerName
  
  @js.native
  sealed trait TaskUpdated extends WebhookTriggerName
  
  @js.native
  sealed trait WorkerDuty extends WebhookTriggerName
  
  /* "smsRecipientResponseMissed" */ val SmsRecipientResponseMissed: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.SmsRecipientResponseMissed with String = js.native
  /* "taskArrival" */ val TaskArrival: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskArrival with String = js.native
  /* "taskAssigned" */ val TaskAssigned: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskAssigned with String = js.native
  /* "taskCloned" */ val TaskCloned: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCloned with String = js.native
  /* "taskCompleted" */ val TaskCompleted: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCompleted with String = js.native
  /* "taskCreated" */ val TaskCreated: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCreated with String = js.native
  /* "taskDelayed" */ val TaskDelayed: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDelayed with String = js.native
  /* "taskDeleted" */ val TaskDeleted: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDeleted with String = js.native
  /* "taskEta" */ val TaskEta: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskEta with String = js.native
  /* "taskFailed" */ val TaskFailed: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskFailed with String = js.native
  /* "taskStarted" */ val TaskStarted: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted with String = js.native
  /* "taskUnassigned" */ val TaskUnassigned: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUnassigned with String = js.native
  /* "taskUpdated" */ val TaskUpdated: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUpdated with String = js.native
  /* "workerDuty" */ val WorkerDuty: typings.atOnfleetNodeDashOnfleet.resourcesWebhooksMod.WebhookTriggerName.WorkerDuty with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebhookTriggerName with String] = js.native
}


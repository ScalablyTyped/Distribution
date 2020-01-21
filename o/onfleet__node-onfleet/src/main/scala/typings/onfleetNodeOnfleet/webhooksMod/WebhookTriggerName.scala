package typings.onfleetNodeOnfleet.webhooksMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebhookTriggerName with String] = js.native
  /* "smsRecipientResponseMissed" */ @js.native
  object SmsRecipientResponseMissed extends TopLevel[SmsRecipientResponseMissed with String]
  
  /* "taskArrival" */ @js.native
  object TaskArrival extends TopLevel[TaskArrival with String]
  
  /* "taskAssigned" */ @js.native
  object TaskAssigned extends TopLevel[TaskAssigned with String]
  
  /* "taskCloned" */ @js.native
  object TaskCloned extends TopLevel[TaskCloned with String]
  
  /* "taskCompleted" */ @js.native
  object TaskCompleted extends TopLevel[TaskCompleted with String]
  
  /* "taskCreated" */ @js.native
  object TaskCreated extends TopLevel[TaskCreated with String]
  
  /* "taskDelayed" */ @js.native
  object TaskDelayed extends TopLevel[TaskDelayed with String]
  
  /* "taskDeleted" */ @js.native
  object TaskDeleted extends TopLevel[TaskDeleted with String]
  
  /* "taskEta" */ @js.native
  object TaskEta extends TopLevel[TaskEta with String]
  
  /* "taskFailed" */ @js.native
  object TaskFailed extends TopLevel[TaskFailed with String]
  
  /* "taskStarted" */ @js.native
  object TaskStarted extends TopLevel[TaskStarted with String]
  
  /* "taskUnassigned" */ @js.native
  object TaskUnassigned extends TopLevel[TaskUnassigned with String]
  
  /* "taskUpdated" */ @js.native
  object TaskUpdated extends TopLevel[TaskUpdated with String]
  
  /* "workerDuty" */ @js.native
  object WorkerDuty extends TopLevel[WorkerDuty with String]
  
}


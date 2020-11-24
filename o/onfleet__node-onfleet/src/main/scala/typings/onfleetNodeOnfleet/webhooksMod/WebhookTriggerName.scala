package typings.onfleetNodeOnfleet.webhooksMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebhookTriggerName extends js.Object
@JSImport("@onfleet/node-onfleet/Resources/Webhooks", "WebhookTriggerName")
@js.native
object WebhookTriggerName extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WebhookTriggerName with String] = js.native
  
  @js.native
  sealed trait SmsRecipientResponseMissed extends WebhookTriggerName
  /* "smsRecipientResponseMissed" */ @js.native
  object SmsRecipientResponseMissed extends TopLevel[SmsRecipientResponseMissed with String]
  
  @js.native
  sealed trait TaskArrival extends WebhookTriggerName
  /* "taskArrival" */ @js.native
  object TaskArrival extends TopLevel[TaskArrival with String]
  
  @js.native
  sealed trait TaskAssigned extends WebhookTriggerName
  /* "taskAssigned" */ @js.native
  object TaskAssigned extends TopLevel[TaskAssigned with String]
  
  @js.native
  sealed trait TaskCloned extends WebhookTriggerName
  /* "taskCloned" */ @js.native
  object TaskCloned extends TopLevel[TaskCloned with String]
  
  @js.native
  sealed trait TaskCompleted extends WebhookTriggerName
  /* "taskCompleted" */ @js.native
  object TaskCompleted extends TopLevel[TaskCompleted with String]
  
  @js.native
  sealed trait TaskCreated extends WebhookTriggerName
  /* "taskCreated" */ @js.native
  object TaskCreated extends TopLevel[TaskCreated with String]
  
  @js.native
  sealed trait TaskDelayed extends WebhookTriggerName
  /* "taskDelayed" */ @js.native
  object TaskDelayed extends TopLevel[TaskDelayed with String]
  
  @js.native
  sealed trait TaskDeleted extends WebhookTriggerName
  /* "taskDeleted" */ @js.native
  object TaskDeleted extends TopLevel[TaskDeleted with String]
  
  @js.native
  sealed trait TaskEta extends WebhookTriggerName
  /* "taskEta" */ @js.native
  object TaskEta extends TopLevel[TaskEta with String]
  
  @js.native
  sealed trait TaskFailed extends WebhookTriggerName
  /* "taskFailed" */ @js.native
  object TaskFailed extends TopLevel[TaskFailed with String]
  
  @js.native
  sealed trait TaskStarted extends WebhookTriggerName
  /* "taskStarted" */ @js.native
  object TaskStarted extends TopLevel[TaskStarted with String]
  
  @js.native
  sealed trait TaskUnassigned extends WebhookTriggerName
  /* "taskUnassigned" */ @js.native
  object TaskUnassigned extends TopLevel[TaskUnassigned with String]
  
  @js.native
  sealed trait TaskUpdated extends WebhookTriggerName
  /* "taskUpdated" */ @js.native
  object TaskUpdated extends TopLevel[TaskUpdated with String]
  
  @js.native
  sealed trait WorkerDuty extends WebhookTriggerName
  /* "workerDuty" */ @js.native
  object WorkerDuty extends TopLevel[WorkerDuty with String]
}

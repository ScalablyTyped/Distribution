package typings.onfleetNodeOnfleet

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webhooksMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Webhooks", JSImport.Namespace)
  @js.native
  class ^ () extends Webhook
  
  @js.native
  sealed trait WebhookTriggerName extends StObject
  @JSImport("@onfleet/node-onfleet/Resources/Webhooks", "WebhookTriggerName")
  @js.native
  object WebhookTriggerName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WebhookTriggerName with String] = js.native
    
    @js.native
    sealed trait SmsRecipientResponseMissed extends WebhookTriggerName
    /* "smsRecipientResponseMissed" */ val SmsRecipientResponseMissed: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed with String = js.native
    
    @js.native
    sealed trait TaskArrival extends WebhookTriggerName
    /* "taskArrival" */ val TaskArrival: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskArrival with String = js.native
    
    @js.native
    sealed trait TaskAssigned extends WebhookTriggerName
    /* "taskAssigned" */ val TaskAssigned: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskAssigned with String = js.native
    
    @js.native
    sealed trait TaskCloned extends WebhookTriggerName
    /* "taskCloned" */ val TaskCloned: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCloned with String = js.native
    
    @js.native
    sealed trait TaskCompleted extends WebhookTriggerName
    /* "taskCompleted" */ val TaskCompleted: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCompleted with String = js.native
    
    @js.native
    sealed trait TaskCreated extends WebhookTriggerName
    /* "taskCreated" */ val TaskCreated: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCreated with String = js.native
    
    @js.native
    sealed trait TaskDelayed extends WebhookTriggerName
    /* "taskDelayed" */ val TaskDelayed: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDelayed with String = js.native
    
    @js.native
    sealed trait TaskDeleted extends WebhookTriggerName
    /* "taskDeleted" */ val TaskDeleted: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDeleted with String = js.native
    
    @js.native
    sealed trait TaskEta extends WebhookTriggerName
    /* "taskEta" */ val TaskEta: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta with String = js.native
    
    @js.native
    sealed trait TaskFailed extends WebhookTriggerName
    /* "taskFailed" */ val TaskFailed: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskFailed with String = js.native
    
    @js.native
    sealed trait TaskStarted extends WebhookTriggerName
    /* "taskStarted" */ val TaskStarted: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted with String = js.native
    
    @js.native
    sealed trait TaskUnassigned extends WebhookTriggerName
    /* "taskUnassigned" */ val TaskUnassigned: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned with String = js.native
    
    @js.native
    sealed trait TaskUpdated extends WebhookTriggerName
    /* "taskUpdated" */ val TaskUpdated: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUpdated with String = js.native
    
    @js.native
    sealed trait WorkerDuty extends WebhookTriggerName
    /* "workerDuty" */ val WorkerDuty: typings.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty with String = js.native
  }
  
  @js.native
  trait GetWebhookResult extends WebhookResult {
    
    var isEnabled: Boolean = js.native
  }
  object GetWebhookResult {
    
    @scala.inline
    def apply(
      count: Double,
      id: String,
      isEnabled: Boolean,
      trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
      url: String
    ): GetWebhookResult = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetWebhookResult]
    }
    
    @scala.inline
    implicit class GetWebhookResultMutableBuilder[Self <: GetWebhookResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnfleetWebhook extends StObject {
    
    var threshold: js.UndefOr[Double] = js.native
    
    var trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14` = js.native
    
    var url: String = js.native
  }
  object OnfleetWebhook {
    
    @scala.inline
    def apply(
      trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
      url: String
    ): OnfleetWebhook = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetWebhook]
    }
    
    @scala.inline
    implicit class OnfleetWebhookMutableBuilder[Self <: OnfleetWebhook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setTrigger(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Webhook extends StObject {
    
    def create(webhook: OnfleetWebhook): js.Promise[WebhookResult] = js.native
    
    def deleteOne(id: String): js.Promise[Unit] = js.native
    
    def get(): js.Promise[js.Array[GetWebhookResult]] = js.native
  }
  object Webhook {
    
    @scala.inline
    def apply(
      create: OnfleetWebhook => js.Promise[WebhookResult],
      deleteOne: String => js.Promise[Unit],
      get: () => js.Promise[js.Array[GetWebhookResult]]
    ): Webhook = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Webhook]
    }
    
    @scala.inline
    implicit class WebhookMutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: OnfleetWebhook => js.Promise[WebhookResult]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteOne(value: String => js.Promise[Unit]): Self = StObject.set(x, "deleteOne", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => js.Promise[js.Array[GetWebhookResult]]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait WebhookResult extends StObject {
    
    var count: Double = js.native
    
    var id: String = js.native
    
    var trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14` = js.native
    
    var url: String = js.native
  }
  object WebhookResult {
    
    @scala.inline
    def apply(
      count: Double,
      id: String,
      trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
      url: String
    ): WebhookResult = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookResult]
    }
    
    @scala.inline
    implicit class WebhookResultMutableBuilder[Self <: WebhookResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrigger(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
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
  trait WebhookTriggerType extends StObject
  object WebhookTriggerType {
    
    @scala.inline
    def TriggerId(triggerId: `0`, triggerName: TaskStarted): typings.onfleetNodeOnfleet.anon.TriggerId = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerId]
    }
    
    @scala.inline
    def TriggerIdTriggerName(triggerId: `2`, triggerName: TaskArrival): typings.onfleetNodeOnfleet.anon.TriggerIdTriggerName = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerIdTriggerName]
    }
    
    @scala.inline
    def TriggerName(triggerId: `1`, triggerName: TaskEta): typings.onfleetNodeOnfleet.anon.TriggerName = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerName]
    }
    
    @scala.inline
    def TriggerNameSmsRecipientResponseMissed(triggerId: `14`, triggerName: SmsRecipientResponseMissed): typings.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed]
    }
    
    @scala.inline
    def TriggerNameTaskAssigned(triggerId: `9`, triggerName: TaskAssigned): typings.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned]
    }
    
    @scala.inline
    def TriggerNameTaskCloned(triggerId: `13`, triggerName: TaskCloned): typings.onfleetNodeOnfleet.anon.TriggerNameTaskCloned = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskCloned]
    }
    
    @scala.inline
    def TriggerNameTaskCompleted(triggerId: `3`, triggerName: TaskCompleted): typings.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted]
    }
    
    @scala.inline
    def TriggerNameTaskCreated(triggerId: `6`, triggerName: TaskCreated): typings.onfleetNodeOnfleet.anon.TriggerNameTaskCreated = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskCreated]
    }
    
    @scala.inline
    def TriggerNameTaskDelayed(triggerId: `12`, triggerName: TaskDelayed): typings.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed]
    }
    
    @scala.inline
    def TriggerNameTaskDeleted(triggerId: `8`, triggerName: TaskDeleted): typings.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted]
    }
    
    @scala.inline
    def TriggerNameTaskFailed(triggerId: `4`, triggerName: TaskFailed): typings.onfleetNodeOnfleet.anon.TriggerNameTaskFailed = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskFailed]
    }
    
    @scala.inline
    def TriggerNameTaskUnassigned(triggerId: `10`, triggerName: TaskUnassigned): typings.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned]
    }
    
    @scala.inline
    def TriggerNameTaskUpdated(triggerId: `7`, triggerName: TaskUpdated): typings.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated]
    }
    
    @scala.inline
    def TriggerNameWorkerDuty(triggerId: `5`, triggerName: WorkerDuty): typings.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty = {
      val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty]
    }
  }
}

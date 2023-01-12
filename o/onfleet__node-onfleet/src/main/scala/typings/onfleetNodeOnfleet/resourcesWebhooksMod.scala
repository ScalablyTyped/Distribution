package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`0`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`10`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`12`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`13`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`14`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`1`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`2`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`3`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`4`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`5`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`6`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`7`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`8`
import typings.onfleetNodeOnfleet.onfleetNodeOnfleetInts.`9`
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskArrival
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskAssigned
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCloned
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCompleted
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCreated
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDelayed
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDeleted
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskEta
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskFailed
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUnassigned
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUpdated
import typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.WorkerDuty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesWebhooksMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Webhooks", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Webhook {
    
    /* CompleteClass */
    override def create(webhook: OnfleetWebhook): js.Promise[WebhookResult] = js.native
    
    /* CompleteClass */
    override def deleteOne(id: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def get(): js.Promise[js.Array[GetWebhookResult]] = js.native
  }
  
  @js.native
  sealed trait WebhookTriggerName extends StObject
  @JSImport("@onfleet/node-onfleet/Resources/Webhooks", "WebhookTriggerName")
  @js.native
  object WebhookTriggerName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WebhookTriggerName & String] = js.native
    
    @js.native
    sealed trait SmsRecipientResponseMissed
      extends StObject
         with WebhookTriggerName
    /* "smsRecipientResponseMissed" */ val SmsRecipientResponseMissed: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.SmsRecipientResponseMissed & String = js.native
    
    @js.native
    sealed trait TaskArrival
      extends StObject
         with WebhookTriggerName
    /* "taskArrival" */ val TaskArrival: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskArrival & String = js.native
    
    @js.native
    sealed trait TaskAssigned
      extends StObject
         with WebhookTriggerName
    /* "taskAssigned" */ val TaskAssigned: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskAssigned & String = js.native
    
    @js.native
    sealed trait TaskCloned
      extends StObject
         with WebhookTriggerName
    /* "taskCloned" */ val TaskCloned: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCloned & String = js.native
    
    @js.native
    sealed trait TaskCompleted
      extends StObject
         with WebhookTriggerName
    /* "taskCompleted" */ val TaskCompleted: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCompleted & String = js.native
    
    @js.native
    sealed trait TaskCreated
      extends StObject
         with WebhookTriggerName
    /* "taskCreated" */ val TaskCreated: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskCreated & String = js.native
    
    @js.native
    sealed trait TaskDelayed
      extends StObject
         with WebhookTriggerName
    /* "taskDelayed" */ val TaskDelayed: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDelayed & String = js.native
    
    @js.native
    sealed trait TaskDeleted
      extends StObject
         with WebhookTriggerName
    /* "taskDeleted" */ val TaskDeleted: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskDeleted & String = js.native
    
    @js.native
    sealed trait TaskEta
      extends StObject
         with WebhookTriggerName
    /* "taskEta" */ val TaskEta: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskEta & String = js.native
    
    @js.native
    sealed trait TaskFailed
      extends StObject
         with WebhookTriggerName
    /* "taskFailed" */ val TaskFailed: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskFailed & String = js.native
    
    @js.native
    sealed trait TaskStarted
      extends StObject
         with WebhookTriggerName
    /* "taskStarted" */ val TaskStarted: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskStarted & String = js.native
    
    @js.native
    sealed trait TaskUnassigned
      extends StObject
         with WebhookTriggerName
    /* "taskUnassigned" */ val TaskUnassigned: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUnassigned & String = js.native
    
    @js.native
    sealed trait TaskUpdated
      extends StObject
         with WebhookTriggerName
    /* "taskUpdated" */ val TaskUpdated: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.TaskUpdated & String = js.native
    
    @js.native
    sealed trait WorkerDuty
      extends StObject
         with WebhookTriggerName
    /* "workerDuty" */ val WorkerDuty: typings.onfleetNodeOnfleet.resourcesWebhooksMod.WebhookTriggerName.WorkerDuty & String = js.native
  }
  
  trait GetWebhookResult
    extends StObject
       with WebhookResult {
    
    var isEnabled: Boolean
  }
  object GetWebhookResult {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: GetWebhookResult] (val x: Self) extends AnyVal {
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnfleetWebhook extends StObject {
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`
    
    var url: String
  }
  object OnfleetWebhook {
    
    inline def apply(
      trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
      url: String
    ): OnfleetWebhook = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetWebhook]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnfleetWebhook] (val x: Self) extends AnyVal {
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTrigger(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Webhook extends StObject {
    
    def create(webhook: OnfleetWebhook): js.Promise[WebhookResult]
    
    def deleteOne(id: String): js.Promise[Unit]
    
    def get(): js.Promise[js.Array[GetWebhookResult]]
  }
  object Webhook {
    
    inline def apply(
      create: OnfleetWebhook => js.Promise[WebhookResult],
      deleteOne: String => js.Promise[Unit],
      get: () => js.Promise[js.Array[GetWebhookResult]]
    ): Webhook = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Webhook]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: OnfleetWebhook => js.Promise[WebhookResult]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setDeleteOne(value: String => js.Promise[Unit]): Self = StObject.set(x, "deleteOne", js.Any.fromFunction1(value))
      
      inline def setGet(value: () => js.Promise[js.Array[GetWebhookResult]]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  trait WebhookResult extends StObject {
    
    var count: Double
    
    var id: String
    
    var trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`
    
    var url: String
  }
  object WebhookResult {
    
    inline def apply(
      count: Double,
      id: String,
      trigger: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`,
      url: String
    ): WebhookResult = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebhookResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebhookResult] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTrigger(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `12` | `13` | `14`): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
    
    inline def TriggerId(triggerName: TaskStarted): typings.onfleetNodeOnfleet.anon.TriggerId = {
      val __obj = js.Dynamic.literal(triggerId = 0, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerId]
    }
    
    inline def TriggerIdTriggerName(triggerName: TaskArrival): typings.onfleetNodeOnfleet.anon.TriggerIdTriggerName = {
      val __obj = js.Dynamic.literal(triggerId = 2, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerIdTriggerName]
    }
    
    inline def TriggerName(triggerName: TaskEta): typings.onfleetNodeOnfleet.anon.TriggerName = {
      val __obj = js.Dynamic.literal(triggerId = 1, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerName]
    }
    
    inline def TriggerNameSmsRecipientResponseMissed(triggerName: SmsRecipientResponseMissed): typings.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed = {
      val __obj = js.Dynamic.literal(triggerId = 14, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameSmsRecipientResponseMissed]
    }
    
    inline def TriggerNameTaskAssigned(triggerName: TaskAssigned): typings.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned = {
      val __obj = js.Dynamic.literal(triggerId = 9, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskAssigned]
    }
    
    inline def TriggerNameTaskCloned(triggerName: TaskCloned): typings.onfleetNodeOnfleet.anon.TriggerNameTaskCloned = {
      val __obj = js.Dynamic.literal(triggerId = 13, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskCloned]
    }
    
    inline def TriggerNameTaskCompleted(triggerName: TaskCompleted): typings.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted = {
      val __obj = js.Dynamic.literal(triggerId = 3, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskCompleted]
    }
    
    inline def TriggerNameTaskCreated(triggerName: TaskCreated): typings.onfleetNodeOnfleet.anon.TriggerNameTaskCreated = {
      val __obj = js.Dynamic.literal(triggerId = 6, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskCreated]
    }
    
    inline def TriggerNameTaskDelayed(triggerName: TaskDelayed): typings.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed = {
      val __obj = js.Dynamic.literal(triggerId = 12, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskDelayed]
    }
    
    inline def TriggerNameTaskDeleted(triggerName: TaskDeleted): typings.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted = {
      val __obj = js.Dynamic.literal(triggerId = 8, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskDeleted]
    }
    
    inline def TriggerNameTaskFailed(triggerName: TaskFailed): typings.onfleetNodeOnfleet.anon.TriggerNameTaskFailed = {
      val __obj = js.Dynamic.literal(triggerId = 4, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskFailed]
    }
    
    inline def TriggerNameTaskUnassigned(triggerName: TaskUnassigned): typings.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned = {
      val __obj = js.Dynamic.literal(triggerId = 10, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskUnassigned]
    }
    
    inline def TriggerNameTaskUpdated(triggerName: TaskUpdated): typings.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated = {
      val __obj = js.Dynamic.literal(triggerId = 7, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameTaskUpdated]
    }
    
    inline def TriggerNameWorkerDuty(triggerName: WorkerDuty): typings.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty = {
      val __obj = js.Dynamic.literal(triggerId = 5, triggerName = triggerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.onfleetNodeOnfleet.anon.TriggerNameWorkerDuty]
    }
  }
}

package typings.nodeCron

import typings.node.eventsMod.EventEmitter
import typings.nodeCron.nodeCronStrings.init
import typings.nodeCron.nodeCronStrings.manual
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-cron", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTasks(): Map[String, ScheduledTask] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTasks")().asInstanceOf[Map[String, ScheduledTask]]
  
  inline def schedule(cronExpression: String, func: String): ScheduledTask = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(cronExpression.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[ScheduledTask]
  inline def schedule(cronExpression: String, func: String, options: ScheduleOptions): ScheduledTask = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(cronExpression.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScheduledTask]
  inline def schedule(cronExpression: String, func: js.Function1[/* now */ js.Date | manual | init, Unit]): ScheduledTask = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(cronExpression.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[ScheduledTask]
  inline def schedule(
    cronExpression: String,
    func: js.Function1[/* now */ js.Date | manual | init, Unit],
    options: ScheduleOptions
  ): ScheduledTask = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(cronExpression.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScheduledTask]
  
  inline def validate(cronExpression: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(cronExpression.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait ScheduleOptions extends StObject {
    
    /**
      * The schedule name
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether to recover missed executions instead of skipping them.
      *
      * Defaults to `false`
      */
    var recoverMissedExecutions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Execute task immediately after creation
      */
    var runOnInit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A boolean to set if the created task is scheduled.
      *
      * Defaults to `true`
      */
    var scheduled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The timezone that is used for job scheduling
      */
    var timezone: js.UndefOr[String] = js.undefined
  }
  object ScheduleOptions {
    
    inline def apply(): ScheduleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScheduleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScheduleOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRecoverMissedExecutions(value: Boolean): Self = StObject.set(x, "recoverMissedExecutions", value.asInstanceOf[js.Any])
      
      inline def setRecoverMissedExecutionsUndefined: Self = StObject.set(x, "recoverMissedExecutions", js.undefined)
      
      inline def setRunOnInit(value: Boolean): Self = StObject.set(x, "runOnInit", value.asInstanceOf[js.Any])
      
      inline def setRunOnInitUndefined: Self = StObject.set(x, "runOnInit", js.undefined)
      
      inline def setScheduled(value: Boolean): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
      
      inline def setScheduledUndefined: Self = StObject.set(x, "scheduled", js.undefined)
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
  
  @js.native
  trait ScheduledTask extends EventEmitter {
    
    def now(): Unit = js.native
    def now(now: js.Date): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
}

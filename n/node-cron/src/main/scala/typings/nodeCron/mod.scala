package typings.nodeCron

import typings.tzOffset.mod.Timezone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-cron", "schedule")
  @js.native
  def schedule(cronExpression: String, func: js.Function0[Unit]): ScheduledTask = js.native
  @JSImport("node-cron", "schedule")
  @js.native
  def schedule(cronExpression: String, func: js.Function0[Unit], options: ScheduleOptions): ScheduledTask = js.native
  
  @JSImport("node-cron", "validate")
  @js.native
  def validate(cronExpression: String): Boolean = js.native
  
  @js.native
  trait ScheduleOptions extends StObject {
    
    /**
      * A boolean to set if the created task is scheduled.
      *
      * Defaults to `true`
      */
    var scheduled: js.UndefOr[Boolean] = js.native
    
    /**
      * The timezone that is used for job scheduling
      */
    var timezone: js.UndefOr[Timezone] = js.native
  }
  object ScheduleOptions {
    
    @scala.inline
    def apply(): ScheduleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScheduleOptions]
    }
    
    @scala.inline
    implicit class ScheduleOptionsMutableBuilder[Self <: ScheduleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScheduled(value: Boolean): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduledUndefined: Self = StObject.set(x, "scheduled", js.undefined)
      
      @scala.inline
      def setTimezone(value: Timezone): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    }
  }
  
  @js.native
  trait ScheduledTask extends StObject {
    
    def destroy(): Unit = js.native
    
    def getStatus(): String = js.native
    
    def start(): this.type = js.native
    
    def stop(): this.type = js.native
  }
  object ScheduledTask {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getStatus: () => String,
      start: () => ScheduledTask,
      stop: () => ScheduledTask
    ): ScheduledTask = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getStatus = js.Any.fromFunction0(getStatus), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[ScheduledTask]
    }
    
    @scala.inline
    implicit class ScheduledTaskMutableBuilder[Self <: ScheduledTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStatus(value: () => String): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: () => ScheduledTask): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => ScheduledTask): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}

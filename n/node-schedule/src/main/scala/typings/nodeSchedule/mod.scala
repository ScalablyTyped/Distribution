package typings.nodeSchedule

import typings.node.eventsMod.EventEmitter
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-schedule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-schedule", "Invocation")
  @js.native
  class Invocation protected () extends StObject {
    def this(job: Job, fireDate: Date, recurrenceRule: RecurrenceRule) = this()
    
    var fireDate: Date = js.native
    
    var job: Job = js.native
    
    var recurrenceRule: RecurrenceRule = js.native
    
    var timerID: Double = js.native
  }
  
  @JSImport("node-schedule", "Job")
  @js.native
  class Job protected () extends EventEmitter {
    /**
      * Use the function scheduleJob() to create new Job objects.
      *
      * @internal
      * @param name     either an optional name for this Job or this Job's callback
      * @param job      either this Job's callback or an optional callback function
      * @param callback optional callback that is executed right before the JobCallback
      */
    def this(name: String) = this()
    def this(name: JobCallback) = this()
    def this(name: String, job: js.Function0[Unit]) = this()
    def this(name: String, job: JobCallback) = this()
    def this(name: JobCallback, job: js.Function0[Unit]) = this()
    def this(name: JobCallback, job: JobCallback) = this()
    def this(name: String, job: js.Function0[Unit], callback: js.Function0[Unit]) = this()
    def this(name: String, job: Unit, callback: js.Function0[Unit]) = this()
    def this(name: String, job: JobCallback, callback: js.Function0[Unit]) = this()
    def this(name: JobCallback, job: js.Function0[Unit], callback: js.Function0[Unit]) = this()
    def this(name: JobCallback, job: Unit, callback: js.Function0[Unit]) = this()
    def this(name: JobCallback, job: JobCallback, callback: js.Function0[Unit]) = this()
    
    /**
      * cancel all pending Invocations of this Job.
      * @param reschedule whether to reschedule the canceled Invocations.
      */
    def cancel(): Boolean = js.native
    def cancel(reschedule: Boolean): Boolean = js.native
    
    /**
      * cancel the next Invocation of this Job.
      * @param reschedule whether to reschedule the canceled Invocation.
      * @return whether cancelation was successful
      */
    def cancelNext(): Boolean = js.native
    def cancelNext(reschedule: Boolean): Boolean = js.native
    
    /**
      * run this Job immediately.
      */
    def invoke(): Unit = js.native
    
    val name: String = js.native
    
    /** The Date on which this Job will be run next. */
    def nextInvocation(): Date = js.native
    
    /** A list of all pending Invocations */
    def pendingInvocations(): js.Array[Invocation] = js.native
    
    def reschedule(spec: String): Boolean = js.native
    def reschedule(spec: Double): Boolean = js.native
    /**
      * Changes the scheduling information for this Job.
      * @return whether the reschedule was successful
      */
    def reschedule(spec: RecurrenceRule): Boolean = js.native
    
    /** schedule this Job to be run on the specified date. */
    def runOnDate(date: Date): Unit = js.native
    
    def schedule(date: String): Boolean = js.native
    def schedule(date: Double): Boolean = js.native
    /** set scheduling information */
    def schedule(date: Date): Boolean = js.native
    
    /**
      * set the number of currently running Jobs.
      * @internal
      */
    def setTriggeredJobs(triggeredJobs: Double): Unit = js.native
    
    /**
      * removes an Invocation from this Job's tracking list. For internal use.
      * @internal
      * @return boolean whether the invocation was successful. Removing an Invocation that doesn't exist, returns false.
      */
    def stopTrackingInvocation(invocation: Invocation): Boolean = js.native
    
    /**
      * Adds an Invocation to this job. For internal use.
      * @internal
      * @return whether the invocation could be added
      */
    def trackInvocation(invocation: Invocation): Boolean = js.native
    
    /**
      * @internal
      * @return the number of currently running instances of this Job.
      */
    def triggeredJobs(): Double = js.native
  }
  
  @JSImport("node-schedule", "Range")
  @js.native
  class Range () extends StObject {
    def this(start: Double) = this()
    def this(start: Double, end: Double) = this()
    def this(start: Unit, end: Double) = this()
    def this(start: Double, end: Double, step: Double) = this()
    def this(start: Double, end: Unit, step: Double) = this()
    def this(start: Unit, end: Double, step: Double) = this()
    def this(start: Unit, end: Unit, step: Double) = this()
    
    /** Whether the class contains the specified value. */
    def contains(value: Double): Boolean = js.native
  }
  
  @JSImport("node-schedule", "RecurrenceRule")
  @js.native
  class RecurrenceRule protected () extends StObject {
    def this(
      year: js.UndefOr[RecurrenceSegment],
      month: js.UndefOr[RecurrenceSegment],
      date: js.UndefOr[RecurrenceSegment],
      dayOfWeek: js.UndefOr[RecurrenceSegment],
      hour: js.UndefOr[RecurrenceSegment],
      minute: js.UndefOr[RecurrenceSegment],
      second: js.UndefOr[RecurrenceSegment],
      tz: js.UndefOr[Timezone]
    ) = this()
    
    /**
      * Day of the month.
      */
    var date: RecurrenceSegment = js.native
    
    var dayOfWeek: RecurrenceSegment = js.native
    
    var hour: RecurrenceSegment = js.native
    
    var minute: RecurrenceSegment = js.native
    
    var month: RecurrenceSegment = js.native
    
    def nextInvocationDate(base: Date): Date = js.native
    
    var second: RecurrenceSegment = js.native
    
    var tz: Timezone = js.native
    
    var year: RecurrenceSegment = js.native
  }
  
  inline def cancelJob(job: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelJob")(job.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def cancelJob(job: Job): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelJob")(job.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def rescheduleJob(job: String, spec: String): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: String, spec: RecurrenceRule): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: String, spec: RecurrenceSpecDateRange): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: String, spec: RecurrenceSpecObjLit): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: String, spec: Date): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: Job, spec: String): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: Job, spec: RecurrenceRule): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: Job, spec: RecurrenceSpecDateRange): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: Job, spec: RecurrenceSpecObjLit): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def rescheduleJob(job: Job, spec: Date): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("rescheduleJob")(job.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Job]
  
  inline def scheduleJob(name: String, rule: String, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(name.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(name: String, rule: Double, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(name.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(name: String, rule: RecurrenceRule, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(name.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(name: String, rule: RecurrenceSpecDateRange, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(name.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(name: String, rule: RecurrenceSpecObjLit, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(name.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(name: String, rule: Date, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(name.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(rule: String, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(rule: Double, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(rule: RecurrenceRule, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(rule: RecurrenceSpecDateRange, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(rule: RecurrenceSpecObjLit, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  inline def scheduleJob(rule: Date, callback: JobCallback): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleJob")(rule.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Job]
  
  type JobCallback = js.Function1[/* fireDate */ Date, Unit]
  
  type Recurrence = Double | Range | String
  
  type RecurrenceSegment = Recurrence | js.Array[Recurrence]
  
  trait RecurrenceSpecDateRange extends StObject {
    
    /**
      * Ending date in date range.
      */
    var end: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * Cron expression string.
      */
    var rule: String
    
    /**
      * Starting date in date range.
      */
    var start: js.UndefOr[Date | String | Double] = js.undefined
    
    /**
      * Timezone
      */
    var tz: js.UndefOr[Timezone] = js.undefined
  }
  object RecurrenceSpecDateRange {
    
    inline def apply(rule: String): RecurrenceSpecDateRange = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecurrenceSpecDateRange]
    }
    
    extension [Self <: RecurrenceSpecDateRange](x: Self) {
      
      inline def setEnd(value: Date | String | Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Date | String | Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTz(value: Timezone): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
    }
  }
  
  trait RecurrenceSpecObjLit extends StObject {
    
    /**
      * Day of the month.
      */
    var date: js.UndefOr[RecurrenceSegment] = js.undefined
    
    var dayOfWeek: js.UndefOr[RecurrenceSegment] = js.undefined
    
    var hour: js.UndefOr[RecurrenceSegment] = js.undefined
    
    var minute: js.UndefOr[RecurrenceSegment] = js.undefined
    
    var month: js.UndefOr[RecurrenceSegment] = js.undefined
    
    var second: js.UndefOr[RecurrenceSegment] = js.undefined
    
    /**
      * Timezone
      */
    var tz: js.UndefOr[Timezone] = js.undefined
    
    var year: js.UndefOr[RecurrenceSegment] = js.undefined
  }
  object RecurrenceSpecObjLit {
    
    inline def apply(): RecurrenceSpecObjLit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecurrenceSpecObjLit]
    }
    
    extension [Self <: RecurrenceSpecObjLit](x: Self) {
      
      inline def setDate(value: RecurrenceSegment): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDateVarargs(value: Recurrence*): Self = StObject.set(x, "date", js.Array(value :_*))
      
      inline def setDayOfWeek(value: RecurrenceSegment): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
      
      inline def setDayOfWeekVarargs(value: Recurrence*): Self = StObject.set(x, "dayOfWeek", js.Array(value :_*))
      
      inline def setHour(value: RecurrenceSegment): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      inline def setHourVarargs(value: Recurrence*): Self = StObject.set(x, "hour", js.Array(value :_*))
      
      inline def setMinute(value: RecurrenceSegment): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      inline def setMinuteVarargs(value: Recurrence*): Self = StObject.set(x, "minute", js.Array(value :_*))
      
      inline def setMonth(value: RecurrenceSegment): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      inline def setMonthVarargs(value: Recurrence*): Self = StObject.set(x, "month", js.Array(value :_*))
      
      inline def setSecond(value: RecurrenceSegment): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setSecondVarargs(value: Recurrence*): Self = StObject.set(x, "second", js.Array(value :_*))
      
      inline def setTz(value: Timezone): Self = StObject.set(x, "tz", value.asInstanceOf[js.Any])
      
      inline def setTzUndefined: Self = StObject.set(x, "tz", js.undefined)
      
      inline def setYear(value: RecurrenceSegment): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      
      inline def setYearVarargs(value: Recurrence*): Self = StObject.set(x, "year", js.Array(value :_*))
    }
  }
  
  type Timezone = String
}

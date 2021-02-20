package typings.meteorSjobs

import org.scalablytyped.runtime.StringDictionary
import typings.meteorSjobs.meteorSjobsBooleans.`false`
import typings.meteorSjobs.meteorSjobsBooleans.`true`
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-single-declare-module
object mod {
  
  @JSImport("meteor/msavin:sjobs", "JobContext")
  @js.native
  class JobContext () extends StObject {
    
    /** Access the cached document of the current job. */
    def document(): Job = js.native
    
    /** Mark the job as having failed. */
    def failure(): js.Object = js.native
    def failure(result: js.Any): js.Object = js.native
    
    // returns Mongo WriteResult object
    /** get a persistent value from key */
    def get(key: String): js.Any = js.native
    
    /** Remove the job from the collection. */
    def remove(): Double = js.native
    
    // returns Mongo WriteResult object
    /** Replicate the job with the same arguments. */
    def replicate(): Job = js.native
    def replicate(config: JobRunConfigObject): Job = js.native
    
    // returns Mongo WriteResult object
    /** Tell the job to run again later. */
    def reschedule(): js.Object = js.native
    def reschedule(config: JobRunConfigObject): js.Object = js.native
    
    /** Sets a persistent key/value pair */
    def set(key: String, value: js.Any): js.Object = js.native
    
    /** Mark the job as successful. */
    def success(): js.Object = js.native
  }
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("meteor/msavin:sjobs", "Jobs")
  @js.native
  class Jobs () extends StObject
  object Jobs {
    
    @JSImport("meteor/msavin:sjobs", "Jobs")
    @js.native
    val ^ : js.Any = js.native
    
    /** Allows you to cancel a job if it has not run already. */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.cancel")
    @js.native
    def cancel: js.Function1[/* jobId */ String, Unit] = js.native
    @scala.inline
    def cancel_=(x: js.Function1[/* jobId */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
    
    /**
      * Allows you to clear all or some of the jobs in your database. It supports State for selecting a job state,
      *  You can add the name arguments to specify a specific queue. You can also call an optional callback.
      */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.clear")
    @js.native
    def clear: js.Function3[
        /* state */ State, 
        /* name */ js.UndefOr[String], 
        /* cb */ js.UndefOr[js.Function1[/* args */ js.Any, js.Any]], 
        Double
      ] = js.native
    @scala.inline
    def clear_=(
      x: js.Function3[
          /* state */ State, 
          /* name */ js.UndefOr[String], 
          /* cb */ js.UndefOr[js.Function1[/* args */ js.Any, js.Any]], 
          Double
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    /**
      * Allows you to configure how the package should work. You can figure one option or all of them.
      * All the options are pre-configured in ./package/server/imports/utilities/config.js.
      */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.configure")
    @js.native
    def configure: js.Function1[/* options */ Options, Unit] = js.native
    @scala.inline
    def configure_=(x: js.Function1[/* options */ Options, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configure")(x.asInstanceOf[js.Any])
    
    /** Allows you to run a job ahead of its due date. It can only work on jobs that have not been resolved. */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.execute")
    @js.native
    def execute: js.Function1[/* docId */ String, Unit] = js.native
    @scala.inline
    def execute_=(x: js.Function1[/* docId */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("execute")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.find")
    @js.native
    def find: js.Function1[/* repeated */ js.Any, `false` | Unit] = js.native
    @scala.inline
    def find_=(x: js.Function1[/* repeated */ js.Any, `false` | Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("find")(x.asInstanceOf[js.Any])
    
    /**  allows you to get a job document by its document id. */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.get")
    @js.native
    def get: js.Function1[/* docId */ String, Job] = js.native
    @scala.inline
    def get_=(x: js.Function1[/* docId */ String, Job]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    /**
      * Allows you to register logic for a job. Once registered, the package will start a queue to look for and execute jobs
      *  as appropriate, and you will be able to run jobs with Jobs.run .
      */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.register")
    @js.native
    def register: js.Function1[/* job */ JobDefinition, Unit] = js.native
    @scala.inline
    def register_=(x: js.Function1[/* job */ JobDefinition, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
    
    /** Allows you to replicate a job. */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.replicate")
    @js.native
    def replicate: js.Function2[/* jobId */ String, /* config */ js.UndefOr[JobRunConfigObject], Unit] = js.native
    @scala.inline
    def replicate_=(x: js.Function2[/* jobId */ String, /* config */ js.UndefOr[JobRunConfigObject], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replicate")(x.asInstanceOf[js.Any])
    
    /** Allows you to reschedule a job. It can only work on jobs that have not been resolved. */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.reschedule")
    @js.native
    def reschedule: js.Function2[/* jobId */ String, /* config */ js.UndefOr[JobRunConfigObject], Unit] = js.native
    @scala.inline
    def reschedule_=(x: js.Function2[/* jobId */ String, /* config */ js.UndefOr[JobRunConfigObject], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reschedule")(x.asInstanceOf[js.Any])
    
    /**
      * Allows you to schedule a job to run. You call it by specifying the job name and its arguments.
      * At the end, you can pass in a special configuration object. Otherwise, it will be scheduled to run as soon as possible.
      */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.run")
    @js.native
    def run: js.Function2[/* jobname */ String, /* repeated */ js.Any, Unit] = js.native
    @scala.inline
    def run_=(x: js.Function2[/* jobname */ String, /* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("run")(x.asInstanceOf[js.Any])
    
    /**
      * Allows you start all the queues. If you call the function with no arguments, it will start all the queues.
      * If you pass in a string, it will start a queue with that name.
      * If you pass in an array, it will loop over the items in it, and treat them like a string.
      */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.start")
    @js.native
    def start: js.Function1[/* queueName */ js.UndefOr[String | js.Array[js.Any]], Unit] = js.native
    @scala.inline
    def start_=(x: js.Function1[/* queueName */ js.UndefOr[String | js.Array[js.Any]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
    
    /**
      * Allows you stop all the queues. If you call the function with no arguments, it will stop all the queues.
      * If you pass in a string, it will stop a queue with that name.
      * If you pass in an array, it will loop over the items in it, and treat them like a string.
      */
    /* static member */
    @JSImport("meteor/msavin:sjobs", "Jobs.stop")
    @js.native
    def stop: js.Function1[/* queueName */ js.UndefOr[String | js.Array[js.Any]], Unit] = js.native
    @scala.inline
    def stop_=(x: js.Function1[/* queueName */ js.UndefOr[String | js.Array[js.Any]], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stop")(x.asInstanceOf[js.Any])
  }
  
  /**
    * The supported fields for in and on can be used in singular and/or plural versions.
    * The date object will be updated in the order that is specified.
    */
  @js.native
  trait CfgTimeObject extends StObject {
    
    var day: js.UndefOr[Double] = js.native
    
    var days: js.UndefOr[Double] = js.native
    
    var hour: js.UndefOr[Double] = js.native
    
    var hours: js.UndefOr[Double] = js.native
    
    var milisecond: js.UndefOr[Double] = js.native
    
    var miliseconds: js.UndefOr[Double] = js.native
    
    var minute: js.UndefOr[Double] = js.native
    
    var minutes: js.UndefOr[Double] = js.native
    
    var month: js.UndefOr[Double] = js.native
    
    var months: js.UndefOr[Double] = js.native
    
    var second: js.UndefOr[Double] = js.native
    
    var seconds: js.UndefOr[Double] = js.native
    
    var year: js.UndefOr[Double] = js.native
    
    var years: js.UndefOr[Double] = js.native
  }
  object CfgTimeObject {
    
    @scala.inline
    def apply(): CfgTimeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CfgTimeObject]
    }
    
    @scala.inline
    implicit class CfgTimeObjectMutableBuilder[Self <: CfgTimeObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMilisecond(value: Double): Self = StObject.set(x, "milisecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilisecondUndefined: Self = StObject.set(x, "milisecond", js.undefined)
      
      @scala.inline
      def setMiliseconds(value: Double): Self = StObject.set(x, "miliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilisecondsUndefined: Self = StObject.set(x, "miliseconds", js.undefined)
      
      @scala.inline
      def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      
      @scala.inline
      def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
  
  @js.native
  trait HistoryItem extends StObject {
    
    var date: Date = js.native
    
    var newDue: js.UndefOr[Date] = js.native
    
    var serverId: String = js.native
    
    var state: js.UndefOr[JobState] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object HistoryItem {
    
    @scala.inline
    def apply(date: Date, serverId: String): HistoryItem = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryItem]
    }
    
    @scala.inline
    implicit class HistoryItemMutableBuilder[Self <: HistoryItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewDue(value: Date): Self = StObject.set(x, "newDue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewDueUndefined: Self = StObject.set(x, "newDue", js.undefined)
      
      @scala.inline
      def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: JobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Job extends StObject {
    
    var _id: js.UndefOr[String] = js.native
    
    var arguments: js.Array[_] = js.native
    
    var created: Date = js.native
    
    var data: js.Any = js.native
    
    var due: Date = js.native
    
    var history: js.Array[HistoryItem] = js.native
    
    var name: String = js.native
    
    var priority: Double = js.native
    
    var serverId: String = js.native
    
    var state: JobState = js.native
  }
  object Job {
    
    @scala.inline
    def apply(
      arguments: js.Array[_],
      created: Date,
      data: js.Any,
      due: Date,
      history: js.Array[HistoryItem],
      name: String,
      priority: Double,
      serverId: String,
      state: JobState
    ): Job = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], due = due.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Job]
    }
    
    @scala.inline
    implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: js.Array[_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDue(value: Date): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistory(value: js.Array[HistoryItem]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryVarargs(value: HistoryItem*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: JobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    }
  }
  
  type JobDefinition = StringDictionary[js.ThisFunction1[/* this */ JobContext, /* repeated */ js.Any, Unit]]
  
  @js.native
  trait JobRunConfigObject extends StObject {
    
    /** Run a callback function after scheduling the job. */
    var callback: js.UndefOr[js.Function2[/* error */ `true` | Null, /* result */ Job, _]] = js.native
    
    /** Provide your own date. This stacks with the in and on operator, and will be applied before they perform their operations. */
    var date: js.UndefOr[js.Function0[Date]] = js.native
    
    /** Will schedule the job at a later time, using the current time and your inputs to calculate the due time. */
    var in: js.UndefOr[CfgTimeObject] = js.native
    
    /** Overrides the current time with your inputs */
    var on: js.UndefOr[CfgTimeObject] = js.native
    
    /**
      * The default priority for each job is 0, if set to a positive integer, it will run ahead of other jobs.
      * If set to a negative integer, it will only run after all the zero or positive jobs have completed.
      */
    var priority: js.UndefOr[Double] = js.native
    
    /** If a job is marked as singular, it will only be scheduled if no other job is pending with the same arguments. */
    var singular: js.UndefOr[Boolean] = js.native
    
    /** If a job is marked as unique, it will only be scheduled if no other job exists with the same arguments. */
    var unique: js.UndefOr[Boolean] = js.native
  }
  object JobRunConfigObject {
    
    @scala.inline
    def apply(): JobRunConfigObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobRunConfigObject]
    }
    
    @scala.inline
    implicit class JobRunConfigObjectMutableBuilder[Self <: JobRunConfigObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* error */ `true` | Null, /* result */ Job) => _): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDate(value: () => Date): Self = StObject.set(x, "date", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setIn(value: CfgTimeObject): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setOn(value: CfgTimeObject): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setSingular(value: Boolean): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.meteorSjobs.meteorSjobsStrings.pending
    - typings.meteorSjobs.meteorSjobsStrings.success
    - typings.meteorSjobs.meteorSjobsStrings.failure
  */
  trait JobState extends StObject
  object JobState {
    
    @scala.inline
    def failure: typings.meteorSjobs.meteorSjobsStrings.failure = "failure".asInstanceOf[typings.meteorSjobs.meteorSjobsStrings.failure]
    
    @scala.inline
    def pending: typings.meteorSjobs.meteorSjobsStrings.pending = "pending".asInstanceOf[typings.meteorSjobs.meteorSjobsStrings.pending]
    
    @scala.inline
    def success: typings.meteorSjobs.meteorSjobsStrings.success = "success".asInstanceOf[typings.meteorSjobs.meteorSjobsStrings.success]
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Specify if the package should automatically delete internal data (not job related). */
    var autoPurge: js.UndefOr[Boolean] = js.native
    
    /** Specify if the package should retry failed jobs whenever a new server takes control. */
    var autoRetry: js.UndefOr[Boolean] = js.native
    
    /** Specify if the package should start automatically on Meteor.startup. */
    var autoStart: js.UndefOr[Boolean] = js.native
    
    /**  development mode assumes that only one server is running, and that it is the active one. */
    var disableDevelopmentMode: js.UndefOr[Boolean] = js.native
    
    /** Determine how to get the current date, if for whatever reason, new Date() is not suitable */
    var getDate: js.UndefOr[js.Function0[Date]] = js.native
    
    var gracePeriod: js.UndefOr[Double] = js.native
    
    /**  Specify how often the package should check for due jobs. */
    var interval: js.UndefOr[Double] = js.native
    
    /** Determine how to log the package outputs */
    var log: js.UndefOr[js.Function1[/* messages */ String | js.Object, Unit]] = js.native
    
    /** Specify how long the server could be inactive before another server takes on the master role. */
    var maxWait: js.UndefOr[Double] = js.native
    
    /** Store jobs data in a remote collection. */
    var remoteCollection: js.UndefOr[String] = js.native
    
    /** Determine how to set the serverId - for example, you can have the package use your hosts deployment id */
    var setServerId: js.UndefOr[js.Function0[String]] = js.native
    
    /** Specify how long after server startup the package should start running. */
    var startupDelay: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoPurge(value: Boolean): Self = StObject.set(x, "autoPurge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPurgeUndefined: Self = StObject.set(x, "autoPurge", js.undefined)
      
      @scala.inline
      def setAutoRetry(value: Boolean): Self = StObject.set(x, "autoRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRetryUndefined: Self = StObject.set(x, "autoRetry", js.undefined)
      
      @scala.inline
      def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      @scala.inline
      def setDisableDevelopmentMode(value: Boolean): Self = StObject.set(x, "disableDevelopmentMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDevelopmentModeUndefined: Self = StObject.set(x, "disableDevelopmentMode", js.undefined)
      
      @scala.inline
      def setGetDate(value: () => Date): Self = StObject.set(x, "getDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDateUndefined: Self = StObject.set(x, "getDate", js.undefined)
      
      @scala.inline
      def setGracePeriod(value: Double): Self = StObject.set(x, "gracePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGracePeriodUndefined: Self = StObject.set(x, "gracePeriod", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLog(value: /* messages */ String | js.Object => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      @scala.inline
      def setRemoteCollection(value: String): Self = StObject.set(x, "remoteCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteCollectionUndefined: Self = StObject.set(x, "remoteCollection", js.undefined)
      
      @scala.inline
      def setSetServerId(value: () => String): Self = StObject.set(x, "setServerId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetServerIdUndefined: Self = StObject.set(x, "setServerId", js.undefined)
      
      @scala.inline
      def setStartupDelay(value: Double): Self = StObject.set(x, "startupDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartupDelayUndefined: Self = StObject.set(x, "startupDelay", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.meteorSjobs.meteorSjobsStrings.pending
    - typings.meteorSjobs.meteorSjobsStrings.success
    - typings.meteorSjobs.meteorSjobsStrings.failure
    - typings.meteorSjobs.meteorSjobsStrings.Asterisk
  */
  trait State extends StObject
  object State {
    
    @scala.inline
    def Asterisk: typings.meteorSjobs.meteorSjobsStrings.Asterisk = "*".asInstanceOf[typings.meteorSjobs.meteorSjobsStrings.Asterisk]
    
    @scala.inline
    def failure: typings.meteorSjobs.meteorSjobsStrings.failure = "failure".asInstanceOf[typings.meteorSjobs.meteorSjobsStrings.failure]
    
    @scala.inline
    def pending: typings.meteorSjobs.meteorSjobsStrings.pending = "pending".asInstanceOf[typings.meteorSjobs.meteorSjobsStrings.pending]
    
    @scala.inline
    def success: typings.meteorSjobs.meteorSjobsStrings.success = "success".asInstanceOf[typings.meteorSjobs.meteorSjobsStrings.success]
  }
}

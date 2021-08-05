package typings.nodeResque

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.nodeResque.anon.Args
import typings.nodeResque.anon.RTimestamp
import typings.nodeResque.nodeResqueStrings.cleanStuckWorker
import typings.nodeResque.nodeResqueStrings.cleaning_worker
import typings.nodeResque.nodeResqueStrings.end
import typings.nodeResque.nodeResqueStrings.error
import typings.nodeResque.nodeResqueStrings.failure
import typings.nodeResque.nodeResqueStrings.job
import typings.nodeResque.nodeResqueStrings.master
import typings.nodeResque.nodeResqueStrings.pause
import typings.nodeResque.nodeResqueStrings.ping
import typings.nodeResque.nodeResqueStrings.poll
import typings.nodeResque.nodeResqueStrings.reEnqueue
import typings.nodeResque.nodeResqueStrings.start
import typings.nodeResque.nodeResqueStrings.success
import typings.nodeResque.nodeResqueStrings.transferredJob
import typings.nodeResque.nodeResqueStrings.workingTimestamp
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-resque", "Connection")
  @js.native
  class Connection protected () extends EventEmitter {
    def this(options: ConnectionOptions) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
  }
  
  @JSImport("node-resque", "Queue")
  @js.native
  class Queue protected () extends EventEmitter {
    def this(options: QueueOptions) = this()
    def this(options: QueueOptions, jobs: JobsHash) = this()
    
    def allDelayed(): js.Promise[js.Array[Double]] = js.native
    
    def allWorkingOn(): js.Promise[StringDictionary[WorkerStatus]] = js.native
    
    def cleanOldWorkers(age: Double): js.Promise[StringDictionary[ErrorPayload] | js.Object] = js.native
    
    def connect(): js.Promise[Unit] = js.native
    
    def del(queue: String, jobName: String): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: js.Array[js.Any]): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: js.Array[js.Any], count: Double): js.Promise[Double] = js.native
    def del(queue: String, jobName: String, args: Unit, count: Double): js.Promise[Double] = js.native
    
    def delDelayed(queue: String, jobName: String): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: js.Array[js.Any]): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: js.Array[js.Any], count: Double): js.Promise[js.Array[Double]] = js.native
    def delDelayed(queue: String, jobName: String, args: Unit, count: Double): js.Promise[js.Array[Double]] = js.native
    
    def delLock(lockName: String): js.Promise[Double] = js.native
    
    def delQueue(queue: String): js.Promise[Unit] = js.native
    
    def delayedAt(timestamp: Double): js.Promise[RTimestamp] = js.native
    
    def encode(queue: String, jobName: String): String = js.native
    def encode(queue: String, jobName: String, args: js.Array[js.Any]): String = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    def enqueue(queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueue(queue: String, jobName: String, args: js.Array[js.Any]): js.Promise[Unit] = js.native
    
    def enqueueAt(timestamp: Double, queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueueAt(timestamp: Double, queue: String, jobName: String, args: js.Array[js.Any]): js.Promise[Unit] = js.native
    
    def enqueueIn(milliseconds: Double, queue: String, jobName: String): js.Promise[Unit] = js.native
    def enqueueIn(milliseconds: Double, queue: String, jobName: String, args: js.Array[js.Any]): js.Promise[Unit] = js.native
    
    def failed(start: Double, stop: Double): js.Promise[js.Array[ErrorPayload]] = js.native
    
    def failedCount(): js.Promise[Double] = js.native
    
    def forceCleanWorker(workerName: String): js.Promise[js.Array[ErrorPayload] | Unit] = js.native
    
    def length(queue: String): js.Promise[Double] = js.native
    
    def locks(): js.Promise[StringDictionary[String]] = js.native
    
    @JSName("on")
    def on_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
    
    @JSName("once")
    def once_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
    
    def queued(queue: String, start: Double, stop: Double): js.Promise[js.Array[Job[js.Any]]] = js.native
    
    def queues(): js.Promise[js.Array[String]] = js.native
    
    def removeFailed(failedJob: ErrorPayload): js.Promise[Unit] = js.native
    
    def retryAndRemoveFailed(failedJob: ErrorPayload): js.Promise[Unit] = js.native
    
    def scheduledAt(queue: String, jobName: String): js.Promise[js.Array[Double]] = js.native
    def scheduledAt(queue: String, jobName: String, args: js.Array[js.Any]): js.Promise[js.Array[Double]] = js.native
    
    def stats(): js.Promise[js.Any] = js.native
    
    def timestamps(): js.Promise[js.Array[Double]] = js.native
    
    def workers(): js.Promise[StringDictionary[String]] = js.native
    
    def workingOn(workerName: String, queues: js.Array[String]): js.Promise[WorkerStatus] = js.native
  }
  
  @JSImport("node-resque", "Scheduler")
  @js.native
  class Scheduler protected () extends EventEmitter {
    def this(options: SchedulerOptions) = this()
    def this(options: SchedulerOptions, jobs: JobsHash) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_cleanStuckWorker(
      event: cleanStuckWorker,
      cb: js.Function3[/* workerName */ String, /* errorPayload */ ErrorPayload, /* delta */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_master(event: master, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_poll(event: poll, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_transferredJob(event: transferredJob, cb: js.Function2[/* timestamp */ Double, /* job */ Job[js.Any], Unit]): this.type = js.native
    @JSName("on")
    def on_workingTimestamp(event: workingTimestamp, cb: js.Function1[/* timestamp */ Double, Unit]): this.type = js.native
    
    @JSName("once")
    def once_cleanStuckWorker(
      event: cleanStuckWorker,
      cb: js.Function3[/* workerName */ String, /* errorPayload */ ErrorPayload, /* delta */ Double, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.Function2[/* error */ Error, /* queue */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_master(event: master, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_poll(event: poll, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_transferredJob(event: transferredJob, cb: js.Function2[/* timestamp */ Double, /* job */ Job[js.Any], Unit]): this.type = js.native
    @JSName("once")
    def once_workingTimestamp(event: workingTimestamp, cb: js.Function1[/* timestamp */ Double, Unit]): this.type = js.native
    
    def removeAllListeners(event: SchedulerEvent): this.type = js.native
    
    def start(): js.Promise[Unit] = js.native
  }
  
  @JSImport("node-resque", "Worker")
  @js.native
  class Worker protected () extends EventEmitter {
    def this(options: WorkerOptions) = this()
    def this(options: WorkerOptions, jobs: JobsHash) = this()
    
    def connect(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function3[/* error */ Error, /* queue */ String, /* job */ Job[js.Any], Unit]): this.type = js.native
    @JSName("on")
    def on_failure(
      event: failure,
      cb: js.Function3[/* queue */ String, /* job */ Job[js.Any], /* failure */ js.Any, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[js.Any], Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_reEnqueue(
      event: reEnqueue,
      cb: js.Function3[/* queue */ String, /* job */ Job[js.Any], /* plugin */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_success(
      event: success,
      cb: js.Function3[/* queue */ String, /* job */ Job[js.Any], /* result */ js.Any, Unit]
    ): this.type = js.native
    
    @JSName("once")
    def once_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.Function3[/* error */ Error, /* queue */ String, /* job */ Job[js.Any], Unit]): this.type = js.native
    @JSName("once")
    def once_failure(
      event: failure,
      cb: js.Function3[/* queue */ String, /* job */ Job[js.Any], /* failure */ js.Any, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[js.Any], Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
    @JSName("once")
    def once_reEnqueue(
      event: reEnqueue,
      cb: js.Function3[/* queue */ String, /* job */ Job[js.Any], /* plugin */ String, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_success(
      event: success,
      cb: js.Function3[/* queue */ String, /* job */ Job[js.Any], /* result */ js.Any, Unit]
    ): this.type = js.native
    
    def removeAllListeners(event: WorkerEvent): this.type = js.native
    
    def start(): js.Promise[Unit] = js.native
  }
  
  trait ConnectionOptions extends StObject {
    
    var database: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var looping: js.UndefOr[Boolean] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var pkg: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var redis: js.UndefOr[js.Any] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setDatabase(value: Double): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLooping(value: Boolean): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      inline def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRedis(value: js.Any): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
      
      inline def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
    }
  }
  
  trait ErrorPayload extends StObject {
    
    var backtrace: js.Array[String] | Null
    
    var error: String
    
    var exception: String
    
    var failed_at: String
    
    var payload: js.Any
    
    var queue: String
    
    var worker: String
  }
  object ErrorPayload {
    
    inline def apply(
      error: String,
      exception: String,
      failed_at: String,
      payload: js.Any,
      queue: String,
      worker: String
    ): ErrorPayload = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], exception = exception.asInstanceOf[js.Any], failed_at = failed_at.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any], backtrace = null)
      __obj.asInstanceOf[ErrorPayload]
    }
    
    extension [Self <: ErrorPayload](x: Self) {
      
      inline def setBacktrace(value: js.Array[String]): Self = StObject.set(x, "backtrace", value.asInstanceOf[js.Any])
      
      inline def setBacktraceNull: Self = StObject.set(x, "backtrace", null)
      
      inline def setBacktraceVarargs(value: String*): Self = StObject.set(x, "backtrace", js.Array(value :_*))
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
      
      inline def setFailed_at(value: String): Self = StObject.set(x, "failed_at", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
  
  trait Job[TResult] extends StObject {
    
    def perform(args: js.Any*): js.Promise[TResult]
    
    var pluginOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Job {
    
    inline def apply[TResult](perform: /* repeated */ js.Any => js.Promise[TResult]): Job[TResult] = {
      val __obj = js.Dynamic.literal(perform = js.Any.fromFunction1(perform))
      __obj.asInstanceOf[Job[TResult]]
    }
    
    extension [Self <: Job[?], TResult](x: Self & Job[TResult]) {
      
      inline def setPerform(value: /* repeated */ js.Any => js.Promise[TResult]): Self = StObject.set(x, "perform", js.Any.fromFunction1(value))
      
      inline def setPluginOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "pluginOptions", value.asInstanceOf[js.Any])
      
      inline def setPluginOptionsUndefined: Self = StObject.set(x, "pluginOptions", js.undefined)
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    }
  }
  
  type JobsHash = StringDictionary[Job[js.Any]]
  
  trait QueueOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.undefined
  }
  object QueueOptions {
    
    inline def apply(): QueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueOptions]
    }
    
    extension [Self <: QueueOptions](x: Self) {
      
      inline def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeResque.nodeResqueStrings.start
    - typings.nodeResque.nodeResqueStrings.end
    - typings.nodeResque.nodeResqueStrings.poll
    - typings.nodeResque.nodeResqueStrings.master
    - typings.nodeResque.nodeResqueStrings.cleanStuckWorker
    - typings.nodeResque.nodeResqueStrings.error
    - typings.nodeResque.nodeResqueStrings.workingTimestamp
    - typings.nodeResque.nodeResqueStrings.transferredJob
  */
  trait SchedulerEvent extends StObject
  object SchedulerEvent {
    
    inline def cleanStuckWorker: typings.nodeResque.nodeResqueStrings.cleanStuckWorker = "cleanStuckWorker".asInstanceOf[typings.nodeResque.nodeResqueStrings.cleanStuckWorker]
    
    inline def end: typings.nodeResque.nodeResqueStrings.end = "end".asInstanceOf[typings.nodeResque.nodeResqueStrings.end]
    
    inline def error: typings.nodeResque.nodeResqueStrings.error = "error".asInstanceOf[typings.nodeResque.nodeResqueStrings.error]
    
    inline def master: typings.nodeResque.nodeResqueStrings.master = "master".asInstanceOf[typings.nodeResque.nodeResqueStrings.master]
    
    inline def poll: typings.nodeResque.nodeResqueStrings.poll = "poll".asInstanceOf[typings.nodeResque.nodeResqueStrings.poll]
    
    inline def start: typings.nodeResque.nodeResqueStrings.start = "start".asInstanceOf[typings.nodeResque.nodeResqueStrings.start]
    
    inline def transferredJob: typings.nodeResque.nodeResqueStrings.transferredJob = "transferredJob".asInstanceOf[typings.nodeResque.nodeResqueStrings.transferredJob]
    
    inline def workingTimestamp: typings.nodeResque.nodeResqueStrings.workingTimestamp = "workingTimestamp".asInstanceOf[typings.nodeResque.nodeResqueStrings.workingTimestamp]
  }
  
  trait SchedulerOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.undefined
    
    var masterLockTimeout: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var stuckWorkerTimeout: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object SchedulerOptions {
    
    inline def apply(): SchedulerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchedulerOptions]
    }
    
    extension [Self <: SchedulerOptions](x: Self) {
      
      inline def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setMasterLockTimeout(value: Double): Self = StObject.set(x, "masterLockTimeout", value.asInstanceOf[js.Any])
      
      inline def setMasterLockTimeoutUndefined: Self = StObject.set(x, "masterLockTimeout", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setStuckWorkerTimeout(value: Double): Self = StObject.set(x, "stuckWorkerTimeout", value.asInstanceOf[js.Any])
      
      inline def setStuckWorkerTimeoutUndefined: Self = StObject.set(x, "stuckWorkerTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeResque.nodeResqueStrings.start
    - typings.nodeResque.nodeResqueStrings.end
    - typings.nodeResque.nodeResqueStrings.cleaning_worker
    - typings.nodeResque.nodeResqueStrings.poll
    - typings.nodeResque.nodeResqueStrings.ping
    - typings.nodeResque.nodeResqueStrings.job
    - typings.nodeResque.nodeResqueStrings.reEnqueue
    - typings.nodeResque.nodeResqueStrings.success
    - typings.nodeResque.nodeResqueStrings.failure
    - typings.nodeResque.nodeResqueStrings.error
    - typings.nodeResque.nodeResqueStrings.pause
  */
  trait WorkerEvent extends StObject
  object WorkerEvent {
    
    inline def cleaning_worker: typings.nodeResque.nodeResqueStrings.cleaning_worker = "cleaning_worker".asInstanceOf[typings.nodeResque.nodeResqueStrings.cleaning_worker]
    
    inline def end: typings.nodeResque.nodeResqueStrings.end = "end".asInstanceOf[typings.nodeResque.nodeResqueStrings.end]
    
    inline def error: typings.nodeResque.nodeResqueStrings.error = "error".asInstanceOf[typings.nodeResque.nodeResqueStrings.error]
    
    inline def failure: typings.nodeResque.nodeResqueStrings.failure = "failure".asInstanceOf[typings.nodeResque.nodeResqueStrings.failure]
    
    inline def job: typings.nodeResque.nodeResqueStrings.job = "job".asInstanceOf[typings.nodeResque.nodeResqueStrings.job]
    
    inline def pause: typings.nodeResque.nodeResqueStrings.pause = "pause".asInstanceOf[typings.nodeResque.nodeResqueStrings.pause]
    
    inline def ping: typings.nodeResque.nodeResqueStrings.ping = "ping".asInstanceOf[typings.nodeResque.nodeResqueStrings.ping]
    
    inline def poll: typings.nodeResque.nodeResqueStrings.poll = "poll".asInstanceOf[typings.nodeResque.nodeResqueStrings.poll]
    
    inline def reEnqueue: typings.nodeResque.nodeResqueStrings.reEnqueue = "reEnqueue".asInstanceOf[typings.nodeResque.nodeResqueStrings.reEnqueue]
    
    inline def start: typings.nodeResque.nodeResqueStrings.start = "start".asInstanceOf[typings.nodeResque.nodeResqueStrings.start]
    
    inline def success: typings.nodeResque.nodeResqueStrings.success = "success".asInstanceOf[typings.nodeResque.nodeResqueStrings.success]
  }
  
  trait WorkerOptions extends StObject {
    
    var connection: js.UndefOr[ConnectionOptions] = js.undefined
    
    var looping: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var queues: js.Array[String]
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object WorkerOptions {
    
    inline def apply(queues: js.Array[String]): WorkerOptions = {
      val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerOptions]
    }
    
    extension [Self <: WorkerOptions](x: Self) {
      
      inline def setConnection(value: ConnectionOptions): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setLooping(value: Boolean): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
      
      inline def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setQueues(value: js.Array[String]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
      
      inline def setQueuesVarargs(value: String*): Self = StObject.set(x, "queues", js.Array(value :_*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait WorkerStatus extends StObject {
    
    var payload: Args
    
    var queue: String
    
    var run_at: String
    
    var worker: String
  }
  object WorkerStatus {
    
    inline def apply(payload: Args, queue: String, run_at: String, worker: String): WorkerStatus = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], run_at = run_at.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerStatus]
    }
    
    extension [Self <: WorkerStatus](x: Self) {
      
      inline def setPayload(value: Args): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setRun_at(value: String): Self = StObject.set(x, "run_at", value.asInstanceOf[js.Any])
      
      inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
}

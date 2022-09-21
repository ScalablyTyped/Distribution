package typings.orchestrator

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Stream
import typings.orchestrator.anon.Dep
import typings.orchestrator.anon.MissingTasks
import typings.orchestrator.orchestratorStrings.`catch`
import typings.orchestrator.orchestratorStrings.callback
import typings.orchestrator.orchestratorStrings.promise
import typings.orchestrator.orchestratorStrings.stream
import typings.orchestrator.orchestratorStrings.sync
import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** A module for sequencing and executing tasks and dependencies in maximum concurrency
    */
  @JSImport("orchestrator", JSImport.Namespace)
  @js.native
  open class ^ () extends Orchestrator
  
  @js.native
  trait AddMethod extends StObject {
    
    /** Define a task
      * @param name The name of the task.
      * @param fn The function that performs the task's operations. For asynchronous tasks, you need to provide a hint when the task is complete:
      *  - Take in a callback
      *  - Return a stream or a promise
      */
    def apply(name: String): Orchestrator = js.native
    def apply(name: String, deps: js.Array[String]): Orchestrator = js.native
    def apply(name: String, deps: js.Array[String], fn: TaskFunc): Orchestrator = js.native
    def apply(name: String, deps: Unit, fn: TaskFunc): Orchestrator = js.native
    def apply(name: String, fn: TaskFunc): Orchestrator = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.orchestrator.orchestratorStrings.start
    - typings.orchestrator.orchestratorStrings.stop
    - typings.orchestrator.orchestratorStrings.err
    - typings.orchestrator.orchestratorStrings.task_start
    - typings.orchestrator.orchestratorStrings.task_stop
    - typings.orchestrator.orchestratorStrings.task_err
    - typings.orchestrator.orchestratorStrings.task_not_found
    - typings.orchestrator.orchestratorStrings.task_recursion
  */
  trait EventNames extends StObject
  object EventNames {
    
    inline def err: typings.orchestrator.orchestratorStrings.err = "err".asInstanceOf[typings.orchestrator.orchestratorStrings.err]
    
    inline def start: typings.orchestrator.orchestratorStrings.start = "start".asInstanceOf[typings.orchestrator.orchestratorStrings.start]
    
    inline def stop: typings.orchestrator.orchestratorStrings.stop = "stop".asInstanceOf[typings.orchestrator.orchestratorStrings.stop]
    
    inline def task_err: typings.orchestrator.orchestratorStrings.task_err = "task_err".asInstanceOf[typings.orchestrator.orchestratorStrings.task_err]
    
    inline def task_not_found: typings.orchestrator.orchestratorStrings.task_not_found = "task_not_found".asInstanceOf[typings.orchestrator.orchestratorStrings.task_not_found]
    
    inline def task_recursion: typings.orchestrator.orchestratorStrings.task_recursion = "task_recursion".asInstanceOf[typings.orchestrator.orchestratorStrings.task_recursion]
    
    inline def task_start: typings.orchestrator.orchestratorStrings.task_start = "task_start".asInstanceOf[typings.orchestrator.orchestratorStrings.task_start]
    
    inline def task_stop: typings.orchestrator.orchestratorStrings.task_stop = "task_stop".asInstanceOf[typings.orchestrator.orchestratorStrings.task_stop]
  }
  
  trait Meta extends StObject {
    
    var duration: Double
    
    var hrDuration: js.Tuple2[Double, Double]
    
    var runMethod: callback | `catch` | promise | stream | sync
  }
  object Meta {
    
    inline def apply(
      duration: Double,
      hrDuration: js.Tuple2[Double, Double],
      runMethod: callback | `catch` | promise | stream | sync
    ): Meta = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], hrDuration = hrDuration.asInstanceOf[js.Any], runMethod = runMethod.asInstanceOf[js.Any])
      __obj.asInstanceOf[Meta]
    }
    
    extension [Self <: Meta](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setHrDuration(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "hrDuration", value.asInstanceOf[js.Any])
      
      inline def setRunMethod(value: callback | `catch` | promise | stream | sync): Self = StObject.set(x, "runMethod", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnAllCallbackEvent
    extends StObject
       with OnCallbackEvent {
    
    var src: String
  }
  object OnAllCallbackEvent {
    
    inline def apply(err: Any, message: String, src: String, task: String): OnAllCallbackEvent = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnAllCallbackEvent]
    }
    
    extension [Self <: OnAllCallbackEvent](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnCallbackEvent extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var err: Any
    
    var message: String
    
    var task: String
  }
  object OnCallbackEvent {
    
    inline def apply(err: Any, message: String, task: String): OnCallbackEvent = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnCallbackEvent]
    }
    
    extension [Self <: OnCallbackEvent](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setErr(value: Any): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    }
  }
  
  /** A module for sequencing and executing tasks and dependencies in maximum concurrency
    */
  @js.native
  trait Orchestrator extends EventEmitter {
    
    def _emitTaskDone(task: Task, message: String): Unit = js.native
    def _emitTaskDone(task: Task, message: String, err: Any): Unit = js.native
    
    def _readyToRunTask(task: Task): Boolean = js.native
    
    def _resetAllTasks(): Unit = js.native
    
    def _resetSpecificTasks(names: js.Array[String]): Unit = js.native
    
    // probably supposed to be private methods, but still available on Orchestrator prototype
    def _resetTask(task: Task): Unit = js.native
    
    def _runStep(): Unit = js.native
    
    def _runTask(task: Task): Unit = js.native
    
    def _stopTask(task: Task, meta: Meta): Unit = js.native
    
    /** Define a task
      * @param name The name of the task.
      * @param fn The function that performs the task's operations. For asynchronous tasks, you need to provide a hint when the task is complete:
      *  - Take in a callback
      *  - Return a stream or a promise
      */
    def add(name: String): Orchestrator = js.native
    def add(name: String, deps: js.Array[String]): Orchestrator = js.native
    def add(name: String, deps: js.Array[String], fn: TaskFunc): Orchestrator = js.native
    def add(name: String, deps: Unit, fn: TaskFunc): Orchestrator = js.native
    def add(name: String, fn: TaskFunc): Orchestrator = js.native
    
    def allDone(): Boolean = js.native
    
    var doneCallback: js.UndefOr[js.Function1[/* error */ js.UndefOr[Any], Any]] = js.native
    
    /** Have you defined a task with this name?
      * @param name The task name to query
      */
    def hasTask(name: String): Boolean = js.native
    
    var isRunning: Boolean = js.native
    
    /** Listen to orchestrator internals
      * @param event Event name to listen to:
      *  - start: from start() method, shows you the task sequence
      *  - stop: from stop() method, the queue finished successfully
      *  - err: from stop() method, the queue was aborted due to a task error
      *  - task_start: from _runTask() method, task was started
      *  - task_stop: from _runTask() method, task completed successfully
      *  - task_err: from _runTask() method, task errored
      *  - task_not_found: from start() method, you're trying to start a task that doesn't exist
      *  - task_recursion: from start() method, there are recursive dependencies in your task list
      * @param cb Passes single argument: e: event details
      */
    def on(event: EventNames, cb: js.Function1[/* e */ OnCallbackEvent, Any]): this.type = js.native
    
    /** Listen to all orchestrator events from one callback
      * @param cb Passes single argument: e: event details
      */
    def onAll(cb: js.Function1[/* e */ OnAllCallbackEvent, Any]): Unit = js.native
    
    def reset(): Orchestrator = js.native
    
    var seq: js.Array[Any] = js.native
    
    def sequence(tasks: js.Array[Dep], names: js.Array[String]): MissingTasks = js.native
    @JSName("sequence")
    var sequence_Original: Sequencify = js.native
    
    // TODO: TypeScript 2.1.5 cannot express varargs followed by callback as a last argument...
    def start(task1: Strings, task2: Strings): Orchestrator = js.native
    def start(task1: Strings, task2: Strings, cb: js.Function1[/* error */ js.UndefOr[Any], Any]): Orchestrator = js.native
    def start(task1: Strings, task2: Strings, task3: Strings): Orchestrator = js.native
    def start(task1: Strings, task2: Strings, task3: Strings, cb: js.Function1[/* error */ js.UndefOr[Any], Any]): Orchestrator = js.native
    def start(task1: Strings, task2: Strings, task3: Strings, task4: Strings): Orchestrator = js.native
    def start(
      task1: Strings,
      task2: Strings,
      task3: Strings,
      task4: Strings,
      cb: js.Function1[/* error */ js.UndefOr[Any], Any]
    ): Orchestrator = js.native
    def start(task1: Strings, task2: Strings, task3: Strings, task4: Strings, task5: Strings): Orchestrator = js.native
    def start(
      task1: Strings,
      task2: Strings,
      task3: Strings,
      task4: Strings,
      task5: Strings,
      cb: js.Function1[/* error */ js.UndefOr[Any], Any]
    ): Orchestrator = js.native
    def start(task1: Strings, task2: Strings, task3: Strings, task4: Strings, task5: Strings, task6: Strings): Orchestrator = js.native
    def start(
      task1: Strings,
      task2: Strings,
      task3: Strings,
      task4: Strings,
      task5: Strings,
      task6: Strings,
      cb: js.Function1[/* error */ js.UndefOr[Any], Any]
    ): Orchestrator = js.native
    /** Start running the tasks
      * @param tasks Tasks to be executed. You may pass any number of tasks as individual arguments.
      * @param cb Callback to call after run completed.
      */
    def start(tasks: Strings*): Orchestrator = js.native
    /** Start running the tasks
      * @param tasks Tasks to be executed. You may pass any number of tasks as individual arguments.
      * @param cb Callback to call after run completed.
      */
    def start(tasks: Strings): Orchestrator = js.native
    def start(tasks: Strings, cb: js.Function1[/* error */ js.UndefOr[Any], Any]): Orchestrator = js.native
    @JSName("start")
    var start_Original: StartMethod = js.native
    
    def stop(): Unit = js.native
    def stop(err: Any): Unit = js.native
    def stop(err: Any, successfulFinish: Boolean): Unit = js.native
    def stop(err: Unit, successfulFinish: Boolean): Unit = js.native
    
    def task(name: String): Task = js.native
    def task(name: String, dep: js.Array[String], fn: TaskFunc): Unit = js.native
    def task(name: String, fn: TaskFunc): Unit = js.native
    
    var tasks: StringDictionary[Task] = js.native
  }
  
  /** The method export generated by orchestrator/lib/runTask.js */
  type RunTask = js.Function2[
    /* task */ TaskFunc, 
    /* done */ js.Function2[/* err */ Any, /* meta */ Meta, Unit], 
    Unit
  ]
  
  /** The module export of the sequencify package: https://www.npmjs.com/package/sequencify */
  type Sequencify = js.Function2[/* tasks */ js.Array[Dep], /* names */ js.Array[String], MissingTasks]
  
  /** Start running the tasks
    */
  @js.native
  trait StartMethod extends StObject {
    
    // TODO: TypeScript 2.1.5 cannot express varargs followed by callback as a last argument...
    def apply(task1: Strings, task2: Strings): Orchestrator = js.native
    def apply(task1: Strings, task2: Strings, cb: js.Function1[/* error */ js.UndefOr[Any], Any]): Orchestrator = js.native
    def apply(task1: Strings, task2: Strings, task3: Strings): Orchestrator = js.native
    def apply(task1: Strings, task2: Strings, task3: Strings, cb: js.Function1[/* error */ js.UndefOr[Any], Any]): Orchestrator = js.native
    def apply(task1: Strings, task2: Strings, task3: Strings, task4: Strings): Orchestrator = js.native
    def apply(
      task1: Strings,
      task2: Strings,
      task3: Strings,
      task4: Strings,
      cb: js.Function1[/* error */ js.UndefOr[Any], Any]
    ): Orchestrator = js.native
    def apply(task1: Strings, task2: Strings, task3: Strings, task4: Strings, task5: Strings): Orchestrator = js.native
    def apply(
      task1: Strings,
      task2: Strings,
      task3: Strings,
      task4: Strings,
      task5: Strings,
      cb: js.Function1[/* error */ js.UndefOr[Any], Any]
    ): Orchestrator = js.native
    def apply(task1: Strings, task2: Strings, task3: Strings, task4: Strings, task5: Strings, task6: Strings): Orchestrator = js.native
    def apply(
      task1: Strings,
      task2: Strings,
      task3: Strings,
      task4: Strings,
      task5: Strings,
      task6: Strings,
      cb: js.Function1[/* error */ js.UndefOr[Any], Any]
    ): Orchestrator = js.native
    /** Start running the tasks
      * @param tasks Tasks to be executed. You may pass any number of tasks as individual arguments.
      * @param cb Callback to call after run completed.
      */
    def apply(tasks: Strings*): Orchestrator = js.native
    /** Start running the tasks
      * @param tasks Tasks to be executed. You may pass any number of tasks as individual arguments.
      * @param cb Callback to call after run completed.
      */
    def apply(tasks: Strings): Orchestrator = js.native
    def apply(tasks: Strings, cb: js.Function1[/* error */ js.UndefOr[Any], Any]): Orchestrator = js.native
  }
  
  type Strings = String | js.Array[String]
  
  trait Task extends StObject {
    
    var dep: js.Array[String]
    
    var done: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    def fn(callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Promise[Any] | Stream | Any
    @JSName("fn")
    var fn_Original: TaskFunc
    
    var hrDuration: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var name: String
    
    var running: js.UndefOr[Boolean] = js.undefined
  }
  object Task {
    
    inline def apply(
      dep: js.Array[String],
      fn: /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Promise[Any] | Stream | Any,
      name: String
    ): Task = {
      val __obj = js.Dynamic.literal(dep = dep.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setDep(value: js.Array[String]): Self = StObject.set(x, "dep", value.asInstanceOf[js.Any])
      
      inline def setDepVarargs(value: String*): Self = StObject.set(x, "dep", js.Array(value*))
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFn(value: /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit] => Promise[Any] | Stream | Any): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setHrDuration(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "hrDuration", value.asInstanceOf[js.Any])
      
      inline def setHrDurationUndefined: Self = StObject.set(x, "hrDuration", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    }
  }
  
  /** A task, can either call a callback to indicate task completion or return a promise or a stream: (task is marked complete when promise.then() resolves/fails or stream ends)
    */
  type TaskFunc = js.Function1[
    /* callback */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Promise[Any] | Stream | Any
  ]
}

package typings
package orchestratorLib.orchestratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A module for sequencing and executing tasks and dependencies in maximum concurrency
  */
@js.native
trait Orchestrator
  extends nodeLib.eventsMod.EventEmitter {
  var doneCallback: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], _]] = js.native
  var isRunning: scala.Boolean = js.native
  var seq: js.Array[_] = js.native
  @JSName("sequence")
  var sequence_Original: Sequencify = js.native
  @JSName("start")
  var start_Original: StartMethod = js.native
  var tasks: org.scalablytyped.runtime.StringDictionary[Task] = js.native
  def _emitTaskDone(task: Task, message: java.lang.String): scala.Unit = js.native
  def _emitTaskDone(task: Task, message: java.lang.String, err: js.Any): scala.Unit = js.native
  def _readyToRunTask(task: Task): scala.Boolean = js.native
  def _resetAllTasks(): scala.Unit = js.native
  def _resetSpecificTasks(names: js.Array[java.lang.String]): scala.Unit = js.native
  // probably supposed to be private methods, but still available on Orchestrator prototype
  def _resetTask(task: Task): scala.Unit = js.native
  def _runStep(): scala.Unit = js.native
  def _runTask(task: Task): scala.Unit = js.native
  def _stopTask(task: Task, meta: Meta): scala.Unit = js.native
  /** Define a task
    * @param name The name of the task.
    * @param fn The function that performs the task's operations. For asynchronous tasks, you need to provide a hint when the task is complete:
    *  - Take in a callback
    *  - Return a stream or a promise
    */
  def add(name: java.lang.String): Orchestrator = js.native
  def add(name: java.lang.String, deps: js.Array[java.lang.String]): Orchestrator = js.native
  def add(name: java.lang.String, deps: js.Array[java.lang.String], fn: TaskFunc): Orchestrator = js.native
  def add(name: java.lang.String, fn: TaskFunc): Orchestrator = js.native
  def allDone(): scala.Boolean = js.native
  /** Have you defined a task with this name?
    * @param name The task name to query
    */
  def hasTask(name: java.lang.String): scala.Boolean = js.native
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
  def on(event: EventNames, cb: js.Function1[/* e */ OnCallbackEvent, _]): this.type = js.native
  /** Listen to all orchestrator events from one callback
    * @param cb Passes single argument: e: event details
    */
  def onAll(cb: js.Function1[/* e */ OnAllCallbackEvent, _]): scala.Unit = js.native
  def reset(): Orchestrator = js.native
  def sequence(tasks: js.Array[orchestratorLib.Anon_Dep], names: js.Array[java.lang.String]): orchestratorLib.Anon_MissingTasks = js.native
  // TODO: TypeScript 2.1.5 cannot express varargs followed by callback as a last argument...
  def start(task1: Strings, task2: Strings): Orchestrator = js.native
  def start(task1: Strings, task2: Strings, cb: js.Function1[/* error */ js.UndefOr[js.Any], _]): Orchestrator = js.native
  def start(task1: Strings, task2: Strings, task3: Strings): Orchestrator = js.native
  def start(
    task1: Strings,
    task2: Strings,
    task3: Strings,
    cb: js.Function1[/* error */ js.UndefOr[js.Any], _]
  ): Orchestrator = js.native
  def start(task1: Strings, task2: Strings, task3: Strings, task4: Strings): Orchestrator = js.native
  def start(
    task1: Strings,
    task2: Strings,
    task3: Strings,
    task4: Strings,
    cb: js.Function1[/* error */ js.UndefOr[js.Any], _]
  ): Orchestrator = js.native
  def start(task1: Strings, task2: Strings, task3: Strings, task4: Strings, task5: Strings): Orchestrator = js.native
  def start(
    task1: Strings,
    task2: Strings,
    task3: Strings,
    task4: Strings,
    task5: Strings,
    cb: js.Function1[/* error */ js.UndefOr[js.Any], _]
  ): Orchestrator = js.native
  def start(task1: Strings, task2: Strings, task3: Strings, task4: Strings, task5: Strings, task6: Strings): Orchestrator = js.native
  def start(
    task1: Strings,
    task2: Strings,
    task3: Strings,
    task4: Strings,
    task5: Strings,
    task6: Strings,
    cb: js.Function1[/* error */ js.UndefOr[js.Any], _]
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
  def start(tasks: Strings, cb: js.Function1[/* error */ js.UndefOr[js.Any], _]): Orchestrator = js.native
  def stop(): scala.Unit = js.native
  def stop(err: js.Any): scala.Unit = js.native
  def stop(err: js.Any, successfulFinish: scala.Boolean): scala.Unit = js.native
  def task(name: java.lang.String): Task = js.native
  def task(name: java.lang.String, dep: js.Array[java.lang.String], fn: TaskFunc): scala.Unit = js.native
  def task(name: java.lang.String, fn: TaskFunc): scala.Unit = js.native
}


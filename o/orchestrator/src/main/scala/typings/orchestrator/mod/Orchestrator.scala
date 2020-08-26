package typings.orchestrator.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.orchestrator.anon.Dep
import typings.orchestrator.anon.MissingTasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A module for sequencing and executing tasks and dependencies in maximum concurrency
  */
@js.native
trait Orchestrator extends EventEmitter {
  var doneCallback: js.UndefOr[js.Function1[/* error */ js.UndefOr[js.Any], _]] = js.native
  var isRunning: Boolean = js.native
  var seq: js.Array[_] = js.native
  @JSName("sequence")
  var sequence_Original: Sequencify = js.native
  @JSName("start")
  var start_Original: StartMethod = js.native
  var tasks: StringDictionary[Task] = js.native
  def _emitTaskDone(task: Task, message: String): Unit = js.native
  def _emitTaskDone(task: Task, message: String, err: js.Any): Unit = js.native
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
  def add(name: String, deps: js.UndefOr[scala.Nothing], fn: TaskFunc): Orchestrator = js.native
  def add(name: String, deps: js.Array[String]): Orchestrator = js.native
  def add(name: String, deps: js.Array[String], fn: TaskFunc): Orchestrator = js.native
  def add(name: String, fn: TaskFunc): Orchestrator = js.native
  def allDone(): Boolean = js.native
  /** Have you defined a task with this name?
    * @param name The task name to query
    */
  def hasTask(name: String): Boolean = js.native
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
  def onAll(cb: js.Function1[/* e */ OnAllCallbackEvent, _]): Unit = js.native
  def reset(): Orchestrator = js.native
  def sequence(tasks: js.Array[Dep], names: js.Array[String]): MissingTasks = js.native
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
  def stop(): Unit = js.native
  def stop(err: js.UndefOr[scala.Nothing], successfulFinish: Boolean): Unit = js.native
  def stop(err: js.Any): Unit = js.native
  def stop(err: js.Any, successfulFinish: Boolean): Unit = js.native
  def task(name: String): Task = js.native
  def task(name: String, dep: js.Array[String], fn: TaskFunc): Unit = js.native
  def task(name: String, fn: TaskFunc): Unit = js.native
}


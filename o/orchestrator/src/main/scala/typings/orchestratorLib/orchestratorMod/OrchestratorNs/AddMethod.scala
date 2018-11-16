package typings
package orchestratorLib.orchestratorMod.OrchestratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddMethod extends js.Object {
  /** Define a task
           * @param name The name of the task.
           * @param fn The function that performs the task's operations. For asynchronous tasks, you need to provide a hint when the task is complete:
           *  - Take in a callback
           *  - Return a stream or a promise
           */
  def apply(name: java.lang.String): orchestratorLib.orchestratorMod.Orchestrator = js.native
  /** Define a task
           * @param name The name of the task.
           * @param deps An array of task names to be executed and completed before your task will run.
           * @param fn The function that performs the task's operations. For asynchronous tasks, you need to provide a hint when the task is complete:
           *  - Take in a callback
           *  - Return a stream or a promise
           */
  def apply(name: java.lang.String, deps: js.Array[java.lang.String]): orchestratorLib.orchestratorMod.Orchestrator = js.native
  /** Define a task
           * @param name The name of the task.
           * @param deps An array of task names to be executed and completed before your task will run.
           * @param fn The function that performs the task's operations. For asynchronous tasks, you need to provide a hint when the task is complete:
           *  - Take in a callback
           *  - Return a stream or a promise
           */
  def apply(name: java.lang.String, deps: js.Array[java.lang.String], fn: TaskFunc): orchestratorLib.orchestratorMod.Orchestrator = js.native
  /** Define a task
           * @param name The name of the task.
           * @param fn The function that performs the task's operations. For asynchronous tasks, you need to provide a hint when the task is complete:
           *  - Take in a callback
           *  - Return a stream or a promise
           */
  def apply(name: java.lang.String, fn: TaskFunc): orchestratorLib.orchestratorMod.Orchestrator = js.native
}


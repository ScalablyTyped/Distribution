package typings
package orchestratorLib.orchestratorMod

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
  def apply(name: java.lang.String): Orchestrator = js.native
  def apply(name: java.lang.String, deps: js.Array[java.lang.String]): Orchestrator = js.native
  def apply(name: java.lang.String, deps: js.Array[java.lang.String], fn: TaskFunc): Orchestrator = js.native
  def apply(name: java.lang.String, fn: TaskFunc): Orchestrator = js.native
}


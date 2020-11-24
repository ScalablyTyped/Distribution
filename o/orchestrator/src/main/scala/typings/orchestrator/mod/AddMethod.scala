package typings.orchestrator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddMethod extends js.Object {
  
  /** Define a task
    * @param name The name of the task.
    * @param fn The function that performs the task's operations. For asynchronous tasks, you need to provide a hint when the task is complete:
    *  - Take in a callback
    *  - Return a stream or a promise
    */
  def apply(name: String): Orchestrator = js.native
  def apply(name: String, deps: js.UndefOr[scala.Nothing], fn: TaskFunc): Orchestrator = js.native
  def apply(name: String, deps: js.Array[String]): Orchestrator = js.native
  def apply(name: String, deps: js.Array[String], fn: TaskFunc): Orchestrator = js.native
  def apply(name: String, fn: TaskFunc): Orchestrator = js.native
}

package typings.mobxDashTask

import typings.mobxDashTask.libTaskMod.Task
import typings.mobxDashTask.libTaskMod.TaskFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-task", JSImport.Namespace)
@js.native
object mobxDashTaskMod extends js.Object {
  /**
    * Creates a task in the `pending` state.
    */
  val task: TaskFactory = js.native
  def TaskGroup[A /* <: js.Array[_] */, R](tasks: js.Array[Task[A, R]]): typings.mobxDashTask.libTaskDashGroupMod.TaskGroup[A, R] = js.native
}


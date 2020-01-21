package typings.mobxTask

import typings.mobxTask.taskMod.TaskFactory
import typings.mobxTask.taskMod.Task_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-task", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Creates a task in the `pending` state.
    */
  val task: TaskFactory = js.native
  def TaskGroup[A /* <: js.Array[_] */, R](tasks: js.Array[Task_[A, R]]): typings.mobxTask.taskGroupMod.TaskGroup[A, R] = js.native
}


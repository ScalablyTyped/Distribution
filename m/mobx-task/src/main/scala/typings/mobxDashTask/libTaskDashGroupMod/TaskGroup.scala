package typings.mobxDashTask.libTaskDashGroupMod

import typings.mobxDashTask.libTaskMod.Task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-task/lib/task-group", "TaskGroup")
@js.native
object TaskGroup extends js.Object {
  def apply[A /* <: js.Array[_] */, R](tasks: js.Array[Task[A, R]]): TaskGroup[A, R] = js.native
}


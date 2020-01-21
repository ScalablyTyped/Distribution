package typings.mobxTask.taskGroupMod

import typings.mobxTask.taskMod.Task_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-task/lib/task-group", "TaskGroup")
@js.native
object TaskGroup extends js.Object {
  def apply[A /* <: js.Array[_] */, R](tasks: js.Array[Task_[A, R]]): TaskGroup[A, R] = js.native
}


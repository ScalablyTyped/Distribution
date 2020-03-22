package typings.mobxTask.taskGroupMod

import typings.mobxTask.taskMod.Task_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<mobx-task.mobx-task/lib/task.Task<A, R>, mobx-task.mobx-task/lib/task-group.QueryableMethods> */
trait TaskGroup[A /* <: js.Array[_] */, R] extends js.Object {
  var error: js.Any
  var `match`: js.Any
  var pending: js.Any
  var rejected: js.Any
  var resolved: js.Any
  var result: js.Any
  var state: js.Any
}

@JSImport("mobx-task/lib/task-group", "TaskGroup")
@js.native
object TaskGroup extends js.Object {
  def apply[A /* <: js.Array[_] */, R](tasks: js.Array[Task_[A, R]]): TaskGroup[A, R] = js.native
}


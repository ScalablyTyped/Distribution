package typings.mobxTask.taskGroupMod

import typings.mobxTask.taskMod.Task_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<mobx-task.mobx-task/lib/task.Task<A, R>, mobx-task.mobx-task/lib/task-group.QueryableMethods> */
@js.native
trait TaskGroup[A /* <: js.Array[_] */, R] extends js.Object {
  
  var error: js.UndefOr[js.Any] = js.native
  
  var `match`: js.UndefOr[js.Any] = js.native
  
  var pending: js.UndefOr[js.Any] = js.native
  
  var rejected: js.UndefOr[js.Any] = js.native
  
  var resolved: js.UndefOr[js.Any] = js.native
  
  var result: js.UndefOr[js.Any] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
}
@JSImport("mobx-task/lib/task-group", "TaskGroup")
@js.native
object TaskGroup extends js.Object {
  
  def apply[A /* <: js.Array[_] */, R](tasks: js.Array[Task_[A, R]]): TaskGroup[A, R] = js.native
}

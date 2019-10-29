package typings.mobxDashTask

import typings.mobxDashTask.libTaskDashGroupMod.QueryableMethods
import typings.mobxDashTask.libTaskDashGroupMod.TaskGroup
import typings.mobxDashTask.libTaskMod.Task
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-task/lib/task-group", JSImport.Namespace)
@js.native
object libTaskDashGroupMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.mobxDashTask.mobxDashTaskStrings.state
    - typings.mobxDashTask.mobxDashTaskStrings.pending
    - typings.mobxDashTask.mobxDashTaskStrings.resolved
    - typings.mobxDashTask.mobxDashTaskStrings.rejected
    - typings.mobxDashTask.mobxDashTaskStrings.result
    - typings.mobxDashTask.mobxDashTaskStrings.error
    - typings.mobxDashTask.mobxDashTaskStrings.`match`
  */
  trait QueryableMethods extends js.Object
  
  def TaskGroup[A /* <: js.Array[_] */, R](tasks: js.Array[Task[A, R]]): TaskGroup[A, R] = js.native
  type TaskGroup[A /* <: js.Array[_] */, R] = Pick[Task[A, R], QueryableMethods]
}


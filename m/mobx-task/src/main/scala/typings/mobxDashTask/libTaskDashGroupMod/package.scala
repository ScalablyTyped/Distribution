package typings.mobxDashTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTaskDashGroupMod {
  import typings.mobxDashTask.libTaskMod.Task
  import typings.std.Pick

  type TaskGroup[A /* <: js.Array[_] */, R] = Pick[Task[A, R], QueryableMethods]
}

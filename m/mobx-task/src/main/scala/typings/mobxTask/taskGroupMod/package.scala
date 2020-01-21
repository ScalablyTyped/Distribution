package typings.mobxTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object taskGroupMod {
  type TaskGroup[A /* <: js.Array[_] */, R] = typings.std.Pick[
    typings.mobxTask.taskMod.Task_[A, R], 
    typings.mobxTask.taskGroupMod.QueryableMethods
  ]
}

package typings.mobxTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object taskMod {
  type TaskFunc[A /* <: js.Array[_] */, R] = js.Function1[/* args */ A, js.Promise[R]]
  type Task_[A /* <: js.Array[_] */, R] = (typings.mobxTask.taskMod.TaskFunc[A, typings.mobxTask.taskMod.WithoutPromise[R]]) with (typings.mobxTask.taskMod.TaskState[A, R]) with (typings.mobxTask.taskMod.TaskMethods[A, R])
  type WithoutPromise[T] = T
}

package typings.mobxDashTask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTaskMod {
  type Task[A /* <: js.Array[_] */, R] = (TaskFunc[A, WithoutPromise[R]]) with (TaskState[A, R]) with (TaskMethods[A, R])
  type TaskFunc[A /* <: js.Array[_] */, R] = js.Function1[/* args */ A, js.Promise[R]]
  type WithoutPromise[T] = T
}

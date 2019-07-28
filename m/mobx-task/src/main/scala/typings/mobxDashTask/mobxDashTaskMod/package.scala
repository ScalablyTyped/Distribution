package typings.mobxDashTask

import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobxDashTaskMod {
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type Task[Result, Args /* <: js.Array[_] */] = TaskStatusAware[Result, Args]
  type TaskError = Error
  type TaskFunc[R, A /* <: js.Array[_] */] = js.Function1[/* args */ A, R]
  type WithoutPromise[T] = T
}

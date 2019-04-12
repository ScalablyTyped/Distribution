package typings
package mobxDashTaskLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobxDashTaskMod {
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type TaskError = stdLib.Error
  type TaskFunc[R, A /* <: js.Array[_] */] = js.Function1[/* args */ A, R]
  type WithoutPromise[T] = T
}

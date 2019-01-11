package typings
package pDashTimeoutLib.pDashTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](input: js.Thenable[T], ms: scala.Double): js.Promise[T] = js.native
  def apply[T](
    input: js.Thenable[T],
    ms: scala.Double,
    message: java.lang.String | pDashTimeoutLib.pDashTimeoutMod.pTimeoutNs.TimeoutError
  ): js.Promise[T] = js.native
  def apply[T, R](input: js.Thenable[T], ms: scala.Double, fallback: js.Function0[R | js.Promise[R]]): js.Promise[T | R] = js.native
}


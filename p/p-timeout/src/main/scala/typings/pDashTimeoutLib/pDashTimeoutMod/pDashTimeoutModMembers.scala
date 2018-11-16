package typings
package pDashTimeoutLib.pDashTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-timeout", JSImport.Namespace)
@js.native
object pDashTimeoutModMembers extends js.Object {
  def apply[T](input: stdLib.PromiseLike[T], ms: scala.Double): stdLib.Promise[T] = js.native
  def apply[T](
    input: stdLib.PromiseLike[T],
    ms: scala.Double,
    message: java.lang.String | pDashTimeoutLib.pDashTimeoutMod.pTimeoutNs.TimeoutError
  ): stdLib.Promise[T] = js.native
  def apply[T, R](input: stdLib.PromiseLike[T], ms: scala.Double, fallback: js.Function0[R | stdLib.Promise[R]]): stdLib.Promise[T | R] = js.native
}


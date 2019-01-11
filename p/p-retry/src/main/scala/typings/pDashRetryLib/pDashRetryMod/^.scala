package typings
package pDashRetryLib.pDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](input: js.Function1[/* attemptCount */ scala.Double, js.Thenable[T] | T]): js.Promise[T] = js.native
  def apply[T](
    input: js.Function1[/* attemptCount */ scala.Double, js.Thenable[T] | T],
    options: pDashRetryLib.pDashRetryMod.pRetryNs.Options
  ): js.Promise[T] = js.native
}


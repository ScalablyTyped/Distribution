package typings
package pDashRetryLib.pDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-retry", JSImport.Namespace)
@js.native
object pDashRetryModMembers extends js.Object {
  def apply[T](input: js.Function1[/* attemptCount */ scala.Double, stdLib.PromiseLike[T] | T]): stdLib.Promise[T] = js.native
  def apply[T](
    input: js.Function1[/* attemptCount */ scala.Double, stdLib.PromiseLike[T] | T],
    options: pDashRetryLib.pDashRetryMod.pRetryNs.Options
  ): stdLib.Promise[T] = js.native
}


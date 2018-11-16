package typings
package pDashLocateLib.pDashLocateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-locate", JSImport.Namespace)
@js.native
object pDashLocateModMembers extends js.Object {
  def apply[T](
    input: stdLib.Iterable[stdLib.PromiseLike[T] | T],
    tester: js.Function1[/* element */ T, stdLib.Promise[scala.Boolean] | scala.Boolean]
  ): stdLib.Promise[js.UndefOr[T]] = js.native
  def apply[T](
    input: stdLib.Iterable[stdLib.PromiseLike[T] | T],
    tester: js.Function1[/* element */ T, stdLib.Promise[scala.Boolean] | scala.Boolean],
    options: pDashLocateLib.pDashLocateMod.pLocateNs.Options
  ): stdLib.Promise[js.UndefOr[T]] = js.native
}


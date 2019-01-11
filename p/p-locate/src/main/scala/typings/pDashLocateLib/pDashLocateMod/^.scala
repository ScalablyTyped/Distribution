package typings
package pDashLocateLib.pDashLocateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-locate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](
    input: stdLib.Iterable[js.Thenable[T] | T],
    tester: js.Function1[/* element */ T, js.Promise[scala.Boolean] | scala.Boolean]
  ): js.Promise[js.UndefOr[T]] = js.native
  def apply[T](
    input: stdLib.Iterable[js.Thenable[T] | T],
    tester: js.Function1[/* element */ T, js.Promise[scala.Boolean] | scala.Boolean],
    options: pDashLocateLib.pDashLocateMod.pLocateNs.Options
  ): js.Promise[js.UndefOr[T]] = js.native
}


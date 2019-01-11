package typings
package pDashEveryLib.pDashEveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-every", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](
    input: stdLib.Iterable[js.Thenable[T] | T],
    testFn: js.Function2[/* element */ T, /* index */ scala.Double, scala.Boolean | js.Promise[scala.Boolean]]
  ): js.Promise[scala.Boolean] = js.native
  def apply[T](
    input: stdLib.Iterable[js.Thenable[T] | T],
    testFn: js.Function2[/* element */ T, /* index */ scala.Double, scala.Boolean | js.Promise[scala.Boolean]],
    options: pDashEveryLib.pDashEveryMod.pEveryNs.Options
  ): js.Promise[scala.Boolean] = js.native
}


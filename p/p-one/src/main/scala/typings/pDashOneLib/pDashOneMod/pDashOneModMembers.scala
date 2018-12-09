package typings
package pDashOneLib.pDashOneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-one", JSImport.Namespace)
@js.native
object pDashOneModMembers extends js.Object {
  def apply[T](
    input: stdLib.Iterable[js.Thenable[T] | T],
    testFn: js.Function2[/* element */ T, /* index */ scala.Double, scala.Boolean | js.Promise[scala.Boolean]]
  ): js.Promise[scala.Boolean] = js.native
  def apply[T](
    input: stdLib.Iterable[js.Thenable[T] | T],
    testFn: js.Function2[/* element */ T, /* index */ scala.Double, scala.Boolean | js.Promise[scala.Boolean]],
    options: pDashOneLib.pDashOneMod.pOneNs.Options
  ): js.Promise[scala.Boolean] = js.native
}


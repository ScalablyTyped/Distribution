package typings
package pDashLocateLib.pDashLocateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-locate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[scala.Boolean] | scala.Boolean]
  ): js.Promise[js.UndefOr[ValueType]] = js.native
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    tester: js.Function1[/* element */ ValueType, js.Thenable[scala.Boolean] | scala.Boolean],
    options: Options
  ): js.Promise[js.UndefOr[ValueType]] = js.native
}


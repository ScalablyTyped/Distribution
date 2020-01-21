package typings.pEvery

import typings.pMap.mod.Options
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-every", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[ValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]]
  ): js.Promise[Boolean] = js.native
  def default[ValueType](
    input: Iterable[js.Thenable[ValueType] | ValueType],
    testFunction: js.Function2[/* element */ ValueType, /* index */ Double, Boolean | js.Thenable[Boolean]],
    options: Options
  ): js.Promise[Boolean] = js.native
}


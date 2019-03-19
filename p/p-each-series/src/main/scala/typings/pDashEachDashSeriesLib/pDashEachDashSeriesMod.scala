package typings
package pDashEachDashSeriesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-each-series", JSImport.Namespace)
@js.native
object pDashEachDashSeriesMod extends js.Object {
  def default[ValueType](
    input: stdLib.Iterable[js.Thenable[ValueType] | ValueType],
    iterator: js.Function2[/* element */ ValueType, /* index */ scala.Double, _]
  ): js.Promise[js.Array[ValueType]] = js.native
}


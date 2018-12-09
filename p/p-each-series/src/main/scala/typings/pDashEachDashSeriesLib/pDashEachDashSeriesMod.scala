package typings
package pDashEachDashSeriesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-each-series", JSImport.Namespace)
@js.native
object pDashEachDashSeriesMod extends js.Object {
  def apply[T](
    input: stdLib.Iterable[js.Thenable[T] | T],
    iterator: js.Function2[/* element */ T, /* index */ scala.Double, _]
  ): js.Promise[js.Array[T]] = js.native
}


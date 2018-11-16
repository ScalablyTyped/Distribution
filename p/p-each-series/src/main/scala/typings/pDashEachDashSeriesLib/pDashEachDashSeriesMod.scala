package typings
package pDashEachDashSeriesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-each-series", JSImport.Namespace)
@js.native
object pDashEachDashSeriesMod extends js.Object {
  def apply[T](
    input: stdLib.Iterable[stdLib.PromiseLike[T] | T],
    iterator: js.Function2[/* element */ T, /* index */ scala.Double, _]
  ): stdLib.Promise[js.Array[T]] = js.native
}


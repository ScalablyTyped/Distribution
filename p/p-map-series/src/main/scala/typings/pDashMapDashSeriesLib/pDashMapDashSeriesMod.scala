package typings
package pDashMapDashSeriesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-map-series", JSImport.Namespace)
@js.native
object pDashMapDashSeriesMod extends js.Object {
  def apply[T, U](
    input: stdLib.Iterable[js.Thenable[T] | T],
    mapper: js.Function2[/* element */ T, /* index */ scala.Double, js.Thenable[U] | U]
  ): js.Promise[js.Array[U]] = js.native
}


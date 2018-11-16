package typings
package pDashSeriesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-series", JSImport.Namespace)
@js.native
object pDashSeriesMod extends js.Object {
  def apply[T](tasks: stdLib.Iterable[js.Function0[stdLib.Promise[T] | T]]): stdLib.Promise[js.Array[T]] = js.native
}


package typings
package pDashTimesLib.pDashTimesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-times", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](count: scala.Double, mapper: js.Function1[/* index */ scala.Double, T | js.Thenable[T]]): js.Promise[js.Array[T]] = js.native
  def apply[T](
    count: scala.Double,
    mapper: js.Function1[/* index */ scala.Double, T | js.Thenable[T]],
    options: pDashTimesLib.pDashTimesMod.pTimesNs.Options
  ): js.Promise[js.Array[T]] = js.native
}


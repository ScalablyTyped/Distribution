package typings
package pDashMapLib.pDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-map", JSImport.Namespace)
@js.native
object pDashMapModMembers extends js.Object {
  def apply[T, M](input: stdLib.Iterable[pDashMapLib.Input[T]], mapper: pDashMapLib.Mapper[T, M]): js.Promise[js.Array[M]] = js.native
  def apply[T, M](
    input: stdLib.Iterable[pDashMapLib.Input[T]],
    mapper: pDashMapLib.Mapper[T, M],
    options: pDashMapLib.pDashMapMod.pMapNs.Options
  ): js.Promise[js.Array[M]] = js.native
}


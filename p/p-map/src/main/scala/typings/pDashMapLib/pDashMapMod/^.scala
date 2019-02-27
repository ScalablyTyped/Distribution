package typings
package pDashMapLib.pDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[Element, NewElement](input: stdLib.Iterable[Element], mapper: pDashMapLib.pDashMapMod.Mapper[Element, NewElement]): js.Promise[js.Array[NewElement]] = js.native
  def default[Element, NewElement](
    input: stdLib.Iterable[Element],
    mapper: pDashMapLib.pDashMapMod.Mapper[Element, NewElement],
    options: pDashMapLib.pDashMapMod.Options
  ): js.Promise[js.Array[NewElement]] = js.native
}


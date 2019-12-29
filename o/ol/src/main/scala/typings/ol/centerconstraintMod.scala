package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/centerconstraint", JSImport.Namespace)
@js.native
object centerconstraintMod extends js.Object {
  def createExtent(extent: Extent): Type = js.native
  def none(): js.UndefOr[Coordinate] = js.native
  def none(center: Coordinate): js.UndefOr[Coordinate] = js.native
  type Type = js.Function1[/* p0 */ js.UndefOr[Coordinate], js.UndefOr[Coordinate]]
}


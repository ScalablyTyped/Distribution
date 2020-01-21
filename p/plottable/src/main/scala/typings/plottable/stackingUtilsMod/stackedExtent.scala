package typings.plottable.stackingUtilsMod

import typings.plottable.interfacesMod.IAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/stackingUtils", "stackedExtent")
@js.native
object stackedExtent extends js.Object {
  def apply(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
}


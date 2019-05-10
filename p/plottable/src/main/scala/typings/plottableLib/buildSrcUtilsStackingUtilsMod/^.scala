package typings
package plottableLib.buildSrcUtilsStackingUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/stackingUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val normalizeKey: (js.Function1[/* key */ js.Any, java.lang.String]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MemoizedFunction */ js.Any) = js.native
  def stack(
    datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset],
    keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
    valueAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]
  ): StackingResult = js.native
  def stack(
    datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset],
    keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
    valueAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double],
    stackingOrder: IStackingOrder
  ): StackingResult = js.native
  def stackedExtent(
    stackingResult: StackingResult,
    keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
    filter: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Boolean]
  ): js.Array[scala.Double] = js.native
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): plottableLib.Anon_MaximumExtents[D] = js.native
}


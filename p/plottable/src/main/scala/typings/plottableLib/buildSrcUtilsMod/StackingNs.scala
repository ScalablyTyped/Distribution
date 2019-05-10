package typings
package plottableLib.buildSrcUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "Stacking")
@js.native
object StackingNs extends js.Object {
  val normalizeKey: (js.Function1[/* key */ js.Any, java.lang.String]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MemoizedFunction */ js.Any) = js.native
  def stack(
    datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset],
    keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
    valueAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]
  ): plottableLib.buildSrcUtilsStackingUtilsMod.StackingResult = js.native
  def stack(
    datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset],
    keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
    valueAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double],
    stackingOrder: plottableLib.buildSrcUtilsStackingUtilsMod.IStackingOrder
  ): plottableLib.buildSrcUtilsStackingUtilsMod.StackingResult = js.native
  def stackedExtent(
    stackingResult: plottableLib.buildSrcUtilsStackingUtilsMod.StackingResult,
    keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
    filter: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Boolean]
  ): js.Array[scala.Double] = js.native
  def stackedExtents[D](stackingResult: plottableLib.buildSrcUtilsStackingUtilsMod.GenericStackingResult[D]): plottableLib.Anon_MaximumExtents[D] = js.native
  @js.native
  object IStackingOrder extends js.Object {
    var bottomup: plottableLib.plottableLibStrings.bottomup = js.native
    var topdown: plottableLib.plottableLibStrings.topdown = js.native
  }
  
}


package typings
package plottableLib.buildSrcUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "Stacking")
@js.native
object StackingNs extends js.Object {
  val IStackingOrder: plottableLib.Anon_Topdown = js.native
  val normalizeKey: (js.Function1[/* key */ js.Any, java.lang.String]) with lodashLib.lodashMod.underscoreNs.MemoizedFunction = js.native
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
  def stackedExtents[D](stackingResult: plottableLib.buildSrcUtilsStackingUtilsMod.GenericStackingResult[D]): plottableLib.Anon_MinimumExtents[D] = js.native
}


package typings.plottable.plottableMod.Utils

import typings.lodash.lodashMod.MemoizedFunction
import typings.plottable.Anon_MaximumExtents
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcUtilsStackingUtilsMod.GenericStackingResult
import typings.plottable.buildSrcUtilsStackingUtilsMod.IStackingOrder
import typings.plottable.buildSrcUtilsStackingUtilsMod.StackingResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Utils.Stacking")
@js.native
object Stacking extends js.Object {
  val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
  def stack(
    datasets: js.Array[typings.plottable.buildSrcCoreDatasetMod.Dataset],
    keyAccessor: IAccessor[_],
    valueAccessor: IAccessor[Double]
  ): StackingResult = js.native
  def stack(
    datasets: js.Array[typings.plottable.buildSrcCoreDatasetMod.Dataset],
    keyAccessor: IAccessor[_],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = js.native
  def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): Anon_MaximumExtents[D] = js.native
  @js.native
  object IStackingOrder extends js.Object {
    var bottomup: typings.plottable.plottableStrings.bottomup = js.native
    var topdown: typings.plottable.plottableStrings.topdown = js.native
  }
  
}


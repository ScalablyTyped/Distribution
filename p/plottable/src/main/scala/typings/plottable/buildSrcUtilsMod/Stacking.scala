package typings.plottable.buildSrcUtilsMod

import typings.plottable.Anon_MaximumExtents
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcUtilsStackingUtilsMod.GenericStackingResult
import typings.plottable.buildSrcUtilsStackingUtilsMod.IStackingOrder
import typings.plottable.buildSrcUtilsStackingUtilsMod.StackingResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "Stacking")
@js.native
object Stacking extends js.Object {
  val normalizeKey: (js.Function1[/* key */ js.Any, String]) with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MemoizedFunction */ js.Any) = js.native
  def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[_], valueAccessor: IAccessor[Double]): StackingResult = js.native
  def stack(
    datasets: js.Array[Dataset],
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


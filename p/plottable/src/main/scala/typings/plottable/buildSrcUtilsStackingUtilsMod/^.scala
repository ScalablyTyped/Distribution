package typings.plottable.buildSrcUtilsStackingUtilsMod

import typings.lodash.lodashMod.MemoizedFunction
import typings.plottable.Anon_MaximumExtents
import typings.plottable.buildSrcCoreDatasetMod.Dataset
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/stackingUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
  def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[_], valueAccessor: IAccessor[Double]): StackingResult = js.native
  def stack(
    datasets: js.Array[Dataset],
    keyAccessor: IAccessor[_],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = js.native
  def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): Anon_MaximumExtents[D] = js.native
}


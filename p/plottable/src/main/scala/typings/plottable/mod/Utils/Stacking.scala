package typings.plottable.mod.Utils

import typings.lodash.mod.MemoizedFunction
import typings.plottable.anon.MaximumExtents
import typings.plottable.datasetMod.Dataset
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.stackingUtilsMod.GenericStackingResult
import typings.plottable.stackingUtilsMod.IStackingOrder
import typings.plottable.stackingUtilsMod.StackingResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "Utils.Stacking")
@js.native
object Stacking extends js.Object {
  
  val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
  
  def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[_], valueAccessor: IAccessor[Double]): StackingResult = js.native
  def stack(
    datasets: js.Array[Dataset],
    keyAccessor: IAccessor[_],
    valueAccessor: IAccessor[Double],
    stackingOrder: IStackingOrder
  ): StackingResult = js.native
  
  def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
  
  def stackedExtents[D](stackingResult: GenericStackingResult[D]): MaximumExtents[D] = js.native
  
  @js.native
  object IStackingOrder extends js.Object {
    
    var bottomup: typings.plottable.plottableStrings.bottomup = js.native
    
    var topdown: typings.plottable.plottableStrings.topdown = js.native
  }
}

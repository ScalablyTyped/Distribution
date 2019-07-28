package typings.plottable.buildSrcUtilsRTreeMod

import typings.plottable.buildSrcCoreInterfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/rTree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[/* node */ RTreeNode[T], QueryPredicateResult] = js.native
  def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[/* a */ RTreeNode[T], /* b */ RTreeNode[T], Double] = js.native
}


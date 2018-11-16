package typings
package plottableLib.buildSrcUtilsRTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/rTree", JSImport.Namespace)
@js.native
object buildSrcUtilsRTreeModMembers extends js.Object {
  def createMinimizingNodePredicate[T](
    point: plottableLib.buildSrcCoreInterfacesMod.Point,
    nearFn: IDistanceFunction,
    farFn: IDistanceFunction
  ): js.Function1[/* node */ RTreeNode[T], QueryPredicateResult] = js.native
  def createNodeSort[T](point: plottableLib.buildSrcCoreInterfacesMod.Point, distanceFn: IDistanceFunction): js.Function2[/* a */ RTreeNode[T], /* b */ RTreeNode[T], scala.Double] = js.native
}


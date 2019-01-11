package typings
package plottableLib.buildSrcUtilsRTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/rTree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createMinimizingNodePredicate[T](
    point: plottableLib.buildSrcCoreInterfacesMod.Point,
    nearFn: plottableLib.buildSrcUtilsRTreeMod.IDistanceFunction,
    farFn: plottableLib.buildSrcUtilsRTreeMod.IDistanceFunction
  ): js.Function1[
    /* node */ plottableLib.buildSrcUtilsRTreeMod.RTreeNode[T], 
    plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult
  ] = js.native
  def createNodeSort[T](
    point: plottableLib.buildSrcCoreInterfacesMod.Point,
    distanceFn: plottableLib.buildSrcUtilsRTreeMod.IDistanceFunction
  ): js.Function2[
    /* a */ plottableLib.buildSrcUtilsRTreeMod.RTreeNode[T], 
    /* b */ plottableLib.buildSrcUtilsRTreeMod.RTreeNode[T], 
    scala.Double
  ] = js.native
}


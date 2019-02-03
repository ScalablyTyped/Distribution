package typings
package plottableLib.buildSrcUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "RTree")
@js.native
object RTreeNs extends js.Object {
  @js.native
  class RTree[T] ()
    extends plottableLib.buildSrcUtilsRTreeMod.RTree[T] {
    def this(maxNodeChildren: scala.Double) = this()
    def this(maxNodeChildren: scala.Double, splitStrategy: plottableLib.buildSrcUtilsRTreeSplitStrategiesMod.IRTreeSplitStrategy) = this()
  }
  
  @js.native
  class RTreeBounds protected ()
    extends plottableLib.buildSrcUtilsRTreeMod.RTreeBounds {
    def this(xl: scala.Double, yl: scala.Double, xh: scala.Double, yh: scala.Double) = this()
  }
  
  @js.native
  class RTreeNode[T] protected ()
    extends plottableLib.buildSrcUtilsRTreeMod.RTreeNode[T] {
    def this(leaf: scala.Boolean) = this()
  }
  
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
  @js.native
  object QueryPredicateResult extends js.Object {
    /* 1 */ val FAIL: plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult.FAIL with scala.Double = js.native
    /* 0 */ val PASS: plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult.PASS with scala.Double = js.native
    /* 2 */ val PASS_AND_OVERWRITE: plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult with scala.Double] = js.native
  }
  
  /* static members */
  @js.native
  object RTreeBounds extends js.Object {
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    def absoluteDistanceToFarEdgeX(
      bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      p: plottableLib.buildSrcCoreInterfacesMod.Point
    ): scala.Double = js.native
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    def absoluteDistanceToFarEdgeY(
      bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      p: plottableLib.buildSrcCoreInterfacesMod.Point
    ): scala.Double = js.native
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    def absoluteDistanceToNearEdgeX(
      bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      p: plottableLib.buildSrcCoreInterfacesMod.Point
    ): scala.Double = js.native
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    def absoluteDistanceToNearEdgeY(
      bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      p: plottableLib.buildSrcCoreInterfacesMod.Point
    ): scala.Double = js.native
    def bounds(bounds: plottableLib.buildSrcCoreInterfacesMod.Bounds): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def distanceSquaredToFarEdge(
      bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      p: plottableLib.buildSrcCoreInterfacesMod.Point
    ): scala.Double = js.native
    /**
      * Returns the distance squared from `p` to the nearest edge of `bounds`. If
      * the point touches or is inside the bounds, returns `0`;
      *
      * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
      */
    def distanceSquaredToNearEdge(
      bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      p: plottableLib.buildSrcCoreInterfacesMod.Point
    ): scala.Double = js.native
    def entityBounds(bounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    /**
      * Returns true if `a` overlaps `b` in the x and y axes.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapBounds(
      a: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      b: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds
    ): scala.Boolean = js.native
    /**
      * Returns true if `a` overlaps `b` in the x axis only.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapX(
      a: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      b: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds
    ): scala.Boolean = js.native
    /**
      * Returns true if `a` overlaps `b` in the y axis only.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapY(
      a: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      b: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds
    ): scala.Boolean = js.native
    def pointPair(p0: plottableLib.buildSrcCoreInterfacesMod.Point, p1: plottableLib.buildSrcCoreInterfacesMod.Point): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def points(points: js.Array[plottableLib.buildSrcCoreInterfacesMod.Point]): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def union(
      b0: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds,
      b1: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds
    ): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def unionAll(bounds: js.Array[plottableLib.buildSrcUtilsRTreeMod.RTreeBounds]): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def xywh(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): plottableLib.buildSrcUtilsRTreeMod.RTreeBounds = js.native
  }
  
  /* static members */
  @js.native
  object RTreeNode extends js.Object {
    def valueNode[T](bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds, value: T): plottableLib.buildSrcUtilsRTreeMod.RTreeNode[T] = js.native
  }
  
  type QueryPredicateResult = plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult
}


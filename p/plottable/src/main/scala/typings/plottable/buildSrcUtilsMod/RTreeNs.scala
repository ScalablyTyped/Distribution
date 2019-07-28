package typings.plottable.buildSrcUtilsMod

import typings.plottable.buildSrcCoreInterfacesMod.Bounds
import typings.plottable.buildSrcCoreInterfacesMod.IEntityBounds
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcUtilsRTreeMod.IDistanceFunction
import typings.plottable.buildSrcUtilsRTreeSplitStrategiesMod.IRTreeSplitStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "RTree")
@js.native
object RTreeNs extends js.Object {
  @js.native
  class RTree[T] ()
    extends typings.plottable.buildSrcUtilsRTreeMod.RTree[T] {
    def this(maxNodeChildren: Double) = this()
    def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
  }
  
  @js.native
  class RTreeBounds protected ()
    extends typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds {
    def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
  }
  
  @js.native
  class RTreeNode[T] protected ()
    extends typings.plottable.buildSrcUtilsRTreeMod.RTreeNode[T] {
    def this(leaf: Boolean) = this()
  }
  
  def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[
    /* node */ typings.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
    typings.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult
  ] = js.native
  def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[
    /* a */ typings.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
    /* b */ typings.plottable.buildSrcUtilsRTreeMod.RTreeNode[T], 
    Double
  ] = js.native
  @js.native
  object QueryPredicateResult extends js.Object {
    /* 1 */ val FAIL: typings.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.FAIL with Double = js.native
    /* 0 */ val PASS: typings.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.PASS with Double = js.native
    /* 2 */ val PASS_AND_OVERWRITE: typings.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.plottable.buildSrcUtilsRTreeMod.QueryPredicateResult with Double] = js.native
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
    def absoluteDistanceToFarEdgeX(bounds: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = js.native
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    def absoluteDistanceToFarEdgeY(bounds: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = js.native
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    def absoluteDistanceToNearEdgeX(bounds: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = js.native
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    def absoluteDistanceToNearEdgeY(bounds: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = js.native
    def bounds(bounds: Bounds): typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def distanceSquaredToFarEdge(bounds: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = js.native
    /**
      * Returns the distance squared from `p` to the nearest edge of `bounds`. If
      * the point touches or is inside the bounds, returns `0`;
      *
      * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
      */
    def distanceSquaredToNearEdge(bounds: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds, p: Point): Double = js.native
    def entityBounds(bounds: IEntityBounds): typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    /**
      * Returns true if `a` overlaps `b` in the x and y axes.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapBounds(
      a: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds,
      b: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds
    ): Boolean = js.native
    /**
      * Returns true if `a` overlaps `b` in the x axis only.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapX(
      a: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds,
      b: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds
    ): Boolean = js.native
    /**
      * Returns true if `a` overlaps `b` in the y axis only.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapY(
      a: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds,
      b: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds
    ): Boolean = js.native
    def pointPair(p0: Point, p1: Point): typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def points(points: js.Array[Point]): typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def union(
      b0: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds,
      b1: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds
    ): typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def unionAll(bounds: js.Array[typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds]): typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds = js.native
    def xywh(x: Double, y: Double, w: Double, h: Double): typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds = js.native
  }
  
  /* static members */
  @js.native
  object RTreeNode extends js.Object {
    def valueNode[T](bounds: typings.plottable.buildSrcUtilsRTreeMod.RTreeBounds, value: T): typings.plottable.buildSrcUtilsRTreeMod.RTreeNode[T] = js.native
  }
  
}


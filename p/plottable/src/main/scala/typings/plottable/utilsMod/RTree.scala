package typings.plottable.utilsMod

import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.Point
import typings.plottable.rTreeMod.IDistanceFunction
import typings.plottable.rTreeMod.QueryPredicateResult
import typings.plottable.rTreeSplitStrategiesMod.IRTreeSplitStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/utils", "RTree")
@js.native
object RTree extends js.Object {
  
  def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[/* node */ typings.plottable.rTreeMod.RTreeNode[T], QueryPredicateResult] = js.native
  
  def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[
    /* a */ typings.plottable.rTreeMod.RTreeNode[T], 
    /* b */ typings.plottable.rTreeMod.RTreeNode[T], 
    Double
  ] = js.native
  
  @js.native
  object QueryPredicateResult extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.plottable.rTreeMod.QueryPredicateResult with Double] = js.native
    
    /* 1 */ val FAIL: typings.plottable.rTreeMod.QueryPredicateResult.FAIL with Double = js.native
    
    /* 0 */ val PASS: typings.plottable.rTreeMod.QueryPredicateResult.PASS with Double = js.native
    
    /* 2 */ val PASS_AND_OVERWRITE: typings.plottable.rTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE with Double = js.native
  }
  
  @js.native
  class RTree[T] ()
    extends typings.plottable.rTreeMod.RTree[T] {
    def this(maxNodeChildren: Double) = this()
    def this(maxNodeChildren: js.UndefOr[scala.Nothing], splitStrategy: IRTreeSplitStrategy) = this()
    def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
  }
  
  @js.native
  class RTreeBounds protected ()
    extends typings.plottable.rTreeMod.RTreeBounds {
    def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
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
    def absoluteDistanceToFarEdgeX(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    def absoluteDistanceToFarEdgeY(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    def absoluteDistanceToNearEdgeX(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    def absoluteDistanceToNearEdgeY(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    
    def bounds(bounds: Bounds): typings.plottable.rTreeMod.RTreeBounds = js.native
    
    def distanceSquaredToFarEdge(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    
    /**
      * Returns the distance squared from `p` to the nearest edge of `bounds`. If
      * the point touches or is inside the bounds, returns `0`;
      *
      * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
      */
    def distanceSquaredToNearEdge(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    
    def entityBounds(bounds: IEntityBounds): typings.plottable.rTreeMod.RTreeBounds = js.native
    
    /**
      * Returns true if `a` overlaps `b` in the x and y axes.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapBounds(a: typings.plottable.rTreeMod.RTreeBounds, b: typings.plottable.rTreeMod.RTreeBounds): Boolean = js.native
    
    /**
      * Returns true if `a` overlaps `b` in the x axis only.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapX(a: typings.plottable.rTreeMod.RTreeBounds, b: typings.plottable.rTreeMod.RTreeBounds): Boolean = js.native
    
    /**
      * Returns true if `a` overlaps `b` in the y axis only.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapY(a: typings.plottable.rTreeMod.RTreeBounds, b: typings.plottable.rTreeMod.RTreeBounds): Boolean = js.native
    
    def pointPair(p0: Point, p1: Point): typings.plottable.rTreeMod.RTreeBounds = js.native
    
    def points(points: js.Array[Point]): typings.plottable.rTreeMod.RTreeBounds = js.native
    
    def union(b0: typings.plottable.rTreeMod.RTreeBounds, b1: typings.plottable.rTreeMod.RTreeBounds): typings.plottable.rTreeMod.RTreeBounds = js.native
    
    def unionAll(bounds: js.Array[typings.plottable.rTreeMod.RTreeBounds]): typings.plottable.rTreeMod.RTreeBounds = js.native
    
    def xywh(x: Double, y: Double, w: Double, h: Double): typings.plottable.rTreeMod.RTreeBounds = js.native
  }
  
  @js.native
  class RTreeNode[T] protected ()
    extends typings.plottable.rTreeMod.RTreeNode[T] {
    def this(leaf: Boolean) = this()
  }
  /* static members */
  @js.native
  object RTreeNode extends js.Object {
    
    def valueNode[T](bounds: typings.plottable.rTreeMod.RTreeBounds, value: T): typings.plottable.rTreeMod.RTreeNode[T] = js.native
  }
}

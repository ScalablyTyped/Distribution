package typings.plottable

import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.Point
import typings.plottable.rTreeSplitStrategiesMod.IRTreeSplitStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rTreeMod {
  
  @js.native
  sealed trait QueryPredicateResult extends StObject
  @JSImport("plottable/build/src/utils/rTree", "QueryPredicateResult")
  @js.native
  object QueryPredicateResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[QueryPredicateResult with Double] = js.native
    
    @js.native
    sealed trait FAIL extends QueryPredicateResult
    /* 1 */ val FAIL: typings.plottable.rTreeMod.QueryPredicateResult.FAIL with Double = js.native
    
    @js.native
    sealed trait PASS extends QueryPredicateResult
    /* 0 */ val PASS: typings.plottable.rTreeMod.QueryPredicateResult.PASS with Double = js.native
    
    @js.native
    sealed trait PASS_AND_OVERWRITE extends QueryPredicateResult
    /* 2 */ val PASS_AND_OVERWRITE: typings.plottable.rTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE with Double = js.native
  }
  
  @JSImport("plottable/build/src/utils/rTree", "RTree")
  @js.native
  class RTree[T] () extends StObject {
    def this(maxNodeChildren: Double) = this()
    def this(maxNodeChildren: js.UndefOr[scala.Nothing], splitStrategy: IRTreeSplitStrategy) = this()
    def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
    
    def clear(): Unit = js.native
    
    def getRoot(): RTreeNode[T] = js.native
    
    def insert(bounds: RTreeBounds, value: T): RTreeNode[T] = js.native
    
    def intersect(bounds: RTreeBounds): js.Array[T] = js.native
    
    def intersectX(bounds: RTreeBounds): js.Array[T] = js.native
    
    def intersectY(bounds: RTreeBounds): js.Array[T] = js.native
    
    def locate(xy: Point): js.Array[T] = js.native
    
    /**
      * Returns an array of `T` values that are the "nearest" to the query point.
      *
      * Nearness is measured as the absolute distance from the query point to the
      * nearest edge of the node bounds. If the node bounds contains the query
      * point, the distance is 0.
      */
    def locateNearest(xy: Point): js.Array[T] = js.native
    
    /**
      * Returns an array of `T` values that are the "nearest" to the query point.
      *
      * Nearness is measured as the 1-dimensional absolute distance from the
      * query's x point to the nearest edge of the node bounds. If the node
      * bounds contains the query point, the distance is 0.
      *
      * The results are sorted by y-coordinate nearness.
      */
    def locateNearestX(xy: Point): js.Array[T] = js.native
    
    /**
      * Returns an array of `T` values that are the "nearest" to the query point.
      *
      * Nearness is measured as the 1-dimensional absolute distance from the
      * query's y point to the nearest edge of the node bounds. If the node
      * bounds contains the query point, the distance is 0.
      *
      * The results are sorted by x-coordinate nearness.
      */
    def locateNearestY(xy: Point): js.Array[T] = js.native
    
    var maxNodeChildren: js.Any = js.native
    
    def query(predicate: js.Function1[/* b */ RTreeBounds, Boolean]): js.Array[T] = js.native
    
    def queryNodes(predicate: js.Function1[/* b */ RTreeNode[T], QueryPredicateResult]): js.Array[RTreeNode[T]] = js.native
    
    var root: js.Any = js.native
    
    var size: js.Any = js.native
    
    var splitStrategy: js.Any = js.native
  }
  
  @JSImport("plottable/build/src/utils/rTree", "RTreeBounds")
  @js.native
  class RTreeBounds protected () extends StObject {
    def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
    
    def area(): Double = js.native
    
    var areaCached: js.Any = js.native
    
    def contains(xy: Point): Boolean = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var xh: Double = js.native
    
    var xl: Double = js.native
    
    var yh: Double = js.native
    
    var yl: Double = js.native
  }
  /* static members */
  object RTreeBounds {
    
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.absoluteDistanceToFarEdgeX")
    @js.native
    def absoluteDistanceToFarEdgeX(bounds: RTreeBounds, p: Point): Double = js.native
    
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.absoluteDistanceToFarEdgeY")
    @js.native
    def absoluteDistanceToFarEdgeY(bounds: RTreeBounds, p: Point): Double = js.native
    
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.absoluteDistanceToNearEdgeX")
    @js.native
    def absoluteDistanceToNearEdgeX(bounds: RTreeBounds, p: Point): Double = js.native
    
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.absoluteDistanceToNearEdgeY")
    @js.native
    def absoluteDistanceToNearEdgeY(bounds: RTreeBounds, p: Point): Double = js.native
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.bounds")
    @js.native
    def bounds(bounds: Bounds): RTreeBounds = js.native
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.distanceSquaredToFarEdge")
    @js.native
    def distanceSquaredToFarEdge(bounds: RTreeBounds, p: Point): Double = js.native
    
    /**
      * Returns the distance squared from `p` to the nearest edge of `bounds`. If
      * the point touches or is inside the bounds, returns `0`;
      *
      * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
      */
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.distanceSquaredToNearEdge")
    @js.native
    def distanceSquaredToNearEdge(bounds: RTreeBounds, p: Point): Double = js.native
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.entityBounds")
    @js.native
    def entityBounds(bounds: IEntityBounds): RTreeBounds = js.native
    
    /**
      * Returns true if `a` overlaps `b` in the x and y axes.
      *
      * Touching counts as overlap.
      */
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.isBoundsOverlapBounds")
    @js.native
    def isBoundsOverlapBounds(a: RTreeBounds, b: RTreeBounds): Boolean = js.native
    
    /**
      * Returns true if `a` overlaps `b` in the x axis only.
      *
      * Touching counts as overlap.
      */
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.isBoundsOverlapX")
    @js.native
    def isBoundsOverlapX(a: RTreeBounds, b: RTreeBounds): Boolean = js.native
    
    /**
      * Returns true if `a` overlaps `b` in the y axis only.
      *
      * Touching counts as overlap.
      */
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.isBoundsOverlapY")
    @js.native
    def isBoundsOverlapY(a: RTreeBounds, b: RTreeBounds): Boolean = js.native
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.pointPair")
    @js.native
    def pointPair(p0: Point, p1: Point): RTreeBounds = js.native
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.points")
    @js.native
    def points(points: js.Array[Point]): RTreeBounds = js.native
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.union")
    @js.native
    def union(b0: RTreeBounds, b1: RTreeBounds): RTreeBounds = js.native
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.unionAll")
    @js.native
    def unionAll(bounds: js.Array[RTreeBounds]): RTreeBounds = js.native
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds.xywh")
    @js.native
    def xywh(x: Double, y: Double, w: Double, h: Double): RTreeBounds = js.native
  }
  
  @JSImport("plottable/build/src/utils/rTree", "RTreeNode")
  @js.native
  class RTreeNode[T] protected () extends StObject {
    def this(leaf: Boolean) = this()
    
    var bounds: RTreeBounds = js.native
    
    var entries: js.Array[RTreeNode[T]] = js.native
    
    /**
      * Inserts a child node and updates the ancestry bounds.
      */
    def insert(node: RTreeNode[T]): this.type = js.native
    
    var leaf: Boolean = js.native
    
    /**
      * Returns the depth from this node to the deepest leaf descendant.
      */
    def maxDepth(): Double = js.native
    
    /**
      * Returns `true` iff this node has more children than the `maxNodeChildren`
      * parameter.
      */
    def overflow(maxNodeChildren: Double): Boolean = js.native
    
    var parent: RTreeNode[T] = js.native
    
    /**
      * Removes a child node and updates the ancestry bounds.
      *
      * If the node argument is not a child, do nothing.
      */
    def remove(node: RTreeNode[T]): this.type = js.native
    
    /**
      * Splits this node by creating two new nodes and dividing the this node's
      * children between them. This node is removed from its parent and the two
      * new nodes are added.
      *
      * If this node is the root, a new parent node is created.
      *
      * Returns the parent node.
      */
    def split(strategy: IRTreeSplitStrategy): RTreeNode[T] = js.native
    
    /**
      * Chooses an node from then entries that minimizes the area difference that
      * adding the bounds the each entry would cause.
      */
    def subtree(bounds: RTreeBounds): RTreeNode[T] = js.native
    
    /**
      * Returns the difference in area that adding an entry `bounds` to the node
      * would cause.
      */
    def unionAreaDifference(bounds: RTreeBounds): Double = js.native
    
    var value: T = js.native
  }
  /* static members */
  object RTreeNode {
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeNode.valueNode")
    @js.native
    def valueNode[T](bounds: RTreeBounds, value: T): RTreeNode[T] = js.native
  }
  
  @JSImport("plottable/build/src/utils/rTree", "createMinimizingNodePredicate")
  @js.native
  def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[/* node */ RTreeNode[T], QueryPredicateResult] = js.native
  
  @JSImport("plottable/build/src/utils/rTree", "createNodeSort")
  @js.native
  def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[/* a */ RTreeNode[T], /* b */ RTreeNode[T], Double] = js.native
  
  type IDistanceFunction = js.Function2[/* bounds */ RTreeBounds, /* p */ Point, Double]
}

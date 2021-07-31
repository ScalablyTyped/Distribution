package typings.plottable

import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.Point
import typings.plottable.rTreeSplitStrategiesMod.IRTreeSplitStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rTreeMod {
  
  @JSImport("plottable/build/src/utils/rTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait QueryPredicateResult extends StObject
  @JSImport("plottable/build/src/utils/rTree", "QueryPredicateResult")
  @js.native
  object QueryPredicateResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[QueryPredicateResult & Double] = js.native
    
    @js.native
    sealed trait FAIL
      extends StObject
         with QueryPredicateResult
    /* 1 */ val FAIL: typings.plottable.rTreeMod.QueryPredicateResult.FAIL & Double = js.native
    
    @js.native
    sealed trait PASS
      extends StObject
         with QueryPredicateResult
    /* 0 */ val PASS: typings.plottable.rTreeMod.QueryPredicateResult.PASS & Double = js.native
    
    @js.native
    sealed trait PASS_AND_OVERWRITE
      extends StObject
         with QueryPredicateResult
    /* 2 */ val PASS_AND_OVERWRITE: typings.plottable.rTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE & Double = js.native
  }
  
  @JSImport("plottable/build/src/utils/rTree", "RTree")
  @js.native
  class RTree[T] () extends StObject {
    def this(maxNodeChildren: Double) = this()
    def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
    def this(maxNodeChildren: Unit, splitStrategy: IRTreeSplitStrategy) = this()
    
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
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeBounds")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    @scala.inline
    def absoluteDistanceToFarEdgeX(bounds: RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDistanceToFarEdgeX")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    @scala.inline
    def absoluteDistanceToFarEdgeY(bounds: RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDistanceToFarEdgeY")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    @scala.inline
    def absoluteDistanceToNearEdgeX(bounds: RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDistanceToNearEdgeX")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    @scala.inline
    def absoluteDistanceToNearEdgeY(bounds: RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDistanceToNearEdgeY")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def bounds(bounds: Bounds): RTreeBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(bounds.asInstanceOf[js.Any]).asInstanceOf[RTreeBounds]
    
    @scala.inline
    def distanceSquaredToFarEdge(bounds: RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquaredToFarEdge")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns the distance squared from `p` to the nearest edge of `bounds`. If
      * the point touches or is inside the bounds, returns `0`;
      *
      * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
      */
    @scala.inline
    def distanceSquaredToNearEdge(bounds: RTreeBounds, p: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquaredToNearEdge")(bounds.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def entityBounds(bounds: IEntityBounds): RTreeBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("entityBounds")(bounds.asInstanceOf[js.Any]).asInstanceOf[RTreeBounds]
    
    /**
      * Returns true if `a` overlaps `b` in the x and y axes.
      *
      * Touching counts as overlap.
      */
    @scala.inline
    def isBoundsOverlapBounds(a: RTreeBounds, b: RTreeBounds): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoundsOverlapBounds")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns true if `a` overlaps `b` in the x axis only.
      *
      * Touching counts as overlap.
      */
    @scala.inline
    def isBoundsOverlapX(a: RTreeBounds, b: RTreeBounds): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoundsOverlapX")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Returns true if `a` overlaps `b` in the y axis only.
      *
      * Touching counts as overlap.
      */
    @scala.inline
    def isBoundsOverlapY(a: RTreeBounds, b: RTreeBounds): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBoundsOverlapY")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def pointPair(p0: Point, p1: Point): RTreeBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPair")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[RTreeBounds]
    
    @scala.inline
    def points(points: js.Array[Point]): RTreeBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("points")(points.asInstanceOf[js.Any]).asInstanceOf[RTreeBounds]
    
    @scala.inline
    def union(b0: RTreeBounds, b1: RTreeBounds): RTreeBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(b0.asInstanceOf[js.Any], b1.asInstanceOf[js.Any])).asInstanceOf[RTreeBounds]
    
    @scala.inline
    def unionAll(bounds: js.Array[RTreeBounds]): RTreeBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("unionAll")(bounds.asInstanceOf[js.Any]).asInstanceOf[RTreeBounds]
    
    @scala.inline
    def xywh(x: Double, y: Double, w: Double, h: Double): RTreeBounds = (^.asInstanceOf[js.Dynamic].applyDynamic("xywh")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[RTreeBounds]
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
    
    @JSImport("plottable/build/src/utils/rTree", "RTreeNode")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def valueNode[T](bounds: RTreeBounds, value: T): RTreeNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("valueNode")(bounds.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RTreeNode[T]]
  }
  
  @scala.inline
  def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[/* node */ RTreeNode[T], QueryPredicateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMinimizingNodePredicate")(point.asInstanceOf[js.Any], nearFn.asInstanceOf[js.Any], farFn.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* node */ RTreeNode[T], QueryPredicateResult]]
  
  @scala.inline
  def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[/* a */ RTreeNode[T], /* b */ RTreeNode[T], Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNodeSort")(point.asInstanceOf[js.Any], distanceFn.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ RTreeNode[T], /* b */ RTreeNode[T], Double]]
  
  type IDistanceFunction = js.Function2[/* bounds */ RTreeBounds, /* p */ Point, Double]
}

package typings
package plottableLib.plottableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Utils")
@js.native
object UtilsNs extends js.Object {
  @js.native
  class Bucket protected ()
    extends plottableLib.buildSrcUtilsMod.Bucket {
    def this(index: scala.Double, xValue: scala.Double, yValue: scala.Double) = this()
  }
  
  @js.native
  class CallbackSet[CB /* <: js.Function */] ()
    extends plottableLib.buildSrcUtilsMod.CallbackSet[CB]
  
  @js.native
  class EntityStore[T /* <: plottableLib.buildSrcUtilsEntityStoreMod.IPositionedEntity */] ()
    extends plottableLib.buildSrcUtilsMod.EntityStore[T]
  
  @js.native
  class Map[K, V] ()
    extends plottableLib.buildSrcUtilsMod.Map[K, V]
  
  @js.native
  class Set[T] ()
    extends plottableLib.buildSrcUtilsMod.Set[T]
  
  @js.native
  class Translator protected ()
    extends plottableLib.buildSrcUtilsMod.Translator {
    def this(_rootElement: stdLib.HTMLElement) = this()
  }
  
  def assign[T /* <: stdLib.Record[_, _] */](objs: stdLib.Partial[T]*): T = js.native
  def coerceExternalD3[S /* <: d3DashSelectionLib.d3DashSelectionMod.Selection[_, _, _, _] */](externalD3Selection: S): S = js.native
  def getTranslator(component: plottableLib.buildSrcComponentsComponentMod.Component): plottableLib.buildSrcUtilsTransformAwareTranslatorMod.Translator = js.native
  @JSName("Array")
  @js.native
  object ArrayNs extends js.Object {
    def add(aList: js.Array[scala.Double], bList: js.Array[scala.Double]): js.Array[scala.Double] = js.native
    def createFilledArray[T](value: T, count: scala.Double): js.Array[T] = js.native
    def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[scala.Double], T], count: scala.Double): js.Array[T] = js.native
    def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = js.native
    def uniq[T](arr: js.Array[T]): js.Array[T] = js.native
  }
  
  @JSName("Color")
  @js.native
  object ColorNs extends js.Object {
    def colorTest(
      colorTester: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_],
      className: java.lang.String
    ): java.lang.String = js.native
    def contrast(a: java.lang.String, b: java.lang.String): scala.Double = js.native
    def lightenColor(color: java.lang.String, factor: scala.Double): java.lang.String = js.native
  }
  
  @JSName("DOM")
  @js.native
  object DOMNs extends js.Object {
    var SCREEN_REFRESH_RATE_MILLISECONDS: scala.Double = js.native
    def clientRectInside(innerClientRect: stdLib.ClientRect, outerClientRect: stdLib.ClientRect): scala.Boolean = js.native
    def clientRectsOverlap(clientRectA: stdLib.ClientRect, clientRectB: stdLib.ClientRect): scala.Boolean = js.native
    def contains(parent: stdLib.Element, child: stdLib.Element): scala.Boolean = js.native
    def elementBBox(element: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): stdLib.SVGRect = js.native
    def elementHeight(elementOrSelection: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.Element, _, _, _]): scala.Double = js.native
    def elementHeight(elementOrSelection: stdLib.Element): scala.Double = js.native
    def elementWidth(elementOrSelection: d3DashSelectionLib.d3DashSelectionMod.Selection[stdLib.Element, _, _, _]): scala.Double = js.native
    def elementWidth(elementOrSelection: stdLib.Element): scala.Double = js.native
    def entityBounds(element: stdLib.Element): plottableLib.buildSrcCoreInterfacesMod.IEntityBounds = js.native
    def expandRect(rect: stdLib.ClientRect, amount: scala.Double): plottableLib.Anon_BottomLeft = js.native
    def getElementTransform(elem: stdLib.Element): plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix | scala.Null = js.native
    def getHtmlElementAncestors(elem: stdLib.Element): js.Array[stdLib.HTMLElement] = js.native
    def getRotate(el: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): scala.Double = js.native
    def getScaleValues(el: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): js.Tuple2[scala.Double, scala.Double] = js.native
    def getTranslateValues(el: plottableLib.buildSrcCoreInterfacesMod.SimpleSelection[_]): js.Tuple2[scala.Double, scala.Double] = js.native
    def intersectsBBox(
      xValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
      yValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
      bbox: stdLib.SVGRect
    ): scala.Boolean = js.native
    def intersectsBBox(
      xValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
      yValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
      bbox: stdLib.SVGRect,
      tolerance: scala.Double
    ): scala.Boolean = js.native
    def intersectsBBox(
      xValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
      yValOrRange: scala.Double,
      bbox: stdLib.SVGRect
    ): scala.Boolean = js.native
    def intersectsBBox(
      xValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
      yValOrRange: scala.Double,
      bbox: stdLib.SVGRect,
      tolerance: scala.Double
    ): scala.Boolean = js.native
    def intersectsBBox(
      xValOrRange: scala.Double,
      yValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
      bbox: stdLib.SVGRect
    ): scala.Boolean = js.native
    def intersectsBBox(
      xValOrRange: scala.Double,
      yValOrRange: plottableLib.buildSrcCoreInterfacesMod.Range,
      bbox: stdLib.SVGRect,
      tolerance: scala.Double
    ): scala.Boolean = js.native
    def intersectsBBox(xValOrRange: scala.Double, yValOrRange: scala.Double, bbox: stdLib.SVGRect): scala.Boolean = js.native
    def intersectsBBox(
      xValOrRange: scala.Double,
      yValOrRange: scala.Double,
      bbox: stdLib.SVGRect,
      tolerance: scala.Double
    ): scala.Boolean = js.native
    def requestAnimationFramePolyfill(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  }
  
  @JSName("Math")
  @js.native
  object MathNs extends js.Object {
    def applyTransform(
      a: plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix,
      p: plottableLib.buildSrcCoreInterfacesMod.Point
    ): plottableLib.buildSrcCoreInterfacesMod.Point = js.native
    def boundsIntersects(
      aX: scala.Double,
      aY: scala.Double,
      aWidth: scala.Double,
      aHeight: scala.Double,
      bX: scala.Double,
      bY: scala.Double,
      bWidth: scala.Double,
      bHeight: scala.Double
    ): scala.Boolean = js.native
    def clamp(x: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
    def degreesToRadians(degree: scala.Double): scala.Double = js.native
    def distanceSquared(p1: plottableLib.buildSrcCoreInterfacesMod.Point, p2: plottableLib.buildSrcCoreInterfacesMod.Point): scala.Double = js.native
    def getCumulativeTransform(element: stdLib.Element): plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix = js.native
    def inRange(x: scala.Double, a: scala.Double, b: scala.Double): scala.Boolean = js.native
    def invertMatrix(a: plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix): plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix = js.native
    def isNaN(n: js.Any): scala.Boolean = js.native
    def isValidNumber(n: js.Any): scala.Boolean = js.native
    def max[C](array: js.Array[C], defaultValue: C): C = js.native
    def max[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[scala.Double], C],
      defaultValue: C
    ): C = js.native
    def min[C](array: js.Array[C], defaultValue: C): C = js.native
    def min[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[scala.Double], C],
      defaultValue: C
    ): C = js.native
    def multiplyMatrix(
      a: plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix,
      b: plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix
    ): plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix = js.native
    def multiplyTranslate(
      a: plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix,
      v: plottableLib.buildSrcUtilsMathUtilsMod.ITranslateVector
    ): plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix = js.native
    def premultiplyTranslate(
      v: plottableLib.buildSrcUtilsMathUtilsMod.ITranslateVector,
      b: plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix
    ): plottableLib.buildSrcUtilsMathUtilsMod.ICssTransformMatrix = js.native
    def range(start: scala.Double, stop: scala.Double): js.Array[scala.Double] = js.native
    def range(start: scala.Double, stop: scala.Double, step: scala.Double): js.Array[scala.Double] = js.native
    def within(
      p: plottableLib.buildSrcCoreInterfacesMod.Point,
      bounds: plottableLib.buildSrcCoreInterfacesMod.Bounds
    ): scala.Boolean = js.native
  }
  
  @JSName("RTree")
  @js.native
  object RTreeNs extends js.Object {
    @js.native
    class RTree[T] ()
      extends plottableLib.buildSrcUtilsMod.RTreeNs.RTree[T] {
      def this(maxNodeChildren: scala.Double) = this()
      def this(maxNodeChildren: scala.Double, splitStrategy: plottableLib.buildSrcUtilsRTreeSplitStrategiesMod.IRTreeSplitStrategy) = this()
    }
    
    @js.native
    class RTreeBounds protected ()
      extends plottableLib.buildSrcUtilsMod.RTreeNs.RTreeBounds {
      def this(xl: scala.Double, yl: scala.Double, xh: scala.Double, yh: scala.Double) = this()
    }
    
    @js.native
    class RTreeNode[T] protected ()
      extends plottableLib.buildSrcUtilsMod.RTreeNs.RTreeNode[T] {
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
    
    @js.native
    object RTreeNode extends js.Object {
      def valueNode[T](bounds: plottableLib.buildSrcUtilsRTreeMod.RTreeBounds, value: T): plottableLib.buildSrcUtilsRTreeMod.RTreeNode[T] = js.native
    }
    
    type QueryPredicateResult = plottableLib.buildSrcUtilsRTreeMod.QueryPredicateResult
  }
  
  @JSName("Stacking")
  @js.native
  object StackingNs extends js.Object {
    val IStackingOrder: plottableLib.Anon_Topdown = js.native
    val normalizeKey: (js.Function1[/* key */ js.Any, java.lang.String]) with lodashLib.lodashMod.underscoreNs.MemoizedFunction = js.native
    def stack(
      datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset],
      keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
      valueAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double]
    ): plottableLib.buildSrcUtilsStackingUtilsMod.StackingResult = js.native
    def stack(
      datasets: js.Array[plottableLib.buildSrcCoreDatasetMod.Dataset],
      keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
      valueAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Double],
      stackingOrder: plottableLib.buildSrcUtilsStackingUtilsMod.IStackingOrder
    ): plottableLib.buildSrcUtilsStackingUtilsMod.StackingResult = js.native
    def stackedExtent(
      stackingResult: plottableLib.buildSrcUtilsStackingUtilsMod.StackingResult,
      keyAccessor: plottableLib.buildSrcCoreInterfacesMod.IAccessor[_],
      filter: plottableLib.buildSrcCoreInterfacesMod.IAccessor[scala.Boolean]
    ): js.Array[scala.Double] = js.native
    def stackedExtents[D](stackingResult: plottableLib.buildSrcUtilsStackingUtilsMod.GenericStackingResult[D]): plottableLib.Anon_MinimumExtents[D] = js.native
  }
  
  @js.native
  object Translator extends js.Object {
    /**
      * Is the event's target part of the given component's DOM tree?
      */
    def isEventInside(component: plottableLib.buildSrcComponentsComponentMod.Component, e: stdLib.Event): scala.Boolean = js.native
  }
  
  @JSName("Window")
  @js.native
  object WindowNs extends js.Object {
    def debounce[T /* <: js.Function */](msec: scala.Double, callback: T): T = js.native
    def debounce[T /* <: js.Function */](msec: scala.Double, callback: T, context: js.Any): T = js.native
    def deprecated(callingMethod: java.lang.String, version: java.lang.String): scala.Unit = js.native
    def deprecated(callingMethod: java.lang.String, version: java.lang.String, message: java.lang.String): scala.Unit = js.native
    def setTimeout(f: js.Function, time: scala.Double, args: js.Any*): scala.Double = js.native
    def warn(warning: java.lang.String): scala.Unit = js.native
  }
  
}


package typings.plottable.plottableMod

import typings.d3DashSelection.d3DashSelectionMod.Selection
import typings.lodash.lodashMod.MemoizedFunction
import typings.plottable.Anon_BottomHeight
import typings.plottable.Anon_MaximumExtents
import typings.plottable.buildSrcCoreInterfacesMod.Bounds
import typings.plottable.buildSrcCoreInterfacesMod.IAccessor
import typings.plottable.buildSrcCoreInterfacesMod.IEntityBounds
import typings.plottable.buildSrcCoreInterfacesMod.Point
import typings.plottable.buildSrcCoreInterfacesMod.Range
import typings.plottable.buildSrcCoreInterfacesMod.SimpleSelection
import typings.plottable.buildSrcUtilsEntityStoreMod.IPositionedEntity
import typings.plottable.buildSrcUtilsMathUtilsMod.ICssTransformMatrix
import typings.plottable.buildSrcUtilsMathUtilsMod.ITranslateVector
import typings.plottable.buildSrcUtilsRTreeMod.IDistanceFunction
import typings.plottable.buildSrcUtilsRTreeSplitStrategiesMod.IRTreeSplitStrategy
import typings.plottable.buildSrcUtilsStackingUtilsMod.GenericStackingResult
import typings.plottable.buildSrcUtilsStackingUtilsMod.StackingResult
import typings.std.ClientRect
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.Record
import typings.std.SVGRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Utils")
@js.native
object UtilsNs extends js.Object {
  @js.native
  class Bucket protected ()
    extends typings.plottable.buildSrcUtilsMod.Bucket {
    def this(index: Double, xValue: Double, yValue: Double) = this()
  }
  
  @js.native
  class CallbackSet[CB /* <: js.Function */] ()
    extends typings.plottable.buildSrcUtilsMod.CallbackSet[CB]
  
  @js.native
  class EntityStore[T /* <: IPositionedEntity */] ()
    extends typings.plottable.buildSrcUtilsMod.EntityStore[T]
  
  @js.native
  class Map[K, V] ()
    extends typings.plottable.buildSrcUtilsMod.Map[K, V]
  
  @js.native
  class Set[T] ()
    extends typings.plottable.buildSrcUtilsMod.Set[T]
  
  @js.native
  class Translator protected ()
    extends typings.plottable.buildSrcUtilsMod.Translator {
    def this(_rootElement: HTMLElement) = this()
  }
  
  def assign[T /* <: Record[_, _] */](objs: Partial[T]*): T = js.native
  def coerceExternalD3[S /* <: Selection[_, _, _, _] */](externalD3Selection: S): S = js.native
  def getTranslator(component: typings.plottable.buildSrcComponentsComponentMod.Component): typings.plottable.buildSrcUtilsTransformAwareTranslatorMod.Translator = js.native
  @JSName("Array")
  @js.native
  object ArrayNs extends js.Object {
    def add(aList: js.Array[Double], bList: js.Array[Double]): js.Array[Double] = js.native
    def createFilledArray[T](value: T, count: Double): js.Array[T] = js.native
    def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[Double], T], count: Double): js.Array[T] = js.native
    def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = js.native
    def uniq[T](arr: js.Array[T]): js.Array[T] = js.native
  }
  
  @JSName("Color")
  @js.native
  object ColorNs extends js.Object {
    def colorTest(colorTester: SimpleSelection[_], className: String): String = js.native
    def contrast(a: String, b: String): Double = js.native
    def lightenColor(color: String, factor: Double): String = js.native
  }
  
  @JSName("DOM")
  @js.native
  object DOMNs extends js.Object {
    var SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
    def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = js.native
    def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = js.native
    def contains(parent: Element, child: Element): Boolean = js.native
    def elementBBox(element: SimpleSelection[_]): SVGRect = js.native
    def elementHeight(elementOrSelection: Selection[Element, _, _, _]): Double = js.native
    def elementHeight(elementOrSelection: Element): Double = js.native
    def elementWidth(elementOrSelection: Selection[Element, _, _, _]): Double = js.native
    def elementWidth(elementOrSelection: Element): Double = js.native
    def entityBounds(element: Element): IEntityBounds = js.native
    def expandRect(rect: ClientRect, amount: Double): Anon_BottomHeight = js.native
    def getElementTransform(elem: Element): ICssTransformMatrix | Null = js.native
    def getHtmlElementAncestors(elem: Element): js.Array[HTMLElement] = js.native
    def getRotate(el: SimpleSelection[_]): Double = js.native
    def getScaleValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
    def getTranslateValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
    def requestAnimationFramePolyfill(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSName("Math")
  @js.native
  object MathNs extends js.Object {
    def applyTransform(a: ICssTransformMatrix, p: Point): Point = js.native
    def boundsIntersects(
      aX: Double,
      aY: Double,
      aWidth: Double,
      aHeight: Double,
      bX: Double,
      bY: Double,
      bWidth: Double,
      bHeight: Double
    ): Boolean = js.native
    def clamp(x: Double, min: Double, max: Double): Double = js.native
    def degreesToRadians(degree: Double): Double = js.native
    def distanceSquared(p1: Point, p2: Point): Double = js.native
    def getCumulativeTransform(element: Element): ICssTransformMatrix = js.native
    def inRange(x: Double, a: Double, b: Double): Boolean = js.native
    def invertMatrix(a: ICssTransformMatrix): ICssTransformMatrix = js.native
    def isNaN(n: js.Any): Boolean = js.native
    def isValidNumber(n: js.Any): Boolean = js.native
    def max[C](array: js.Array[C], defaultValue: C): C = js.native
    def max[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
      defaultValue: C
    ): C = js.native
    def min[C](array: js.Array[C], defaultValue: C): C = js.native
    def min[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
      defaultValue: C
    ): C = js.native
    def multiplyMatrix(a: ICssTransformMatrix, b: ICssTransformMatrix): ICssTransformMatrix = js.native
    def multiplyTranslate(a: ICssTransformMatrix, v: ITranslateVector): ICssTransformMatrix = js.native
    def premultiplyTranslate(v: ITranslateVector, b: ICssTransformMatrix): ICssTransformMatrix = js.native
    def range(start: Double, stop: Double): js.Array[Double] = js.native
    def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native
    def within(p: Point, bounds: Bounds): Boolean = js.native
  }
  
  @JSName("RTree")
  @js.native
  object RTreeNs extends js.Object {
    @js.native
    class RTree[T] ()
      extends typings.plottable.buildSrcUtilsMod.RTreeNs.RTree[T] {
      def this(maxNodeChildren: Double) = this()
      def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
    }
    
    @js.native
    class RTreeBounds protected ()
      extends typings.plottable.buildSrcUtilsMod.RTreeNs.RTreeBounds {
      def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
    }
    
    @js.native
    class RTreeNode[T] protected ()
      extends typings.plottable.buildSrcUtilsMod.RTreeNs.RTreeNode[T] {
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
  
  @JSName("Stacking")
  @js.native
  object StackingNs extends js.Object {
    val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
    def stack(
      datasets: js.Array[typings.plottable.buildSrcCoreDatasetMod.Dataset],
      keyAccessor: IAccessor[_],
      valueAccessor: IAccessor[Double]
    ): StackingResult = js.native
    def stack(
      datasets: js.Array[typings.plottable.buildSrcCoreDatasetMod.Dataset],
      keyAccessor: IAccessor[_],
      valueAccessor: IAccessor[Double],
      stackingOrder: typings.plottable.buildSrcUtilsStackingUtilsMod.IStackingOrder
    ): StackingResult = js.native
    def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
    def stackedExtents[D](stackingResult: GenericStackingResult[D]): Anon_MaximumExtents[D] = js.native
    @js.native
    object IStackingOrder extends js.Object {
      var bottomup: typings.plottable.plottableStrings.bottomup = js.native
      var topdown: typings.plottable.plottableStrings.topdown = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Translator extends js.Object {
    /**
      * Is the event's target part of the given component's DOM tree?
      */
    def isEventInside(component: typings.plottable.buildSrcComponentsComponentMod.Component, e: Event): Boolean = js.native
  }
  
  @JSName("Window")
  @js.native
  object WindowNs extends js.Object {
    def debounce[T /* <: js.Function */](msec: Double, callback: T): T = js.native
    def debounce[T /* <: js.Function */](msec: Double, callback: T, context: js.Any): T = js.native
    def deprecated(callingMethod: String, version: String): Unit = js.native
    def deprecated(callingMethod: String, version: String, message: String): Unit = js.native
    def setTimeout(f: js.Function, time: Double, args: js.Any*): Double = js.native
    def warn(warning: String): Unit = js.native
  }
  
}


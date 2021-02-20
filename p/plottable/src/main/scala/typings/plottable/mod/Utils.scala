package typings.plottable.mod

import typings.d3Selection.mod.Selection_
import typings.lodash.mod.MemoizedFunction
import typings.plottable.anon.Left
import typings.plottable.anon.MaximumExtents
import typings.plottable.entityStoreMod.IPositionedEntity
import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.IAccessor
import typings.plottable.interfacesMod.IEntityBounds
import typings.plottable.interfacesMod.Point
import typings.plottable.interfacesMod.Range
import typings.plottable.interfacesMod.SimpleSelection
import typings.plottable.mathUtilsMod.ICssTransformMatrix
import typings.plottable.mathUtilsMod.ITranslateVector
import typings.plottable.plottableStrings.bottomup
import typings.plottable.plottableStrings.topdown
import typings.plottable.rTreeMod.IDistanceFunction
import typings.plottable.rTreeMod.QueryPredicateResult
import typings.plottable.rTreeSplitStrategiesMod.IRTreeSplitStrategy
import typings.plottable.stackingUtilsMod.GenericStackingResult
import typings.plottable.stackingUtilsMod.IStackingOrder
import typings.plottable.stackingUtilsMod.StackingResult
import typings.std.ClientRect
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.Record
import typings.std.SVGRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utils {
  
  object Array {
    
    @JSImport("plottable", "Utils.Array.add")
    @js.native
    def add(aList: js.Array[Double], bList: js.Array[Double]): js.Array[Double] = js.native
    
    @JSImport("plottable", "Utils.Array.createFilledArray")
    @js.native
    def createFilledArray[T](value: T, count: Double): js.Array[T] = js.native
    @JSImport("plottable", "Utils.Array.createFilledArray")
    @js.native
    def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[Double], T], count: Double): js.Array[T] = js.native
    
    @JSImport("plottable", "Utils.Array.flatten")
    @js.native
    def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = js.native
    
    @JSImport("plottable", "Utils.Array.uniq")
    @js.native
    def uniq[T](arr: js.Array[T]): js.Array[T] = js.native
  }
  
  @JSImport("plottable", "Utils.Bucket")
  @js.native
  class Bucket protected ()
    extends typings.plottable.utilsMod.Bucket {
    def this(index: Double, xValue: Double, yValue: Double) = this()
  }
  
  @JSImport("plottable", "Utils.CallbackSet")
  @js.native
  class CallbackSet[CB /* <: js.Function */] ()
    extends typings.plottable.utilsMod.CallbackSet[CB]
  
  object Color {
    
    @JSImport("plottable", "Utils.Color.colorTest")
    @js.native
    def colorTest(colorTester: SimpleSelection[_], className: String): String = js.native
    
    @JSImport("plottable", "Utils.Color.contrast")
    @js.native
    def contrast(a: String, b: String): Double = js.native
    
    @JSImport("plottable", "Utils.Color.lightenColor")
    @js.native
    def lightenColor(color: String, factor: Double): String = js.native
  }
  
  object DOM {
    
    @JSImport("plottable", "Utils.DOM")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable", "Utils.DOM.SCREEN_REFRESH_RATE_MILLISECONDS")
    @js.native
    def SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
    @scala.inline
    def SCREEN_REFRESH_RATE_MILLISECONDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN_REFRESH_RATE_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable", "Utils.DOM.clientRectInside")
    @js.native
    def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = js.native
    
    @JSImport("plottable", "Utils.DOM.clientRectsOverlap")
    @js.native
    def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = js.native
    
    @JSImport("plottable", "Utils.DOM.contains")
    @js.native
    def contains(parent: Element, child: Element): Boolean = js.native
    
    @JSImport("plottable", "Utils.DOM.elementBBox")
    @js.native
    def elementBBox(element: SimpleSelection[_]): SVGRect = js.native
    
    @JSImport("plottable", "Utils.DOM.elementHeight")
    @js.native
    def elementHeight(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
    @JSImport("plottable", "Utils.DOM.elementHeight")
    @js.native
    def elementHeight(elementOrSelection: Element): Double = js.native
    
    @JSImport("plottable", "Utils.DOM.elementWidth")
    @js.native
    def elementWidth(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
    @JSImport("plottable", "Utils.DOM.elementWidth")
    @js.native
    def elementWidth(elementOrSelection: Element): Double = js.native
    
    @JSImport("plottable", "Utils.DOM.entityBounds")
    @js.native
    def entityBounds(element: Element): IEntityBounds = js.native
    
    @JSImport("plottable", "Utils.DOM.expandRect")
    @js.native
    def expandRect(rect: ClientRect, amount: Double): Left = js.native
    
    @JSImport("plottable", "Utils.DOM.getElementTransform")
    @js.native
    def getElementTransform(elem: Element): ICssTransformMatrix | Null = js.native
    
    @JSImport("plottable", "Utils.DOM.getHtmlElementAncestors")
    @js.native
    def getHtmlElementAncestors(elem: Element): js.Array[HTMLElement] = js.native
    
    @JSImport("plottable", "Utils.DOM.getRotate")
    @js.native
    def getRotate(el: SimpleSelection[_]): Double = js.native
    
    @JSImport("plottable", "Utils.DOM.getScaleValues")
    @js.native
    def getScaleValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
    
    @JSImport("plottable", "Utils.DOM.getTranslateValues")
    @js.native
    def getTranslateValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
    
    @JSImport("plottable", "Utils.DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
    @JSImport("plottable", "Utils.DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
    @JSImport("plottable", "Utils.DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
    @JSImport("plottable", "Utils.DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
    @JSImport("plottable", "Utils.DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
    @JSImport("plottable", "Utils.DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
    @JSImport("plottable", "Utils.DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
    @JSImport("plottable", "Utils.DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
    
    @JSImport("plottable", "Utils.DOM.requestAnimationFramePolyfill")
    @js.native
    def requestAnimationFramePolyfill(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("plottable", "Utils.EntityStore")
  @js.native
  class EntityStore[T /* <: IPositionedEntity */] ()
    extends typings.plottable.utilsMod.EntityStore[T]
  
  @JSImport("plottable", "Utils.Map")
  @js.native
  class Map[K, V] ()
    extends typings.plottable.utilsMod.Map[K, V]
  
  object Math {
    
    @JSImport("plottable", "Utils.Math.applyTransform")
    @js.native
    def applyTransform(a: ICssTransformMatrix, p: Point): Point = js.native
    
    @JSImport("plottable", "Utils.Math.boundsIntersects")
    @js.native
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
    
    @JSImport("plottable", "Utils.Math.clamp")
    @js.native
    def clamp(x: Double, min: Double, max: Double): Double = js.native
    
    @JSImport("plottable", "Utils.Math.degreesToRadians")
    @js.native
    def degreesToRadians(degree: Double): Double = js.native
    
    @JSImport("plottable", "Utils.Math.distanceSquared")
    @js.native
    def distanceSquared(p1: Point, p2: Point): Double = js.native
    
    @JSImport("plottable", "Utils.Math.getCumulativeTransform")
    @js.native
    def getCumulativeTransform(element: Element): ICssTransformMatrix = js.native
    
    @JSImport("plottable", "Utils.Math.inRange")
    @js.native
    def inRange(x: Double, a: Double, b: Double): Boolean = js.native
    
    @JSImport("plottable", "Utils.Math.invertMatrix")
    @js.native
    def invertMatrix(a: ICssTransformMatrix): ICssTransformMatrix = js.native
    
    @JSImport("plottable", "Utils.Math.isNaN")
    @js.native
    def isNaN(n: js.Any): Boolean = js.native
    
    @JSImport("plottable", "Utils.Math.isValidNumber")
    @js.native
    def isValidNumber(n: js.Any): Boolean = js.native
    
    @JSImport("plottable", "Utils.Math.max")
    @js.native
    def max[C](array: js.Array[C], defaultValue: C): C = js.native
    @JSImport("plottable", "Utils.Math.max")
    @js.native
    def max[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
      defaultValue: C
    ): C = js.native
    
    @JSImport("plottable", "Utils.Math.min")
    @js.native
    def min[C](array: js.Array[C], defaultValue: C): C = js.native
    @JSImport("plottable", "Utils.Math.min")
    @js.native
    def min[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
      defaultValue: C
    ): C = js.native
    
    @JSImport("plottable", "Utils.Math.multiplyMatrix")
    @js.native
    def multiplyMatrix(a: ICssTransformMatrix, b: ICssTransformMatrix): ICssTransformMatrix = js.native
    
    @JSImport("plottable", "Utils.Math.multiplyTranslate")
    @js.native
    def multiplyTranslate(a: ICssTransformMatrix, v: ITranslateVector): ICssTransformMatrix = js.native
    
    @JSImport("plottable", "Utils.Math.premultiplyTranslate")
    @js.native
    def premultiplyTranslate(v: ITranslateVector, b: ICssTransformMatrix): ICssTransformMatrix = js.native
    
    @JSImport("plottable", "Utils.Math.range")
    @js.native
    def range(start: Double, stop: Double): js.Array[Double] = js.native
    @JSImport("plottable", "Utils.Math.range")
    @js.native
    def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native
    
    @JSImport("plottable", "Utils.Math.within")
    @js.native
    def within(p: Point, bounds: Bounds): Boolean = js.native
  }
  
  object RTree {
    
    @JSImport("plottable", "Utils.RTree.QueryPredicateResult")
    @js.native
    object QueryPredicateResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.plottable.rTreeMod.QueryPredicateResult with Double] = js.native
      
      /* 1 */ val FAIL: typings.plottable.rTreeMod.QueryPredicateResult.FAIL with Double = js.native
      
      /* 0 */ val PASS: typings.plottable.rTreeMod.QueryPredicateResult.PASS with Double = js.native
      
      /* 2 */ val PASS_AND_OVERWRITE: typings.plottable.rTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE with Double = js.native
    }
    
    @JSImport("plottable", "Utils.RTree.RTree")
    @js.native
    class RTree[T] ()
      extends typings.plottable.utilsMod.RTree.RTree[T] {
      def this(maxNodeChildren: Double) = this()
      def this(maxNodeChildren: js.UndefOr[scala.Nothing], splitStrategy: IRTreeSplitStrategy) = this()
      def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
    }
    
    @JSImport("plottable", "Utils.RTree.RTreeBounds")
    @js.native
    class RTreeBounds protected ()
      extends typings.plottable.utilsMod.RTree.RTreeBounds {
      def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
    }
    /* static members */
    object RTreeBounds {
      
      /**
        * Returns the orthogonal absolute distance in the x-dimension from point
        * `p` to the farthest edge of `bounds`.
        *
        * If `p.x` is inside the bounds returns `0`.
        */
      @JSImport("plottable", "Utils.RTree.RTreeBounds.absoluteDistanceToFarEdgeX")
      @js.native
      def absoluteDistanceToFarEdgeX(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      /**
        * Returns the orthogonal absolute distance in the y-dimension from point
        * `p` to the farthest edge of `bounds`.
        *
        * If `p.y` is inside the bounds returns `0`.
        */
      @JSImport("plottable", "Utils.RTree.RTreeBounds.absoluteDistanceToFarEdgeY")
      @js.native
      def absoluteDistanceToFarEdgeY(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      /**
        * Returns the orthogonal absolute distance in the x-dimension from point
        * `p` to the nearest edge of `bounds`.
        *
        * If `p.x` is inside the bounds returns `0`.
        */
      @JSImport("plottable", "Utils.RTree.RTreeBounds.absoluteDistanceToNearEdgeX")
      @js.native
      def absoluteDistanceToNearEdgeX(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      /**
        * Returns the orthogonal absolute distance in the y-dimension from point
        * `p` to the nearest edge of `bounds`.
        *
        * If `p.y` is inside the bounds returns `0`.
        */
      @JSImport("plottable", "Utils.RTree.RTreeBounds.absoluteDistanceToNearEdgeY")
      @js.native
      def absoluteDistanceToNearEdgeY(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      @JSImport("plottable", "Utils.RTree.RTreeBounds.bounds")
      @js.native
      def bounds(bounds: Bounds): typings.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable", "Utils.RTree.RTreeBounds.distanceSquaredToFarEdge")
      @js.native
      def distanceSquaredToFarEdge(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      /**
        * Returns the distance squared from `p` to the nearest edge of `bounds`. If
        * the point touches or is inside the bounds, returns `0`;
        *
        * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
        */
      @JSImport("plottable", "Utils.RTree.RTreeBounds.distanceSquaredToNearEdge")
      @js.native
      def distanceSquaredToNearEdge(bounds: typings.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      @JSImport("plottable", "Utils.RTree.RTreeBounds.entityBounds")
      @js.native
      def entityBounds(bounds: IEntityBounds): typings.plottable.rTreeMod.RTreeBounds = js.native
      
      /**
        * Returns true if `a` overlaps `b` in the x and y axes.
        *
        * Touching counts as overlap.
        */
      @JSImport("plottable", "Utils.RTree.RTreeBounds.isBoundsOverlapBounds")
      @js.native
      def isBoundsOverlapBounds(a: typings.plottable.rTreeMod.RTreeBounds, b: typings.plottable.rTreeMod.RTreeBounds): Boolean = js.native
      
      /**
        * Returns true if `a` overlaps `b` in the x axis only.
        *
        * Touching counts as overlap.
        */
      @JSImport("plottable", "Utils.RTree.RTreeBounds.isBoundsOverlapX")
      @js.native
      def isBoundsOverlapX(a: typings.plottable.rTreeMod.RTreeBounds, b: typings.plottable.rTreeMod.RTreeBounds): Boolean = js.native
      
      /**
        * Returns true if `a` overlaps `b` in the y axis only.
        *
        * Touching counts as overlap.
        */
      @JSImport("plottable", "Utils.RTree.RTreeBounds.isBoundsOverlapY")
      @js.native
      def isBoundsOverlapY(a: typings.plottable.rTreeMod.RTreeBounds, b: typings.plottable.rTreeMod.RTreeBounds): Boolean = js.native
      
      @JSImport("plottable", "Utils.RTree.RTreeBounds.pointPair")
      @js.native
      def pointPair(p0: Point, p1: Point): typings.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable", "Utils.RTree.RTreeBounds.points")
      @js.native
      def points(points: js.Array[Point]): typings.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable", "Utils.RTree.RTreeBounds.union")
      @js.native
      def union(b0: typings.plottable.rTreeMod.RTreeBounds, b1: typings.plottable.rTreeMod.RTreeBounds): typings.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable", "Utils.RTree.RTreeBounds.unionAll")
      @js.native
      def unionAll(bounds: js.Array[typings.plottable.rTreeMod.RTreeBounds]): typings.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable", "Utils.RTree.RTreeBounds.xywh")
      @js.native
      def xywh(x: Double, y: Double, w: Double, h: Double): typings.plottable.rTreeMod.RTreeBounds = js.native
    }
    
    @JSImport("plottable", "Utils.RTree.RTreeNode")
    @js.native
    class RTreeNode[T] protected ()
      extends typings.plottable.utilsMod.RTree.RTreeNode[T] {
      def this(leaf: Boolean) = this()
    }
    /* static members */
    object RTreeNode {
      
      @JSImport("plottable", "Utils.RTree.RTreeNode.valueNode")
      @js.native
      def valueNode[T](bounds: typings.plottable.rTreeMod.RTreeBounds, value: T): typings.plottable.rTreeMod.RTreeNode[T] = js.native
    }
    
    @JSImport("plottable", "Utils.RTree.createMinimizingNodePredicate")
    @js.native
    def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[/* node */ typings.plottable.rTreeMod.RTreeNode[T], QueryPredicateResult] = js.native
    
    @JSImport("plottable", "Utils.RTree.createNodeSort")
    @js.native
    def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[
        /* a */ typings.plottable.rTreeMod.RTreeNode[T], 
        /* b */ typings.plottable.rTreeMod.RTreeNode[T], 
        Double
      ] = js.native
  }
  
  @JSImport("plottable", "Utils.Set")
  @js.native
  class Set[T] ()
    extends typings.plottable.utilsMod.Set[T]
  
  object Stacking {
    
    object IStackingOrder {
      
      @JSImport("plottable", "Utils.Stacking.IStackingOrder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("plottable", "Utils.Stacking.IStackingOrder.bottomup")
      @js.native
      def bottomup: typings.plottable.plottableStrings.bottomup = js.native
      @scala.inline
      def bottomup_=(x: bottomup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomup")(x.asInstanceOf[js.Any])
      
      @JSImport("plottable", "Utils.Stacking.IStackingOrder.topdown")
      @js.native
      def topdown: typings.plottable.plottableStrings.topdown = js.native
      @scala.inline
      def topdown_=(x: topdown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topdown")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("plottable", "Utils.Stacking.normalizeKey")
    @js.native
    val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
    
    @JSImport("plottable", "Utils.Stacking.stack")
    @js.native
    def stack(
      datasets: js.Array[typings.plottable.datasetMod.Dataset],
      keyAccessor: IAccessor[_],
      valueAccessor: IAccessor[Double]
    ): StackingResult = js.native
    @JSImport("plottable", "Utils.Stacking.stack")
    @js.native
    def stack(
      datasets: js.Array[typings.plottable.datasetMod.Dataset],
      keyAccessor: IAccessor[_],
      valueAccessor: IAccessor[Double],
      stackingOrder: IStackingOrder
    ): StackingResult = js.native
    
    @JSImport("plottable", "Utils.Stacking.stackedExtent")
    @js.native
    def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
    
    @JSImport("plottable", "Utils.Stacking.stackedExtents")
    @js.native
    def stackedExtents[D](stackingResult: GenericStackingResult[D]): MaximumExtents[D] = js.native
  }
  
  @JSImport("plottable", "Utils.Translator")
  @js.native
  class Translator protected ()
    extends typings.plottable.utilsMod.Translator {
    def this(_rootElement: HTMLElement) = this()
  }
  /* static members */
  object Translator {
    
    /**
      * Is the event's target part of the given component's DOM tree?
      */
    @JSImport("plottable", "Utils.Translator.isEventInside")
    @js.native
    def isEventInside(component: typings.plottable.componentMod.Component, e: Event): Boolean = js.native
  }
  
  object Window {
    
    @JSImport("plottable", "Utils.Window.debounce")
    @js.native
    def debounce[T /* <: js.Function */](msec: Double, callback: T): T = js.native
    @JSImport("plottable", "Utils.Window.debounce")
    @js.native
    def debounce[T /* <: js.Function */](msec: Double, callback: T, context: js.Any): T = js.native
    
    @JSImport("plottable", "Utils.Window.deprecated")
    @js.native
    def deprecated(callingMethod: String, version: String): Unit = js.native
    @JSImport("plottable", "Utils.Window.deprecated")
    @js.native
    def deprecated(callingMethod: String, version: String, message: String): Unit = js.native
    
    @JSImport("plottable", "Utils.Window.setTimeout")
    @js.native
    def setTimeout(f: js.Function, time: Double, args: js.Any*): Double = js.native
    
    @JSImport("plottable", "Utils.Window.warn")
    @js.native
    def warn(warning: String): Unit = js.native
  }
  
  @JSImport("plottable", "Utils.assign")
  @js.native
  def assign[T /* <: Record[_, _] */](objs: Partial[T]*): T = js.native
  
  @JSImport("plottable", "Utils.coerceExternalD3")
  @js.native
  def coerceExternalD3[S /* <: Selection_[_, _, _, _] */](externalD3Selection: S): S = js.native
  
  @JSImport("plottable", "Utils.getTranslator")
  @js.native
  def getTranslator(component: typings.plottable.componentMod.Component): typings.plottable.transformAwareTranslatorMod.Translator = js.native
}

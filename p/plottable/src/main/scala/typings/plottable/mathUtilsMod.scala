package typings.plottable

import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.Point
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathUtilsMod {
  
  @JSImport("plottable/build/src/utils/mathUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyTransform(a: ICssTransformMatrix, p: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(a.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def boundsIntersects(
    aX: Double,
    aY: Double,
    aWidth: Double,
    aHeight: Double,
    bX: Double,
    bY: Double,
    bWidth: Double,
    bHeight: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boundsIntersects")(aX.asInstanceOf[js.Any], aY.asInstanceOf[js.Any], aWidth.asInstanceOf[js.Any], aHeight.asInstanceOf[js.Any], bX.asInstanceOf[js.Any], bY.asInstanceOf[js.Any], bWidth.asInstanceOf[js.Any], bHeight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clamp(x: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(x.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def degreesToRadians(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToRadians")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def distanceSquared(p1: Point, p2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceSquared")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getCumulativeTransform(element: Element): ICssTransformMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("getCumulativeTransform")(element.asInstanceOf[js.Any]).asInstanceOf[ICssTransformMatrix]
  
  inline def inRange(x: Double, a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(x.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def invertMatrix(a: ICssTransformMatrix): ICssTransformMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("invertMatrix")(a.asInstanceOf[js.Any]).asInstanceOf[ICssTransformMatrix]
  
  inline def isNaN(n: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidNumber(n: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def max[C](array: js.Array[C], defaultValue: C): C = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def max[T, C](
    array: js.Array[T],
    accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
    defaultValue: C
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def min[C](array: js.Array[C], defaultValue: C): C = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[C]
  inline def min[T, C](
    array: js.Array[T],
    accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
    defaultValue: C
  ): C = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[C]
  
  inline def multiplyMatrix(a: ICssTransformMatrix, b: ICssTransformMatrix): ICssTransformMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyMatrix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ICssTransformMatrix]
  
  inline def multiplyTranslate(a: ICssTransformMatrix, v: ITranslateVector): ICssTransformMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyTranslate")(a.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[ICssTransformMatrix]
  
  inline def premultiplyTranslate(v: ITranslateVector, b: ICssTransformMatrix): ICssTransformMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("premultiplyTranslate")(v.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ICssTransformMatrix]
  
  inline def range(start: Double, stop: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def range(start: Double, stop: Double, step: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def within(p: Point, bounds: Bounds): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(p.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type ICssTransformMatrix = js.Tuple6[Double, Double, Double, Double, Double, Double]
  
  type ITranslateVector = js.Tuple2[Double, Double]
}

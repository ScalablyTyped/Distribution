package typings.plottable

import typings.plottable.interfacesMod.Bounds
import typings.plottable.interfacesMod.Point
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathUtilsMod {
  
  @JSImport("plottable/build/src/utils/mathUtils", "applyTransform")
  @js.native
  def applyTransform(a: ICssTransformMatrix, p: Point): Point = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "boundsIntersects")
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
  
  @JSImport("plottable/build/src/utils/mathUtils", "clamp")
  @js.native
  def clamp(x: Double, min: Double, max: Double): Double = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "degreesToRadians")
  @js.native
  def degreesToRadians(degree: Double): Double = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "distanceSquared")
  @js.native
  def distanceSquared(p1: Point, p2: Point): Double = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "getCumulativeTransform")
  @js.native
  def getCumulativeTransform(element: Element): ICssTransformMatrix = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "inRange")
  @js.native
  def inRange(x: Double, a: Double, b: Double): Boolean = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "invertMatrix")
  @js.native
  def invertMatrix(a: ICssTransformMatrix): ICssTransformMatrix = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "isNaN")
  @js.native
  def isNaN(n: js.Any): Boolean = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "isValidNumber")
  @js.native
  def isValidNumber(n: js.Any): Boolean = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "max")
  @js.native
  def max[C](array: js.Array[C], defaultValue: C): C = js.native
  @JSImport("plottable/build/src/utils/mathUtils", "max")
  @js.native
  def max[T, C](
    array: js.Array[T],
    accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
    defaultValue: C
  ): C = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "min")
  @js.native
  def min[C](array: js.Array[C], defaultValue: C): C = js.native
  @JSImport("plottable/build/src/utils/mathUtils", "min")
  @js.native
  def min[T, C](
    array: js.Array[T],
    accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
    defaultValue: C
  ): C = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "multiplyMatrix")
  @js.native
  def multiplyMatrix(a: ICssTransformMatrix, b: ICssTransformMatrix): ICssTransformMatrix = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "multiplyTranslate")
  @js.native
  def multiplyTranslate(a: ICssTransformMatrix, v: ITranslateVector): ICssTransformMatrix = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "premultiplyTranslate")
  @js.native
  def premultiplyTranslate(v: ITranslateVector, b: ICssTransformMatrix): ICssTransformMatrix = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "range")
  @js.native
  def range(start: Double, stop: Double): js.Array[Double] = js.native
  @JSImport("plottable/build/src/utils/mathUtils", "range")
  @js.native
  def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native
  
  @JSImport("plottable/build/src/utils/mathUtils", "within")
  @js.native
  def within(p: Point, bounds: Bounds): Boolean = js.native
  
  type ICssTransformMatrix = js.Tuple6[Double, Double, Double, Double, Double, Double]
  
  type ITranslateVector = js.Tuple2[Double, Double]
}

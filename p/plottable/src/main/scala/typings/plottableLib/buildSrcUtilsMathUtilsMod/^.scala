package typings
package plottableLib.buildSrcUtilsMathUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils/mathUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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


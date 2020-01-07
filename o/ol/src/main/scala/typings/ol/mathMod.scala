package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/math", JSImport.Namespace)
@js.native
object mathMod extends js.Object {
  def clamp(value: Double, min: Double, max: Double): Double = js.native
  def lerp(a: Double, b: Double, x: Double): Double = js.native
  def modulo(a: Double, b: Double): Double = js.native
  def solveLinearSystem(mat: js.Array[js.Array[Double]]): js.Array[Double] = js.native
  def squaredDistance(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def squaredSegmentDistance(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def toDegrees(angleInRadians: Double): Double = js.native
  def toRadians(angleInDegrees: Double): Double = js.native
}


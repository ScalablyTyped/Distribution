package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/math", JSImport.Namespace)
@js.native
object mathMod extends js.Object {
  def clamp(value: scala.Double, min: scala.Double, max: scala.Double): scala.Double = js.native
  def lerp(a: scala.Double, b: scala.Double, x: scala.Double): scala.Double = js.native
  def modulo(a: scala.Double, b: scala.Double): scala.Double = js.native
  def roundUpToPowerOfTwo(x: scala.Double): scala.Double = js.native
  def solveLinearSystem(mat: js.Array[js.Array[scala.Double]]): js.Array[scala.Double] = js.native
  def squaredDistance(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def squaredSegmentDistance(
    x: scala.Double,
    y: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double
  ): scala.Double = js.native
  def toDegrees(angleInRadians: scala.Double): scala.Double = js.native
  def toRadians(angleInDegrees: scala.Double): scala.Double = js.native
}


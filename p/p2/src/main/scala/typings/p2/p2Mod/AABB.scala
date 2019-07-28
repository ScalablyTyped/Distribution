package typings.p2.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "AABB")
@js.native
class AABB () extends js.Object {
  def this(options: AABBOptions) = this()
  var lowerBound: js.Tuple2[Double, Double] = js.native
  var upperBound: js.Tuple2[Double, Double] = js.native
  def containsPoint(point: js.Tuple2[Double, Double]): Boolean = js.native
  def copy(aabb: AABB): Unit = js.native
  def extend(aabb: AABB): Unit = js.native
  def overlaps(aabb: AABB): Boolean = js.native
  def overlapsRay(ray: Ray): Double = js.native
  def setFromPoints(points: js.Array[js.Tuple2[Double, Double]], position: js.Tuple2[Double, Double]): Unit = js.native
  def setFromPoints(points: js.Array[js.Tuple2[Double, Double]], position: js.Tuple2[Double, Double], angle: Double): Unit = js.native
  def setFromPoints(
    points: js.Array[js.Tuple2[Double, Double]],
    position: js.Tuple2[Double, Double],
    angle: Double,
    skinSize: Double
  ): Unit = js.native
}


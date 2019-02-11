package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AABB extends js.Object {
  var lowerBound: js.Tuple2[scala.Double, scala.Double] = js.native
  var upperBound: js.Tuple2[scala.Double, scala.Double] = js.native
  def containsPoint(point: js.Tuple2[scala.Double, scala.Double]): scala.Boolean = js.native
  def copy(aabb: AABB): scala.Unit = js.native
  def extend(aabb: AABB): scala.Unit = js.native
  def overlaps(aabb: AABB): scala.Boolean = js.native
  def overlapsRay(ray: Ray): scala.Double = js.native
  def setFromPoints(
    points: js.Array[js.Tuple2[scala.Double, scala.Double]],
    position: js.Tuple2[scala.Double, scala.Double]
  ): scala.Unit = js.native
  def setFromPoints(
    points: js.Array[js.Tuple2[scala.Double, scala.Double]],
    position: js.Tuple2[scala.Double, scala.Double],
    angle: scala.Double
  ): scala.Unit = js.native
  def setFromPoints(
    points: js.Array[js.Tuple2[scala.Double, scala.Double]],
    position: js.Tuple2[scala.Double, scala.Double],
    angle: scala.Double,
    skinSize: scala.Double
  ): scala.Unit = js.native
}


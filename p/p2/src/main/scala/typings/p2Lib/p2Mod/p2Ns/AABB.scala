package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AABB extends js.Object {
  def copy(aabb: AABB): scala.Unit
  def extend(aabb: AABB): scala.Unit
  def overlaps(aabb: AABB): scala.Boolean
  def setFromPoints(
    points: js.Array[js.Array[scala.Double]],
    position: js.Array[scala.Double],
    angle: scala.Double,
    skinSize: scala.Double
  ): scala.Unit
}


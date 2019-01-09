package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "AABB")
@js.native
class AABB ()
  extends p2Lib.p2Mod.p2Ns.AABB {
  def this(options: p2Lib.Anon_LowerBound) = this()
  /* CompleteClass */
  override def copy(aabb: p2Lib.p2Mod.p2Ns.AABB): scala.Unit = js.native
  /* CompleteClass */
  override def extend(aabb: p2Lib.p2Mod.p2Ns.AABB): scala.Unit = js.native
  /* CompleteClass */
  override def overlaps(aabb: p2Lib.p2Mod.p2Ns.AABB): scala.Boolean = js.native
  /* CompleteClass */
  override def setFromPoints(
    points: js.Array[js.Array[scala.Double]],
    position: js.Array[scala.Double],
    angle: scala.Double,
    skinSize: scala.Double
  ): scala.Unit = js.native
}


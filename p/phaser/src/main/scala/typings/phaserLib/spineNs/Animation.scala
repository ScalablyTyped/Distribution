package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Animation")
@js.native
class Animation protected () extends js.Object {
  def this(name: java.lang.String, timelines: js.Array[Timeline], duration: scala.Double) = this()
  var duration: scala.Double = js.native
  var name: java.lang.String = js.native
  var timelines: js.Array[Timeline] = js.native
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: scala.Double,
    time: scala.Double,
    loop: scala.Boolean,
    events: js.Array[Event],
    alpha: scala.Double,
    pose: MixPose,
    direction: MixDirection
  ): scala.Unit = js.native
}

@JSGlobal("spine.Animation")
@js.native
object Animation extends js.Object {
  def binarySearch(values: phaserLib.spineNs.ArrayLike[scala.Double], target: scala.Double): scala.Double = js.native
  def binarySearch(values: phaserLib.spineNs.ArrayLike[scala.Double], target: scala.Double, step: scala.Double): scala.Double = js.native
  def linearSearch(values: phaserLib.spineNs.ArrayLike[scala.Double], target: scala.Double, step: scala.Double): scala.Double = js.native
}


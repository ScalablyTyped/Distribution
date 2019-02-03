package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.RotateTimeline")
@js.native
class RotateTimeline protected () extends CurveTimeline {
  def this(frameCount: scala.Double) = this()
  var boneIndex: scala.Double = js.native
  var frames: ArrayLike[scala.Double] = js.native
  def setFrame(frameIndex: scala.Double, time: scala.Double, degrees: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("spine.RotateTimeline")
@js.native
object RotateTimeline extends js.Object {
  var ENTRIES: scala.Double = js.native
  var PREV_ROTATION: scala.Double = js.native
  var PREV_TIME: scala.Double = js.native
  var ROTATION: scala.Double = js.native
}


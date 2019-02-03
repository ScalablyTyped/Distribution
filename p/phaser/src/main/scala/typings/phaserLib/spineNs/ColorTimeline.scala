package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.ColorTimeline")
@js.native
class ColorTimeline protected () extends CurveTimeline {
  def this(frameCount: scala.Double) = this()
  var frames: ArrayLike[scala.Double] = js.native
  var slotIndex: scala.Double = js.native
  def setFrame(
    frameIndex: scala.Double,
    time: scala.Double,
    r: scala.Double,
    g: scala.Double,
    b: scala.Double,
    a: scala.Double
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("spine.ColorTimeline")
@js.native
object ColorTimeline extends js.Object {
  var A: scala.Double = js.native
  var B: scala.Double = js.native
  var ENTRIES: scala.Double = js.native
  var G: scala.Double = js.native
  var PREV_A: scala.Double = js.native
  var PREV_B: scala.Double = js.native
  var PREV_G: scala.Double = js.native
  var PREV_R: scala.Double = js.native
  var PREV_TIME: scala.Double = js.native
  var R: scala.Double = js.native
}


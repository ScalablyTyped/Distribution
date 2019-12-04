package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.ColorTimeline")
@js.native
class ColorTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var frames: ArrayLike[Double] = js.native
  var slotIndex: Double = js.native
  def setFrame(frameIndex: Double, time: Double, r: Double, g: Double, b: Double, a: Double): Unit = js.native
}

/* static members */
@JSGlobal("spine.ColorTimeline")
@js.native
object ColorTimeline extends js.Object {
  var A: Double = js.native
  var B: Double = js.native
  var ENTRIES: Double = js.native
  var G: Double = js.native
  var PREV_A: Double = js.native
  var PREV_B: Double = js.native
  var PREV_G: Double = js.native
  var PREV_R: Double = js.native
  var PREV_TIME: Double = js.native
  var R: Double = js.native
}


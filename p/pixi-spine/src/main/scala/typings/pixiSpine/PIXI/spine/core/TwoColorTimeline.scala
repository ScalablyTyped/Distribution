package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TwoColorTimeline")
@js.native
class TwoColorTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var frames: ArrayLike[Double] = js.native
  var slotIndex: Double = js.native
  def setFrame(
    frameIndex: Double,
    time: Double,
    r: Double,
    g: Double,
    b: Double,
    a: Double,
    r2: Double,
    g2: Double,
    b2: Double
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.TwoColorTimeline")
@js.native
object TwoColorTimeline extends js.Object {
  var A: Double = js.native
  var B: Double = js.native
  var B2: Double = js.native
  var ENTRIES: Double = js.native
  var G: Double = js.native
  var G2: Double = js.native
  var PREV_A: Double = js.native
  var PREV_B: Double = js.native
  var PREV_B2: Double = js.native
  var PREV_G: Double = js.native
  var PREV_G2: Double = js.native
  var PREV_R: Double = js.native
  var PREV_R2: Double = js.native
  var PREV_TIME: Double = js.native
  var R: Double = js.native
  var R2: Double = js.native
}


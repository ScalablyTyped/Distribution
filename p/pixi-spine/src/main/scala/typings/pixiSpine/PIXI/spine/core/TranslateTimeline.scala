package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TranslateTimeline")
@js.native
class TranslateTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var boneIndex: Double = js.native
  var frames: ArrayLike[Double] = js.native
  def setFrame(frameIndex: Double, time: Double, x: Double, y: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.TranslateTimeline")
@js.native
object TranslateTimeline extends js.Object {
  var ENTRIES: Double = js.native
  var PREV_TIME: Double = js.native
  var PREV_X: Double = js.native
  var PREV_Y: Double = js.native
  var X: Double = js.native
  var Y: Double = js.native
}


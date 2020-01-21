package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.IkConstraintTimeline")
@js.native
class IkConstraintTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var frames: ArrayLike[Double] = js.native
  var ikConstraintIndex: Double = js.native
  def setFrame(
    frameIndex: Double,
    time: Double,
    mix: Double,
    softness: Double,
    bendDirection: Double,
    compress: Boolean,
    stretch: Boolean
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.IkConstraintTimeline")
@js.native
object IkConstraintTimeline extends js.Object {
  var BEND_DIRECTION: Double = js.native
  var COMPRESS: Double = js.native
  var ENTRIES: Double = js.native
  var MIX: Double = js.native
  var PREV_BEND_DIRECTION: Double = js.native
  var PREV_COMPRESS: Double = js.native
  var PREV_MIX: Double = js.native
  var PREV_SOFTNESS: Double = js.native
  var PREV_STRETCH: Double = js.native
  var PREV_TIME: Double = js.native
  var SOFTNESS: Double = js.native
  var STRETCH: Double = js.native
}


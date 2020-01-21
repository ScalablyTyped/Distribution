package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.TransformConstraintTimeline")
@js.native
class TransformConstraintTimeline protected () extends CurveTimeline {
  def this(frameCount: Double) = this()
  var frames: ArrayLike[Double] = js.native
  var transformConstraintIndex: Double = js.native
  def setFrame(
    frameIndex: Double,
    time: Double,
    rotateMix: Double,
    translateMix: Double,
    scaleMix: Double,
    shearMix: Double
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.TransformConstraintTimeline")
@js.native
object TransformConstraintTimeline extends js.Object {
  var ENTRIES: Double = js.native
  var PREV_ROTATE: Double = js.native
  var PREV_SCALE: Double = js.native
  var PREV_SHEAR: Double = js.native
  var PREV_TIME: Double = js.native
  var PREV_TRANSLATE: Double = js.native
  var ROTATE: Double = js.native
  var SCALE: Double = js.native
  var SHEAR: Double = js.native
  var TRANSLATE: Double = js.native
}


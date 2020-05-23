package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.TransformConstraintTimeline")
@js.native
class TransformConstraintTimeline protected ()
  extends typings.phaser.spine.TransformConstraintTimeline {
  def this(frameCount: Double) = this()
  /* CompleteClass */
  override var curves: js.Any = js.native
  /* CompleteClass */
  override var frames: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var transformConstraintIndex: Double = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: typings.phaser.spine.Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[typings.phaser.spine.Event],
    alpha: Double,
    blend: typings.phaser.spine.MixBlend,
    direction: typings.phaser.spine.MixDirection
  ): Unit = js.native
  /* CompleteClass */
  override def getCurvePercent(frameIndex: Double, percent: Double): Double = js.native
  /* CompleteClass */
  override def getCurveType(frameIndex: Double): Double = js.native
  /* CompleteClass */
  override def getFrameCount(): Double = js.native
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  /* CompleteClass */
  override def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit = js.native
  /* CompleteClass */
  override def setFrame(
    frameIndex: Double,
    time: Double,
    rotateMix: Double,
    translateMix: Double,
    scaleMix: Double,
    shearMix: Double
  ): Unit = js.native
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
}

/* static members */
@JSGlobal("spine.TransformConstraintTimeline")
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


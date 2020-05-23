package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.ColorTimeline")
@js.native
class ColorTimeline protected ()
  extends typings.phaser.spine.ColorTimeline {
  def this(frameCount: Double) = this()
  /* CompleteClass */
  override var curves: js.Any = js.native
  /* CompleteClass */
  override var frames: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var slotIndex: Double = js.native
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
  override def setFrame(frameIndex: Double, time: Double, r: Double, g: Double, b: Double, a: Double): Unit = js.native
  /* CompleteClass */
  override def setLinear(frameIndex: Double): Unit = js.native
  /* CompleteClass */
  override def setStepped(frameIndex: Double): Unit = js.native
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


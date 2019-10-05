package typings.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.AttachmentTimeline")
@js.native
class AttachmentTimeline protected () extends Timeline {
  def this(frameCount: Double) = this()
  var attachmentNames: js.Array[String] = js.native
  var frames: ArrayLike[Double] = js.native
  var slotIndex: Double = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit = js.native
  def getFrameCount(): Double = js.native
  /* CompleteClass */
  override def getPropertyId(): Double = js.native
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit = js.native
}


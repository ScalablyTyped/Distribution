package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentTimeline extends Timeline {
  var attachmentNames: js.Array[String]
  var frames: ArrayLike[Double]
  var slotIndex: Double
  def getFrameCount(): Double
  def setFrame(frameIndex: Double, time: Double, attachmentName: String): Unit
}

object AttachmentTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    attachmentNames: js.Array[String],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setFrame: (Double, Double, String) => Unit,
    slotIndex: Double
  ): AttachmentTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), attachmentNames = attachmentNames.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setFrame = js.Any.fromFunction3(setFrame), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentTimeline]
  }
}


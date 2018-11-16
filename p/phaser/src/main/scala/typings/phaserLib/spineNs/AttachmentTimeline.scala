package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.AttachmentTimeline")
@js.native
class AttachmentTimeline protected () extends Timeline {
  def this(frameCount: scala.Double) = this()
  var attachmentNames: js.Array[java.lang.String] = js.native
  var frames: ArrayLike[scala.Double] = js.native
  var slotIndex: scala.Double = js.native
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    skeleton: Skeleton,
    lastTime: scala.Double,
    time: scala.Double,
    events: js.Array[Event],
    alpha: scala.Double,
    pose: MixPose,
    direction: MixDirection
  ): scala.Unit = js.native
  def getFrameCount(): scala.Double = js.native
  /* CompleteClass */
  override def getPropertyId(): scala.Double = js.native
  def setFrame(frameIndex: scala.Double, time: scala.Double, attachmentName: java.lang.String): scala.Unit = js.native
}


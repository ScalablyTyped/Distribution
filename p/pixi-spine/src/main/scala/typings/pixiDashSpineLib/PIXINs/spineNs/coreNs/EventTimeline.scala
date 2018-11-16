package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.EventTimeline")
@js.native
class EventTimeline protected () extends Timeline {
  def this(frameCount: scala.Double) = this()
  var events: js.Array[Event] = js.native
  var frames: ArrayLike[scala.Double] = js.native
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
  def setFrame(frameIndex: scala.Double, event: Event): scala.Unit = js.native
}


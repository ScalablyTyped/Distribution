package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTimeline extends Timeline {
  var events: js.Array[Event]
  var frames: ArrayLike[Double]
  def getFrameCount(): Double
  def setFrame(frameIndex: Double, event: Event): Unit
}

object EventTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    events: js.Array[Event],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setFrame: (Double, Event) => Unit
  ): EventTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), events = events.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setFrame = js.Any.fromFunction2(setFrame))
    __obj.asInstanceOf[EventTimeline]
  }
}


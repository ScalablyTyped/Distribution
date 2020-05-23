package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOrderTimeline extends Timeline {
  var drawOrders: js.Array[js.Array[Double]]
  var frames: ArrayLike[Double]
  def getFrameCount(): Double
  def setFrame(frameIndex: Double, time: Double, drawOrder: js.Array[Double]): Unit
}

object DrawOrderTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    drawOrders: js.Array[js.Array[Double]],
    frames: ArrayLike[Double],
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setFrame: (Double, Double, js.Array[Double]) => Unit
  ): DrawOrderTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), drawOrders = drawOrders.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setFrame = js.Any.fromFunction3(setFrame))
    __obj.asInstanceOf[DrawOrderTimeline]
  }
}


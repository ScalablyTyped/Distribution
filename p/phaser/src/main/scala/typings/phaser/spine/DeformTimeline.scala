package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeformTimeline extends CurveTimeline {
  var attachment: VertexAttachment
  var frameVertices: js.Array[ArrayLike[Double]]
  var frames: ArrayLike[Double]
  var slotIndex: Double
  def setFrame(frameIndex: Double, time: Double, vertices: ArrayLike[Double]): Unit
}

object DeformTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    attachment: VertexAttachment,
    curves: js.Any,
    frameVertices: js.Array[ArrayLike[Double]],
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, ArrayLike[Double]) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit,
    slotIndex: Double
  ): DeformTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), attachment = attachment.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], frameVertices = frameVertices.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction3(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeformTimeline]
  }
}


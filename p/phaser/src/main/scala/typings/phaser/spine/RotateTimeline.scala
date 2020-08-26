package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateTimeline extends CurveTimeline {
  var boneIndex: Double = js.native
  var frames: ArrayLike[Double] = js.native
  def setFrame(frameIndex: Double, time: Double, degrees: Double): Unit = js.native
}

object RotateTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    boneIndex: Double,
    curves: js.Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, Double) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit
  ): RotateTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), boneIndex = boneIndex.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction3(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped))
    __obj.asInstanceOf[RotateTimeline]
  }
  @scala.inline
  implicit class RotateTimelineOps[Self <: RotateTimeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoneIndex(value: Double): Self = this.set("boneIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrames(value: ArrayLike[Double]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetFrame(value: (Double, Double, Double) => Unit): Self = this.set("setFrame", js.Any.fromFunction3(value))
  }
  
}


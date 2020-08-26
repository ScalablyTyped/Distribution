package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwoColorTimeline extends CurveTimeline {
  var frames: ArrayLike[Double] = js.native
  var slotIndex: Double = js.native
  def setFrame(
    frameIndex: Double,
    time: Double,
    r: Double,
    g: Double,
    b: Double,
    a: Double,
    r2: Double,
    g2: Double,
    b2: Double
  ): Unit = js.native
}

object TwoColorTimeline {
  @scala.inline
  def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Unit,
    curves: js.Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: () => Double,
    getPropertyId: () => Double,
    setCurve: (Double, Double, Double, Double, Double) => Unit,
    setFrame: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit,
    slotIndex: Double
  ): TwoColorTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction9(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoColorTimeline]
  }
  @scala.inline
  implicit class TwoColorTimelineOps[Self <: TwoColorTimeline] (val x: Self) extends AnyVal {
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
    def setFrames(value: ArrayLike[Double]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetFrame(value: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = this.set("setFrame", js.Any.fromFunction9(value))
    @scala.inline
    def setSlotIndex(value: Double): Self = this.set("slotIndex", value.asInstanceOf[js.Any])
  }
  
}


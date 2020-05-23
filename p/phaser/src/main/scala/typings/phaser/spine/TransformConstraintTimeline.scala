package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformConstraintTimeline extends CurveTimeline {
  var frames: ArrayLike[Double]
  var transformConstraintIndex: Double
  def setFrame(
    frameIndex: Double,
    time: Double,
    rotateMix: Double,
    translateMix: Double,
    scaleMix: Double,
    shearMix: Double
  ): Unit
}

object TransformConstraintTimeline {
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
    setFrame: (Double, Double, Double, Double, Double, Double) => Unit,
    setLinear: Double => Unit,
    setStepped: Double => Unit,
    transformConstraintIndex: Double
  ): TransformConstraintTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7(apply), curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = js.Any.fromFunction0(getFrameCount), getPropertyId = js.Any.fromFunction0(getPropertyId), setCurve = js.Any.fromFunction5(setCurve), setFrame = js.Any.fromFunction6(setFrame), setLinear = js.Any.fromFunction1(setLinear), setStepped = js.Any.fromFunction1(setStepped), transformConstraintIndex = transformConstraintIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformConstraintTimeline]
  }
}


package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationTime extends js.Object {
  var animationTime: Double
  var exponential: js.UndefOr[Boolean] = js.undefined
  var initial: js.UndefOr[Double] = js.undefined
  var springStiffness: Double
}

object AnimationTime {
  @scala.inline
  def apply(
    animationTime: Double,
    springStiffness: Double,
    exponential: js.UndefOr[Boolean] = js.undefined,
    initial: js.UndefOr[Double] = js.undefined
  ): AnimationTime = {
    val __obj = js.Dynamic.literal(animationTime = animationTime.asInstanceOf[js.Any], springStiffness = springStiffness.asInstanceOf[js.Any])
    if (!js.isUndefined(exponential)) __obj.updateDynamic("exponential")(exponential.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTime]
  }
}


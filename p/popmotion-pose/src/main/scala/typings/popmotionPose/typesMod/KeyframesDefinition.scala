package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.keyframesTypesMod.Values
import typings.popmotionEasing.mod.Easing
import typings.popmotionPose.popmotionPoseStrings.keyframes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :'keyframes'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.KeyframesProps */
trait KeyframesDefinition extends TransitionDefinition {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[Easing | js.Array[Easing] | StringDictionary[Easing]] = js.undefined
  var easings: js.UndefOr[js.Array[Easing]] = js.undefined
  var elapsed: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[Double] = js.undefined
  var loop: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var times: js.UndefOr[js.Array[Double]] = js.undefined
  var `type`: keyframes
  var values: Values
  var yoyo: js.UndefOr[Double] = js.undefined
}

object KeyframesDefinition {
  @scala.inline
  def apply(
    `type`: keyframes,
    values: Values,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] = null,
    easings: js.Array[Easing] = null,
    elapsed: js.UndefOr[Double] = js.undefined,
    flip: js.UndefOr[Double] = js.undefined,
    loop: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    times: js.Array[Double] = null,
    yoyo: js.UndefOr[Double] = js.undefined
  ): KeyframesDefinition = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easings != null) __obj.updateDynamic("easings")(easings.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsed)) __obj.updateDynamic("elapsed")(elapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesDefinition]
  }
}


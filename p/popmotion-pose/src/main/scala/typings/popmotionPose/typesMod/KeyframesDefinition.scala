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
    delay: Int | Double = null,
    duration: Int | Double = null,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] = null,
    easings: js.Array[Easing] = null,
    elapsed: Int | Double = null,
    flip: Int | Double = null,
    loop: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    times: js.Array[Double] = null,
    yoyo: Int | Double = null
  ): KeyframesDefinition = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (easings != null) __obj.updateDynamic("easings")(easings.asInstanceOf[js.Any])
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (times != null) __obj.updateDynamic("times")(times.asInstanceOf[js.Any])
    if (yoyo != null) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesDefinition]
  }
}


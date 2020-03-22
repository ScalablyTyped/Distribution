package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionEasing.mod.Easing
import typings.popmotionPose.popmotionPoseStrings.tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ts-essentials.ts-essentials.Merge<{  type  :'tween'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.TweenProps, {  ease  :popmotion.popmotion.TweenProps['ease'] | keyof {  linear  :@popmotion/easing.@popmotion/easing.Easing,   easeIn  :@popmotion/easing.@popmotion/easing.Easing,   easeOut  :@popmotion/easing.@popmotion/easing.Easing,   easeInOut  :@popmotion/easing.@popmotion/easing.Easing,   circIn  :@popmotion/easing.@popmotion/easing.Easing,   circOut  :@popmotion/easing.@popmotion/easing.Easing,   circInOut  :@popmotion/easing.@popmotion/easing.Easing,   backIn  :@popmotion/easing.@popmotion/easing.Easing,   backOut  :@popmotion/easing.@popmotion/easing.Easing,   backInOut  :@popmotion/easing.@popmotion/easing.Easing,   anticipate  :@popmotion/easing.@popmotion/easing.Easing} | popmotion-pose.popmotion-pose/lib/types.CubicBezierArgs}> */
trait TweenDefinition extends TransitionDefinition {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[Easing | js.Array[Easing] | StringDictionary[Easing] | String | CubicBezierArgs] = js.undefined
  var elapsed: js.UndefOr[Double] = js.undefined
  var flip: js.UndefOr[Double] = js.undefined
  var flipCount: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[typings.popmotion.valueMod.Value] = js.undefined
  var loop: js.UndefOr[Double] = js.undefined
  var loopCount: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var playDirection: js.UndefOr[Double] = js.undefined
  var repeatDelay: js.UndefOr[Double] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[typings.popmotion.valueMod.Value] = js.undefined
  var `type`: tween
  var yoyo: js.UndefOr[Double] = js.undefined
  var yoyoCount: js.UndefOr[Double] = js.undefined
}

object TweenDefinition {
  @scala.inline
  def apply(
    `type`: tween,
    delay: Int | Double = null,
    duration: Int | Double = null,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] | String | CubicBezierArgs = null,
    elapsed: Int | Double = null,
    flip: Int | Double = null,
    flipCount: Int | Double = null,
    from: typings.popmotion.valueMod.Value = null,
    loop: Int | Double = null,
    loopCount: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    playDirection: Int | Double = null,
    repeatDelay: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    to: typings.popmotion.valueMod.Value = null,
    yoyo: Int | Double = null,
    yoyoCount: Int | Double = null
  ): TweenDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (elapsed != null) __obj.updateDynamic("elapsed")(elapsed.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (flipCount != null) __obj.updateDynamic("flipCount")(flipCount.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (loopCount != null) __obj.updateDynamic("loopCount")(loopCount.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (playDirection != null) __obj.updateDynamic("playDirection")(playDirection.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (yoyo != null) __obj.updateDynamic("yoyo")(yoyo.asInstanceOf[js.Any])
    if (yoyoCount != null) __obj.updateDynamic("yoyoCount")(yoyoCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenDefinition]
  }
}


package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionEasing.mod.Easing
import typings.popmotionPose.popmotionPoseStrings.anticipate
import typings.popmotionPose.popmotionPoseStrings.backIn
import typings.popmotionPose.popmotionPoseStrings.backInOut
import typings.popmotionPose.popmotionPoseStrings.backOut
import typings.popmotionPose.popmotionPoseStrings.circIn
import typings.popmotionPose.popmotionPoseStrings.circInOut
import typings.popmotionPose.popmotionPoseStrings.circOut
import typings.popmotionPose.popmotionPoseStrings.easeIn
import typings.popmotionPose.popmotionPoseStrings.easeInOut
import typings.popmotionPose.popmotionPoseStrings.easeOut
import typings.popmotionPose.popmotionPoseStrings.linear
import typings.popmotionPose.popmotionPoseStrings.tween
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined ts-essentials.ts-essentials.Merge<{  type  :'tween'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.TweenProps, {  ease  :popmotion.popmotion.TweenProps['ease'] | keyof {  linear  :@popmotion/easing.@popmotion/easing.Easing,   easeIn  :@popmotion/easing.@popmotion/easing.Easing,   easeOut  :@popmotion/easing.@popmotion/easing.Easing,   easeInOut  :@popmotion/easing.@popmotion/easing.Easing,   circIn  :@popmotion/easing.@popmotion/easing.Easing,   circOut  :@popmotion/easing.@popmotion/easing.Easing,   circInOut  :@popmotion/easing.@popmotion/easing.Easing,   backIn  :@popmotion/easing.@popmotion/easing.Easing,   backOut  :@popmotion/easing.@popmotion/easing.Easing,   backInOut  :@popmotion/easing.@popmotion/easing.Easing,   anticipate  :@popmotion/easing.@popmotion/easing.Easing} | popmotion-pose.popmotion-pose/lib/types.CubicBezierArgs}> */
trait TweenDefinition extends TransitionDefinition {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var ease: js.UndefOr[
    Easing | js.Array[Easing] | StringDictionary[Easing] | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
  ] = js.undefined
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
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    ease: Easing | js.Array[Easing] | StringDictionary[Easing] | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs = null,
    elapsed: js.UndefOr[Double] = js.undefined,
    flip: js.UndefOr[Double] = js.undefined,
    flipCount: js.UndefOr[Double] = js.undefined,
    from: typings.popmotion.valueMod.Value = null,
    loop: js.UndefOr[Double] = js.undefined,
    loopCount: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    playDirection: js.UndefOr[Double] = js.undefined,
    repeatDelay: js.UndefOr[Double] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    to: typings.popmotion.valueMod.Value = null,
    yoyo: js.UndefOr[Double] = js.undefined,
    yoyoCount: js.UndefOr[Double] = js.undefined
  ): TweenDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (!js.isUndefined(elapsed)) __obj.updateDynamic("elapsed")(elapsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipCount)) __obj.updateDynamic("flipCount")(flipCount.get.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loopCount)) __obj.updateDynamic("loopCount")(loopCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(playDirection)) __obj.updateDynamic("playDirection")(playDirection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatDelay)) __obj.updateDynamic("repeatDelay")(repeatDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yoyoCount)) __obj.updateDynamic("yoyoCount")(yoyoCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenDefinition]
  }
}


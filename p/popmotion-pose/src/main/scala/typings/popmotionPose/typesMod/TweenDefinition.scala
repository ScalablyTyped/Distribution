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

/* Inlined ts-essentials.ts-essentials.Merge<{  type :'tween'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.TweenProps, {  ease :popmotion.popmotion.TweenProps['ease'] | keyof {  linear :@popmotion/easing.@popmotion/easing.Easing,   easeIn :@popmotion/easing.@popmotion/easing.Easing,   easeOut :@popmotion/easing.@popmotion/easing.Easing,   easeInOut :@popmotion/easing.@popmotion/easing.Easing,   circIn :@popmotion/easing.@popmotion/easing.Easing,   circOut :@popmotion/easing.@popmotion/easing.Easing,   circInOut :@popmotion/easing.@popmotion/easing.Easing,   backIn :@popmotion/easing.@popmotion/easing.Easing,   backOut :@popmotion/easing.@popmotion/easing.Easing,   backInOut :@popmotion/easing.@popmotion/easing.Easing,   anticipate :@popmotion/easing.@popmotion/easing.Easing} | popmotion-pose.popmotion-pose/lib/types.CubicBezierArgs}> */
@js.native
trait TweenDefinition extends TransitionDefinition {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[
    Easing | js.Array[Easing] | StringDictionary[Easing] | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
  ] = js.native
  var elapsed: js.UndefOr[Double] = js.native
  var flip: js.UndefOr[Double] = js.native
  var flipCount: js.UndefOr[Double] = js.native
  var from: js.UndefOr[typings.popmotion.valueMod.Value] = js.native
  var loop: js.UndefOr[Double] = js.native
  var loopCount: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var playDirection: js.UndefOr[Double] = js.native
  var repeatDelay: js.UndefOr[Double] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var to: js.UndefOr[typings.popmotion.valueMod.Value] = js.native
  var `type`: tween = js.native
  var yoyo: js.UndefOr[Double] = js.native
  var yoyoCount: js.UndefOr[Double] = js.native
}

object TweenDefinition {
  @scala.inline
  def apply(`type`: tween): TweenDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenDefinition]
  }
  @scala.inline
  implicit class TweenDefinitionOps[Self <: TweenDefinition] (val x: Self) extends AnyVal {
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
    def setType(value: tween): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEaseVarargs(value: Easing*): Self = this.set("ease", js.Array(value :_*))
    @scala.inline
    def setEaseFunction1(value: /* v */ Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
    @scala.inline
    def setEase(
      value: Easing | js.Array[Easing] | StringDictionary[Easing] | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
    ): Self = this.set("ease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    @scala.inline
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElapsed: Self = this.set("elapsed", js.undefined)
    @scala.inline
    def setFlip(value: Double): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setFlipCount(value: Double): Self = this.set("flipCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipCount: Self = this.set("flipCount", js.undefined)
    @scala.inline
    def setFromVarargs(value: (Double | String)*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: typings.popmotion.valueMod.Value): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setLoop(value: Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setLoopCount(value: Double): Self = this.set("loopCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoopCount: Self = this.set("loopCount", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPlayDirection(value: Double): Self = this.set("playDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayDirection: Self = this.set("playDirection", js.undefined)
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setToVarargs(value: (Double | String)*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: typings.popmotion.valueMod.Value): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setYoyo(value: Double): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
    @scala.inline
    def setYoyoCount(value: Double): Self = this.set("yoyoCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoyoCount: Self = this.set("yoyoCount", js.undefined)
  }
  
}


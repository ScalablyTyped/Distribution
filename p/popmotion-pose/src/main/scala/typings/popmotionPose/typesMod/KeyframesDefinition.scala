package typings.popmotionPose.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotion.keyframesTypesMod.ValueList
import typings.popmotion.keyframesTypesMod.ValueMap
import typings.popmotion.keyframesTypesMod.Values
import typings.popmotionEasing.mod.Easing
import typings.popmotionPose.popmotionPoseStrings.keyframes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type :'keyframes'} & popmotion-pose.popmotion-pose/lib/types.TransitionDefinitionCommonProps & popmotion.popmotion.KeyframesProps */
@js.native
trait KeyframesDefinition extends TransitionDefinition {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[Easing | js.Array[Easing] | StringDictionary[Easing]] = js.native
  var easings: js.UndefOr[js.Array[Easing]] = js.native
  var elapsed: js.UndefOr[Double] = js.native
  var flip: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var times: js.UndefOr[js.Array[Double]] = js.native
  var `type`: keyframes = js.native
  var values: Values = js.native
  var yoyo: js.UndefOr[Double] = js.native
}

object KeyframesDefinition {
  @scala.inline
  def apply(`type`: keyframes, values: Values): KeyframesDefinition = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesDefinition]
  }
  @scala.inline
  implicit class KeyframesDefinitionOps[Self <: KeyframesDefinition] (val x: Self) extends AnyVal {
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
    def setType(value: keyframes): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: (Double | String | ValueList | ValueMap)*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: Values): Self = this.set("values", value.asInstanceOf[js.Any])
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
    def setEase(value: Easing | js.Array[Easing] | StringDictionary[Easing]): Self = this.set("ease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    @scala.inline
    def setEasingsVarargs(value: Easing*): Self = this.set("easings", js.Array(value :_*))
    @scala.inline
    def setEasings(value: js.Array[Easing]): Self = this.set("easings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasings: Self = this.set("easings", js.undefined)
    @scala.inline
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElapsed: Self = this.set("elapsed", js.undefined)
    @scala.inline
    def setFlip(value: Double): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setLoop(value: Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setTimesVarargs(value: Double*): Self = this.set("times", js.Array(value :_*))
    @scala.inline
    def setTimes(value: js.Array[Double]): Self = this.set("times", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimes: Self = this.set("times", js.undefined)
    @scala.inline
    def setYoyo(value: Double): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
  }
  
}


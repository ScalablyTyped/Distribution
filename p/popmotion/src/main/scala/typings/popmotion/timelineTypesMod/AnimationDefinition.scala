package typings.popmotion.timelineTypesMod

import typings.popmotion.valueMod.Value
import typings.popmotionEasing.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationDefinition extends js.Object {
  var at: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[Easing] = js.native
  var from: js.UndefOr[Value] = js.native
  var to: js.UndefOr[Value] = js.native
  var track: String = js.native
}

object AnimationDefinition {
  @scala.inline
  def apply(track: String): AnimationDefinition = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDefinition]
  }
  @scala.inline
  implicit class AnimationDefinitionOps[Self <: AnimationDefinition] (val x: Self) extends AnyVal {
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
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def setAt(value: Double): Self = this.set("at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEase(value: /* v */ Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    @scala.inline
    def setFromVarargs(value: (Double | String)*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: Value): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setToVarargs(value: (Double | String)*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: Value): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}


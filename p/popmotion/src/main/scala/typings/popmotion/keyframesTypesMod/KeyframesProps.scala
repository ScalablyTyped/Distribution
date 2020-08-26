package typings.popmotion.keyframesTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionEasing.mod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyframesProps extends js.Object {
  var duration: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[Easing | js.Array[Easing] | StringDictionary[Easing]] = js.native
  var easings: js.UndefOr[js.Array[Easing]] = js.native
  var elapsed: js.UndefOr[Double] = js.native
  var flip: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Double] = js.native
  var times: js.UndefOr[js.Array[Double]] = js.native
  var values: Values = js.native
  var yoyo: js.UndefOr[Double] = js.native
}

object KeyframesProps {
  @scala.inline
  def apply(values: Values): KeyframesProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyframesProps]
  }
  @scala.inline
  implicit class KeyframesPropsOps[Self <: KeyframesProps] (val x: Self) extends AnyVal {
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
    def setValuesVarargs(value: (Double | String | ValueList | ValueMap)*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: Values): Self = this.set("values", value.asInstanceOf[js.Any])
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


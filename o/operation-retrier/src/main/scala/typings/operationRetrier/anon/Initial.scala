package typings.operationRetrier.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initial extends js.Object {
  var initial: js.UndefOr[Double] = js.native
  var max: Double = js.native
  var maxAttemptsCount: js.UndefOr[Double] = js.native
  var maxAttemptsTime: js.UndefOr[Double] = js.native
  var min: Double = js.native
  var randomness: js.UndefOr[Double] = js.native
}

object Initial {
  @scala.inline
  def apply(max: Double, min: Double): Initial = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial]
  }
  @scala.inline
  implicit class InitialOps[Self <: Initial] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: Double): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setMaxAttemptsCount(value: Double): Self = this.set("maxAttemptsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttemptsCount: Self = this.set("maxAttemptsCount", js.undefined)
    @scala.inline
    def setMaxAttemptsTime(value: Double): Self = this.set("maxAttemptsTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAttemptsTime: Self = this.set("maxAttemptsTime", js.undefined)
    @scala.inline
    def setRandomness(value: Double): Self = this.set("randomness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomness: Self = this.set("randomness", js.undefined)
  }
  
}


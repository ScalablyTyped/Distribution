package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromTo extends _DurationInputArg1 {
  var from: MomentInput = js.native
  var to: MomentInput = js.native
}

object FromTo {
  @scala.inline
  def apply(from: MomentInput, to: MomentInput): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
  @scala.inline
  implicit class FromToOps[Self <: FromTo] (val x: Self) extends AnyVal {
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
    def setFromVarargs(value: (Double | String)*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: MomentInput): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVarargs(value: (Double | String)*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: MomentInput): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}


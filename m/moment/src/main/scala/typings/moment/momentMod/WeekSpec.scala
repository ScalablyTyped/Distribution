package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeekSpec extends js.Object {
  var dow: Double = js.native
  var doy: js.UndefOr[Double] = js.native
}

object WeekSpec {
  @scala.inline
  def apply(dow: Double): WeekSpec = {
    val __obj = js.Dynamic.literal(dow = dow.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekSpec]
  }
  @scala.inline
  implicit class WeekSpecOps[Self <: WeekSpec] (val x: Self) extends AnyVal {
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
    def setDow(value: Double): Self = this.set("dow", value.asInstanceOf[js.Any])
    @scala.inline
    def setDoy(value: Double): Self = this.set("doy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoy: Self = this.set("doy", js.undefined)
  }
  
}


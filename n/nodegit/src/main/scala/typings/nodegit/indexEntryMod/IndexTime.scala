package typings.nodegit.indexEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexTime extends js.Object {
  var nanoseconds: Double = js.native
  var seconds: Double = js.native
}

object IndexTime {
  @scala.inline
  def apply(nanoseconds: Double, seconds: Double): IndexTime = {
    val __obj = js.Dynamic.literal(nanoseconds = nanoseconds.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexTime]
  }
  @scala.inline
  implicit class IndexTimeOps[Self <: IndexTime] (val x: Self) extends AnyVal {
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
    def setNanoseconds(value: Double): Self = this.set("nanoseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
  }
  
}


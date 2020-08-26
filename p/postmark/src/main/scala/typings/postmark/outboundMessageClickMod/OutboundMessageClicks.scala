package typings.postmark.outboundMessageClickMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundMessageClicks extends js.Object {
  var Clicks: js.Array[ClickEvent] = js.native
  var TotalCount: Double = js.native
}

object OutboundMessageClicks {
  @scala.inline
  def apply(Clicks: js.Array[ClickEvent], TotalCount: Double): OutboundMessageClicks = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessageClicks]
  }
  @scala.inline
  implicit class OutboundMessageClicksOps[Self <: OutboundMessageClicks] (val x: Self) extends AnyVal {
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
    def setClicksVarargs(value: ClickEvent*): Self = this.set("Clicks", js.Array(value :_*))
    @scala.inline
    def setClicks(value: js.Array[ClickEvent]): Self = this.set("Clicks", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
  
}


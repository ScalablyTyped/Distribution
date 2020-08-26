package typings.postmark.outboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundMessageOpens extends js.Object {
  var Opens: js.Array[OpenEvent] = js.native
  var TotalCount: Double = js.native
}

object OutboundMessageOpens {
  @scala.inline
  def apply(Opens: js.Array[OpenEvent], TotalCount: Double): OutboundMessageOpens = {
    val __obj = js.Dynamic.literal(Opens = Opens.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessageOpens]
  }
  @scala.inline
  implicit class OutboundMessageOpensOps[Self <: OutboundMessageOpens] (val x: Self) extends AnyVal {
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
    def setOpensVarargs(value: OpenEvent*): Self = this.set("Opens", js.Array(value :_*))
    @scala.inline
    def setOpens(value: js.Array[OpenEvent]): Self = this.set("Opens", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
  
}


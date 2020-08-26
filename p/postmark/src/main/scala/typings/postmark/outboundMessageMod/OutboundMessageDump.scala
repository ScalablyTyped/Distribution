package typings.postmark.outboundMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutboundMessageDump extends js.Object {
  var Body: String = js.native
}

object OutboundMessageDump {
  @scala.inline
  def apply(Body: String): OutboundMessageDump = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutboundMessageDump]
  }
  @scala.inline
  implicit class OutboundMessageDumpOps[Self <: OutboundMessageDump] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
  }
  
}


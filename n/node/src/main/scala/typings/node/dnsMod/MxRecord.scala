package typings.node.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MxRecord extends js.Object {
  var exchange: String = js.native
  var priority: Double = js.native
}

object MxRecord {
  @scala.inline
  def apply(exchange: String, priority: Double): MxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[MxRecord]
  }
  @scala.inline
  implicit class MxRecordOps[Self <: MxRecord] (val x: Self) extends AnyVal {
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
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
  }
  
}


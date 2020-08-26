package typings.node.dnsMod

import typings.node.nodeStrings.MX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyMxRecord
  extends MxRecord
     with AnyRecord {
  var `type`: MX = js.native
}

object AnyMxRecord {
  @scala.inline
  def apply(exchange: String, priority: Double, `type`: MX): AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyMxRecord]
  }
  @scala.inline
  implicit class AnyMxRecordOps[Self <: AnyMxRecord] (val x: Self) extends AnyVal {
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
    def setType(value: MX): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


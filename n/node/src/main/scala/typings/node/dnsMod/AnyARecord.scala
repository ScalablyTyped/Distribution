package typings.node.dnsMod

import typings.node.nodeStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyARecord
  extends RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  var `type`: A = js.native
}

object AnyARecord {
  @scala.inline
  def apply(address: String, ttl: Double, `type`: A): AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyARecord]
  }
  @scala.inline
  implicit class AnyARecordOps[Self <: AnyARecord] (val x: Self) extends AnyVal {
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
    def setType(value: A): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


package typings.node.dnsMod

import typings.node.nodeStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyARecord
  extends RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  var `type`: A
}

object AnyARecord {
  @scala.inline
  def apply(address: java.lang.String, ttl: Double, `type`: A): AnyARecord = {
    val __obj = js.Dynamic.literal(address = address, ttl = ttl)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyARecord]
  }
}


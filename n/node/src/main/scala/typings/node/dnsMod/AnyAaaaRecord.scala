package typings.node.dnsMod

import typings.node.nodeStrings.AAAA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyAaaaRecord
  extends RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  var `type`: AAAA
}

object AnyAaaaRecord {
  @scala.inline
  def apply(address: String, ttl: Double, `type`: AAAA): AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAaaaRecord]
  }
}


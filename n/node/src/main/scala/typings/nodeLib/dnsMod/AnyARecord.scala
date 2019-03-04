package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyARecord
  extends RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  var `type`: nodeLib.nodeLibStrings.A
}

object AnyARecord {
  @scala.inline
  def apply(address: java.lang.String, ttl: scala.Double, `type`: nodeLib.nodeLibStrings.A): AnyARecord = {
    val __obj = js.Dynamic.literal(address = address, ttl = ttl)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyARecord]
  }
}


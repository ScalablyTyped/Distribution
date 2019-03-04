package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyAaaaRecord
  extends RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  var `type`: nodeLib.nodeLibStrings.AAAA
}

object AnyAaaaRecord {
  @scala.inline
  def apply(address: java.lang.String, ttl: scala.Double, `type`: nodeLib.nodeLibStrings.AAAA): AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address, ttl = ttl)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnyAaaaRecord]
  }
}


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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[AnyAaaaRecord]
  }
}


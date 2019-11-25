package typings.node.dnsMod

import typings.node.nodeStrings.A
import typings.node.nodeStrings.AAAA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Use AnyARecord or AnyAaaaRecord instead. */
/* Rewritten from type alias, can be one of: 
  - typings.node.dnsMod.AnyARecord
  - typings.node.dnsMod.AnyAaaaRecord
*/
trait AnyRecordWithTtl extends js.Object

object AnyRecordWithTtl {
  @scala.inline
  def AnyARecord(address: java.lang.String, ttl: Double, `type`: A): AnyRecordWithTtl = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecordWithTtl]
  }
  @scala.inline
  def AnyAaaaRecord(address: java.lang.String, ttl: Double, `type`: AAAA): AnyRecordWithTtl = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyRecordWithTtl]
  }
}


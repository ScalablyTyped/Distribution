package typings.node.dnsMod

import typings.node.nodeStrings.A
import typings.node.nodeStrings.AAAA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Use `AnyARecord` or `AnyAaaaRecord` instead. */
/* Rewritten from type alias, can be one of: 
  - typings.node.dnsMod.AnyARecord
  - typings.node.dnsMod.AnyAaaaRecord
*/
trait AnyRecordWithTtl extends StObject
object AnyRecordWithTtl {
  
  @scala.inline
  def AnyARecord(address: String, ttl: Double, `type`: A): typings.node.dnsMod.AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.node.dnsMod.AnyARecord]
  }
  
  @scala.inline
  def AnyAaaaRecord(address: String, ttl: Double, `type`: AAAA): typings.node.dnsMod.AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.node.dnsMod.AnyAaaaRecord]
  }
}

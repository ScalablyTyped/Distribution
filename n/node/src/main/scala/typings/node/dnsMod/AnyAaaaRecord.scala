package typings.node.dnsMod

import typings.node.nodeStrings.AAAA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyAaaaRecord
  extends RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  
  var `type`: AAAA = js.native
}
object AnyAaaaRecord {
  
  @scala.inline
  def apply(address: String, ttl: Double, `type`: AAAA): AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAaaaRecord]
  }
  
  @scala.inline
  implicit class AnyAaaaRecordMutableBuilder[Self <: AnyAaaaRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AAAA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

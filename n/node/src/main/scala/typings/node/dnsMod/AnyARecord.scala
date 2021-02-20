package typings.node.dnsMod

import typings.node.nodeStrings.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class AnyARecordMutableBuilder[Self <: AnyARecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: A): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

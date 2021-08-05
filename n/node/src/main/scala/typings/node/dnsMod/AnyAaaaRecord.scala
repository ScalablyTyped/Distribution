package typings.node.dnsMod

import typings.node.nodeStrings.AAAA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyAaaaRecord
  extends StObject
     with RecordWithTtl
     with AnyRecord
     with AnyRecordWithTtl {
  
  var `type`: AAAA
}
object AnyAaaaRecord {
  
  inline def apply(address: String, ttl: Double): AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AAAA")
    __obj.asInstanceOf[AnyAaaaRecord]
  }
  
  extension [Self <: AnyAaaaRecord](x: Self) {
    
    inline def setType(value: AAAA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

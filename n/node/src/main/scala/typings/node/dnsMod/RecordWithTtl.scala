package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordWithTtl extends StObject {
  
  var address: String
  
  var ttl: Double
}
object RecordWithTtl {
  
  @scala.inline
  def apply(address: String, ttl: Double): RecordWithTtl = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordWithTtl]
  }
  
  @scala.inline
  implicit class RecordWithTtlMutableBuilder[Self <: RecordWithTtl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}

package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRequest extends StObject {
  
  var op: String = js.native
  
  var path: String = js.native
  
  var value: js.Any = js.native
}
object UpdateRequest {
  
  @scala.inline
  def apply(op: String, path: String, value: js.Any): UpdateRequest = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRequest]
  }
  
  @scala.inline
  implicit class UpdateRequestMutableBuilder[Self <: UpdateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

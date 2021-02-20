package typings.parse.mod.global.Parse

import typings.parse.mod.global.Parse.Object._Encode
import typings.parse.mod.global.Parse.Schema._FieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pointer
  extends _Encode[js.Any]
     with _FieldType {
  
  var __type: String = js.native
  
  var className: String = js.native
  
  var objectId: String = js.native
}
object Pointer {
  
  @scala.inline
  def apply(__type: String, className: String, objectId: String): Pointer = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointer]
  }
  
  @scala.inline
  implicit class PointerMutableBuilder[Self <: Pointer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}

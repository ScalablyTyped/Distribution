package typings.parse.mod.global.Parse

import typings.parse.mod.global.Parse.Schema._FieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pointer
  extends StObject
     with _FieldType {
  
  var __type: String
  
  var className: String
  
  var objectId: String
}
object Pointer {
  
  inline def apply(__type: String, className: String, objectId: String): Pointer = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pointer]
  }
  
  extension [Self <: Pointer](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}

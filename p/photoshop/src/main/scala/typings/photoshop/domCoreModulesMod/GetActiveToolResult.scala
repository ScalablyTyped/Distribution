package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActiveToolResult extends StObject {
  
  var classId: String
  
  var isModal: Boolean
  
  var key: String
  
  var title: String
}
object GetActiveToolResult {
  
  inline def apply(classId: String, isModal: Boolean, key: String, title: String): GetActiveToolResult = {
    val __obj = js.Dynamic.literal(classId = classId.asInstanceOf[js.Any], isModal = isModal.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActiveToolResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetActiveToolResult] (val x: Self) extends AnyVal {
    
    inline def setClassId(value: String): Self = StObject.set(x, "classId", value.asInstanceOf[js.Any])
    
    inline def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

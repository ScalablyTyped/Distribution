package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentData extends StObject {
  
  var content_type: js.Any
  
  var data: js.Any
  
  var name: String
}
object AttachmentData {
  
  inline def apply(content_type: js.Any, data: js.Any, name: String): AttachmentData = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentData]
  }
  
  extension [Self <: AttachmentData](x: Self) {
    
    inline def setContent_type(value: js.Any): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

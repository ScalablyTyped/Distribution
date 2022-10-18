package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** attachment data */
trait AttachmentData extends StObject {
  
  var content_type: Any
  
  var data: Any
  
  var name: String
}
object AttachmentData {
  
  inline def apply(content_type: Any, data: Any, name: String): AttachmentData = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentData]
  }
  
  extension [Self <: AttachmentData](x: Self) {
    
    inline def setContent_type(value: Any): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

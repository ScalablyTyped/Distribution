package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentData extends StObject {
  
  var content_type: js.Any = js.native
  
  var data: js.Any = js.native
  
  var name: String = js.native
}
object AttachmentData {
  
  @scala.inline
  def apply(content_type: js.Any, data: js.Any, name: String): AttachmentData = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentData]
  }
  
  @scala.inline
  implicit class AttachmentDataMutableBuilder[Self <: AttachmentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_type(value: js.Any): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

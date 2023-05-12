package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskFileAttachment
  extends StObject
     with AttachmentBase {
  
  // The base64-encoded contents of the file.
  var contentBytes: js.UndefOr[String] = js.undefined
}
object TaskFileAttachment {
  
  inline def apply(): TaskFileAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskFileAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskFileAttachment] (val x: Self) extends AnyVal {
    
    inline def setContentBytes(value: String): Self = StObject.set(x, "contentBytes", value.asInstanceOf[js.Any])
    
    inline def setContentBytesUndefined: Self = StObject.set(x, "contentBytes", js.undefined)
  }
}

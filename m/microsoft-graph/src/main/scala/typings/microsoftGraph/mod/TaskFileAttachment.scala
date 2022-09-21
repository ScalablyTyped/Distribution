package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskFileAttachment
  extends StObject
     with AttachmentBase {
  
  var contentBytes: js.UndefOr[String] = js.undefined
}
object TaskFileAttachment {
  
  inline def apply(): TaskFileAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskFileAttachment]
  }
  
  extension [Self <: TaskFileAttachment](x: Self) {
    
    inline def setContentBytes(value: String): Self = StObject.set(x, "contentBytes", value.asInstanceOf[js.Any])
    
    inline def setContentBytesUndefined: Self = StObject.set(x, "contentBytes", js.undefined)
  }
}

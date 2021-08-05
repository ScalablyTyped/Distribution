package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlinedAttachment
  extends StObject
     with Attachment {
  
  var ContentID: String
}
object InlinedAttachment {
  
  inline def apply(Base64Content: String, ContentID: String, ContentType: String, Filename: String): InlinedAttachment = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentID = ContentID.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinedAttachment]
  }
  
  extension [Self <: InlinedAttachment](x: Self) {
    
    inline def setContentID(value: String): Self = StObject.set(x, "ContentID", value.asInstanceOf[js.Any])
  }
}

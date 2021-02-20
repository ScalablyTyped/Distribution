package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlinedAttachment extends Attachment {
  
  var ContentID: String = js.native
}
object InlinedAttachment {
  
  @scala.inline
  def apply(Base64Content: String, ContentID: String, ContentType: String, Filename: String): InlinedAttachment = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentID = ContentID.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlinedAttachment]
  }
  
  @scala.inline
  implicit class InlinedAttachmentMutableBuilder[Self <: InlinedAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentID(value: String): Self = StObject.set(x, "ContentID", value.asInstanceOf[js.Any])
  }
}

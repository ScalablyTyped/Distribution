package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  var Base64Content: String
  
  var ContentType: String
  
  var Filename: String
}
object Attachment {
  
  @scala.inline
  def apply(Base64Content: String, ContentType: String, Filename: String): Attachment = {
    val __obj = js.Dynamic.literal(Base64Content = Base64Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], Filename = Filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase64Content(value: String): Self = StObject.set(x, "Base64Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "Filename", value.asInstanceOf[js.Any])
  }
}

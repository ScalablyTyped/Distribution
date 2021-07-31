package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAttachment
  extends StObject
     with Attachment {
  
  // The base64-encoded contents of the file.
  var contentBytes: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The ID of the attachment in the Exchange store.
  var contentId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Do not use this property as it is not supported.
  var contentLocation: js.UndefOr[NullableOption[String]] = js.undefined
}
object FileAttachment {
  
  @scala.inline
  def apply(): FileAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAttachment]
  }
  
  @scala.inline
  implicit class FileAttachmentMutableBuilder[Self <: FileAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentBytes(value: NullableOption[Double]): Self = StObject.set(x, "contentBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentBytesNull: Self = StObject.set(x, "contentBytes", null)
    
    @scala.inline
    def setContentBytesUndefined: Self = StObject.set(x, "contentBytes", js.undefined)
    
    @scala.inline
    def setContentId(value: NullableOption[String]): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentIdNull: Self = StObject.set(x, "contentId", null)
    
    @scala.inline
    def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    @scala.inline
    def setContentLocation(value: NullableOption[String]): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLocationNull: Self = StObject.set(x, "contentLocation", null)
    
    @scala.inline
    def setContentLocationUndefined: Self = StObject.set(x, "contentLocation", js.undefined)
  }
}

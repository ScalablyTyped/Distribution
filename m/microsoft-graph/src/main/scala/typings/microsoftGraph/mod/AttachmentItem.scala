package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentItem extends StObject {
  
  // The type of attachment. Possible values are: file, item, reference. Required.
  var attachmentType: js.UndefOr[NullableOption[AttachmentType]] = js.undefined
  
  // The nature of the data in the attachment. Optional.
  var contentType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // true if the attachment is an inline attachment; otherwise, false. Optional.
  var isInline: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The display name of the attachment. This can be a descriptive string and does not have to be the actual file name.
    * Required.
    */
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The length of the attachment in bytes. Required.
  var size: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AttachmentItem {
  
  @scala.inline
  def apply(): AttachmentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentItem]
  }
  
  @scala.inline
  implicit class AttachmentItemMutableBuilder[Self <: AttachmentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentType(value: NullableOption[AttachmentType]): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentTypeNull: Self = StObject.set(x, "attachmentType", null)
    
    @scala.inline
    def setAttachmentTypeUndefined: Self = StObject.set(x, "attachmentType", js.undefined)
    
    @scala.inline
    def setContentType(value: NullableOption[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setIsInline(value: NullableOption[Boolean]): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInlineNull: Self = StObject.set(x, "isInline", null)
    
    @scala.inline
    def setIsInlineUndefined: Self = StObject.set(x, "isInline", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSize(value: NullableOption[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeNull: Self = StObject.set(x, "size", null)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

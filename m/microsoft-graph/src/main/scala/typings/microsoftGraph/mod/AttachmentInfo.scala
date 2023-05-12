package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentInfo extends StObject {
  
  // The type of the attachment. The possible values are: file, item, reference. Required.
  var attachmentType: js.UndefOr[NullableOption[AttachmentType]] = js.undefined
  
  // The nature of the data in the attachment. Optional.
  var contentType: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The display name of the attachment. This can be a descriptive string and does not have to be the actual file name.
    * Required.
    */
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The length of the attachment in bytes. Required.
  var size: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AttachmentInfo {
  
  inline def apply(): AttachmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentInfo] (val x: Self) extends AnyVal {
    
    inline def setAttachmentType(value: NullableOption[AttachmentType]): Self = StObject.set(x, "attachmentType", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTypeNull: Self = StObject.set(x, "attachmentType", null)
    
    inline def setAttachmentTypeUndefined: Self = StObject.set(x, "attachmentType", js.undefined)
    
    inline def setContentType(value: NullableOption[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSize(value: NullableOption[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

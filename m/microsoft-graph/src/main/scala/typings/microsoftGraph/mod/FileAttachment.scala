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
  
  inline def apply(): FileAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAttachment]
  }
  
  extension [Self <: FileAttachment](x: Self) {
    
    inline def setContentBytes(value: NullableOption[Double]): Self = StObject.set(x, "contentBytes", value.asInstanceOf[js.Any])
    
    inline def setContentBytesNull: Self = StObject.set(x, "contentBytes", null)
    
    inline def setContentBytesUndefined: Self = StObject.set(x, "contentBytes", js.undefined)
    
    inline def setContentId(value: NullableOption[String]): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentIdNull: Self = StObject.set(x, "contentId", null)
    
    inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    inline def setContentLocation(value: NullableOption[String]): Self = StObject.set(x, "contentLocation", value.asInstanceOf[js.Any])
    
    inline def setContentLocationNull: Self = StObject.set(x, "contentLocation", null)
    
    inline def setContentLocationUndefined: Self = StObject.set(x, "contentLocation", js.undefined)
  }
}

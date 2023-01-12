package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document
  extends StObject
     with FileBase {
  
  var file_name: js.UndefOr[String] = js.undefined
  
  var mime_type: js.UndefOr[String] = js.undefined
  
  var thumb: js.UndefOr[PhotoSize] = js.undefined
}
object Document {
  
  inline def apply(file_id: String, file_unique_id: String): Document = {
    val __obj = js.Dynamic.literal(file_id = file_id.asInstanceOf[js.Any], file_unique_id = file_unique_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
    
    inline def setFile_nameUndefined: Self = StObject.set(x, "file_name", js.undefined)
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setMime_typeUndefined: Self = StObject.set(x, "mime_type", js.undefined)
    
    inline def setThumb(value: PhotoSize): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
  }
}

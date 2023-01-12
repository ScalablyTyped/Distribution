package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSetContent extends StObject {
  
  // Content type information of the file.
  var contentType: js.UndefOr[NullableOption[ContentTypeInfo]] = js.undefined
  
  // Name of the file in resource folder that should be added as a default content or a template in the document set.
  var fileName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Folder name in which the file will be placed when a new document set is created in the library.
  var folderName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DocumentSetContent {
  
  inline def apply(): DocumentSetContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSetContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentSetContent] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: NullableOption[ContentTypeInfo]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFolderName(value: NullableOption[String]): Self = StObject.set(x, "folderName", value.asInstanceOf[js.Any])
    
    inline def setFolderNameNull: Self = StObject.set(x, "folderName", null)
    
    inline def setFolderNameUndefined: Self = StObject.set(x, "folderName", js.undefined)
  }
}

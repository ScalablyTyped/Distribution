package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentId extends StObject {
  
  /**
    * A unique Id of the attached document. This parameter is deprecated since 1.28.0. Use the `files` parameter
    * instead.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * A FileList of individually selected files from the underlying system. Restriction: Internet Explorer
    * 9 supports only single file with property file.name. Since version 1.28.0.
    */
  var files: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object DocumentId {
  
  inline def apply(): DocumentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentId]
  }
  
  extension [Self <: DocumentId](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setFiles(value: js.Array[js.Object]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: js.Object*): Self = StObject.set(x, "files", js.Array(value*))
  }
}

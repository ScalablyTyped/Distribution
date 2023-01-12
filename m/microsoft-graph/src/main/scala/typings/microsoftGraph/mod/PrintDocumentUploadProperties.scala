package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintDocumentUploadProperties extends StObject {
  
  // The document's content (MIME) type.
  var contentType: js.UndefOr[String] = js.undefined
  
  // The document's name.
  var documentName: js.UndefOr[String] = js.undefined
  
  // The document's size in bytes.
  var size: js.UndefOr[Double] = js.undefined
}
object PrintDocumentUploadProperties {
  
  inline def apply(): PrintDocumentUploadProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintDocumentUploadProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintDocumentUploadProperties] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setDocumentName(value: String): Self = StObject.set(x, "documentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "documentName", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}

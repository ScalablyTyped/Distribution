package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDocumentStyleRequest extends StObject {
  
  /**
    * The styles to set on the document. Certain document style changes may cause other changes in order to mirror the behavior of the Docs editor. See the documentation of DocumentStyle
    * for more information.
    */
  var documentStyle: js.UndefOr[DocumentStyle] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `document_style` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the background, set `fields` to `"background"`.
    */
  var fields: js.UndefOr[String] = js.undefined
}
object UpdateDocumentStyleRequest {
  
  inline def apply(): UpdateDocumentStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDocumentStyleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDocumentStyleRequest] (val x: Self) extends AnyVal {
    
    inline def setDocumentStyle(value: DocumentStyle): Self = StObject.set(x, "documentStyle", value.asInstanceOf[js.Any])
    
    inline def setDocumentStyleUndefined: Self = StObject.set(x, "documentStyle", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}

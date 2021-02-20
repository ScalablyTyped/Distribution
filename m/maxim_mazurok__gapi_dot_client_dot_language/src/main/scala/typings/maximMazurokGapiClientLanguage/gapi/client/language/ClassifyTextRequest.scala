package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifyTextRequest extends StObject {
  
  /** Required. Input document. */
  var document: js.UndefOr[Document] = js.native
}
object ClassifyTextRequest {
  
  @scala.inline
  def apply(): ClassifyTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyTextRequest]
  }
  
  @scala.inline
  implicit class ClassifyTextRequestMutableBuilder[Self <: ClassifyTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}

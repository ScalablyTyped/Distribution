package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeSyntaxRequest extends StObject {
  
  /** Required. Input document. */
  var document: js.UndefOr[Document] = js.undefined
  
  /** The encoding type used by the API to calculate offsets. */
  var encodingType: js.UndefOr[String] = js.undefined
}
object AnalyzeSyntaxRequest {
  
  @scala.inline
  def apply(): AnalyzeSyntaxRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeSyntaxRequest]
  }
  
  @scala.inline
  implicit class AnalyzeSyntaxRequestMutableBuilder[Self <: AnalyzeSyntaxRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
  }
}

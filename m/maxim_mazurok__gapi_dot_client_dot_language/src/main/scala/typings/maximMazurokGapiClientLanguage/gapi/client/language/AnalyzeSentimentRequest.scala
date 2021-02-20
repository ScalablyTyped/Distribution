package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzeSentimentRequest extends StObject {
  
  /** Required. Input document. */
  var document: js.UndefOr[Document] = js.native
  
  /** The encoding type used by the API to calculate sentence offsets. */
  var encodingType: js.UndefOr[String] = js.native
}
object AnalyzeSentimentRequest {
  
  @scala.inline
  def apply(): AnalyzeSentimentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeSentimentRequest]
  }
  
  @scala.inline
  implicit class AnalyzeSentimentRequestMutableBuilder[Self <: AnalyzeSentimentRequest] (val x: Self) extends AnyVal {
    
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

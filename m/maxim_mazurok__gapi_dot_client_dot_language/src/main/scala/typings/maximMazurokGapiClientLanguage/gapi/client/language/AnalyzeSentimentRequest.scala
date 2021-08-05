package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeSentimentRequest extends StObject {
  
  /** Required. Input document. */
  var document: js.UndefOr[Document] = js.undefined
  
  /** The encoding type used by the API to calculate sentence offsets. */
  var encodingType: js.UndefOr[String] = js.undefined
}
object AnalyzeSentimentRequest {
  
  inline def apply(): AnalyzeSentimentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeSentimentRequest]
  }
  
  extension [Self <: AnalyzeSentimentRequest](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
  }
}

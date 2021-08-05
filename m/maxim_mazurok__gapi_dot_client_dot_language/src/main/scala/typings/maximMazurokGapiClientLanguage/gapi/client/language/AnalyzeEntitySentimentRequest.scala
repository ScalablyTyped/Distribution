package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeEntitySentimentRequest extends StObject {
  
  /** Required. Input document. */
  var document: js.UndefOr[Document] = js.undefined
  
  /** The encoding type used by the API to calculate offsets. */
  var encodingType: js.UndefOr[String] = js.undefined
}
object AnalyzeEntitySentimentRequest {
  
  inline def apply(): AnalyzeEntitySentimentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeEntitySentimentRequest]
  }
  
  extension [Self <: AnalyzeEntitySentimentRequest](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
  }
}

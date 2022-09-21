package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeEntitiesRequest extends StObject {
  
  /** document_content is a document to be annotated. */
  var documentContent: js.UndefOr[String] = js.undefined
  
  /** A list of licensed vocabularies to use in the request, in addition to the default unlicensed vocabularies. */
  var licensedVocabularies: js.UndefOr[js.Array[String]] = js.undefined
}
object AnalyzeEntitiesRequest {
  
  inline def apply(): AnalyzeEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeEntitiesRequest]
  }
  
  extension [Self <: AnalyzeEntitiesRequest](x: Self) {
    
    inline def setDocumentContent(value: String): Self = StObject.set(x, "documentContent", value.asInstanceOf[js.Any])
    
    inline def setDocumentContentUndefined: Self = StObject.set(x, "documentContent", js.undefined)
    
    inline def setLicensedVocabularies(value: js.Array[String]): Self = StObject.set(x, "licensedVocabularies", value.asInstanceOf[js.Any])
    
    inline def setLicensedVocabulariesUndefined: Self = StObject.set(x, "licensedVocabularies", js.undefined)
    
    inline def setLicensedVocabulariesVarargs(value: String*): Self = StObject.set(x, "licensedVocabularies", js.Array(value*))
  }
}

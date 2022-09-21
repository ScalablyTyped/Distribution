package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateDocumentResponse extends StObject {
  
  /** Translated document. */
  var documentTranslation: js.UndefOr[DocumentTranslation] = js.undefined
  
  /** The `glossary_config` used for this translation. */
  var glossaryConfig: js.UndefOr[TranslateTextGlossaryConfig] = js.undefined
  
  /** The document's translation output if a glossary is provided in the request. This can be the same as [TranslateDocumentResponse.document_translation] if no glossary terms apply. */
  var glossaryDocumentTranslation: js.UndefOr[DocumentTranslation] = js.undefined
  
  /**
    * Only present when 'model' is present in the request. 'model' is normalized to have a project number. For example: If the 'model' field in TranslateDocumentRequest is:
    * `projects/{project-id}/locations/{location-id}/models/general/nmt` then `model` here would be normalized to `projects/{project-number}/locations/{location-id}/models/general/nmt`.
    */
  var model: js.UndefOr[String] = js.undefined
}
object TranslateDocumentResponse {
  
  inline def apply(): TranslateDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateDocumentResponse]
  }
  
  extension [Self <: TranslateDocumentResponse](x: Self) {
    
    inline def setDocumentTranslation(value: DocumentTranslation): Self = StObject.set(x, "documentTranslation", value.asInstanceOf[js.Any])
    
    inline def setDocumentTranslationUndefined: Self = StObject.set(x, "documentTranslation", js.undefined)
    
    inline def setGlossaryConfig(value: TranslateTextGlossaryConfig): Self = StObject.set(x, "glossaryConfig", value.asInstanceOf[js.Any])
    
    inline def setGlossaryConfigUndefined: Self = StObject.set(x, "glossaryConfig", js.undefined)
    
    inline def setGlossaryDocumentTranslation(value: DocumentTranslation): Self = StObject.set(x, "glossaryDocumentTranslation", value.asInstanceOf[js.Any])
    
    inline def setGlossaryDocumentTranslationUndefined: Self = StObject.set(x, "glossaryDocumentTranslation", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}

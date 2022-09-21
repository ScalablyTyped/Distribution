package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateDocumentRequest extends StObject {
  
  /** Required. Input configurations. */
  var documentInputConfig: js.UndefOr[DocumentInputConfig] = js.undefined
  
  /**
    * Optional. Output configurations. Defines if the output file should be stored within Cloud Storage as well as the desired output format. If not provided the translated file will only
    * be returned through a byte-stream and its output mime type will be the same as the input file's mime type.
    */
  var documentOutputConfig: js.UndefOr[DocumentOutputConfig] = js.undefined
  
  /** Optional. Glossary to be applied. The glossary must be within the same region (have the same location-id) as the model, otherwise an INVALID_ARGUMENT (400) error is returned. */
  var glossaryConfig: js.UndefOr[TranslateTextGlossaryConfig] = js.undefined
  
  /**
    * Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters,
    * numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See
    * https://cloud.google.com/translate/docs/advanced/labels for more information.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.TranslateDocumentRequest & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Optional. The `model` type requested for this translation. The format depends on model type: - AutoML Translation models:
    * `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}` - General (built-in) models:
    * `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`, If not provided, the default Google model (NMT) will be used for translation.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The BCP-47 language code of the input document if known, for example, "en-US" or "sr-Latn". Supported language codes are listed in Language Support. If the source language
    * isn't specified, the API attempts to identify the source language automatically and returns the source language within the response. Source language must be specified if the request
    * contains a glossary or a custom model.
    */
  var sourceLanguageCode: js.UndefOr[String] = js.undefined
  
  /** Required. The BCP-47 language code to use for translation of the input document, set to one of the language codes listed in Language Support. */
  var targetLanguageCode: js.UndefOr[String] = js.undefined
}
object TranslateDocumentRequest {
  
  inline def apply(): TranslateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateDocumentRequest]
  }
  
  extension [Self <: TranslateDocumentRequest](x: Self) {
    
    inline def setDocumentInputConfig(value: DocumentInputConfig): Self = StObject.set(x, "documentInputConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentInputConfigUndefined: Self = StObject.set(x, "documentInputConfig", js.undefined)
    
    inline def setDocumentOutputConfig(value: DocumentOutputConfig): Self = StObject.set(x, "documentOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentOutputConfigUndefined: Self = StObject.set(x, "documentOutputConfig", js.undefined)
    
    inline def setGlossaryConfig(value: TranslateTextGlossaryConfig): Self = StObject.set(x, "glossaryConfig", value.asInstanceOf[js.Any])
    
    inline def setGlossaryConfigUndefined: Self = StObject.set(x, "glossaryConfig", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.TranslateDocumentRequest & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSourceLanguageCode(value: String): Self = StObject.set(x, "sourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageCodeUndefined: Self = StObject.set(x, "sourceLanguageCode", js.undefined)
    
    inline def setTargetLanguageCode(value: String): Self = StObject.set(x, "targetLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodeUndefined: Self = StObject.set(x, "targetLanguageCode", js.undefined)
  }
}

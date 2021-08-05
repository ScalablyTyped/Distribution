package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateTextRequest extends StObject {
  
  /**
    * Required. The content of the input in string format. We recommend the total content be less than 30k codepoints. The max length of this field is 1024. Use BatchTranslateText for
    * larger text.
    */
  var contents: js.UndefOr[js.Array[String]] = js.undefined
  
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
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.TranslateTextRequest & TopLevel[js.Any]
  ] = js.undefined
  
  /** Optional. The format of the source text, for example, "text/html", "text/plain". If left blank, the MIME type defaults to "text/html". */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The `model` type requested for this translation. The format depends on model type: - AutoML Translation models:
    * `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}` - General (built-in) models:
    * `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`, `projects/{project-number-or-id}/locations/{location-id}/models/general/base` For global
    * (non-regionalized) requests, use `location-id` `global`. For example, `projects/{project-number-or-id}/locations/global/models/general/nmt`. If missing, the system decides which
    * google base model to use.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The BCP-47 language code of the input text if known, for example, "en-US" or "sr-Latn". Supported language codes are listed in Language Support. If the source language
    * isn't specified, the API attempts to identify the source language automatically and returns the source language within the response.
    */
  var sourceLanguageCode: js.UndefOr[String] = js.undefined
  
  /** Required. The BCP-47 language code to use for translation of the input text, set to one of the language codes listed in Language Support. */
  var targetLanguageCode: js.UndefOr[String] = js.undefined
}
object TranslateTextRequest {
  
  inline def apply(): TranslateTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateTextRequest]
  }
  
  extension [Self <: TranslateTextRequest](x: Self) {
    
    inline def setContents(value: js.Array[String]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setContentsVarargs(value: String*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    inline def setGlossaryConfig(value: TranslateTextGlossaryConfig): Self = StObject.set(x, "glossaryConfig", value.asInstanceOf[js.Any])
    
    inline def setGlossaryConfigUndefined: Self = StObject.set(x, "glossaryConfig", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.TranslateTextRequest & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setSourceLanguageCode(value: String): Self = StObject.set(x, "sourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageCodeUndefined: Self = StObject.set(x, "sourceLanguageCode", js.undefined)
    
    inline def setTargetLanguageCode(value: String): Self = StObject.set(x, "targetLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodeUndefined: Self = StObject.set(x, "targetLanguageCode", js.undefined)
  }
}

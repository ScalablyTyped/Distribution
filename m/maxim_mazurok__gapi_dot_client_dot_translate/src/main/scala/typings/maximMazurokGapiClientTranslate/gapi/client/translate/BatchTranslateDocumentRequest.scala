package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchTranslateDocumentRequest extends StObject {
  
  /** Optional. */
  var formatConversions: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateDocumentRequest & TopLevel[Any]
  ] = js.undefined
  
  /** Optional. Glossaries to be applied. It's keyed by target language code. */
  var glossaries: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.translate.gapi.client.translate.TranslateTextGlossaryConfig}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateDocumentRequest & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Required. Input configurations. The total number of files matched should be <= 100. The total content size to translate should be <= 100M Unicode codepoints. The files must use
    * UTF-8 encoding.
    */
  var inputConfigs: js.UndefOr[js.Array[BatchDocumentInputConfig]] = js.undefined
  
  /**
    * Optional. The models to use for translation. Map's key is target language code. Map's value is the model name. Value can be a built-in general model, or an AutoML Translation model.
    * The value format depends on model type: - AutoML Translation models: `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}` - General (built-in) models:
    * `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`, If the map is empty or a specific model is not requested for a language pair, then default google model
    * (nmt) is used.
    */
  var models: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateDocumentRequest & TopLevel[Any]
  ] = js.undefined
  
  /** Required. Output configuration. If 2 input configs match to the same file (that is, same input path), we don't generate output for duplicate inputs. */
  var outputConfig: js.UndefOr[BatchDocumentOutputConfig] = js.undefined
  
  /**
    * Required. The BCP-47 language code of the input document if known, for example, "en-US" or "sr-Latn". Supported language codes are listed in [Language
    * Support](https://cloud.google.com/translate/docs/languages).
    */
  var sourceLanguageCode: js.UndefOr[String] = js.undefined
  
  /** Required. The BCP-47 language code to use for translation of the input document. Specify up to 10 language codes here. */
  var targetLanguageCodes: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchTranslateDocumentRequest {
  
  inline def apply(): BatchTranslateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchTranslateDocumentRequest]
  }
  
  extension [Self <: BatchTranslateDocumentRequest](x: Self) {
    
    inline def setFormatConversions(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateDocumentRequest & TopLevel[Any]
    ): Self = StObject.set(x, "formatConversions", value.asInstanceOf[js.Any])
    
    inline def setFormatConversionsUndefined: Self = StObject.set(x, "formatConversions", js.undefined)
    
    inline def setGlossaries(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.translate.gapi.client.translate.TranslateTextGlossaryConfig}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateDocumentRequest & TopLevel[Any]
    ): Self = StObject.set(x, "glossaries", value.asInstanceOf[js.Any])
    
    inline def setGlossariesUndefined: Self = StObject.set(x, "glossaries", js.undefined)
    
    inline def setInputConfigs(value: js.Array[BatchDocumentInputConfig]): Self = StObject.set(x, "inputConfigs", value.asInstanceOf[js.Any])
    
    inline def setInputConfigsUndefined: Self = StObject.set(x, "inputConfigs", js.undefined)
    
    inline def setInputConfigsVarargs(value: BatchDocumentInputConfig*): Self = StObject.set(x, "inputConfigs", js.Array(value*))
    
    inline def setModels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateDocumentRequest & TopLevel[Any]
    ): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setOutputConfig(value: BatchDocumentOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setSourceLanguageCode(value: String): Self = StObject.set(x, "sourceLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setSourceLanguageCodeUndefined: Self = StObject.set(x, "sourceLanguageCode", js.undefined)
    
    inline def setTargetLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "targetLanguageCodes", value.asInstanceOf[js.Any])
    
    inline def setTargetLanguageCodesUndefined: Self = StObject.set(x, "targetLanguageCodes", js.undefined)
    
    inline def setTargetLanguageCodesVarargs(value: String*): Self = StObject.set(x, "targetLanguageCodes", js.Array(value*))
  }
}

package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchTranslateTextRequest extends js.Object {
  
  /** Optional. Glossaries to be applied for translation. It's keyed by target language code. */
  var glossaries: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.translate.gapi.client.translate.TranslateTextGlossaryConfig}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateTextRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Required. Input configurations. The total number of files matched should be <= 1000. The total content size should be <= 100M Unicode codepoints. The files must use UTF-8 encoding. */
  var inputConfigs: js.UndefOr[js.Array[InputConfig]] = js.native
  
  /**
    * Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters,
    * numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See
    * https://cloud.google.com/translate/docs/advanced/labels for more information.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateTextRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Optional. The models to use for translation. Map's key is target language code. Map's value is model name. Value can be a built-in general model, or an AutoML Translation model. The
    * value format depends on model type: - AutoML Translation models: `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}` - General (built-in) models:
    * `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`, `projects/{project-number-or-id}/locations/{location-id}/models/general/base` If the map is empty or a
    * specific model is not requested for a language pair, then default google model (nmt) is used.
    */
  var models: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateTextRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Required. Output configuration. If 2 input configs match to the same file (that is, same input path), we don't generate output for duplicate inputs. */
  var outputConfig: js.UndefOr[OutputConfig] = js.native
  
  /** Required. Source language code. */
  var sourceLanguageCode: js.UndefOr[String] = js.native
  
  /** Required. Specify up to 10 language codes here. */
  var targetLanguageCodes: js.UndefOr[js.Array[String]] = js.native
}
object BatchTranslateTextRequest {
  
  @scala.inline
  def apply(): BatchTranslateTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchTranslateTextRequest]
  }
  
  @scala.inline
  implicit class BatchTranslateTextRequestOps[Self <: BatchTranslateTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGlossaries(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.translate.gapi.client.translate.TranslateTextGlossaryConfig}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateTextRequest with TopLevel[js.Any]
    ): Self = this.set("glossaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlossaries: Self = this.set("glossaries", js.undefined)
    
    @scala.inline
    def setInputConfigsVarargs(value: InputConfig*): Self = this.set("inputConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInputConfigs(value: js.Array[InputConfig]): Self = this.set("inputConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfigs: Self = this.set("inputConfigs", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateTextRequest with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setModels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.BatchTranslateTextRequest with TopLevel[js.Any]
    ): Self = this.set("models", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
    
    @scala.inline
    def setSourceLanguageCode(value: String): Self = this.set("sourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLanguageCode: Self = this.set("sourceLanguageCode", js.undefined)
    
    @scala.inline
    def setTargetLanguageCodesVarargs(value: String*): Self = this.set("targetLanguageCodes", js.Array(value :_*))
    
    @scala.inline
    def setTargetLanguageCodes(value: js.Array[String]): Self = this.set("targetLanguageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLanguageCodes: Self = this.set("targetLanguageCodes", js.undefined)
  }
}

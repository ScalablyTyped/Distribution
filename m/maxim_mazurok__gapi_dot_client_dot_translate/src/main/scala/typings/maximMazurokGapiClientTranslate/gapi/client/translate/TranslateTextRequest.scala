package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateTextRequest extends js.Object {
  
  /**
    * Required. The content of the input in string format. We recommend the total content be less than 30k codepoints. The max length of this field is 1024. Use BatchTranslateText for
    * larger text.
    */
  var contents: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Glossary to be applied. The glossary must be within the same region (have the same location-id) as the model, otherwise an INVALID_ARGUMENT (400) error is returned. */
  var glossaryConfig: js.UndefOr[TranslateTextGlossaryConfig] = js.native
  
  /**
    * Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters,
    * numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See
    * https://cloud.google.com/translate/docs/advanced/labels for more information.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.TranslateTextRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. The format of the source text, for example, "text/html", "text/plain". If left blank, the MIME type defaults to "text/html". */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Optional. The `model` type requested for this translation. The format depends on model type: - AutoML Translation models:
    * `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}` - General (built-in) models:
    * `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`, `projects/{project-number-or-id}/locations/{location-id}/models/general/base` For global
    * (non-regionalized) requests, use `location-id` `global`. For example, `projects/{project-number-or-id}/locations/global/models/general/nmt`. If missing, the system decides which
    * google base model to use.
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * Optional. The BCP-47 language code of the input text if known, for example, "en-US" or "sr-Latn". Supported language codes are listed in Language Support. If the source language
    * isn't specified, the API attempts to identify the source language automatically and returns the source language within the response.
    */
  var sourceLanguageCode: js.UndefOr[String] = js.native
  
  /** Required. The BCP-47 language code to use for translation of the input text, set to one of the language codes listed in Language Support. */
  var targetLanguageCode: js.UndefOr[String] = js.native
}
object TranslateTextRequest {
  
  @scala.inline
  def apply(): TranslateTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateTextRequest]
  }
  
  @scala.inline
  implicit class TranslateTextRequestOps[Self <: TranslateTextRequest] (val x: Self) extends AnyVal {
    
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
    def setContentsVarargs(value: String*): Self = this.set("contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: js.Array[String]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    
    @scala.inline
    def setGlossaryConfig(value: TranslateTextGlossaryConfig): Self = this.set("glossaryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlossaryConfig: Self = this.set("glossaryConfig", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.TranslateTextRequest with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSourceLanguageCode(value: String): Self = this.set("sourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLanguageCode: Self = this.set("sourceLanguageCode", js.undefined)
    
    @scala.inline
    def setTargetLanguageCode(value: String): Self = this.set("targetLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLanguageCode: Self = this.set("targetLanguageCode", js.undefined)
  }
}

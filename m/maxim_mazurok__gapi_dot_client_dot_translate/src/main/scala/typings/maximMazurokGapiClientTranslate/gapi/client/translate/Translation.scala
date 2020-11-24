package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Translation extends js.Object {
  
  /**
    * The BCP-47 language code of source text in the initial request, detected automatically, if no source language was passed within the initial request. If the source language was
    * passed, auto-detection of the language does not occur and this field is empty.
    */
  var detectedLanguageCode: js.UndefOr[String] = js.native
  
  /** The `glossary_config` used for this translation. */
  var glossaryConfig: js.UndefOr[TranslateTextGlossaryConfig] = js.native
  
  /**
    * Only present when `model` is present in the request. `model` here is normalized to have project number. For example: If the `model` requested in TranslationTextRequest is
    * `projects/{project-id}/locations/{location-id}/models/general/nmt` then `model` here would be normalized to `projects/{project-number}/locations/{location-id}/models/general/nmt`.
    */
  var model: js.UndefOr[String] = js.native
  
  /** Text translated into the target language. */
  var translatedText: js.UndefOr[String] = js.native
}
object Translation {
  
  @scala.inline
  def apply(): Translation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translation]
  }
  
  @scala.inline
  implicit class TranslationOps[Self <: Translation] (val x: Self) extends AnyVal {
    
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
    def setDetectedLanguageCode(value: String): Self = this.set("detectedLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedLanguageCode: Self = this.set("detectedLanguageCode", js.undefined)
    
    @scala.inline
    def setGlossaryConfig(value: TranslateTextGlossaryConfig): Self = this.set("glossaryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlossaryConfig: Self = this.set("glossaryConfig", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setTranslatedText(value: String): Self = this.set("translatedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslatedText: Self = this.set("translatedText", js.undefined)
  }
}

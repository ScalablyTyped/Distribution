package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Translation extends StObject {
  
  /**
    * The BCP-47 language code of source text in the initial request, detected automatically, if no source language was passed within the initial request. If the source language was
    * passed, auto-detection of the language does not occur and this field is empty.
    */
  var detectedLanguageCode: js.UndefOr[String] = js.undefined
  
  /** The `glossary_config` used for this translation. */
  var glossaryConfig: js.UndefOr[TranslateTextGlossaryConfig] = js.undefined
  
  /**
    * Only present when `model` is present in the request. `model` here is normalized to have project number. For example: If the `model` requested in TranslationTextRequest is
    * `projects/{project-id}/locations/{location-id}/models/general/nmt` then `model` here would be normalized to `projects/{project-number}/locations/{location-id}/models/general/nmt`.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /** Text translated into the target language. */
  var translatedText: js.UndefOr[String] = js.undefined
}
object Translation {
  
  @scala.inline
  def apply(): Translation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Translation]
  }
  
  @scala.inline
  implicit class TranslationMutableBuilder[Self <: Translation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectedLanguageCode(value: String): Self = StObject.set(x, "detectedLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedLanguageCodeUndefined: Self = StObject.set(x, "detectedLanguageCode", js.undefined)
    
    @scala.inline
    def setGlossaryConfig(value: TranslateTextGlossaryConfig): Self = StObject.set(x, "glossaryConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlossaryConfigUndefined: Self = StObject.set(x, "glossaryConfig", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setTranslatedText(value: String): Self = StObject.set(x, "translatedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslatedTextUndefined: Self = StObject.set(x, "translatedText", js.undefined)
  }
}

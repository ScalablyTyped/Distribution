package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateTextResponse extends StObject {
  
  /** Text translation responses if a glossary is provided in the request. This can be the same as `translations` if no terms apply. This field has the same length as `contents`. */
  var glossaryTranslations: js.UndefOr[js.Array[Translation]] = js.native
  
  /** Text translation responses with no glossary applied. This field has the same length as `contents`. */
  var translations: js.UndefOr[js.Array[Translation]] = js.native
}
object TranslateTextResponse {
  
  @scala.inline
  def apply(): TranslateTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslateTextResponse]
  }
  
  @scala.inline
  implicit class TranslateTextResponseMutableBuilder[Self <: TranslateTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlossaryTranslations(value: js.Array[Translation]): Self = StObject.set(x, "glossaryTranslations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlossaryTranslationsUndefined: Self = StObject.set(x, "glossaryTranslations", js.undefined)
    
    @scala.inline
    def setGlossaryTranslationsVarargs(value: Translation*): Self = StObject.set(x, "glossaryTranslations", js.Array(value :_*))
    
    @scala.inline
    def setTranslations(value: js.Array[Translation]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setTranslationsVarargs(value: Translation*): Self = StObject.set(x, "translations", js.Array(value :_*))
  }
}

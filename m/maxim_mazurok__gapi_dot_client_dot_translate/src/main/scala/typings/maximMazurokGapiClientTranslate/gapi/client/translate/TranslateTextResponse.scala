package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslateTextResponse extends js.Object {
  
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
  implicit class TranslateTextResponseOps[Self <: TranslateTextResponse] (val x: Self) extends AnyVal {
    
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
    def setGlossaryTranslationsVarargs(value: Translation*): Self = this.set("glossaryTranslations", js.Array(value :_*))
    
    @scala.inline
    def setGlossaryTranslations(value: js.Array[Translation]): Self = this.set("glossaryTranslations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlossaryTranslations: Self = this.set("glossaryTranslations", js.undefined)
    
    @scala.inline
    def setTranslationsVarargs(value: Translation*): Self = this.set("translations", js.Array(value :_*))
    
    @scala.inline
    def setTranslations(value: js.Array[Translation]): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}

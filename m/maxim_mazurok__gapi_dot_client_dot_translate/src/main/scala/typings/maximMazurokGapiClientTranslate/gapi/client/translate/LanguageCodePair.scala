package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageCodePair extends js.Object {
  
  /** Required. The BCP-47 language code of the input text, for example, "en-US". Expected to be an exact match for GlossaryTerm.language_code. */
  var sourceLanguageCode: js.UndefOr[String] = js.native
  
  /** Required. The BCP-47 language code for translation output, for example, "zh-CN". Expected to be an exact match for GlossaryTerm.language_code. */
  var targetLanguageCode: js.UndefOr[String] = js.native
}
object LanguageCodePair {
  
  @scala.inline
  def apply(): LanguageCodePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageCodePair]
  }
  
  @scala.inline
  implicit class LanguageCodePairOps[Self <: LanguageCodePair] (val x: Self) extends AnyVal {
    
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
    def setSourceLanguageCode(value: String): Self = this.set("sourceLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLanguageCode: Self = this.set("sourceLanguageCode", js.undefined)
    
    @scala.inline
    def setTargetLanguageCode(value: String): Self = this.set("targetLanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLanguageCode: Self = this.set("targetLanguageCode", js.undefined)
  }
}

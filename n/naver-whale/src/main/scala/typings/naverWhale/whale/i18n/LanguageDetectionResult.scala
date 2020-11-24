package typings.naverWhale.whale.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageDetectionResult extends js.Object {
  
  /** CLD detected language reliability */
  var isReliable: Boolean = js.native
  
  /** Array of detectedLanguage */
  var languages: js.Array[typings.chrome.chrome.i18n.DetectedLanguage] = js.native
}
object LanguageDetectionResult {
  
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[typings.chrome.chrome.i18n.DetectedLanguage]): LanguageDetectionResult = {
    val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageDetectionResult]
  }
  
  @scala.inline
  implicit class LanguageDetectionResultOps[Self <: LanguageDetectionResult] (val x: Self) extends AnyVal {
    
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
    def setIsReliable(value: Boolean): Self = this.set("isReliable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: typings.chrome.chrome.i18n.DetectedLanguage*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[typings.chrome.chrome.i18n.DetectedLanguage]): Self = this.set("languages", value.asInstanceOf[js.Any])
  }
}

package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectLanguageResponse extends js.Object {
  
  /** The most probable language detected by the Translation API. For each request, the Translation API will always return only one result. */
  var languages: js.UndefOr[js.Array[DetectedLanguage]] = js.native
}
object DetectLanguageResponse {
  
  @scala.inline
  def apply(): DetectLanguageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLanguageResponse]
  }
  
  @scala.inline
  implicit class DetectLanguageResponseOps[Self <: DetectLanguageResponse] (val x: Self) extends AnyVal {
    
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
    def setLanguagesVarargs(value: DetectedLanguage*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[DetectedLanguage]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
}

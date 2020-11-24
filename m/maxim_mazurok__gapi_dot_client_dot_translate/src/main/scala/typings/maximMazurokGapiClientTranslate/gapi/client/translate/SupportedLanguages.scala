package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedLanguages extends js.Object {
  
  /** A list of supported language responses. This list contains an entry for each language the Translation API supports. */
  var languages: js.UndefOr[js.Array[SupportedLanguage]] = js.native
}
object SupportedLanguages {
  
  @scala.inline
  def apply(): SupportedLanguages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedLanguages]
  }
  
  @scala.inline
  implicit class SupportedLanguagesOps[Self <: SupportedLanguages] (val x: Self) extends AnyVal {
    
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
    def setLanguagesVarargs(value: SupportedLanguage*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[SupportedLanguage]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
  }
}

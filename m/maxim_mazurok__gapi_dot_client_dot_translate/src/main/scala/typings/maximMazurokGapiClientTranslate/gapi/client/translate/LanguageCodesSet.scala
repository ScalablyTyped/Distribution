package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageCodesSet extends js.Object {
  
  /**
    * The BCP-47 language code(s) for terms defined in the glossary. All entries are unique. The list contains at least two entries. Expected to be an exact match for
    * GlossaryTerm.language_code.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.native
}
object LanguageCodesSet {
  
  @scala.inline
  def apply(): LanguageCodesSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageCodesSet]
  }
  
  @scala.inline
  implicit class LanguageCodesSetOps[Self <: LanguageCodesSet] (val x: Self) extends AnyVal {
    
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
    def setLanguageCodesVarargs(value: String*): Self = this.set("languageCodes", js.Array(value :_*))
    
    @scala.inline
    def setLanguageCodes(value: js.Array[String]): Self = this.set("languageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCodes: Self = this.set("languageCodes", js.undefined)
  }
}

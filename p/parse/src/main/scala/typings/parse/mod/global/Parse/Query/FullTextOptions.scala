package typings.parse.mod.global.Parse.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// According to https://parseplatform.org/Parse-SDK-JS/api/2.1.0/Parse.Query.html#fullText
@js.native
trait FullTextOptions extends js.Object {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var diacriticSensitive: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
}
object FullTextOptions {
  
  @scala.inline
  def apply(): FullTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullTextOptions]
  }
  
  @scala.inline
  implicit class FullTextOptionsOps[Self <: FullTextOptions] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setDiacriticSensitive(value: Boolean): Self = this.set("diacriticSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiacriticSensitive: Self = this.set("diacriticSensitive", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}

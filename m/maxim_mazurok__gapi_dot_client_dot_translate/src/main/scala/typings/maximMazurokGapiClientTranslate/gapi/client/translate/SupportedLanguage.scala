package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedLanguage extends js.Object {
  
  /** Human readable name of the language localized in the display language specified in the request. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Supported language code, generally consisting of its ISO 639-1 identifier, for example, 'en', 'ja'. In certain cases, BCP-47 codes including language and region identifiers are
    * returned (for example, 'zh-TW' and 'zh-CN')
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Can be used as source language. */
  var supportSource: js.UndefOr[Boolean] = js.native
  
  /** Can be used as target language. */
  var supportTarget: js.UndefOr[Boolean] = js.native
}
object SupportedLanguage {
  
  @scala.inline
  def apply(): SupportedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedLanguage]
  }
  
  @scala.inline
  implicit class SupportedLanguageOps[Self <: SupportedLanguage] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setSupportSource(value: Boolean): Self = this.set("supportSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportSource: Self = this.set("supportSource", js.undefined)
    
    @scala.inline
    def setSupportTarget(value: Boolean): Self = this.set("supportTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportTarget: Self = this.set("supportTarget", js.undefined)
  }
}

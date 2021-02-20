package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedLanguage extends StObject {
  
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
  implicit class SupportedLanguageMutableBuilder[Self <: SupportedLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setSupportSource(value: Boolean): Self = StObject.set(x, "supportSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportSourceUndefined: Self = StObject.set(x, "supportSource", js.undefined)
    
    @scala.inline
    def setSupportTarget(value: Boolean): Self = StObject.set(x, "supportTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportTargetUndefined: Self = StObject.set(x, "supportTarget", js.undefined)
  }
}

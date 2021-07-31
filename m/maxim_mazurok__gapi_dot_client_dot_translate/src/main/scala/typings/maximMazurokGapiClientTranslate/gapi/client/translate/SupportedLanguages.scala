package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedLanguages extends StObject {
  
  /** A list of supported language responses. This list contains an entry for each language the Translation API supports. */
  var languages: js.UndefOr[js.Array[SupportedLanguage]] = js.undefined
}
object SupportedLanguages {
  
  @scala.inline
  def apply(): SupportedLanguages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedLanguages]
  }
  
  @scala.inline
  implicit class SupportedLanguagesMutableBuilder[Self <: SupportedLanguages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: js.Array[SupportedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: SupportedLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}

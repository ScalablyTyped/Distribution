package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageCodesSet extends StObject {
  
  /**
    * The BCP-47 language code(s) for terms defined in the glossary. All entries are unique. The list contains at least two entries. Expected to be an exact match for
    * GlossaryTerm.language_code.
    */
  var languageCodes: js.UndefOr[js.Array[String]] = js.undefined
}
object LanguageCodesSet {
  
  @scala.inline
  def apply(): LanguageCodesSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageCodesSet]
  }
  
  @scala.inline
  implicit class LanguageCodesSetMutableBuilder[Self <: LanguageCodesSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    @scala.inline
    def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value :_*))
  }
}

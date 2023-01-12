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
  
  inline def apply(): LanguageCodesSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageCodesSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageCodesSet] (val x: Self) extends AnyVal {
    
    inline def setLanguageCodes(value: js.Array[String]): Self = StObject.set(x, "languageCodes", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodesUndefined: Self = StObject.set(x, "languageCodes", js.undefined)
    
    inline def setLanguageCodesVarargs(value: String*): Self = StObject.set(x, "languageCodes", js.Array(value*))
  }
}

package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageLocalizedText extends StObject {
  
  /**
    * The language code that text is in. For example, 'en-us'. The language component follows 2-letter codes as defined in
    * ISO 639-1, and the country component follows 2-letter codes as defined in ISO 3166-1 alpha-2. Required.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  // The question in the specific language. Required.
  var text: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessPackageLocalizedText {
  
  inline def apply(): AccessPackageLocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageLocalizedText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageLocalizedText] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setText(value: NullableOption[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

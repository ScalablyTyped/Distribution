package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectLanguageResponse extends StObject {
  
  /** The most probable language detected by the Translation API. For each request, the Translation API will always return only one result. */
  var languages: js.UndefOr[js.Array[DetectedLanguage]] = js.undefined
}
object DetectLanguageResponse {
  
  inline def apply(): DetectLanguageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLanguageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectLanguageResponse] (val x: Self) extends AnyVal {
    
    inline def setLanguages(value: js.Array[DetectedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: DetectedLanguage*): Self = StObject.set(x, "languages", js.Array(value*))
  }
}

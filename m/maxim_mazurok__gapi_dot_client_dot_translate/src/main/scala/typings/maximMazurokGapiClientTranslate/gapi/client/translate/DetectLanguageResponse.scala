package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectLanguageResponse extends StObject {
  
  /** The most probable language detected by the Translation API. For each request, the Translation API will always return only one result. */
  var languages: js.UndefOr[js.Array[DetectedLanguage]] = js.native
}
object DetectLanguageResponse {
  
  @scala.inline
  def apply(): DetectLanguageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLanguageResponse]
  }
  
  @scala.inline
  implicit class DetectLanguageResponseMutableBuilder[Self <: DetectLanguageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguages(value: js.Array[DetectedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: DetectedLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
  }
}

package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextProperty extends StObject {
  
  /** Detected start or end of a text segment. */
  var detectedBreak: js.UndefOr[DetectedBreak] = js.undefined
  
  /** A list of detected languages together with confidence. */
  var detectedLanguages: js.UndefOr[js.Array[DetectedLanguage]] = js.undefined
}
object TextProperty {
  
  @scala.inline
  def apply(): TextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextProperty]
  }
  
  @scala.inline
  implicit class TextPropertyMutableBuilder[Self <: TextProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectedBreak(value: DetectedBreak): Self = StObject.set(x, "detectedBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedBreakUndefined: Self = StObject.set(x, "detectedBreak", js.undefined)
    
    @scala.inline
    def setDetectedLanguages(value: js.Array[DetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    @scala.inline
    def setDetectedLanguagesVarargs(value: DetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value :_*))
  }
}

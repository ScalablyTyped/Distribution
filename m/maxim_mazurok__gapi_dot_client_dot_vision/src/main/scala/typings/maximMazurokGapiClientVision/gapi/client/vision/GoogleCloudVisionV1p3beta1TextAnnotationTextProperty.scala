package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p3beta1TextAnnotationTextProperty extends StObject {
  
  /** Detected start or end of a text segment. */
  var detectedBreak: js.UndefOr[GoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak] = js.undefined
  
  /** A list of detected languages together with confidence. */
  var detectedLanguages: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage]] = js.undefined
}
object GoogleCloudVisionV1p3beta1TextAnnotationTextProperty {
  
  inline def apply(): GoogleCloudVisionV1p3beta1TextAnnotationTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1TextAnnotationTextProperty]
  }
  
  extension [Self <: GoogleCloudVisionV1p3beta1TextAnnotationTextProperty](x: Self) {
    
    inline def setDetectedBreak(value: GoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak): Self = StObject.set(x, "detectedBreak", value.asInstanceOf[js.Any])
    
    inline def setDetectedBreakUndefined: Self = StObject.set(x, "detectedBreak", js.undefined)
    
    inline def setDetectedLanguages(value: js.Array[GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value :_*))
  }
}

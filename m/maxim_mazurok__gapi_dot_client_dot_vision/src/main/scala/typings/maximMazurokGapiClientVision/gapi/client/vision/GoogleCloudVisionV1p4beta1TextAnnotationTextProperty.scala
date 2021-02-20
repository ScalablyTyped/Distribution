package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1TextAnnotationTextProperty extends StObject {
  
  /** Detected start or end of a text segment. */
  var detectedBreak: js.UndefOr[GoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak] = js.native
  
  /** A list of detected languages together with confidence. */
  var detectedLanguages: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage]] = js.native
}
object GoogleCloudVisionV1p4beta1TextAnnotationTextProperty {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1TextAnnotationTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1TextAnnotationTextProperty]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1TextAnnotationTextPropertyMutableBuilder[Self <: GoogleCloudVisionV1p4beta1TextAnnotationTextProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectedBreak(value: GoogleCloudVisionV1p4beta1TextAnnotationDetectedBreak): Self = StObject.set(x, "detectedBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedBreakUndefined: Self = StObject.set(x, "detectedBreak", js.undefined)
    
    @scala.inline
    def setDetectedLanguages(value: js.Array[GoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    @scala.inline
    def setDetectedLanguagesVarargs(value: GoogleCloudVisionV1p4beta1TextAnnotationDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value :_*))
  }
}

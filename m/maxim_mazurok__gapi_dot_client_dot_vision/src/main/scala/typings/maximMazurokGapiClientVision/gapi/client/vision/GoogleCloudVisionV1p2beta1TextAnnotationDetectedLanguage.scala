package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p2beta1TextAnnotationDetectedLanguage extends StObject {
  
  /** Confidence of detected language. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. */
  var languageCode: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p2beta1TextAnnotationDetectedLanguage {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1TextAnnotationDetectedLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1TextAnnotationDetectedLanguage]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1TextAnnotationDetectedLanguageMutableBuilder[Self <: GoogleCloudVisionV1p2beta1TextAnnotationDetectedLanguage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}

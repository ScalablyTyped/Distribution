package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p3beta1SafeSearchAnnotation extends StObject {
  
  /** Represents the adult content likelihood for the image. Adult content may contain elements such as nudity, pornographic images or cartoons, or sexual activities. */
  var adult: js.UndefOr[String] = js.undefined
  
  /** Likelihood that this is a medical image. */
  var medical: js.UndefOr[String] = js.undefined
  
  /**
    * Likelihood that the request image contains racy content. Racy content may include (but is not limited to) skimpy or sheer clothing, strategically covered nudity, lewd or provocative
    * poses, or close-ups of sensitive body areas.
    */
  var racy: js.UndefOr[String] = js.undefined
  
  /** Spoof likelihood. The likelihood that an modification was made to the image's canonical version to make it appear funny or offensive. */
  var spoof: js.UndefOr[String] = js.undefined
  
  /** Likelihood that this image contains violent content. */
  var violence: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p3beta1SafeSearchAnnotation {
  
  inline def apply(): GoogleCloudVisionV1p3beta1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1SafeSearchAnnotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVisionV1p3beta1SafeSearchAnnotation] (val x: Self) extends AnyVal {
    
    inline def setAdult(value: String): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
    
    inline def setAdultUndefined: Self = StObject.set(x, "adult", js.undefined)
    
    inline def setMedical(value: String): Self = StObject.set(x, "medical", value.asInstanceOf[js.Any])
    
    inline def setMedicalUndefined: Self = StObject.set(x, "medical", js.undefined)
    
    inline def setRacy(value: String): Self = StObject.set(x, "racy", value.asInstanceOf[js.Any])
    
    inline def setRacyUndefined: Self = StObject.set(x, "racy", js.undefined)
    
    inline def setSpoof(value: String): Self = StObject.set(x, "spoof", value.asInstanceOf[js.Any])
    
    inline def setSpoofUndefined: Self = StObject.set(x, "spoof", js.undefined)
    
    inline def setViolence(value: String): Self = StObject.set(x, "violence", value.asInstanceOf[js.Any])
    
    inline def setViolenceUndefined: Self = StObject.set(x, "violence", js.undefined)
  }
}

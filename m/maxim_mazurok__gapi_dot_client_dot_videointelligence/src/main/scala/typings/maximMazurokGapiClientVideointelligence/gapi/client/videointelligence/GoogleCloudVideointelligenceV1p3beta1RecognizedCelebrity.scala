package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity extends StObject {
  
  /** The recognized celebrity. */
  var celebrity: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1Celebrity] = js.undefined
  
  /** Recognition confidence. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity](x: Self) {
    
    inline def setCelebrity(value: GoogleCloudVideointelligenceV1p3beta1Celebrity): Self = StObject.set(x, "celebrity", value.asInstanceOf[js.Any])
    
    inline def setCelebrityUndefined: Self = StObject.set(x, "celebrity", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
  }
}

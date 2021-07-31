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
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrityMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1RecognizedCelebrity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCelebrity(value: GoogleCloudVideointelligenceV1p3beta1Celebrity): Self = StObject.set(x, "celebrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCelebrityUndefined: Self = StObject.set(x, "celebrity", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
  }
}

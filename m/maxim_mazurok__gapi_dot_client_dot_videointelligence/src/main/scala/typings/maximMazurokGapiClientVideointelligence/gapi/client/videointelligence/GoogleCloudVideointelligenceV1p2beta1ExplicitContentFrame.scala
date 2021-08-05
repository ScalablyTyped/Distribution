package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame extends StObject {
  
  /** Likelihood of the pornography content.. */
  var pornographyLikelihood: js.UndefOr[String] = js.undefined
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this location. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame {
  
  inline def apply(): GoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame](x: Self) {
    
    inline def setPornographyLikelihood(value: String): Self = StObject.set(x, "pornographyLikelihood", value.asInstanceOf[js.Any])
    
    inline def setPornographyLikelihoodUndefined: Self = StObject.set(x, "pornographyLikelihood", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}

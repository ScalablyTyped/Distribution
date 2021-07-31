package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1LabelFrame extends StObject {
  
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Time-offset, relative to the beginning of the video, corresponding to the video frame for this location. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1LabelFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1LabelFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1LabelFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1LabelFrameMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1LabelFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}

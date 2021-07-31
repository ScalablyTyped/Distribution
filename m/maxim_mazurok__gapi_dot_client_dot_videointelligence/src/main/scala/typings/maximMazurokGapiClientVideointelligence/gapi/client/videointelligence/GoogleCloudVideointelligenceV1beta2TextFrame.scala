package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2TextFrame extends StObject {
  
  /** Bounding polygon of the detected text for this frame. */
  var rotatedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly] = js.undefined
  
  /** Timestamp of this frame. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2TextFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2TextFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2TextFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2TextFrameMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2TextFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotatedBoundingBox(value: GoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly): Self = StObject.set(x, "rotatedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatedBoundingBoxUndefined: Self = StObject.set(x, "rotatedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}

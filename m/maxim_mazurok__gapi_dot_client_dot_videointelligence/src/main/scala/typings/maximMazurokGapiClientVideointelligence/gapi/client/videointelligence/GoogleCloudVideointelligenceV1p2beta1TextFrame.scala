package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1TextFrame extends StObject {
  
  /** Bounding polygon of the detected text for this frame. */
  var rotatedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly] = js.undefined
  
  /** Timestamp of this frame. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1TextFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1TextFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1TextFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1TextFrameMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1TextFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotatedBoundingBox(value: GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly): Self = StObject.set(x, "rotatedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatedBoundingBoxUndefined: Self = StObject.set(x, "rotatedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}

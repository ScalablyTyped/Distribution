package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1TextFrame extends StObject {
  
  /** Bounding polygon of the detected text for this frame. */
  var rotatedBoundingBox: js.UndefOr[GoogleCloudVideointelligenceV1NormalizedBoundingPoly] = js.native
  
  /** Timestamp of this frame. */
  var timeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1TextFrame {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1TextFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1TextFrame]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1TextFrameMutableBuilder[Self <: GoogleCloudVideointelligenceV1TextFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRotatedBoundingBox(value: GoogleCloudVideointelligenceV1NormalizedBoundingPoly): Self = StObject.set(x, "rotatedBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotatedBoundingBoxUndefined: Self = StObject.set(x, "rotatedBoundingBox", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}

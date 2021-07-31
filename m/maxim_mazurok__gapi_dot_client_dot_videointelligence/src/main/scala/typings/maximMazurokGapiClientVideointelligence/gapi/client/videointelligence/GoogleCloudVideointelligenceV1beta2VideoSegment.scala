package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2VideoSegment extends StObject {
  
  /** Time-offset, relative to the beginning of the video, corresponding to the end of the segment (inclusive). */
  var endTimeOffset: js.UndefOr[String] = js.undefined
  
  /** Time-offset, relative to the beginning of the video, corresponding to the start of the segment (inclusive). */
  var startTimeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2VideoSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2VideoSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2VideoSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2VideoSegmentMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2VideoSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    @scala.inline
    def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}

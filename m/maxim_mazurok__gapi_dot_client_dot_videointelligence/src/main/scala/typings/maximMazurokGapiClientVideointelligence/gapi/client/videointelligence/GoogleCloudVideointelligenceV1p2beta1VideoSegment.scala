package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p2beta1VideoSegment extends StObject {
  
  /** Time-offset, relative to the beginning of the video, corresponding to the end of the segment (inclusive). */
  var endTimeOffset: js.UndefOr[String] = js.native
  
  /** Time-offset, relative to the beginning of the video, corresponding to the start of the segment (inclusive). */
  var startTimeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p2beta1VideoSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1VideoSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1VideoSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1VideoSegmentMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1VideoSegment] (val x: Self) extends AnyVal {
    
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

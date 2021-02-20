package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2FaceSegment extends StObject {
  
  /** Video segment where a face was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta2VideoSegment] = js.native
}
object GoogleCloudVideointelligenceV1beta2FaceSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2FaceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2FaceSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2FaceSegmentMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2FaceSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1beta2VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}

package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1FaceSegment extends StObject {
  
  /** Video segment where a face was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1FaceSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1FaceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1FaceSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1FaceSegmentMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1FaceSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1p2beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}

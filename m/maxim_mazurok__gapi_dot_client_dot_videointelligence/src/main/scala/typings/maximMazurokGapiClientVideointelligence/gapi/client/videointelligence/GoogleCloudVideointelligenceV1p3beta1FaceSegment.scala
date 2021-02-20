package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1FaceSegment extends StObject {
  
  /** Video segment where a face was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1VideoSegment] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1FaceSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1FaceSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1FaceSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1FaceSegmentMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1FaceSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1p3beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}

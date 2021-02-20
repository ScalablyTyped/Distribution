package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p2beta1FaceAnnotation extends StObject {
  
  /** All video frames where a face was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1FaceFrame]] = js.native
  
  /** All video segments where a face was detected. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1FaceSegment]] = js.native
  
  /** Thumbnail of a representative face view (in JPEG format). */
  var thumbnail: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p2beta1FaceAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1FaceAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1FaceAnnotationMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1FaceAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1p2beta1FaceFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1p2beta1FaceFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1p2beta1FaceSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1p2beta1FaceSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}

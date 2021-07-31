package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1beta2FaceAnnotation extends StObject {
  
  /** All video frames where a face was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2FaceFrame]] = js.undefined
  
  /** All video segments where a face was detected. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2FaceSegment]] = js.undefined
  
  /** Thumbnail of a representative face view (in JPEG format). */
  var thumbnail: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1beta2FaceAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2FaceAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2FaceAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2FaceAnnotationMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2FaceAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1beta2FaceFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1beta2FaceFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1beta2FaceSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1beta2FaceSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}

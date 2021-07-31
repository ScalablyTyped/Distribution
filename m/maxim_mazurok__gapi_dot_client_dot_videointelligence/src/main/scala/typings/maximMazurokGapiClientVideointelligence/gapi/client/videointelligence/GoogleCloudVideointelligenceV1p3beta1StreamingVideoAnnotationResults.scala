package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults extends StObject {
  
  /** Explicit content annotation results. */
  var explicitAnnotation: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation] = js.undefined
  
  /** Timestamp of the processed frame in microseconds. */
  var frameTimestamp: js.UndefOr[String] = js.undefined
  
  /** Label annotation results. */
  var labelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1LabelAnnotation]] = js.undefined
  
  /** Object tracking results. */
  var objectAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]] = js.undefined
  
  /** Shot annotation results. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1VideoSegment]] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResultsMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitAnnotation(value: GoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation): Self = StObject.set(x, "explicitAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitAnnotationUndefined: Self = StObject.set(x, "explicitAnnotation", js.undefined)
    
    @scala.inline
    def setFrameTimestamp(value: String): Self = StObject.set(x, "frameTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameTimestampUndefined: Self = StObject.set(x, "frameTimestamp", js.undefined)
    
    @scala.inline
    def setLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1p3beta1LabelAnnotation]): Self = StObject.set(x, "labelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAnnotationsUndefined: Self = StObject.set(x, "labelAnnotations", js.undefined)
    
    @scala.inline
    def setLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1p3beta1LabelAnnotation*): Self = StObject.set(x, "labelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotAnnotations(value: js.Array[GoogleCloudVideointelligenceV1p3beta1VideoSegment]): Self = StObject.set(x, "shotAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotAnnotationsUndefined: Self = StObject.set(x, "shotAnnotations", js.undefined)
    
    @scala.inline
    def setShotAnnotationsVarargs(value: GoogleCloudVideointelligenceV1p3beta1VideoSegment*): Self = StObject.set(x, "shotAnnotations", js.Array(value :_*))
  }
}

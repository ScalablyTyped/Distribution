package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1beta2VideoAnnotationResults extends StObject {
  
  /** If set, indicates an error. Note that for a single `AnnotateVideoRequest` some videos may succeed and some may fail. */
  var error: js.UndefOr[GoogleRpcStatus] = js.native
  
  /** Explicit content annotation. */
  var explicitAnnotation: js.UndefOr[GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] = js.native
  
  /** Deprecated. Please use `face_detection_annotations` instead. */
  var faceAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2FaceAnnotation]] = js.native
  
  /** Face detection annotations. */
  var faceDetectionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2FaceDetectionAnnotation]] = js.native
  
  /** Label annotations on frame level. There is exactly one element for each unique label. */
  var frameLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  
  /** Video file location in [Cloud Storage](https://cloud.google.com/storage/). */
  var inputUri: js.UndefOr[String] = js.native
  
  /** Annotations for list of logos detected, tracked and recognized in video. */
  var logoRecognitionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation]] = js.native
  
  /** Annotations for list of objects detected and tracked in video. */
  var objectAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation]] = js.native
  
  /** Person detection annotations. */
  var personDetectionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2PersonDetectionAnnotation]] = js.native
  
  /** Video segment on which the annotation is run. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta2VideoSegment] = js.native
  
  /** Topical label annotations on video level or user-specified segment level. There is exactly one element for each unique label. */
  var segmentLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  
  /**
    * Presence label annotations on video level or user-specified segment level. There is exactly one element for each unique label. Compared to the existing topical
    * `segment_label_annotations`, this field presents more fine-grained, segment-level labels detected in video content and is made available only when the client sets
    * `LabelDetectionConfig.model` to "builtin/latest" in the request.
    */
  var segmentPresenceLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]] = js.native
  
  /** Topical label annotations on shot level. There is exactly one element for each unique label. */
  var shotLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  
  /**
    * Presence label annotations on shot level. There is exactly one element for each unique label. Compared to the existing topical `shot_label_annotations`, this field presents more
    * fine-grained, shot-level labels detected in video content and is made available only when the client sets `LabelDetectionConfig.model` to "builtin/latest" in the request.
    */
  var shotPresenceLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  
  /** Speech transcription. */
  var speechTranscriptions: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2SpeechTranscription]] = js.native
  
  /** OCR text detection and tracking. Annotations for list of detected text snippets. Each will have list of frame information associated with it. */
  var textAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2TextAnnotation]] = js.native
}
object GoogleCloudVideointelligenceV1beta2VideoAnnotationResults {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2VideoAnnotationResults]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2VideoAnnotationResultsMutableBuilder[Self <: GoogleCloudVideointelligenceV1beta2VideoAnnotationResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: GoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExplicitAnnotation(value: GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation): Self = StObject.set(x, "explicitAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitAnnotationUndefined: Self = StObject.set(x, "explicitAnnotation", js.undefined)
    
    @scala.inline
    def setFaceAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2FaceAnnotation]): Self = StObject.set(x, "faceAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceAnnotationsUndefined: Self = StObject.set(x, "faceAnnotations", js.undefined)
    
    @scala.inline
    def setFaceAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2FaceAnnotation*): Self = StObject.set(x, "faceAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setFaceDetectionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2FaceDetectionAnnotation]): Self = StObject.set(x, "faceDetectionAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceDetectionAnnotationsUndefined: Self = StObject.set(x, "faceDetectionAnnotations", js.undefined)
    
    @scala.inline
    def setFaceDetectionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2FaceDetectionAnnotation*): Self = StObject.set(x, "faceDetectionAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setFrameLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = StObject.set(x, "frameLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameLabelAnnotationsUndefined: Self = StObject.set(x, "frameLabelAnnotations", js.undefined)
    
    @scala.inline
    def setFrameLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = StObject.set(x, "frameLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    @scala.inline
    def setLogoRecognitionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation]): Self = StObject.set(x, "logoRecognitionAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoRecognitionAnnotationsUndefined: Self = StObject.set(x, "logoRecognitionAnnotations", js.undefined)
    
    @scala.inline
    def setLogoRecognitionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LogoRecognitionAnnotation*): Self = StObject.set(x, "logoRecognitionAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setPersonDetectionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2PersonDetectionAnnotation]): Self = StObject.set(x, "personDetectionAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonDetectionAnnotationsUndefined: Self = StObject.set(x, "personDetectionAnnotations", js.undefined)
    
    @scala.inline
    def setPersonDetectionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2PersonDetectionAnnotation*): Self = StObject.set(x, "personDetectionAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1beta2VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = StObject.set(x, "segmentLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentLabelAnnotationsUndefined: Self = StObject.set(x, "segmentLabelAnnotations", js.undefined)
    
    @scala.inline
    def setSegmentLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = StObject.set(x, "segmentLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSegmentPresenceLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = StObject.set(x, "segmentPresenceLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentPresenceLabelAnnotationsUndefined: Self = StObject.set(x, "segmentPresenceLabelAnnotations", js.undefined)
    
    @scala.inline
    def setSegmentPresenceLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = StObject.set(x, "segmentPresenceLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    @scala.inline
    def setShotAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]): Self = StObject.set(x, "shotAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotAnnotationsUndefined: Self = StObject.set(x, "shotAnnotations", js.undefined)
    
    @scala.inline
    def setShotAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2VideoSegment*): Self = StObject.set(x, "shotAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = StObject.set(x, "shotLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotLabelAnnotationsUndefined: Self = StObject.set(x, "shotLabelAnnotations", js.undefined)
    
    @scala.inline
    def setShotLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = StObject.set(x, "shotLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotPresenceLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = StObject.set(x, "shotPresenceLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotPresenceLabelAnnotationsUndefined: Self = StObject.set(x, "shotPresenceLabelAnnotations", js.undefined)
    
    @scala.inline
    def setShotPresenceLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = StObject.set(x, "shotPresenceLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSpeechTranscriptions(value: js.Array[GoogleCloudVideointelligenceV1beta2SpeechTranscription]): Self = StObject.set(x, "speechTranscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechTranscriptionsUndefined: Self = StObject.set(x, "speechTranscriptions", js.undefined)
    
    @scala.inline
    def setSpeechTranscriptionsVarargs(value: GoogleCloudVideointelligenceV1beta2SpeechTranscription*): Self = StObject.set(x, "speechTranscriptions", js.Array(value :_*))
    
    @scala.inline
    def setTextAnnotations(value: js.Array[GoogleCloudVideointelligenceV1beta2TextAnnotation]): Self = StObject.set(x, "textAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnnotationsUndefined: Self = StObject.set(x, "textAnnotations", js.undefined)
    
    @scala.inline
    def setTextAnnotationsVarargs(value: GoogleCloudVideointelligenceV1beta2TextAnnotation*): Self = StObject.set(x, "textAnnotations", js.Array(value :_*))
  }
}

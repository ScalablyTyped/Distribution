package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1VideoAnnotationResults extends StObject {
  
  /** If set, indicates an error. Note that for a single `AnnotateVideoRequest` some videos may succeed and some may fail. */
  var error: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** Explicit content annotation. */
  var explicitAnnotation: js.UndefOr[GoogleCloudVideointelligenceV1ExplicitContentAnnotation] = js.undefined
  
  /** Deprecated. Please use `face_detection_annotations` instead. */
  var faceAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1FaceAnnotation]] = js.undefined
  
  /** Face detection annotations. */
  var faceDetectionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1FaceDetectionAnnotation]] = js.undefined
  
  /** Label annotations on frame level. There is exactly one element for each unique label. */
  var frameLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.undefined
  
  /** Video file location in [Cloud Storage](https://cloud.google.com/storage/). */
  var inputUri: js.UndefOr[String] = js.undefined
  
  /** Annotations for list of logos detected, tracked and recognized in video. */
  var logoRecognitionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LogoRecognitionAnnotation]] = js.undefined
  
  /** Annotations for list of objects detected and tracked in video. */
  var objectAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1ObjectTrackingAnnotation]] = js.undefined
  
  /** Person detection annotations. */
  var personDetectionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1PersonDetectionAnnotation]] = js.undefined
  
  /** Video segment on which the annotation is run. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1VideoSegment] = js.undefined
  
  /** Topical label annotations on video level or user-specified segment level. There is exactly one element for each unique label. */
  var segmentLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.undefined
  
  /**
    * Presence label annotations on video level or user-specified segment level. There is exactly one element for each unique label. Compared to the existing topical
    * `segment_label_annotations`, this field presents more fine-grained, segment-level labels detected in video content and is made available only when the client sets
    * `LabelDetectionConfig.model` to "builtin/latest" in the request.
    */
  var segmentPresenceLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.undefined
  
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1VideoSegment]] = js.undefined
  
  /** Topical label annotations on shot level. There is exactly one element for each unique label. */
  var shotLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.undefined
  
  /**
    * Presence label annotations on shot level. There is exactly one element for each unique label. Compared to the existing topical `shot_label_annotations`, this field presents more
    * fine-grained, shot-level labels detected in video content and is made available only when the client sets `LabelDetectionConfig.model` to "builtin/latest" in the request.
    */
  var shotPresenceLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.undefined
  
  /** Speech transcription. */
  var speechTranscriptions: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1SpeechTranscription]] = js.undefined
  
  /** OCR text detection and tracking. Annotations for list of detected text snippets. Each will have list of frame information associated with it. */
  var textAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1TextAnnotation]] = js.undefined
}
object GoogleCloudVideointelligenceV1VideoAnnotationResults {
  
  inline def apply(): GoogleCloudVideointelligenceV1VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1VideoAnnotationResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVideointelligenceV1VideoAnnotationResults] (val x: Self) extends AnyVal {
    
    inline def setError(value: GoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExplicitAnnotation(value: GoogleCloudVideointelligenceV1ExplicitContentAnnotation): Self = StObject.set(x, "explicitAnnotation", value.asInstanceOf[js.Any])
    
    inline def setExplicitAnnotationUndefined: Self = StObject.set(x, "explicitAnnotation", js.undefined)
    
    inline def setFaceAnnotations(value: js.Array[GoogleCloudVideointelligenceV1FaceAnnotation]): Self = StObject.set(x, "faceAnnotations", value.asInstanceOf[js.Any])
    
    inline def setFaceAnnotationsUndefined: Self = StObject.set(x, "faceAnnotations", js.undefined)
    
    inline def setFaceAnnotationsVarargs(value: GoogleCloudVideointelligenceV1FaceAnnotation*): Self = StObject.set(x, "faceAnnotations", js.Array(value*))
    
    inline def setFaceDetectionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1FaceDetectionAnnotation]): Self = StObject.set(x, "faceDetectionAnnotations", value.asInstanceOf[js.Any])
    
    inline def setFaceDetectionAnnotationsUndefined: Self = StObject.set(x, "faceDetectionAnnotations", js.undefined)
    
    inline def setFaceDetectionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1FaceDetectionAnnotation*): Self = StObject.set(x, "faceDetectionAnnotations", js.Array(value*))
    
    inline def setFrameLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = StObject.set(x, "frameLabelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setFrameLabelAnnotationsUndefined: Self = StObject.set(x, "frameLabelAnnotations", js.undefined)
    
    inline def setFrameLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = StObject.set(x, "frameLabelAnnotations", js.Array(value*))
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setLogoRecognitionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LogoRecognitionAnnotation]): Self = StObject.set(x, "logoRecognitionAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLogoRecognitionAnnotationsUndefined: Self = StObject.set(x, "logoRecognitionAnnotations", js.undefined)
    
    inline def setLogoRecognitionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LogoRecognitionAnnotation*): Self = StObject.set(x, "logoRecognitionAnnotations", js.Array(value*))
    
    inline def setObjectAnnotations(value: js.Array[GoogleCloudVideointelligenceV1ObjectTrackingAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    inline def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    inline def setObjectAnnotationsVarargs(value: GoogleCloudVideointelligenceV1ObjectTrackingAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value*))
    
    inline def setPersonDetectionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1PersonDetectionAnnotation]): Self = StObject.set(x, "personDetectionAnnotations", value.asInstanceOf[js.Any])
    
    inline def setPersonDetectionAnnotationsUndefined: Self = StObject.set(x, "personDetectionAnnotations", js.undefined)
    
    inline def setPersonDetectionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1PersonDetectionAnnotation*): Self = StObject.set(x, "personDetectionAnnotations", js.Array(value*))
    
    inline def setSegment(value: GoogleCloudVideointelligenceV1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = StObject.set(x, "segmentLabelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setSegmentLabelAnnotationsUndefined: Self = StObject.set(x, "segmentLabelAnnotations", js.undefined)
    
    inline def setSegmentLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = StObject.set(x, "segmentLabelAnnotations", js.Array(value*))
    
    inline def setSegmentPresenceLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = StObject.set(x, "segmentPresenceLabelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setSegmentPresenceLabelAnnotationsUndefined: Self = StObject.set(x, "segmentPresenceLabelAnnotations", js.undefined)
    
    inline def setSegmentPresenceLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = StObject.set(x, "segmentPresenceLabelAnnotations", js.Array(value*))
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setShotAnnotations(value: js.Array[GoogleCloudVideointelligenceV1VideoSegment]): Self = StObject.set(x, "shotAnnotations", value.asInstanceOf[js.Any])
    
    inline def setShotAnnotationsUndefined: Self = StObject.set(x, "shotAnnotations", js.undefined)
    
    inline def setShotAnnotationsVarargs(value: GoogleCloudVideointelligenceV1VideoSegment*): Self = StObject.set(x, "shotAnnotations", js.Array(value*))
    
    inline def setShotLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = StObject.set(x, "shotLabelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setShotLabelAnnotationsUndefined: Self = StObject.set(x, "shotLabelAnnotations", js.undefined)
    
    inline def setShotLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = StObject.set(x, "shotLabelAnnotations", js.Array(value*))
    
    inline def setShotPresenceLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = StObject.set(x, "shotPresenceLabelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setShotPresenceLabelAnnotationsUndefined: Self = StObject.set(x, "shotPresenceLabelAnnotations", js.undefined)
    
    inline def setShotPresenceLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = StObject.set(x, "shotPresenceLabelAnnotations", js.Array(value*))
    
    inline def setSpeechTranscriptions(value: js.Array[GoogleCloudVideointelligenceV1SpeechTranscription]): Self = StObject.set(x, "speechTranscriptions", value.asInstanceOf[js.Any])
    
    inline def setSpeechTranscriptionsUndefined: Self = StObject.set(x, "speechTranscriptions", js.undefined)
    
    inline def setSpeechTranscriptionsVarargs(value: GoogleCloudVideointelligenceV1SpeechTranscription*): Self = StObject.set(x, "speechTranscriptions", js.Array(value*))
    
    inline def setTextAnnotations(value: js.Array[GoogleCloudVideointelligenceV1TextAnnotation]): Self = StObject.set(x, "textAnnotations", value.asInstanceOf[js.Any])
    
    inline def setTextAnnotationsUndefined: Self = StObject.set(x, "textAnnotations", js.undefined)
    
    inline def setTextAnnotationsVarargs(value: GoogleCloudVideointelligenceV1TextAnnotation*): Self = StObject.set(x, "textAnnotations", js.Array(value*))
  }
}

package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1VideoAnnotationResults extends js.Object {
  
  /** If set, indicates an error. Note that for a single `AnnotateVideoRequest` some videos may succeed and some may fail. */
  var error: js.UndefOr[GoogleRpcStatus] = js.native
  
  /** Explicit content annotation. */
  var explicitAnnotation: js.UndefOr[GoogleCloudVideointelligenceV1ExplicitContentAnnotation] = js.native
  
  /** Deprecated. Please use `face_detection_annotations` instead. */
  var faceAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1FaceAnnotation]] = js.native
  
  /** Face detection annotations. */
  var faceDetectionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1FaceDetectionAnnotation]] = js.native
  
  /** Label annotations on frame level. There is exactly one element for each unique label. */
  var frameLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.native
  
  /** Video file location in [Cloud Storage](https://cloud.google.com/storage/). */
  var inputUri: js.UndefOr[String] = js.native
  
  /** Annotations for list of logos detected, tracked and recognized in video. */
  var logoRecognitionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LogoRecognitionAnnotation]] = js.native
  
  /** Annotations for list of objects detected and tracked in video. */
  var objectAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1ObjectTrackingAnnotation]] = js.native
  
  /** Person detection annotations. */
  var personDetectionAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1PersonDetectionAnnotation]] = js.native
  
  /** Video segment on which the annotation is run. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1VideoSegment] = js.native
  
  /** Topical label annotations on video level or user-specified segment level. There is exactly one element for each unique label. */
  var segmentLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.native
  
  /**
    * Presence label annotations on video level or user-specified segment level. There is exactly one element for each unique label. Compared to the existing topical
    * `segment_label_annotations`, this field presents more fine-grained, segment-level labels detected in video content and is made available only when the client sets
    * `LabelDetectionConfig.model` to "builtin/latest" in the request.
    */
  var segmentPresenceLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.native
  
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1VideoSegment]] = js.native
  
  /** Topical label annotations on shot level. There is exactly one element for each unique label. */
  var shotLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.native
  
  /**
    * Presence label annotations on shot level. There is exactly one element for each unique label. Compared to the existing topical `shot_label_annotations`, this field presents more
    * fine-grained, shot-level labels detected in video content and is made available only when the client sets `LabelDetectionConfig.model` to "builtin/latest" in the request.
    */
  var shotPresenceLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]] = js.native
  
  /** Speech transcription. */
  var speechTranscriptions: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1SpeechTranscription]] = js.native
  
  /** OCR text detection and tracking. Annotations for list of detected text snippets. Each will have list of frame information associated with it. */
  var textAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1TextAnnotation]] = js.native
}
object GoogleCloudVideointelligenceV1VideoAnnotationResults {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1VideoAnnotationResults]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1VideoAnnotationResultsOps[Self <: GoogleCloudVideointelligenceV1VideoAnnotationResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: GoogleRpcStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExplicitAnnotation(value: GoogleCloudVideointelligenceV1ExplicitContentAnnotation): Self = this.set("explicitAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitAnnotation: Self = this.set("explicitAnnotation", js.undefined)
    
    @scala.inline
    def setFaceAnnotationsVarargs(value: GoogleCloudVideointelligenceV1FaceAnnotation*): Self = this.set("faceAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setFaceAnnotations(value: js.Array[GoogleCloudVideointelligenceV1FaceAnnotation]): Self = this.set("faceAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceAnnotations: Self = this.set("faceAnnotations", js.undefined)
    
    @scala.inline
    def setFaceDetectionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1FaceDetectionAnnotation*): Self = this.set("faceDetectionAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setFaceDetectionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1FaceDetectionAnnotation]): Self = this.set("faceDetectionAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceDetectionAnnotations: Self = this.set("faceDetectionAnnotations", js.undefined)
    
    @scala.inline
    def setFrameLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = this.set("frameLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setFrameLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = this.set("frameLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameLabelAnnotations: Self = this.set("frameLabelAnnotations", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    
    @scala.inline
    def setLogoRecognitionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LogoRecognitionAnnotation*): Self = this.set("logoRecognitionAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setLogoRecognitionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LogoRecognitionAnnotation]): Self = this.set("logoRecognitionAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoRecognitionAnnotations: Self = this.set("logoRecognitionAnnotations", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: GoogleCloudVideointelligenceV1ObjectTrackingAnnotation*): Self = this.set("objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[GoogleCloudVideointelligenceV1ObjectTrackingAnnotation]): Self = this.set("objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAnnotations: Self = this.set("objectAnnotations", js.undefined)
    
    @scala.inline
    def setPersonDetectionAnnotationsVarargs(value: GoogleCloudVideointelligenceV1PersonDetectionAnnotation*): Self = this.set("personDetectionAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setPersonDetectionAnnotations(value: js.Array[GoogleCloudVideointelligenceV1PersonDetectionAnnotation]): Self = this.set("personDetectionAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonDetectionAnnotations: Self = this.set("personDetectionAnnotations", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setSegmentLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = this.set("segmentLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSegmentLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = this.set("segmentLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentLabelAnnotations: Self = this.set("segmentLabelAnnotations", js.undefined)
    
    @scala.inline
    def setSegmentPresenceLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = this.set("segmentPresenceLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSegmentPresenceLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = this.set("segmentPresenceLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentPresenceLabelAnnotations: Self = this.set("segmentPresenceLabelAnnotations", js.undefined)
    
    @scala.inline
    def setShotAnnotationsVarargs(value: GoogleCloudVideointelligenceV1VideoSegment*): Self = this.set("shotAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotAnnotations(value: js.Array[GoogleCloudVideointelligenceV1VideoSegment]): Self = this.set("shotAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotAnnotations: Self = this.set("shotAnnotations", js.undefined)
    
    @scala.inline
    def setShotLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = this.set("shotLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = this.set("shotLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotLabelAnnotations: Self = this.set("shotLabelAnnotations", js.undefined)
    
    @scala.inline
    def setShotPresenceLabelAnnotationsVarargs(value: GoogleCloudVideointelligenceV1LabelAnnotation*): Self = this.set("shotPresenceLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotPresenceLabelAnnotations(value: js.Array[GoogleCloudVideointelligenceV1LabelAnnotation]): Self = this.set("shotPresenceLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotPresenceLabelAnnotations: Self = this.set("shotPresenceLabelAnnotations", js.undefined)
    
    @scala.inline
    def setSpeechTranscriptionsVarargs(value: GoogleCloudVideointelligenceV1SpeechTranscription*): Self = this.set("speechTranscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSpeechTranscriptions(value: js.Array[GoogleCloudVideointelligenceV1SpeechTranscription]): Self = this.set("speechTranscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechTranscriptions: Self = this.set("speechTranscriptions", js.undefined)
    
    @scala.inline
    def setTextAnnotationsVarargs(value: GoogleCloudVideointelligenceV1TextAnnotation*): Self = this.set("textAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setTextAnnotations(value: js.Array[GoogleCloudVideointelligenceV1TextAnnotation]): Self = this.set("textAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnnotations: Self = this.set("textAnnotations", js.undefined)
  }
}

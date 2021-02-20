package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1VideoContext extends StObject {
  
  /** Config for EXPLICIT_CONTENT_DETECTION. */
  var explicitContentDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1ExplicitContentDetectionConfig] = js.native
  
  /** Config for FACE_DETECTION. */
  var faceDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1FaceDetectionConfig] = js.native
  
  /** Config for LABEL_DETECTION. */
  var labelDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1LabelDetectionConfig] = js.native
  
  /** Config for OBJECT_TRACKING. */
  var objectTrackingConfig: js.UndefOr[GoogleCloudVideointelligenceV1ObjectTrackingConfig] = js.native
  
  /** Config for PERSON_DETECTION. */
  var personDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1PersonDetectionConfig] = js.native
  
  /** Video segments to annotate. The segments may overlap and are not required to be contiguous or span the whole video. If unspecified, each video is treated as a single segment. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1VideoSegment]] = js.native
  
  /** Config for SHOT_CHANGE_DETECTION. */
  var shotChangeDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1ShotChangeDetectionConfig] = js.native
  
  /** Config for SPEECH_TRANSCRIPTION. */
  var speechTranscriptionConfig: js.UndefOr[GoogleCloudVideointelligenceV1SpeechTranscriptionConfig] = js.native
  
  /** Config for TEXT_DETECTION. */
  var textDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1TextDetectionConfig] = js.native
}
object GoogleCloudVideointelligenceV1VideoContext {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1VideoContext]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1VideoContextMutableBuilder[Self <: GoogleCloudVideointelligenceV1VideoContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicitContentDetectionConfig(value: GoogleCloudVideointelligenceV1ExplicitContentDetectionConfig): Self = StObject.set(x, "explicitContentDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitContentDetectionConfigUndefined: Self = StObject.set(x, "explicitContentDetectionConfig", js.undefined)
    
    @scala.inline
    def setFaceDetectionConfig(value: GoogleCloudVideointelligenceV1FaceDetectionConfig): Self = StObject.set(x, "faceDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceDetectionConfigUndefined: Self = StObject.set(x, "faceDetectionConfig", js.undefined)
    
    @scala.inline
    def setLabelDetectionConfig(value: GoogleCloudVideointelligenceV1LabelDetectionConfig): Self = StObject.set(x, "labelDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDetectionConfigUndefined: Self = StObject.set(x, "labelDetectionConfig", js.undefined)
    
    @scala.inline
    def setObjectTrackingConfig(value: GoogleCloudVideointelligenceV1ObjectTrackingConfig): Self = StObject.set(x, "objectTrackingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTrackingConfigUndefined: Self = StObject.set(x, "objectTrackingConfig", js.undefined)
    
    @scala.inline
    def setPersonDetectionConfig(value: GoogleCloudVideointelligenceV1PersonDetectionConfig): Self = StObject.set(x, "personDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonDetectionConfigUndefined: Self = StObject.set(x, "personDetectionConfig", js.undefined)
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1VideoSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1VideoSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    @scala.inline
    def setShotChangeDetectionConfig(value: GoogleCloudVideointelligenceV1ShotChangeDetectionConfig): Self = StObject.set(x, "shotChangeDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotChangeDetectionConfigUndefined: Self = StObject.set(x, "shotChangeDetectionConfig", js.undefined)
    
    @scala.inline
    def setSpeechTranscriptionConfig(value: GoogleCloudVideointelligenceV1SpeechTranscriptionConfig): Self = StObject.set(x, "speechTranscriptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechTranscriptionConfigUndefined: Self = StObject.set(x, "speechTranscriptionConfig", js.undefined)
    
    @scala.inline
    def setTextDetectionConfig(value: GoogleCloudVideointelligenceV1TextDetectionConfig): Self = StObject.set(x, "textDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDetectionConfigUndefined: Self = StObject.set(x, "textDetectionConfig", js.undefined)
  }
}

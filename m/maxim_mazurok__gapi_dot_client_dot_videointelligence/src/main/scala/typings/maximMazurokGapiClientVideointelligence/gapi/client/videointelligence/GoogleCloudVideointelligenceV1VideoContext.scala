package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1VideoContext extends js.Object {
  
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
  implicit class GoogleCloudVideointelligenceV1VideoContextOps[Self <: GoogleCloudVideointelligenceV1VideoContext] (val x: Self) extends AnyVal {
    
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
    def setExplicitContentDetectionConfig(value: GoogleCloudVideointelligenceV1ExplicitContentDetectionConfig): Self = this.set("explicitContentDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitContentDetectionConfig: Self = this.set("explicitContentDetectionConfig", js.undefined)
    
    @scala.inline
    def setFaceDetectionConfig(value: GoogleCloudVideointelligenceV1FaceDetectionConfig): Self = this.set("faceDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceDetectionConfig: Self = this.set("faceDetectionConfig", js.undefined)
    
    @scala.inline
    def setLabelDetectionConfig(value: GoogleCloudVideointelligenceV1LabelDetectionConfig): Self = this.set("labelDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDetectionConfig: Self = this.set("labelDetectionConfig", js.undefined)
    
    @scala.inline
    def setObjectTrackingConfig(value: GoogleCloudVideointelligenceV1ObjectTrackingConfig): Self = this.set("objectTrackingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectTrackingConfig: Self = this.set("objectTrackingConfig", js.undefined)
    
    @scala.inline
    def setPersonDetectionConfig(value: GoogleCloudVideointelligenceV1PersonDetectionConfig): Self = this.set("personDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonDetectionConfig: Self = this.set("personDetectionConfig", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1VideoSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1VideoSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setShotChangeDetectionConfig(value: GoogleCloudVideointelligenceV1ShotChangeDetectionConfig): Self = this.set("shotChangeDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotChangeDetectionConfig: Self = this.set("shotChangeDetectionConfig", js.undefined)
    
    @scala.inline
    def setSpeechTranscriptionConfig(value: GoogleCloudVideointelligenceV1SpeechTranscriptionConfig): Self = this.set("speechTranscriptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechTranscriptionConfig: Self = this.set("speechTranscriptionConfig", js.undefined)
    
    @scala.inline
    def setTextDetectionConfig(value: GoogleCloudVideointelligenceV1TextDetectionConfig): Self = this.set("textDetectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDetectionConfig: Self = this.set("textDetectionConfig", js.undefined)
  }
}

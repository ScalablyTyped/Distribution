package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1VideoContext extends StObject {
  
  /** Config for EXPLICIT_CONTENT_DETECTION. */
  var explicitContentDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1ExplicitContentDetectionConfig] = js.undefined
  
  /** Config for FACE_DETECTION. */
  var faceDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1FaceDetectionConfig] = js.undefined
  
  /** Config for LABEL_DETECTION. */
  var labelDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1LabelDetectionConfig] = js.undefined
  
  /** Config for OBJECT_TRACKING. */
  var objectTrackingConfig: js.UndefOr[GoogleCloudVideointelligenceV1ObjectTrackingConfig] = js.undefined
  
  /** Config for PERSON_DETECTION. */
  var personDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1PersonDetectionConfig] = js.undefined
  
  /** Video segments to annotate. The segments may overlap and are not required to be contiguous or span the whole video. If unspecified, each video is treated as a single segment. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1VideoSegment]] = js.undefined
  
  /** Config for SHOT_CHANGE_DETECTION. */
  var shotChangeDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1ShotChangeDetectionConfig] = js.undefined
  
  /** Config for SPEECH_TRANSCRIPTION. */
  var speechTranscriptionConfig: js.UndefOr[GoogleCloudVideointelligenceV1SpeechTranscriptionConfig] = js.undefined
  
  /** Config for TEXT_DETECTION. */
  var textDetectionConfig: js.UndefOr[GoogleCloudVideointelligenceV1TextDetectionConfig] = js.undefined
}
object GoogleCloudVideointelligenceV1VideoContext {
  
  inline def apply(): GoogleCloudVideointelligenceV1VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1VideoContext]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1VideoContext](x: Self) {
    
    inline def setExplicitContentDetectionConfig(value: GoogleCloudVideointelligenceV1ExplicitContentDetectionConfig): Self = StObject.set(x, "explicitContentDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setExplicitContentDetectionConfigUndefined: Self = StObject.set(x, "explicitContentDetectionConfig", js.undefined)
    
    inline def setFaceDetectionConfig(value: GoogleCloudVideointelligenceV1FaceDetectionConfig): Self = StObject.set(x, "faceDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setFaceDetectionConfigUndefined: Self = StObject.set(x, "faceDetectionConfig", js.undefined)
    
    inline def setLabelDetectionConfig(value: GoogleCloudVideointelligenceV1LabelDetectionConfig): Self = StObject.set(x, "labelDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setLabelDetectionConfigUndefined: Self = StObject.set(x, "labelDetectionConfig", js.undefined)
    
    inline def setObjectTrackingConfig(value: GoogleCloudVideointelligenceV1ObjectTrackingConfig): Self = StObject.set(x, "objectTrackingConfig", value.asInstanceOf[js.Any])
    
    inline def setObjectTrackingConfigUndefined: Self = StObject.set(x, "objectTrackingConfig", js.undefined)
    
    inline def setPersonDetectionConfig(value: GoogleCloudVideointelligenceV1PersonDetectionConfig): Self = StObject.set(x, "personDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setPersonDetectionConfigUndefined: Self = StObject.set(x, "personDetectionConfig", js.undefined)
    
    inline def setSegments(value: js.Array[GoogleCloudVideointelligenceV1VideoSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1VideoSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    inline def setShotChangeDetectionConfig(value: GoogleCloudVideointelligenceV1ShotChangeDetectionConfig): Self = StObject.set(x, "shotChangeDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setShotChangeDetectionConfigUndefined: Self = StObject.set(x, "shotChangeDetectionConfig", js.undefined)
    
    inline def setSpeechTranscriptionConfig(value: GoogleCloudVideointelligenceV1SpeechTranscriptionConfig): Self = StObject.set(x, "speechTranscriptionConfig", value.asInstanceOf[js.Any])
    
    inline def setSpeechTranscriptionConfigUndefined: Self = StObject.set(x, "speechTranscriptionConfig", js.undefined)
    
    inline def setTextDetectionConfig(value: GoogleCloudVideointelligenceV1TextDetectionConfig): Self = StObject.set(x, "textDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setTextDetectionConfigUndefined: Self = StObject.set(x, "textDetectionConfig", js.undefined)
  }
}

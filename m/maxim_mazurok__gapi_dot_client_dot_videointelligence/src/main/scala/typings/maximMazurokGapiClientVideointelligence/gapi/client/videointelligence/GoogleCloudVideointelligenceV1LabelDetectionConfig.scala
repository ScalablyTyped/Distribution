package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1LabelDetectionConfig extends StObject {
  
  /**
    * The confidence threshold we perform filtering on the labels from frame-level detection. If not set, it is set to 0.4 by default. The valid range for this threshold is [0.1, 0.9].
    * Any value set outside of this range will be clipped. Note: For best results, follow the default threshold. We will update the default threshold everytime when we release a new
    * model.
    */
  var frameConfidenceThreshold: js.UndefOr[Double] = js.native
  
  /** What labels should be detected with LABEL_DETECTION, in addition to video-level labels or segment-level labels. If unspecified, defaults to `SHOT_MODE`. */
  var labelDetectionMode: js.UndefOr[String] = js.native
  
  /** Model to use for label detection. Supported values: "builtin/stable" (the default if unset) and "builtin/latest". */
  var model: js.UndefOr[String] = js.native
  
  /**
    * Whether the video has been shot from a stationary (i.e., non-moving) camera. When set to true, might improve detection accuracy for moving objects. Should be used with
    * `SHOT_AND_FRAME_MODE` enabled.
    */
  var stationaryCamera: js.UndefOr[Boolean] = js.native
  
  /**
    * The confidence threshold we perform filtering on the labels from video-level and shot-level detections. If not set, it's set to 0.3 by default. The valid range for this threshold is
    * [0.1, 0.9]. Any value set outside of this range will be clipped. Note: For best results, follow the default threshold. We will update the default threshold everytime when we release
    * a new model.
    */
  var videoConfidenceThreshold: js.UndefOr[Double] = js.native
}
object GoogleCloudVideointelligenceV1LabelDetectionConfig {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1LabelDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1LabelDetectionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1LabelDetectionConfigMutableBuilder[Self <: GoogleCloudVideointelligenceV1LabelDetectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameConfidenceThreshold(value: Double): Self = StObject.set(x, "frameConfidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameConfidenceThresholdUndefined: Self = StObject.set(x, "frameConfidenceThreshold", js.undefined)
    
    @scala.inline
    def setLabelDetectionMode(value: String): Self = StObject.set(x, "labelDetectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDetectionModeUndefined: Self = StObject.set(x, "labelDetectionMode", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setStationaryCamera(value: Boolean): Self = StObject.set(x, "stationaryCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStationaryCameraUndefined: Self = StObject.set(x, "stationaryCamera", js.undefined)
    
    @scala.inline
    def setVideoConfidenceThreshold(value: Double): Self = StObject.set(x, "videoConfidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoConfidenceThresholdUndefined: Self = StObject.set(x, "videoConfidenceThreshold", js.undefined)
  }
}

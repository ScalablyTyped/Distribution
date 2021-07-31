package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1FaceDetectionConfig extends StObject {
  
  /** Whether to enable face attributes detection, such as glasses, dark_glasses, mouth_open etc. Ignored if 'include_bounding_boxes' is set to false. */
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  
  /** Whether bounding boxes are included in the face annotation output. */
  var includeBoundingBoxes: js.UndefOr[Boolean] = js.undefined
  
  /** Model to use for face detection. Supported values: "builtin/stable" (the default if unset) and "builtin/latest". */
  var model: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1FaceDetectionConfig {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1FaceDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1FaceDetectionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1FaceDetectionConfigMutableBuilder[Self <: GoogleCloudVideointelligenceV1FaceDetectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    @scala.inline
    def setIncludeBoundingBoxes(value: Boolean): Self = StObject.set(x, "includeBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBoundingBoxesUndefined: Self = StObject.set(x, "includeBoundingBoxes", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}

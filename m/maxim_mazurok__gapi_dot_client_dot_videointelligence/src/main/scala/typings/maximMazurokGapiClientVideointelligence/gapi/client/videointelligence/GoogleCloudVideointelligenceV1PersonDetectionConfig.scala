package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1PersonDetectionConfig extends StObject {
  
  /**
    * Whether to enable person attributes detection, such as cloth color (black, blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair, etc. Ignored if
    * 'include_bounding_boxes' is set to false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.native
  
  /** Whether bounding boxes are included in the person detection annotation output. */
  var includeBoundingBoxes: js.UndefOr[Boolean] = js.native
  
  /** Whether to enable pose landmarks detection. Ignored if 'include_bounding_boxes' is set to false. */
  var includePoseLandmarks: js.UndefOr[Boolean] = js.native
}
object GoogleCloudVideointelligenceV1PersonDetectionConfig {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1PersonDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1PersonDetectionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1PersonDetectionConfigMutableBuilder[Self <: GoogleCloudVideointelligenceV1PersonDetectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    @scala.inline
    def setIncludeBoundingBoxes(value: Boolean): Self = StObject.set(x, "includeBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBoundingBoxesUndefined: Self = StObject.set(x, "includeBoundingBoxes", js.undefined)
    
    @scala.inline
    def setIncludePoseLandmarks(value: Boolean): Self = StObject.set(x, "includePoseLandmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePoseLandmarksUndefined: Self = StObject.set(x, "includePoseLandmarks", js.undefined)
  }
}

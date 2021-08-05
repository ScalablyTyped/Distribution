package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1PersonDetectionConfig extends StObject {
  
  /**
    * Whether to enable person attributes detection, such as cloth color (black, blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair, etc. Ignored if
    * 'include_bounding_boxes' is set to false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.undefined
  
  /** Whether bounding boxes are included in the person detection annotation output. */
  var includeBoundingBoxes: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to enable pose landmarks detection. Ignored if 'include_bounding_boxes' is set to false. */
  var includePoseLandmarks: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudVideointelligenceV1PersonDetectionConfig {
  
  inline def apply(): GoogleCloudVideointelligenceV1PersonDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1PersonDetectionConfig]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1PersonDetectionConfig](x: Self) {
    
    inline def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    inline def setIncludeBoundingBoxes(value: Boolean): Self = StObject.set(x, "includeBoundingBoxes", value.asInstanceOf[js.Any])
    
    inline def setIncludeBoundingBoxesUndefined: Self = StObject.set(x, "includeBoundingBoxes", js.undefined)
    
    inline def setIncludePoseLandmarks(value: Boolean): Self = StObject.set(x, "includePoseLandmarks", value.asInstanceOf[js.Any])
    
    inline def setIncludePoseLandmarksUndefined: Self = StObject.set(x, "includePoseLandmarks", js.undefined)
  }
}

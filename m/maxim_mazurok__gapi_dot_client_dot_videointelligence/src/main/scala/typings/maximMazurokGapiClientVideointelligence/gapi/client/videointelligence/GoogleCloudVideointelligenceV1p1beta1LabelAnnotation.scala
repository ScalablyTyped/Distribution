package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p1beta1LabelAnnotation extends StObject {
  
  /**
    * Common categories for the detected entity. For example, when the label is `Terrier`, the category is likely `dog`. And in some cases there might be more than one categories e.g.,
    * `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p1beta1Entity]] = js.undefined
  
  /** Detected entity. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1p1beta1Entity] = js.undefined
  
  /** All video frames where a label was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p1beta1LabelFrame]] = js.undefined
  
  /** All video segments where a label was detected. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p1beta1LabelSegment]] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p1beta1LabelAnnotation {
  
  inline def apply(): GoogleCloudVideointelligenceV1p1beta1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1LabelAnnotation]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p1beta1LabelAnnotation](x: Self) {
    
    inline def setCategoryEntities(value: js.Array[GoogleCloudVideointelligenceV1p1beta1Entity]): Self = StObject.set(x, "categoryEntities", value.asInstanceOf[js.Any])
    
    inline def setCategoryEntitiesUndefined: Self = StObject.set(x, "categoryEntities", js.undefined)
    
    inline def setCategoryEntitiesVarargs(value: GoogleCloudVideointelligenceV1p1beta1Entity*): Self = StObject.set(x, "categoryEntities", js.Array(value*))
    
    inline def setEntity(value: GoogleCloudVideointelligenceV1p1beta1Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setFrames(value: js.Array[GoogleCloudVideointelligenceV1p1beta1LabelFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: GoogleCloudVideointelligenceV1p1beta1LabelFrame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setSegments(value: js.Array[GoogleCloudVideointelligenceV1p1beta1LabelSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1p1beta1LabelSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

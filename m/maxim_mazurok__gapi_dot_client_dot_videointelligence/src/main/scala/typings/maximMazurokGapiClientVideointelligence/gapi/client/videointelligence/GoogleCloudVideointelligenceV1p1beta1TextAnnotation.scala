package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p1beta1TextAnnotation extends StObject {
  
  /** All video segments where OCR detected text appears. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p1beta1TextSegment]] = js.undefined
  
  /** The detected text. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p1beta1TextAnnotation {
  
  inline def apply(): GoogleCloudVideointelligenceV1p1beta1TextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1TextAnnotation]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p1beta1TextAnnotation](x: Self) {
    
    inline def setSegments(value: js.Array[GoogleCloudVideointelligenceV1p1beta1TextSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1p1beta1TextSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

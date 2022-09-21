package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1AnnotateVideoResponse extends StObject {
  
  /** Annotation results for all videos specified in `AnnotateVideoRequest`. */
  var annotationResults: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1VideoAnnotationResults]] = js.undefined
}
object GoogleCloudVideointelligenceV1AnnotateVideoResponse {
  
  inline def apply(): GoogleCloudVideointelligenceV1AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1AnnotateVideoResponse]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1AnnotateVideoResponse](x: Self) {
    
    inline def setAnnotationResults(value: js.Array[GoogleCloudVideointelligenceV1VideoAnnotationResults]): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    inline def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    inline def setAnnotationResultsVarargs(value: GoogleCloudVideointelligenceV1VideoAnnotationResults*): Self = StObject.set(x, "annotationResults", js.Array(value*))
  }
}

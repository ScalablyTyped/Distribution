package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse extends StObject {
  
  /** Annotation results for all videos specified in `AnnotateVideoRequest`. */
  var annotationResults: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1VideoAnnotationResults]] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponseMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1AnnotateVideoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationResults(value: js.Array[GoogleCloudVideointelligenceV1p2beta1VideoAnnotationResults]): Self = StObject.set(x, "annotationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationResultsUndefined: Self = StObject.set(x, "annotationResults", js.undefined)
    
    @scala.inline
    def setAnnotationResultsVarargs(value: GoogleCloudVideointelligenceV1p2beta1VideoAnnotationResults*): Self = StObject.set(x, "annotationResults", js.Array(value :_*))
  }
}

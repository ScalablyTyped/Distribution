package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress extends StObject {
  
  /** Progress metadata for all videos specified in `AnnotateVideoRequest`. */
  var annotationProgress: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress]] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgressMutableBuilder[Self <: GoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationProgress(value: js.Array[GoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress]): Self = StObject.set(x, "annotationProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationProgressUndefined: Self = StObject.set(x, "annotationProgress", js.undefined)
    
    @scala.inline
    def setAnnotationProgressVarargs(value: GoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress*): Self = StObject.set(x, "annotationProgress", js.Array(value :_*))
  }
}

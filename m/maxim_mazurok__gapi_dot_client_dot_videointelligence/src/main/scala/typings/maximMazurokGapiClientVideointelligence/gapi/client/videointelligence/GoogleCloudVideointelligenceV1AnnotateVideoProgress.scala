package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1AnnotateVideoProgress extends js.Object {
  
  /** Progress metadata for all videos specified in `AnnotateVideoRequest`. */
  var annotationProgress: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1VideoAnnotationProgress]] = js.native
}
object GoogleCloudVideointelligenceV1AnnotateVideoProgress {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1AnnotateVideoProgress]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1AnnotateVideoProgressOps[Self <: GoogleCloudVideointelligenceV1AnnotateVideoProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotationProgressVarargs(value: GoogleCloudVideointelligenceV1VideoAnnotationProgress*): Self = this.set("annotationProgress", js.Array(value :_*))
    
    @scala.inline
    def setAnnotationProgress(value: js.Array[GoogleCloudVideointelligenceV1VideoAnnotationProgress]): Self = this.set("annotationProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationProgress: Self = this.set("annotationProgress", js.undefined)
  }
}

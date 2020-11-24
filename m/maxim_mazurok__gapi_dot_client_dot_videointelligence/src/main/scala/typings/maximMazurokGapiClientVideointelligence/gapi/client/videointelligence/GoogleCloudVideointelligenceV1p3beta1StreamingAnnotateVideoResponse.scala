package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse extends js.Object {
  
  /** Streaming annotation results. */
  var annotationResults: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults] = js.native
  
  /**
    * Google Cloud Storage URI that stores annotation results of one streaming session in JSON format. It is the annotation_result_storage_directory from the request followed by
    * '/cloud_project_number-session_id'.
    */
  var annotationResultsUri: js.UndefOr[String] = js.native
  
  /** If set, returns a google.rpc.Status message that specifies the error for the operation. */
  var error: js.UndefOr[GoogleRpcStatus] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponseOps[Self <: GoogleCloudVideointelligenceV1p3beta1StreamingAnnotateVideoResponse] (val x: Self) extends AnyVal {
    
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
    def setAnnotationResults(value: GoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults): Self = this.set("annotationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationResults: Self = this.set("annotationResults", js.undefined)
    
    @scala.inline
    def setAnnotationResultsUri(value: String): Self = this.set("annotationResultsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationResultsUri: Self = this.set("annotationResultsUri", js.undefined)
    
    @scala.inline
    def setError(value: GoogleRpcStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}

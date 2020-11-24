package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p3beta1AnnotateFileResponse extends js.Object {
  
  /** If set, represents the error message for the failed request. The `responses` field will not be set in this case. */
  var error: js.UndefOr[Status] = js.native
  
  /** Information about the file for which this response is generated. */
  var inputConfig: js.UndefOr[GoogleCloudVisionV1p3beta1InputConfig] = js.native
  
  /** Individual responses to images found within the file. This field will be empty if the `error` field is set. */
  var responses: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1AnnotateImageResponse]] = js.native
  
  /** This field gives the total number of pages in the file. */
  var totalPages: js.UndefOr[Double] = js.native
}
object GoogleCloudVisionV1p3beta1AnnotateFileResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1AnnotateFileResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1AnnotateFileResponseOps[Self <: GoogleCloudVisionV1p3beta1AnnotateFileResponse] (val x: Self) extends AnyVal {
    
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
    def setError(value: Status): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInputConfig(value: GoogleCloudVisionV1p3beta1InputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    
    @scala.inline
    def setResponsesVarargs(value: GoogleCloudVisionV1p3beta1AnnotateImageResponse*): Self = this.set("responses", js.Array(value :_*))
    
    @scala.inline
    def setResponses(value: js.Array[GoogleCloudVisionV1p3beta1AnnotateImageResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
    
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
  }
}

package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse extends js.Object {
  
  /** The output location and metadata from AsyncAnnotateFileRequest. */
  var outputConfig: js.UndefOr[GoogleCloudVisionV1p1beta1OutputConfig] = js.native
}
object GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponseOps[Self <: GoogleCloudVisionV1p1beta1AsyncAnnotateFileResponse] (val x: Self) extends AnyVal {
    
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
    def setOutputConfig(value: GoogleCloudVisionV1p1beta1OutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
  }
}

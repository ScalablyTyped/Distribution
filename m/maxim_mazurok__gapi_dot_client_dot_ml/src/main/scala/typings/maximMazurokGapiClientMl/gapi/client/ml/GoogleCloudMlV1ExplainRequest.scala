package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ExplainRequest extends js.Object {
  
  /** Required. The explanation request body. */
  var httpBody: js.UndefOr[GoogleApiHttpBody] = js.native
}
object GoogleCloudMlV1ExplainRequest {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ExplainRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ExplainRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ExplainRequestOps[Self <: GoogleCloudMlV1ExplainRequest] (val x: Self) extends AnyVal {
    
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
    def setHttpBody(value: GoogleApiHttpBody): Self = this.set("httpBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpBody: Self = this.set("httpBody", js.undefined)
  }
}

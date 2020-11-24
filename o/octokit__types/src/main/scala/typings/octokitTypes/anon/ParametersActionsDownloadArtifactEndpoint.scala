package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActionsDownloadArtifactEndpoint
import typings.octokitTypes.endpointsMod.ActionsDownloadArtifactRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsDownloadArtifactEndpoint extends js.Object {
  
  var parameters: ActionsDownloadArtifactEndpoint = js.native
  
  var request: ActionsDownloadArtifactRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsDownloadArtifactEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsDownloadArtifactEndpoint,
    request: ActionsDownloadArtifactRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsDownloadArtifactEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsDownloadArtifactEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsDownloadArtifactEndpointOps[Self <: ParametersActionsDownloadArtifactEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsDownloadArtifactEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsDownloadArtifactRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}

package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreateReleaseEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateReleaseRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreateReleaseResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateReleaseEndpoint extends js.Object {
  
  var parameters: ReposCreateReleaseEndpoint = js.native
  
  var request: ReposCreateReleaseRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateReleaseResponseData] = js.native
}
object ParametersReposCreateReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateReleaseEndpoint,
    request: ReposCreateReleaseRequestOptions,
    response: OctokitResponse[ReposCreateReleaseResponseData]
  ): ParametersReposCreateReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateReleaseEndpointOps[Self <: ParametersReposCreateReleaseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposCreateReleaseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateReleaseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateReleaseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}

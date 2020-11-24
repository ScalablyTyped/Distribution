package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsGetEndpoint extends js.Object {
  
  var parameters: ProjectsGetEndpoint = js.native
  
  var request: ProjectsGetRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsGetResponseData] = js.native
}
object ParametersProjectsGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsGetEndpoint,
    request: ProjectsGetRequestOptions,
    response: OctokitResponse[ProjectsGetResponseData]
  ): ParametersProjectsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsGetEndpointOps[Self <: ParametersProjectsGetEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ProjectsGetEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsGetRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}

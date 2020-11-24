package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsUpdateCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateCardRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsUpdateCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsUpdateCardEndpoint extends js.Object {
  
  var parameters: ProjectsUpdateCardEndpoint = js.native
  
  var request: ProjectsUpdateCardRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsUpdateCardResponseData] = js.native
}
object ParametersProjectsUpdateCardEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsUpdateCardEndpoint,
    request: ProjectsUpdateCardRequestOptions,
    response: OctokitResponse[ProjectsUpdateCardResponseData]
  ): ParametersProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateCardEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsUpdateCardEndpointOps[Self <: ParametersProjectsUpdateCardEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ProjectsUpdateCardEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsUpdateCardRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateCardResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}

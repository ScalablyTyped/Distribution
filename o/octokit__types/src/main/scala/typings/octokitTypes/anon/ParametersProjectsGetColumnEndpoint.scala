package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsGetColumnEndpoint extends js.Object {
  
  var parameters: ProjectsGetColumnEndpoint = js.native
  
  var request: ProjectsGetColumnRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsGetColumnResponseData] = js.native
}
object ParametersProjectsGetColumnEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsGetColumnEndpoint,
    request: ProjectsGetColumnRequestOptions,
    response: OctokitResponse[ProjectsGetColumnResponseData]
  ): ParametersProjectsGetColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetColumnEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsGetColumnEndpointOps[Self <: ParametersProjectsGetColumnEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ProjectsGetColumnEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsGetColumnRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetColumnResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}

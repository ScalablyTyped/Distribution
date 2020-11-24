package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListColumnsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListColumnsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsListColumnsEndpoint extends js.Object {
  
  var parameters: ProjectsListColumnsEndpoint = js.native
  
  var response: OctokitResponse[ProjectsListColumnsResponseData] = js.native
}
object ParametersProjectsListColumnsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsListColumnsEndpoint,
    response: OctokitResponse[ProjectsListColumnsResponseData]
  ): ParametersProjectsListColumnsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListColumnsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListColumnsEndpointOps[Self <: ParametersProjectsListColumnsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ProjectsListColumnsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListColumnsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}

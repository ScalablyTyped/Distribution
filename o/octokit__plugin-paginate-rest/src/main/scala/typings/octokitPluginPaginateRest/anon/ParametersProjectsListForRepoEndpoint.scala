package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListForRepoEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsListForRepoEndpoint extends StObject {
  
  var parameters: ProjectsListForRepoEndpoint = js.native
  
  var response: OctokitResponse[ProjectsListForRepoResponseData] = js.native
}
object ParametersProjectsListForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsListForRepoEndpoint,
    response: OctokitResponse[ProjectsListForRepoResponseData]
  ): ParametersProjectsListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListForRepoEndpointMutableBuilder[Self <: ParametersProjectsListForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsListForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

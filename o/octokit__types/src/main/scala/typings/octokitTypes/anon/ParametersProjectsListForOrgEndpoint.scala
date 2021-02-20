package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsListForOrgEndpoint extends StObject {
  
  var parameters: ProjectsListForOrgEndpoint = js.native
  
  var request: ProjectsListForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsListForOrgResponseData] = js.native
}
object ParametersProjectsListForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsListForOrgEndpoint,
    request: ProjectsListForOrgRequestOptions,
    response: OctokitResponse[ProjectsListForOrgResponseData]
  ): ParametersProjectsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListForOrgEndpointMutableBuilder[Self <: ParametersProjectsListForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsListForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

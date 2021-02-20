package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ProjectsListForUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsListForUserEndpoint extends StObject {
  
  var parameters: ProjectsListForUserEndpoint = js.native
  
  var response: OctokitResponse[ProjectsListForUserResponseData] = js.native
}
object ParametersProjectsListForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsListForUserEndpoint,
    response: OctokitResponse[ProjectsListForUserResponseData]
  ): ParametersProjectsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListForUserEndpointMutableBuilder[Self <: ParametersProjectsListForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsListForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

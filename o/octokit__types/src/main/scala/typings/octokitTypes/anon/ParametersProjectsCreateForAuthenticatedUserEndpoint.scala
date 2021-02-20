package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsCreateForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ProjectsCreateForAuthenticatedUserEndpoint = js.native
  
  var request: ProjectsCreateForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData] = js.native
}
object ParametersProjectsCreateForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsCreateForAuthenticatedUserEndpoint,
    request: ProjectsCreateForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]
  ): ParametersProjectsCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsCreateForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersProjectsCreateForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsCreateForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsCreateForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

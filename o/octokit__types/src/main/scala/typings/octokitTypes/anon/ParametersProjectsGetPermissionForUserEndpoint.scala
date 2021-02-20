package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsGetPermissionForUserEndpoint extends StObject {
  
  var parameters: ProjectsGetPermissionForUserEndpoint = js.native
  
  var request: ProjectsGetPermissionForUserRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsGetPermissionForUserResponseData] = js.native
}
object ParametersProjectsGetPermissionForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsGetPermissionForUserEndpoint,
    request: ProjectsGetPermissionForUserRequestOptions,
    response: OctokitResponse[ProjectsGetPermissionForUserResponseData]
  ): ParametersProjectsGetPermissionForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetPermissionForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsGetPermissionForUserEndpointMutableBuilder[Self <: ParametersProjectsGetPermissionForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsGetPermissionForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsGetPermissionForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetPermissionForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

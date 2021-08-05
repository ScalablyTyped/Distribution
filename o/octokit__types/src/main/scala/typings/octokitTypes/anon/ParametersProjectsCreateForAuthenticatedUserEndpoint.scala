package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsCreateForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ProjectsCreateForAuthenticatedUserEndpoint
  
  var request: ProjectsCreateForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]
}
object ParametersProjectsCreateForAuthenticatedUserEndpoint {
  
  inline def apply(
    parameters: ProjectsCreateForAuthenticatedUserEndpoint,
    request: ProjectsCreateForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]
  ): ParametersProjectsCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ParametersProjectsCreateForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsCreateForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsCreateForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsCreateForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

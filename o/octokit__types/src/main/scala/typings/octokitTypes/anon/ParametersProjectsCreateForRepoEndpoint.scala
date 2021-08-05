package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsCreateForRepoEndpoint extends StObject {
  
  var parameters: ProjectsCreateForRepoEndpoint
  
  var request: ProjectsCreateForRepoRequestOptions
  
  var response: OctokitResponse[ProjectsCreateForRepoResponseData]
}
object ParametersProjectsCreateForRepoEndpoint {
  
  inline def apply(
    parameters: ProjectsCreateForRepoEndpoint,
    request: ProjectsCreateForRepoRequestOptions,
    response: OctokitResponse[ProjectsCreateForRepoResponseData]
  ): ParametersProjectsCreateForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForRepoEndpoint]
  }
  
  extension [Self <: ParametersProjectsCreateForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsCreateForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsCreateForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsCreateForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

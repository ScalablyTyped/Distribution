package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsListForRepoEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListForRepoRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsListForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsListForRepoEndpoint extends StObject {
  
  var parameters: ProjectsListForRepoEndpoint
  
  var request: ProjectsListForRepoRequestOptions
  
  var response: OctokitResponse[ProjectsListForRepoResponseData]
}
object ParametersProjectsListForRepoEndpoint {
  
  inline def apply(
    parameters: ProjectsListForRepoEndpoint,
    request: ProjectsListForRepoRequestOptions,
    response: OctokitResponse[ProjectsListForRepoResponseData]
  ): ParametersProjectsListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForRepoEndpoint]
  }
  
  extension [Self <: ParametersProjectsListForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsListForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsListForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsListForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

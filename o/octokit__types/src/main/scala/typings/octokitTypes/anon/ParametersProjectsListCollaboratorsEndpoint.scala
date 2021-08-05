package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsListCollaboratorsEndpoint extends StObject {
  
  var parameters: ProjectsListCollaboratorsEndpoint
  
  var request: ProjectsListCollaboratorsRequestOptions
  
  var response: OctokitResponse[ProjectsListCollaboratorsResponseData]
}
object ParametersProjectsListCollaboratorsEndpoint {
  
  inline def apply(
    parameters: ProjectsListCollaboratorsEndpoint,
    request: ProjectsListCollaboratorsRequestOptions,
    response: OctokitResponse[ProjectsListCollaboratorsResponseData]
  ): ParametersProjectsListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListCollaboratorsEndpoint]
  }
  
  extension [Self <: ParametersProjectsListCollaboratorsEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsListCollaboratorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsListCollaboratorsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

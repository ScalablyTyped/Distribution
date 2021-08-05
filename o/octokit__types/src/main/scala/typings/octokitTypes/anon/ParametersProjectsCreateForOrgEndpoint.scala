package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsCreateForOrgEndpoint extends StObject {
  
  var parameters: ProjectsCreateForOrgEndpoint
  
  var request: ProjectsCreateForOrgRequestOptions
  
  var response: OctokitResponse[ProjectsCreateForOrgResponseData]
}
object ParametersProjectsCreateForOrgEndpoint {
  
  inline def apply(
    parameters: ProjectsCreateForOrgEndpoint,
    request: ProjectsCreateForOrgRequestOptions,
    response: OctokitResponse[ProjectsCreateForOrgResponseData]
  ): ParametersProjectsCreateForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForOrgEndpoint]
  }
  
  extension [Self <: ParametersProjectsCreateForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsCreateForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsCreateForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsCreateForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

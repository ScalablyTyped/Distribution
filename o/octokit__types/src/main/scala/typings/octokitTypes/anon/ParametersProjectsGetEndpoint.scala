package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsGetEndpoint extends StObject {
  
  var parameters: ProjectsGetEndpoint
  
  var request: ProjectsGetRequestOptions
  
  var response: OctokitResponse[ProjectsGetResponseData]
}
object ParametersProjectsGetEndpoint {
  
  inline def apply(
    parameters: ProjectsGetEndpoint,
    request: ProjectsGetRequestOptions,
    response: OctokitResponse[ProjectsGetResponseData]
  ): ParametersProjectsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetEndpoint]
  }
  
  extension [Self <: ParametersProjectsGetEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

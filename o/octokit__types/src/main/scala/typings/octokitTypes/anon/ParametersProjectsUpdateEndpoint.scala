package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsUpdateEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsUpdateEndpoint extends StObject {
  
  var parameters: ProjectsUpdateEndpoint
  
  var request: ProjectsUpdateRequestOptions
  
  var response: OctokitResponse[ProjectsUpdateResponseData]
}
object ParametersProjectsUpdateEndpoint {
  
  inline def apply(
    parameters: ProjectsUpdateEndpoint,
    request: ProjectsUpdateRequestOptions,
    response: OctokitResponse[ProjectsUpdateResponseData]
  ): ParametersProjectsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateEndpoint]
  }
  
  extension [Self <: ParametersProjectsUpdateEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

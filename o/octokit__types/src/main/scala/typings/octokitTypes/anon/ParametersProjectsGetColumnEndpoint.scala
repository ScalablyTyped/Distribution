package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsGetColumnEndpoint extends StObject {
  
  var parameters: ProjectsGetColumnEndpoint
  
  var request: ProjectsGetColumnRequestOptions
  
  var response: OctokitResponse[ProjectsGetColumnResponseData]
}
object ParametersProjectsGetColumnEndpoint {
  
  inline def apply(
    parameters: ProjectsGetColumnEndpoint,
    request: ProjectsGetColumnRequestOptions,
    response: OctokitResponse[ProjectsGetColumnResponseData]
  ): ParametersProjectsGetColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetColumnEndpoint]
  }
  
  extension [Self <: ParametersProjectsGetColumnEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsGetColumnEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsGetColumnRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsGetColumnResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

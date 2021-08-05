package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsCreateColumnEndpoint extends StObject {
  
  var parameters: ProjectsCreateColumnEndpoint
  
  var request: ProjectsCreateColumnRequestOptions
  
  var response: OctokitResponse[ProjectsCreateColumnResponseData]
}
object ParametersProjectsCreateColumnEndpoint {
  
  inline def apply(
    parameters: ProjectsCreateColumnEndpoint,
    request: ProjectsCreateColumnRequestOptions,
    response: OctokitResponse[ProjectsCreateColumnResponseData]
  ): ParametersProjectsCreateColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateColumnEndpoint]
  }
  
  extension [Self <: ParametersProjectsCreateColumnEndpoint](x: Self) {
    
    inline def setParameters(value: ProjectsCreateColumnEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ProjectsCreateColumnRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ProjectsCreateColumnResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

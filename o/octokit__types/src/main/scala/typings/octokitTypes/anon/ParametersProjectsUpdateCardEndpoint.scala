package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsUpdateCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateCardRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsUpdateCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsUpdateCardEndpoint extends StObject {
  
  var parameters: ProjectsUpdateCardEndpoint
  
  var request: ProjectsUpdateCardRequestOptions
  
  var response: OctokitResponse[ProjectsUpdateCardResponseData]
}
object ParametersProjectsUpdateCardEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsUpdateCardEndpoint,
    request: ProjectsUpdateCardRequestOptions,
    response: OctokitResponse[ProjectsUpdateCardResponseData]
  ): ParametersProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateCardEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsUpdateCardEndpointMutableBuilder[Self <: ParametersProjectsUpdateCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsUpdateCardEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsUpdateCardRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

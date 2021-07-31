package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsDeleteCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsDeleteCardRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsDeleteCardEndpoint extends StObject {
  
  var parameters: ProjectsDeleteCardEndpoint
  
  var request: ProjectsDeleteCardRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersProjectsDeleteCardEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsDeleteCardEndpoint,
    request: ProjectsDeleteCardRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersProjectsDeleteCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsDeleteCardEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsDeleteCardEndpointMutableBuilder[Self <: ParametersProjectsDeleteCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsDeleteCardEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsDeleteCardRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

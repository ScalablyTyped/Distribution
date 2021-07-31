package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsCreateCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateCardRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsCreateCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsCreateCardEndpoint extends StObject {
  
  var parameters: ProjectsCreateCardEndpoint
  
  var request: ProjectsCreateCardRequestOptions
  
  var response: OctokitResponse[ProjectsCreateCardResponseData]
}
object ParametersProjectsCreateCardEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsCreateCardEndpoint,
    request: ProjectsCreateCardRequestOptions,
    response: OctokitResponse[ProjectsCreateCardResponseData]
  ): ParametersProjectsCreateCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateCardEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsCreateCardEndpointMutableBuilder[Self <: ParametersProjectsCreateCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsCreateCardEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsCreateCardRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsUpdateColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersProjectsUpdateColumnEndpoint extends StObject {
  
  var parameters: ProjectsUpdateColumnEndpoint
  
  var request: ProjectsUpdateColumnRequestOptions
  
  var response: OctokitResponse[ProjectsUpdateColumnResponseData]
}
object ParametersProjectsUpdateColumnEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsUpdateColumnEndpoint,
    request: ProjectsUpdateColumnRequestOptions,
    response: OctokitResponse[ProjectsUpdateColumnResponseData]
  ): ParametersProjectsUpdateColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateColumnEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsUpdateColumnEndpointMutableBuilder[Self <: ParametersProjectsUpdateColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsUpdateColumnEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsUpdateColumnRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateColumnResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

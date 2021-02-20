package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsDeleteColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsDeleteColumnRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsDeleteColumnEndpoint extends StObject {
  
  var parameters: ProjectsDeleteColumnEndpoint = js.native
  
  var request: ProjectsDeleteColumnRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersProjectsDeleteColumnEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsDeleteColumnEndpoint,
    request: ProjectsDeleteColumnRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsDeleteColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsDeleteColumnEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsDeleteColumnEndpointMutableBuilder[Self <: ParametersProjectsDeleteColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsDeleteColumnEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsDeleteColumnRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

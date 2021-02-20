package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsGetColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetColumnRequestOptions
import typings.octokitTypes.endpointsMod.ProjectsGetColumnResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsGetColumnEndpoint extends StObject {
  
  var parameters: ProjectsGetColumnEndpoint = js.native
  
  var request: ProjectsGetColumnRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsGetColumnResponseData] = js.native
}
object ParametersProjectsGetColumnEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsGetColumnEndpoint,
    request: ProjectsGetColumnRequestOptions,
    response: OctokitResponse[ProjectsGetColumnResponseData]
  ): ParametersProjectsGetColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetColumnEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsGetColumnEndpointMutableBuilder[Self <: ParametersProjectsGetColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsGetColumnEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsGetColumnRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetColumnResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

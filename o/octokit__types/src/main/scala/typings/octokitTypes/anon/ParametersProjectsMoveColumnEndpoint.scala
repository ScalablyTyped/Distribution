package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ProjectsMoveColumnEndpoint
import typings.octokitTypes.endpointsMod.ProjectsMoveColumnRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsMoveColumnEndpoint extends StObject {
  
  var parameters: ProjectsMoveColumnEndpoint = js.native
  
  var request: ProjectsMoveColumnRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersProjectsMoveColumnEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsMoveColumnEndpoint,
    request: ProjectsMoveColumnRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsMoveColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsMoveColumnEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsMoveColumnEndpointMutableBuilder[Self <: ParametersProjectsMoveColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsMoveColumnEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsMoveColumnRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

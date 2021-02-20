package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetStatusCheckContextsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposSetStatusCheckContextsEndpoint extends StObject {
  
  var parameters: ReposSetStatusCheckContextsEndpoint = js.native
  
  var request: ReposSetStatusCheckContextsRequestOptions = js.native
  
  var response: OctokitResponse[ReposSetStatusCheckContextsResponseData] = js.native
}
object ParametersReposSetStatusCheckContextsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposSetStatusCheckContextsEndpoint,
    request: ReposSetStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposSetStatusCheckContextsResponseData]
  ): ParametersReposSetStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetStatusCheckContextsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposSetStatusCheckContextsEndpointMutableBuilder[Self <: ParametersReposSetStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposSetStatusCheckContextsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposSetStatusCheckContextsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

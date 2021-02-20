package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetViewsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetViewsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetViewsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetViewsEndpoint extends StObject {
  
  var parameters: ReposGetViewsEndpoint = js.native
  
  var request: ReposGetViewsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetViewsResponseData] = js.native
}
object ParametersReposGetViewsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetViewsEndpoint,
    request: ReposGetViewsRequestOptions,
    response: OctokitResponse[ReposGetViewsResponseData]
  ): ParametersReposGetViewsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetViewsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetViewsEndpointMutableBuilder[Self <: ParametersReposGetViewsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetViewsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetViewsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetViewsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

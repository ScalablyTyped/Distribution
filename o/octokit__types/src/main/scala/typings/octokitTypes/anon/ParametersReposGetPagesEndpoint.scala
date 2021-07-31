package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetPagesEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPagesRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetPagesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetPagesEndpoint extends StObject {
  
  var parameters: ReposGetPagesEndpoint
  
  var request: ReposGetPagesRequestOptions
  
  var response: OctokitResponse[ReposGetPagesResponseData]
}
object ParametersReposGetPagesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetPagesEndpoint,
    request: ReposGetPagesRequestOptions,
    response: OctokitResponse[ReposGetPagesResponseData]
  ): ParametersReposGetPagesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPagesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetPagesEndpointMutableBuilder[Self <: ParametersReposGetPagesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetPagesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetPagesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

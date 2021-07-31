package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetTopPathsEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTopPathsRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetTopPathsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetTopPathsEndpoint extends StObject {
  
  var parameters: ReposGetTopPathsEndpoint
  
  var request: ReposGetTopPathsRequestOptions
  
  var response: OctokitResponse[ReposGetTopPathsResponseData]
}
object ParametersReposGetTopPathsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetTopPathsEndpoint,
    request: ReposGetTopPathsRequestOptions,
    response: OctokitResponse[ReposGetTopPathsResponseData]
  ): ParametersReposGetTopPathsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTopPathsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetTopPathsEndpointMutableBuilder[Self <: ParametersReposGetTopPathsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetTopPathsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetTopPathsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTopPathsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

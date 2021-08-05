package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposListTagsEndpoint
import typings.octokitTypes.endpointsMod.ReposListTagsRequestOptions
import typings.octokitTypes.endpointsMod.ReposListTagsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListTagsEndpoint extends StObject {
  
  var parameters: ReposListTagsEndpoint
  
  var request: ReposListTagsRequestOptions
  
  var response: OctokitResponse[ReposListTagsResponseData]
}
object ParametersReposListTagsEndpoint {
  
  inline def apply(
    parameters: ReposListTagsEndpoint,
    request: ReposListTagsRequestOptions,
    response: OctokitResponse[ReposListTagsResponseData]
  ): ParametersReposListTagsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListTagsEndpoint]
  }
  
  extension [Self <: ParametersReposListTagsEndpoint](x: Self) {
    
    inline def setParameters(value: ReposListTagsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposListTagsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposListTagsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

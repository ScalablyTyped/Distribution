package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetTopReferrersEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTopReferrersRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetTopReferrersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetTopReferrersEndpoint extends StObject {
  
  var parameters: ReposGetTopReferrersEndpoint
  
  var request: ReposGetTopReferrersRequestOptions
  
  var response: OctokitResponse[ReposGetTopReferrersResponseData]
}
object ParametersReposGetTopReferrersEndpoint {
  
  inline def apply(
    parameters: ReposGetTopReferrersEndpoint,
    request: ReposGetTopReferrersRequestOptions,
    response: OctokitResponse[ReposGetTopReferrersResponseData]
  ): ParametersReposGetTopReferrersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTopReferrersEndpoint]
  }
  
  extension [Self <: ParametersReposGetTopReferrersEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetTopReferrersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetTopReferrersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetTopReferrersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

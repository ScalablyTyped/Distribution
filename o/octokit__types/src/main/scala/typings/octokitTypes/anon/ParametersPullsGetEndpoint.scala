package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsGetEndpoint
import typings.octokitTypes.endpointsMod.PullsGetRequestOptions
import typings.octokitTypes.endpointsMod.PullsGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsGetEndpoint extends StObject {
  
  var parameters: PullsGetEndpoint
  
  var request: PullsGetRequestOptions
  
  var response: OctokitResponse[PullsGetResponseData]
}
object ParametersPullsGetEndpoint {
  
  inline def apply(
    parameters: PullsGetEndpoint,
    request: PullsGetRequestOptions,
    response: OctokitResponse[PullsGetResponseData]
  ): ParametersPullsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsGetEndpoint]
  }
  
  extension [Self <: ParametersPullsGetEndpoint](x: Self) {
    
    inline def setParameters(value: PullsGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

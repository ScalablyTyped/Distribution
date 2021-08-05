package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.PullsUpdateEndpoint
import typings.octokitTypes.endpointsMod.PullsUpdateRequestOptions
import typings.octokitTypes.endpointsMod.PullsUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPullsUpdateEndpoint extends StObject {
  
  var parameters: PullsUpdateEndpoint
  
  var request: PullsUpdateRequestOptions
  
  var response: OctokitResponse[PullsUpdateResponseData]
}
object ParametersPullsUpdateEndpoint {
  
  inline def apply(
    parameters: PullsUpdateEndpoint,
    request: PullsUpdateRequestOptions,
    response: OctokitResponse[PullsUpdateResponseData]
  ): ParametersPullsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsUpdateEndpoint]
  }
  
  extension [Self <: ParametersPullsUpdateEndpoint](x: Self) {
    
    inline def setParameters(value: PullsUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: PullsUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

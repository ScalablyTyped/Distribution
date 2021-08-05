package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForRepoNetworkEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForRepoNetworkRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityListPublicEventsForRepoNetworkEndpoint extends StObject {
  
  var parameters: ActivityListPublicEventsForRepoNetworkEndpoint
  
  var request: ActivityListPublicEventsForRepoNetworkRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityListPublicEventsForRepoNetworkEndpoint {
  
  inline def apply(
    parameters: ActivityListPublicEventsForRepoNetworkEndpoint,
    request: ActivityListPublicEventsForRepoNetworkRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityListPublicEventsForRepoNetworkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsForRepoNetworkEndpoint]
  }
  
  extension [Self <: ParametersActivityListPublicEventsForRepoNetworkEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityListPublicEventsForRepoNetworkEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityListPublicEventsForRepoNetworkRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityDeleteRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityDeleteRepoSubscriptionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersActivityDeleteRepoSubscriptionEndpoint extends StObject {
  
  var parameters: ActivityDeleteRepoSubscriptionEndpoint
  
  var request: ActivityDeleteRepoSubscriptionRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersActivityDeleteRepoSubscriptionEndpoint {
  
  inline def apply(
    parameters: ActivityDeleteRepoSubscriptionEndpoint,
    request: ActivityDeleteRepoSubscriptionRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersActivityDeleteRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityDeleteRepoSubscriptionEndpoint]
  }
  
  extension [Self <: ParametersActivityDeleteRepoSubscriptionEndpoint](x: Self) {
    
    inline def setParameters(value: ActivityDeleteRepoSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ActivityDeleteRepoSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

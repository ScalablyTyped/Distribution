package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityDeleteRepoSubscriptionEndpoint
import typings.octokitTypes.endpointsMod.ActivityDeleteRepoSubscriptionRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityDeleteRepoSubscriptionEndpoint extends StObject {
  
  var parameters: ActivityDeleteRepoSubscriptionEndpoint = js.native
  
  var request: ActivityDeleteRepoSubscriptionRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityDeleteRepoSubscriptionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityDeleteRepoSubscriptionEndpoint,
    request: ActivityDeleteRepoSubscriptionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityDeleteRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityDeleteRepoSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityDeleteRepoSubscriptionEndpointMutableBuilder[Self <: ParametersActivityDeleteRepoSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityDeleteRepoSubscriptionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityDeleteRepoSubscriptionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

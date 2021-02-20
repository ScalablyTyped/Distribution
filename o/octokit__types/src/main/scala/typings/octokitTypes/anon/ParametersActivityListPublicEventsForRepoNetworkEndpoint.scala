package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForRepoNetworkEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForRepoNetworkRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListPublicEventsForRepoNetworkEndpoint extends StObject {
  
  var parameters: ActivityListPublicEventsForRepoNetworkEndpoint = js.native
  
  var request: ActivityListPublicEventsForRepoNetworkRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListPublicEventsForRepoNetworkEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListPublicEventsForRepoNetworkEndpoint,
    request: ActivityListPublicEventsForRepoNetworkRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicEventsForRepoNetworkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsForRepoNetworkEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListPublicEventsForRepoNetworkEndpointMutableBuilder[Self <: ParametersActivityListPublicEventsForRepoNetworkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListPublicEventsForRepoNetworkEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListPublicEventsForRepoNetworkRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListWebhooksEndpoint
import typings.octokitTypes.endpointsMod.ReposListWebhooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposListWebhooksEndpoint extends StObject {
  
  var parameters: ReposListWebhooksEndpoint
  
  var response: OctokitResponse[ReposListWebhooksResponseData]
}
object ParametersReposListWebhooksEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListWebhooksEndpoint, response: OctokitResponse[ReposListWebhooksResponseData]): ParametersReposListWebhooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListWebhooksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListWebhooksEndpointMutableBuilder[Self <: ParametersReposListWebhooksEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListWebhooksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListWebhooksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

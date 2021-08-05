package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListWebhooksEndpoint
import typings.octokitTypes.endpointsMod.OrgsListWebhooksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListWebhooksEndpoint extends StObject {
  
  var parameters: OrgsListWebhooksEndpoint
  
  var response: OctokitResponse[OrgsListWebhooksResponseData]
}
object ParametersOrgsListWebhooksEndpoint {
  
  inline def apply(parameters: OrgsListWebhooksEndpoint, response: OctokitResponse[OrgsListWebhooksResponseData]): ParametersOrgsListWebhooksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListWebhooksEndpoint]
  }
  
  extension [Self <: ParametersOrgsListWebhooksEndpoint](x: Self) {
    
    inline def setParameters(value: OrgsListWebhooksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsListWebhooksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

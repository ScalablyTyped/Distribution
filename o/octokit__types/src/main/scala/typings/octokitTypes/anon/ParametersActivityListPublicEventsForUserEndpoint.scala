package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForUserEndpoint
import typings.octokitTypes.endpointsMod.ActivityListPublicEventsForUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListPublicEventsForUserEndpoint extends StObject {
  
  var parameters: ActivityListPublicEventsForUserEndpoint = js.native
  
  var request: ActivityListPublicEventsForUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityListPublicEventsForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListPublicEventsForUserEndpoint,
    request: ActivityListPublicEventsForUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityListPublicEventsForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListPublicEventsForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListPublicEventsForUserEndpointMutableBuilder[Self <: ParametersActivityListPublicEventsForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityListPublicEventsForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListPublicEventsForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

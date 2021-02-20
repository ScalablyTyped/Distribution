package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ActivityMarkNotificationsAsReadEndpoint
import typings.octokitTypes.endpointsMod.ActivityMarkNotificationsAsReadRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityMarkNotificationsAsReadEndpoint extends StObject {
  
  var parameters: ActivityMarkNotificationsAsReadEndpoint = js.native
  
  var request: ActivityMarkNotificationsAsReadRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityMarkNotificationsAsReadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityMarkNotificationsAsReadEndpoint,
    request: ActivityMarkNotificationsAsReadRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityMarkNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkNotificationsAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityMarkNotificationsAsReadEndpointMutableBuilder[Self <: ParametersActivityMarkNotificationsAsReadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityMarkNotificationsAsReadEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityMarkNotificationsAsReadRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

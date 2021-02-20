package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsCheckBlockedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsCheckBlockedUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsCheckBlockedUserEndpoint extends StObject {
  
  var parameters: OrgsCheckBlockedUserEndpoint = js.native
  
  var request: OrgsCheckBlockedUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOrgsCheckBlockedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsCheckBlockedUserEndpoint,
    request: OrgsCheckBlockedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsCheckBlockedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsCheckBlockedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsCheckBlockedUserEndpointMutableBuilder[Self <: ParametersOrgsCheckBlockedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsCheckBlockedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsCheckBlockedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

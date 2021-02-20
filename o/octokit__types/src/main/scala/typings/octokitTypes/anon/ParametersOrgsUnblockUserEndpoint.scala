package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsUnblockUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsUnblockUserRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsUnblockUserEndpoint extends StObject {
  
  var parameters: OrgsUnblockUserEndpoint = js.native
  
  var request: OrgsUnblockUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOrgsUnblockUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsUnblockUserEndpoint,
    request: OrgsUnblockUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOrgsUnblockUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUnblockUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsUnblockUserEndpointMutableBuilder[Self <: ParametersOrgsUnblockUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsUnblockUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsUnblockUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

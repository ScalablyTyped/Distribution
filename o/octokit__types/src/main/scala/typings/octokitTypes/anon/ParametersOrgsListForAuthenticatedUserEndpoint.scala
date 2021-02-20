package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsListForAuthenticatedUserEndpoint = js.native
  
  var request: OrgsListForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListForAuthenticatedUserResponseData] = js.native
}
object ParametersOrgsListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListForAuthenticatedUserEndpoint,
    request: OrgsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsListForAuthenticatedUserResponseData]
  ): ParametersOrgsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersOrgsListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListMembershipsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsListMembershipsForAuthenticatedUserEndpoint
  
  var request: OrgsListMembershipsForAuthenticatedUserRequestOptions
  
  var response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
}
object ParametersOrgsListMembershipsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListMembershipsForAuthenticatedUserEndpoint,
    request: OrgsListMembershipsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
  ): ParametersOrgsListMembershipsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembershipsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListMembershipsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersOrgsListMembershipsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListMembershipsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListMembershipsForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

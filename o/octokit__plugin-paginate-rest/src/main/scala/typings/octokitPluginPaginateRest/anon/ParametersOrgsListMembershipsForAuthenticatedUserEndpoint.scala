package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListMembershipsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsListMembershipsForAuthenticatedUserEndpoint
  
  var response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
}
object ParametersOrgsListMembershipsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListMembershipsForAuthenticatedUserEndpoint,
    response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
  ): ParametersOrgsListMembershipsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembershipsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListMembershipsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersOrgsListMembershipsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListMembershipsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}

package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.OrgsListPublicMembersEndpoint
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersRequestOptions
import typings.octokitTypes.endpointsMod.OrgsListPublicMembersResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersOrgsListPublicMembersEndpoint extends StObject {
  
  var parameters: OrgsListPublicMembersEndpoint
  
  var request: OrgsListPublicMembersRequestOptions
  
  var response: OctokitResponse[OrgsListPublicMembersResponseData]
}
object ParametersOrgsListPublicMembersEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListPublicMembersEndpoint,
    request: OrgsListPublicMembersRequestOptions,
    response: OctokitResponse[OrgsListPublicMembersResponseData]
  ): ParametersOrgsListPublicMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPublicMembersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListPublicMembersEndpointMutableBuilder[Self <: ParametersOrgsListPublicMembersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListPublicMembersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListPublicMembersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListPublicMembersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
